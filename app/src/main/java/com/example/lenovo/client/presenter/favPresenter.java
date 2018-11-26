package com.example.lenovo.client.presenter;

import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.model.favModel;
import com.example.lenovo.client.model.storeModel;

import java.util.ArrayList;

public class favPresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public favPresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new favModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }}