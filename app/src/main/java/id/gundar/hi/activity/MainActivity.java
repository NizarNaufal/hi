package id.gundar.hi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.gundar.hi.R;
import id.gundar.hi.internetError.InternetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}