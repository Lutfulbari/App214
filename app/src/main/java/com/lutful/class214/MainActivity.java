package com.lutful.class214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sNum = editText.getText().toString();
                if(sNum.length() >0){

                    int number = Integer.parseInt(sNum);

                    if (number%5==0 && number%11==0){
                        tvDisplay.setText("5 and 11 bivazzo");
                    }else {
                        tvDisplay.setText("5 and 11 bivazzo noy");
                    }
                }else{

                    editText.setError("thik moto number dao");

            }
        });

    }
}