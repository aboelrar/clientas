package com.example.lenovo.client.presenter;



import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.interfaces.MVPP;
import com.example.lenovo.client.model.categoriesModel;
import com.example.lenovo.client.model.imageModel;

import java.util.ArrayList;

public class categoriesPresenter implements MVPP.interfaces.presenter {
    private MVPP.interfaces.Model model;
    private MVPP.interfaces.View views;


    public categoriesPresenter(MVPP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new categoriesModel();
        views.element();
    }


    @Override
    public void getImageData() {
        ArrayList data=model.getImagedata();
        views.setviewImagedata(data);
    }

    @Override
    public void getCategoryData() {
        ArrayList data=model.getCategorydata();
        views.setviewCategorydata(data);
    }
}
