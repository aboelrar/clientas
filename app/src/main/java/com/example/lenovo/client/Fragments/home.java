package com.example.lenovo.client.Fragments;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.client.R;
import com.example.lenovo.client.adapter.titleAdapter;
import com.example.lenovo.client.adapter.viewimage;
import com.example.lenovo.client.interfaces.MVPP;
import com.example.lenovo.client.presenter.categoriesPresenter;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 */
public class home extends Fragment  implements MVPP.interfaces.View{

    ViewPager viewPager;
    com.example.lenovo.client.adapter.viewimage viewimage;
    CircleIndicator circleIndicator;
    int count = 0;
    com.example.lenovo.client.presenter.categoriesPresenter categoriesPresenter;
    RecyclerView categoryList;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    View view;
    public home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);
        categoriesPresenter = new categoriesPresenter(this);
        categoriesPresenter.getImageData();
        categoriesPresenter.getCategoryData();
        return view;
    }

    @Override
    public void element() {
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        circleIndicator = (CircleIndicator) view.findViewById(R.id.indicator);
        categoryList=(RecyclerView)view.findViewById(R.id.homeList);
    }

    @Override
    public void setviewImagedata(ArrayList data) {
        viewimage = new viewimage(getActivity(), data);
        viewPager.setAdapter(viewimage);
        circleIndicator.setViewPager(viewPager);
        move();
    }

    @Override
    public void setviewCategorydata(ArrayList data) {
        layoutManager=new GridLayoutManager(getActivity(),4);
        categoryList.setLayoutManager(layoutManager);
        adapter=new titleAdapter(getActivity(),data,R.layout.categoryitem);
        categoryList.setAdapter(adapter);
    }
    public void move()
    {
        final Handler handler = new Handler();

        final Runnable runnable = new Runnable() {
            public void run() {

                if (count++ <3){
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+ 1);
                }

                handler.postDelayed(this, 5000);

            }
        };

        // trigger first time
        handler.post(runnable);
    }
}
