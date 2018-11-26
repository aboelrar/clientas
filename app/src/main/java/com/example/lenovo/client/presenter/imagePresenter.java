package com.example.lenovo.client.presenter;

import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.model.imageModel;

import java.util.ArrayList;

public class imagePresenter implements MVP.interfaces.presenter {
private MVP.interfaces.Model model;
private MVP.interfaces.View views;


public imagePresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
        }
private void initPresenter() {
        model = new imageModel();
        views.element();
        }

@Override
public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
        }}