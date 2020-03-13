package com.magescapegaming.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textNumberEdit1 = (EditText) findViewById(R.id.textNumberEdit1);
                EditText textNumberEdit2 = (EditText) findViewById(R.id.textNumberEdit2);
                TextView textResultView = (TextView) findViewById(R.id.textResultView);

                int num1 = Integer.parseInt(textNumberEdit1.getText().toString());
                int num2 = Integer.parseInt(textNumberEdit2.getText().toString());
                int result = num1 + num2;

                textResultView.setText(result + "");
            }
        });
    }
}
