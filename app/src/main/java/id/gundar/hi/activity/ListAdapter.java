package id.gundar.hi.activity;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import id.gundar.hi.R;


public class ListAdapter extends ArrayAdapter<Data> {

    Activity context;
    int resource, textViewResourceId;
    List<Data> items, tempItems, suggestions;
    private Dialog pinDialog;
    private EditText popup_title, popup_review;
    private TextView submit;
    private RatingBar rating;
    Integer[] imageId = {
            R.drawable.logoline,
            R.drawable.logoline,
            R.drawable.logoline


    };


    public ListAdapter(Activity mainActivity, ArrayList<Data> dataArrayList) {
        super(mainActivity, 0, dataArrayList);

        this.context = mainActivity;
        this.items = dataArrayList;
    }


    private class ViewHolder {

        TextView description, name;
        ImageView image;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(
                    R.layout.list_data, parent, false);

            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.description = (TextView) convertView.findViewById(R.id.description);
            holder.image = (ImageView) convertView.findViewById(R.id.image);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Data productItems = items.get(position);


        holder.name.setText(productItems.getName());
        holder.description.setText(productItems.getDescription());

        holder.image.setImageResource(imageId[0]);

        return convertView;

    }


}