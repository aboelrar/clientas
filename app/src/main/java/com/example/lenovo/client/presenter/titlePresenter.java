package com.example.lenovo.client.presenter;

import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.model.titleModel;

import java.util.ArrayList;

public class titlePresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public titlePresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new titleModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }
}
