package com.example.lenovo.client.presenter;

import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.model.storeModel;
import com.example.lenovo.client.model.titleModel;

import java.util.ArrayList;

public class storePresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public storePresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new storeModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }}