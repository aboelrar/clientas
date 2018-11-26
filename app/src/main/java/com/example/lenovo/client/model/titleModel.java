package com.example.lenovo.client.model;

import com.example.lenovo.client.R;
        import com.example.lenovo.client.interfaces.MVP;
        import com.example.lenovo.client.lists.titleList;

        import java.util.ArrayList;

public class titleModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<titleList>arrayList=new ArrayList<titleList>();
        arrayList.add(new titleList("جده"));
        arrayList.add(new titleList("مكه المكرمه"));
        arrayList.add(new titleList("الطائف"));
        return arrayList;
    }}