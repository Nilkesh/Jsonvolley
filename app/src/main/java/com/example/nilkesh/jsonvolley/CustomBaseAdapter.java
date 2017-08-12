package com.example.nilkesh.jsonvolley;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by NILKESH on 17-05-2017.
 */

class CustomBaseAdapter extends ArrayAdapter{

    Context context;
    int resource;
    List<ModelData> detail;
    public CustomBaseAdapter(Context context,int resource, List<ModelData> detail) {
        super(context,resource,detail);
        this.context = context;
        this.resource = resource;
        this.detail = detail;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.list_item_1,null);
        ModelData m =detail.get(position);
        TextView text1=(TextView)convertView.findViewById(R.id.txt1);
        text1.setText(m.getName());
        TextView text2=(TextView)convertView.findViewById(R.id.txt2);
        text2.setText(m.getEmail());
        TextView text3=(TextView)convertView.findViewById(R.id.txt3);
        text3.setText(m.getGender());
        TextView text4=(TextView)convertView.findViewById(R.id.txt4);
        text4.setText(m.getAddress());
        TextView text5=(TextView)convertView.findViewById(R.id.txt5);
        text5.setText(m.getMobile());
        TextView text6=(TextView)convertView.findViewById(R.id.txt6);
        text6.setText(m.getHome());
        TextView text7=(TextView)convertView.findViewById(R.id.txt7);
        text7.setText(m.getOffice());
        return  convertView;
    }
}
