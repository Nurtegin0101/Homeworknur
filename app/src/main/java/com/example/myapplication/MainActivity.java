package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText login, password;
    private TextView  num1,num2,num3,num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.ff4);
        login = findViewById(R.id.Mama);
        password = findViewById(R.id.number2);
        num1 = findViewById(R.id.daar1);
        num2 = findViewById(R.id.gaga);
        num3 = findViewById(R.id.von);
        num4 = findViewById(R.id.ffh);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (login.getText().length() > 0 && password.getText().length() > 0) {
                    button.setBackgroundResource(R.drawable.bg_or);
                }  if (login.getText().length() == 0 || password.getText().length() == 0) {
                    button.setBackgroundResource(R.drawable.bg_wew);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

               }
        } ;
        login.addTextChangedListener(textWatcher);
        password.addTextChangedListener(textWatcher);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals("admin@gmail.com" )&& password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Вы успешно за регались",Toast.LENGTH_LONG).show();
                    login.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    num1.setVisibility(View.INVISIBLE);
                    num2.setVisibility(View.INVISIBLE);
                    num3.setVisibility(View.INVISIBLE);
                    num4.setVisibility(View.INVISIBLE);



                }else { Toast.makeText(getApplicationContext(),"Не правелные данные",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}