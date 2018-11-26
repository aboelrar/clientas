package com.example.lenovo.client.Fragments;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.lenovo.client.R;
import com.example.lenovo.client.adapter.titleAdapter;
import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.presenter.favPresenter;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class favourite extends Fragment implements MVP.interfaces.View{
    View view;
    RecyclerView favList;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ImageView grid,list;
    ViewSwitcher switcher1;
    Button close;
    ImageView category;
    com.example.lenovo.client.presenter.favPresenter favPresenter;
    public favourite() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_favourite, container, false);
        grid=(ImageView) view.findViewById(R.id.grid);
        list=(ImageView)view.findViewById(R.id.list);
        switcher1= (ViewSwitcher) view.findViewById(R.id.my_switcher);
        category=(ImageView)view.findViewById(R.id.category);
        favPresenter=new favPresenter(this);
        favPresenter.getData();
        onClick();
        return view;
    }

    @Override
    public void element() {
        favList=(RecyclerView)view.findViewById(R.id.favlist);
    }

    @Override
    public void setviewdata(final ArrayList data) {
  setAdapter(data,R.layout.productitem);
   grid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            layoutManager=new GridLayoutManager(getActivity(),2);
            favList.setLayoutManager(layoutManager);
            adapter=new titleAdapter(getActivity(),data,R.layout.gridproductitem);
            favList.setAdapter(adapter);
            switcher1.showNext();
        }
    });
    list.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setAdapter(data,R.layout.productitem);
            switcher1.showNext();

        }
    });

    }
    public void setAdapter(ArrayList data,int resource)
    {
        layoutManager=new LinearLayoutManager(getActivity());
        favList.setLayoutManager(layoutManager);
        adapter=new titleAdapter(getActivity(),data,resource);
        favList.setAdapter(adapter);
    }
    public void onClick()
    {
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.radiobutton);
                int width = (int)(getResources().getDisplayMetrics().widthPixels*0.90);
                int height = android.view.WindowManager.LayoutParams.WRAP_CONTENT;
                dialog.getWindow().setLayout(width, height);
                dialog.show();
                Button close=(Button)dialog.findViewById(R.id.close);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                }
        });
    }
}
