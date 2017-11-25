package com.example.yuding.hobbit2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by yuding on 2017/3/19.
 */



public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            ///GridView.LayoutParams(420, 420) set pic size
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8 ,8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.h1,R.drawable.h2,
            R.drawable.h3,R.drawable.h4,
            R.drawable.h5,
            R.drawable.t0, R.drawable.t1,
            R.drawable.t2, R.drawable.t3,
            R.drawable.t4, R.drawable.t5,
            R.drawable.t6, R.drawable.t7,
            R.drawable.t8, R.drawable.t9,
            R.drawable.t10, R.drawable.t11,
            R.drawable.t12, R.drawable.t13,
            R.drawable.e0, R.drawable.e1,
            R.drawable.e2, R.drawable.e3,
            R.drawable.e4, R.drawable.e5,
            R.drawable.w0, R.drawable.w1,
            R.drawable.w2


    };
}
