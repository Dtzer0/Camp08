package com.example.myrecyclerview;

import android.view.View;

public interface OnPersonItemClickListener {
    public void onItemClick(PersonAdapter.ViewHolder holder, View view, int position);

   // void onItemClick(PersonAdapter.ViewHolder holder, int position);
}
