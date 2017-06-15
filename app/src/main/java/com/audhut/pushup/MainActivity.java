package com.audhut.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testUpload();
    }

    private void testUpload(){

        int  a = 1;

        a = a + 10;

        Toast.makeText(this," Value of a = " + a,Toast.LENGTH_SHORT).show();


    }
}
