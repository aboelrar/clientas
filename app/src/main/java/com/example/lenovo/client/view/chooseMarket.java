package com.example.lenovo.client.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.client.R;
import com.example.lenovo.client.library.library;

public class chooseMarket extends AppCompatActivity {
LinearLayout city,distric,store;
TextView cityName,districName;
Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_market);
        onClick();
        setText();
    }
    public void onClick()
    {
        city=(LinearLayout)findViewById(R.id.city);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        pass("المدينه");
        sendNum("1");

                }
        });
        distric=(LinearLayout)findViewById(R.id.neightboor);
        distric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass("الحى");
                sendNum("2");
            }
        });
        store=(LinearLayout)findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(chooseMarket.this,store.class);
                startActivity(intent);
            }
        });
        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(chooseMarket.this,home.class);
                startActivity(intent);
            }
        });
        }

    public void pass(String name)
    {
        Intent intent=new Intent(chooseMarket.this,spinnerCity.class);
        intent.putExtra("title",name);
        startActivity(intent);
    }
    public String getNameSpinner()
    {
        Intent intent=getIntent();
        String title=intent.getStringExtra("title");
        return title;
    }
    public void sendNum(String num)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("num",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("num", num);
        editor.commit();
    }
    public void setText()
    {
        cityName=(TextView)findViewById(R.id.cityname);
        districName=(TextView)findViewById(R.id.districname);
        library shared=new library();
        if(shared.getLanguage(this)=="1")
        {
            cityName.setText(getNameSpinner());
        }else if(shared.getLanguage(this)=="2")
        {
            districName.setText(getNameSpinner());
        }
    }
}
