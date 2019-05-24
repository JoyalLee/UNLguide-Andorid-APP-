package com.example.joyal.unlguide.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.joyal.unlguide.Catelog.Academic;
import com.example.joyal.unlguide.Catelog.Building;
import com.example.joyal.unlguide.Catelog.Event;
import com.example.joyal.unlguide.Catelog.House;
import com.example.joyal.unlguide.Catelog.Involve;
import com.example.joyal.unlguide.Catelog.Lib;
import com.example.joyal.unlguide.Catelog.Meal;
import com.example.joyal.unlguide.Catelog.Other;
import com.example.joyal.unlguide.Catelog.Park;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.user.Agreement;
import com.example.joyal.unlguide.user.Register;

/**
 * Created by Joyal on 2017/6/14.
 */

public class CataFrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab02, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView lib = (ImageView) getActivity().findViewById(R.id.lib);
        lib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on libraries.unl.edu", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Lib.class));
            }
        });

        ImageView house = (ImageView) getActivity().findViewById(R.id.housing);
        house.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on housing.unl.edu/", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), House.class));
            }
        });

        ImageView meal = (ImageView) getActivity().findViewById(R.id.meal);
        meal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on http://housing.unl.edu/dining-services", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Meal.class));
            }
        });

        ImageView park = (ImageView) getActivity().findViewById(R.id.park);
        park.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on the Map", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Park.class));
            }
        });

        ImageView academic = (ImageView) getActivity().findViewById(R.id.acdemic);
        academic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on ", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Academic.class));
            }
        });

        ImageView event = (ImageView) getActivity().findViewById(R.id.event);
        event.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on ", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Event.class));
            }
        });

        ImageView inv = (ImageView) getActivity().findViewById(R.id.involve);
        inv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on involved.unl.edu/", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Involve.class));
            }
        });

        ImageView building = (ImageView) getActivity().findViewById(R.id.building);
        building.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More info on fmo.unl.edu/", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Building.class));
            }
        });

        ImageView other = (ImageView) getActivity().findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "More things are developing now ", Toast.LENGTH_SHORT).show();    //显示消息提示框
                startActivity(new Intent(getActivity(), Other.class));
            }
        });


    }
}
