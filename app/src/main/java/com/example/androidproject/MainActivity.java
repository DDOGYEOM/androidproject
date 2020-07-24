package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText userId, userPass;
    Button btnLogin;
    SharedPreferences pref;
    String id, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userId = (EditText) findViewById(R.id.userId);
        userPass = (EditText) findViewById(R.id.userPass);
        btnLogin = (Button)findViewById(R.id.btnLogin);
//      btnRegister = (Button)findViewById(R.id.btnRegister);

        pref = getSharedPreferences("login", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("id", "admin");
        editor.putString("password", "1234");
        editor.commit();


        id = pref.getString("id", "");
        password = pref.getString("password", "");

        System.out.println("--------------------"+id);
        System.out.println("--------------------"+password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userId.getText().toString().equals(id) && userPass.getText().toString().equals(password)) {
                    Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);
                }else {
                    System.out.println("-------------"+userId.getText().toString());
                    System.out.println("-------------"+userPass.getText().toString());
                    Toast.makeText(MainActivity.this, "로그인 실패", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}


    }

