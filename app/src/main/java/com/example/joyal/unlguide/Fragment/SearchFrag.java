package com.example.joyal.unlguide.Fragment;


import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joyal.unlguide.Catelog.Academic;
import com.example.joyal.unlguide.Catelog.Event;
import com.example.joyal.unlguide.Catelog.GPA;
import com.example.joyal.unlguide.Catelog.Involve;
import com.example.joyal.unlguide.Catelog.Lib;
import com.example.joyal.unlguide.Catelog.Meal;
import com.example.joyal.unlguide.Catelog.Other;
import com.example.joyal.unlguide.Catelog.Park;
import com.example.joyal.unlguide.Home;
import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/14.
 */

public class SearchFrag extends Fragment {
    private static final String[] COUNTRIES = new String[] {
            "major", "food", "meal", "building", "park01","GPA","gpacaculate","game","house","library","facility","course","information","fuck"};
    private AutoCompleteTextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab03,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView=(AutoCompleteTextView)getActivity().findViewById(R.id.autoCompleteTextView1);	//获取自动完成文本框
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_dropdown_item_1line,COUNTRIES); //创建一个ArrayAdapter适配器
        textView.setAdapter(adapter);	//为自动完成文本框设置适配器
        Button button=(Button)getActivity().findViewById(R.id.button1);	//获取搜索按钮
        //为搜索按钮添加单击事件监听
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Searching", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(),Result.class));
            }
        });

        TextView gpa = (TextView) getActivity().findViewById(R.id.gpa);
        gpa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),GPA.class));
            }
        });
        TextView food = (TextView) getActivity().findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Meal.class));
            }
        });
        TextView  majors= (TextView) getActivity().findViewById(R.id.majors);
        majors.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Academic.class));
            }
        });
        TextView  parks= (TextView) getActivity().findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Park.class));
            }
        });
        TextView  maps= (TextView) getActivity().findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Home.class));
            }
        });
        TextView  study= (TextView) getActivity().findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Academic.class));
            }
        });
        TextView  lgbt= (TextView) getActivity().findViewById(R.id.lgbt);
        lgbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Involve.class));
            }
        });
        TextView  elses= (TextView) getActivity().findViewById(R.id.elses);
        elses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Other.class));
            }
        });



    }
}
