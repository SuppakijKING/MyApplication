package com.example.jk.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by J&K on 8/30/2015.
 */
public class MyAdapter extends BaseAdapter{

    // ประกาศตัวแปร
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    } // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View objView1 = objLayoutInflater.inflate(R.layout.index_listview, viewGroup, false);

        //Show Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvShowIcon);
        iconImageView.setImageResource(iconInts[i]);

        //Show Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(titleStrings[i]);

        return objView1;

    } //getView
} //Main class
