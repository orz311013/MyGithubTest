package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("test2", "test2");
        Log.v("test3", "test3");

    }

    public void btn(View v) {
        Toast.makeText(MainActivity.this, "TEST", Toast.LENGTH_SHORT).show();
    }


}
