package com.example.kimjh.autocompletetextviewpj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimjh on 2016-01-19.
 */
public class MyAdapter extends BaseAdapter implements Filterable {
    List<MyData> originalItems = new ArrayList<MyData>();       // 총 아이템 갯수
    List<MyData> items = null;      //검색당한 아이템 갯수

    @Override
    public int getCount() {
        if(items == null)return 0;
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view;
        if (convertView == null){
            view = new ItemView(parent.getContext());
        } else {
            view = (ItemView)convertView;
        }
        view.setData(items.get(position));
        return view;
    }

    @Override
    public Filter getFilter() {
       if(filter == null){
           filter = new MyFilter();
       }
        return filter;
    }
    MyFilter filter;

    public void add(MyData data){
        originalItems.add(data);
    }

    private class MyFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            return null;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

        }
    }
}
