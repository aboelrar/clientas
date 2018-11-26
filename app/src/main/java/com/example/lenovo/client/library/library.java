package com.example.lenovo.client.library;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class library {
    public String getLanguage(Context context)
    {
        SharedPreferences sharedPreferences=context.getSharedPreferences("num",MODE_PRIVATE);
        String language=sharedPreferences.getString("num","");
        return language;
        }
    public String getTitle(Context context)
    {
        SharedPreferences sharedPreferences=context.getSharedPreferences("title",MODE_PRIVATE);
        String language=sharedPreferences.getString("title","");
        return language;
    }
    public String getDistric(Context context)
    {
        SharedPreferences sharedPreferences=context.getSharedPreferences("distric",MODE_PRIVATE);
        String language=sharedPreferences.getString("distric","");
        return language;
    }
    public String getListNum(Context context)
    {
        SharedPreferences sharedPreferences=context.getSharedPreferences("listnum",MODE_PRIVATE);
        String language=sharedPreferences.getString("listnum","");
        return language;
    }
}
