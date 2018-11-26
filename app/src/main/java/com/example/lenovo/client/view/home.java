package com.example.lenovo.client.view;

import android.content.SharedPreferences;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.lenovo.client.Fragments.cart;
import com.example.lenovo.client.Fragments.favourite;
import com.example.lenovo.client.Fragments.login;
import com.example.lenovo.client.Fragments.settings;
import com.example.lenovo.client.R;
import com.example.lenovo.client.adapter.titleAdapter;
import com.example.lenovo.client.adapter.viewimage;
import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.interfaces.MVPP;
import com.example.lenovo.client.library.library;
import com.example.lenovo.client.presenter.categoriesPresenter;
import com.example.lenovo.client.presenter.imagePresenter;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class home extends AppCompatActivity{
BottomNavigationView bottomNavigationView;
TextView listNum;
library library;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        library=new library();
        listNum=(TextView)findViewById(R.id.listnum);
        listNum.setText(library.getListNum(this));
        AddFragment();
        replace();
    }

    public void AddFragment()
    {
        Fragment home = new com.example.lenovo.client.Fragments.home();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frag, home ).commit();
    }
    public void replace()
    {
        bottomNavigationView=findViewById(R.id.nav);
        bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.home)
                {

                    Fragment Home = new com.example.lenovo.client.Fragments.home();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frag, Home ).commit();
                }else if(item.getItemId()==R.id.fav) {
                    Fragment favourite = new favourite();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frag, favourite).commit();
                }else if(item.getItemId()==R.id.cart)
                {
                    Fragment cart = new cart();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frag, cart).commit();
                }else if(item.getItemId()==R.id.more)
                {
                    Fragment settings = new settings();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frag, settings).commit();
                }
                return true;
            }
        });
    }


}
