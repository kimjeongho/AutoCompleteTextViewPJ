package com.example.kimjh.autocompletetextviewpj;

import android.graphics.drawable.Drawable;

/**
 * Created by kimjh on 2016-01-19.
 */
public class MyData {
    Drawable icon;
    String title;

    @Override
    public String toString() {  //String를 객체화 하여 표시 하는 것?
        return title;
    }
}
