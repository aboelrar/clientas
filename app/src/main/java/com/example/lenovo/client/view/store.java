package com.example.lenovo.client.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.client.R;
import com.example.lenovo.client.adapter.titleAdapter;
import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.presenter.storePresenter;

import java.util.ArrayList;

public class store extends AppCompatActivity implements MVP.interfaces.View {
RecyclerView storeList;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
    storePresenter storePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        storePresenter=new storePresenter(this);
        storePresenter.getData();
    }

    @Override
    public void element() {
        storeList=(RecyclerView)findViewById(R.id.storeList);
    }

    @Override
    public void setviewdata(ArrayList data) {
      layoutManager=new LinearLayoutManager(this);
      storeList.setLayoutManager(layoutManager);
      adapter=new titleAdapter(store.this,data,R.layout.storeitem);
      storeList.setAdapter(adapter);
    }
}
