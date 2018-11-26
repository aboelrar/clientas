package com.example.lenovo.client.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.lenovo.client.R;
import com.example.lenovo.client.adapter.titleAdapter;
import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.presenter.titlePresenter;

import java.util.ArrayList;

public class spinnerCity extends AppCompatActivity implements MVP.interfaces.View {
 RecyclerView spinnerList;
 RecyclerView.Adapter adapter;
 RecyclerView.LayoutManager layoutManager;
    titlePresenter titlePresenter;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_city);
        titlePresenter=new titlePresenter(this);
        title=(TextView)findViewById(R.id.title);
        title.setText(getTitlee("title"));
        titlePresenter.getData();
    }

    @Override
    public void element() {
        spinnerList=(RecyclerView)findViewById(R.id.spinnerList);
        }

    @Override
    public void setviewdata(ArrayList data) {
        layoutManager=new LinearLayoutManager(this);
        spinnerList.setLayoutManager(layoutManager);
        adapter=new titleAdapter(this,data,R.layout.city);
        spinnerList.setAdapter(adapter);
    }

    public String getTitlee(String title)
    {
        Intent intent=getIntent();
        String name=intent.getStringExtra(title);
        return name;
    }
}
