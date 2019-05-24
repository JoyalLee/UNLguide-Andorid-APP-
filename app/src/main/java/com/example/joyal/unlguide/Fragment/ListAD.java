package com.example.joyal.unlguide.Fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.joyal.unlguide.R;

import java.util.List;
import java.util.Map;

/**
 * Created by Joyal on 2017/6/16.
 */

public class ListAD extends BaseAdapter {
    private List<Map<String,Object>> data;
    private LayoutInflater layoutInflater;
    private Context context;



    public ListAD(Context context, List<Map<String,Object>> data){
        this.context=context;
        this.data=data;

        this.layoutInflater=layoutInflater.from(context);
    }
//    private void addListener(int position,Zujian zujian){
//            zujian.gamepic.setTag(position);
//
//            zujian.gametitle.setTag(position);
//    }
//
//    public void onClick(View view){
//        int position =(Integer)view.getTag();
//        switch (view.getId()){
//            case R.id.
//        }
//    }

    public final class Zujian{
        public  TextView gameinfo;
        public ImageView gamepic;
        public TextView gametitle;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Zujian zujian = null;
        if(convertView==null){
            zujian = new Zujian();
            convertView = layoutInflater.inflate(R.layout.homeitem,null);
            zujian.gametitle=(TextView)convertView.findViewById(R.id.gametitle);
            zujian.gamepic=(ImageView)convertView.findViewById(R.id.gamepic);
            zujian.gameinfo=(TextView)convertView.findViewById(R.id.gameinfo);

            convertView.setTag(zujian);
        }else{
            zujian=(Zujian)convertView.getTag();
        }
//
//          Map datas= data.get(position);



        zujian.gamepic.setImageResource((Integer)data.get(position).get("gamepic"));
        zujian.gametitle.setText((String)data.get(position).get("gametitle"));
        zujian.gameinfo.setText((String)data.get(position).get("gameinfo"));
        return convertView;
    }
}
