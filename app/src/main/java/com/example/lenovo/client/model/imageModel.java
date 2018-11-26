package com.example.lenovo.client.model;

import com.example.lenovo.client.interfaces.MVP;
import com.example.lenovo.client.lists.titleList;

import java.util.ArrayList;

public class imageModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<String>arrayList=new ArrayList<String>();
        arrayList.add("https://cdn.mosoah.com/wp-content/uploads/2018/02/%D8%B3%D9%8A%D8%A7%D8%AD%D8%A9-%D9%81%D9%8A-%D8%AA%D8%A7%D9%8A%D9%84%D8%A7%D9%86%D8%AF.jpg");
        arrayList.add("https://cdn.mosoah.com/wp-content/uploads/2018/02/%D8%B3%D9%8A%D8%A7%D8%AD%D8%A9-%D9%81%D9%8A-%D8%AA%D8%A7%D9%8A%D9%84%D8%A7%D9%86%D8%AF.jpg");
        arrayList.add("https://cdn.mosoah.com/wp-content/uploads/2018/02/%D8%B3%D9%8A%D8%A7%D8%AD%D8%A9-%D9%81%D9%8A-%D8%AA%D8%A7%D9%8A%D9%84%D8%A7%D9%86%D8%AF.jpg");
        arrayList.add("https://cdn.mosoah.com/wp-content/uploads/2018/02/%D8%B3%D9%8A%D8%A7%D8%AD%D8%A9-%D9%81%D9%8A-%D8%AA%D8%A7%D9%8A%D9%84%D8%A7%D9%86%D8%AF.jpg");
        arrayList.add("https://cdn.mosoah.com/wp-content/uploads/2018/02/%D8%B3%D9%8A%D8%A7%D8%AD%D8%A9-%D9%81%D9%8A-%D8%AA%D8%A7%D9%8A%D9%84%D8%A7%D9%86%D8%AF.jpg");
        return arrayList;
    }}