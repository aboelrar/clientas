package com.example.lenovo.client.view;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.client.Fragments.login;
import com.example.lenovo.client.Fragments.signup;
import com.example.lenovo.client.R;

public class registAndLogin extends AppCompatActivity {
 Button login,regist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_and_login);
        login=(Button)findViewById(R.id.login);
        regist=(Button)findViewById(R.id.signup);
        AddFragment();
        setOnClick();
    }
    public void AddFragment()
    {
        Fragment login = new login();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frag, login ).commit();
    }
    public void setOnClick()
    {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regist.setBackgroundResource(R.drawable.rectangle);
                regist.setTextColor(Color.parseColor("#000000"));
                login.setTextColor(Color.parseColor("#ffffff"));
                login.setBackgroundColor(Color.parseColor("#02A4B6"));
                Fragment login = new login();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag, login ).commit();
            }
        });
        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setBackgroundResource(R.drawable.rectangle);
                login.setTextColor(Color.parseColor("#000000"));
                regist.setTextColor(Color.parseColor("#ffffff"));
                regist.setBackgroundColor(Color.parseColor("#02A4B6"));
                Fragment signup = new signup();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag, signup ).commit();
            }
        });

    }
}
