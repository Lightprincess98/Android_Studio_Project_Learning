package com.magescapegaming.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtActivityView = (TextView) findViewById(R.id.txtActivityView);
        if(getIntent().hasExtra("com.magescapegaming.quicklauncher.textvalue")){
            String text = getIntent().getExtras().getString("com.magescapegaming.quicklauncher.textvalue");
            txtActivityView.setText(text);
        }

    }
}