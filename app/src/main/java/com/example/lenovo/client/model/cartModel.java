package com.example.lenovo.client.model;

import com.example.lenovo.client.R;
import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.interfaces.MVPP;
import com.example.lenovo.client.lists.titleList;

import java.util.ArrayList;

public class cartModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<titleList>arrayList=new ArrayList<titleList>();
        arrayList.add(new titleList(R.drawable.snilkers,"سنيكرز  قالب شيكولاتة من شركة مارس لصناعة الشوكولاتة","15 ريال"));
        arrayList.add(new titleList(R.drawable.snilkers,"سنيكرز  قالب شيكولاتة من شركة مارس لصناعة الشوكولاتة","15 ريال"));
        return arrayList;
    }
}