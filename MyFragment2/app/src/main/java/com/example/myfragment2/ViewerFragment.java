package com.example.myfragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewerFragment extends Fragment {

    ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       //인플레이션
        ViewGroup rootView =
                (ViewGroup) inflater.inflate(R.layout.fragment_viewer, container, false);

        imageView = rootView.findViewById(R.id.imageView);

        return rootView;    //리턴
    }

    //특정한 이미지를 세팅
    public void setImage(int resID){
        imageView.setImageResource(resID);
    }
}