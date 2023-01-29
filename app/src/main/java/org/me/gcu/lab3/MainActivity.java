package org.me.gcu.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button multiply;
    private TextView result;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.length);
        num2 = (EditText)findViewById(R.id.breadth);
        multiply = (Button)findViewById(R.id.areaButton);
        result = (TextView)findViewById(R.id.areaAnswer);
        clear = (Button)findViewById(R.id.clearButton);

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int area = number1 * number2;
                result.setText(String.valueOf(area));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("");
            }
        });
    }

}