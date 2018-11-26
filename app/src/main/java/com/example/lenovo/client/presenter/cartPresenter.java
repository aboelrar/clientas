package com.example.lenovo.client.presenter;

import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.model.cartModel;
import com.example.lenovo.client.model.favModel;

import java.util.ArrayList;

public class cartPresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public cartPresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new cartModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }}