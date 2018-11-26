package com.example.lenovo.client.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.client.R;
import com.example.lenovo.client.adapter.titleAdapter;
import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.presenter.favPresenter;

import java.util.ArrayList;

public class favourite extends AppCompatActivity implements MVP.interfaces.View {
    RecyclerView favList;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    favPresenter favPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        favPresenter=new favPresenter(this);
        favPresenter.getData();
    }

    @Override
    public void element() {
favList=(RecyclerView)findViewById(R.id.favlist);
    }

    @Override
    public void setviewdata(ArrayList data) {
layoutManager=new LinearLayoutManager(this);
favList.setLayoutManager(layoutManager);
adapter=new titleAdapter(this,data,R.layout.productitem);
favList.setAdapter(adapter);
    }
}
