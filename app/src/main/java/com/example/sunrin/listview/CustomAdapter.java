package com.example.sunrin.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sunrin on 2016-07-20.
 */
public class CustomAdapter extends BaseAdapter{
    private ArrayList<String> list;
    public CustomAdapter(){
        list = new ArrayList<String>();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_list,parent,false);

            TextView textView = (TextView) convertView.findViewById(R.id.list_text);
            textView.setText(list.get(position));

            Button btn = (Button) convertView.findViewById(R.id.list_btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"리스트"+list.get(pos),Toast.LENGTH_SHORT).show();
                }
            });
            convertView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Toast.makeText(context,"롱클릭"+list.get(pos),Toast.LENGTH_SHORT).show();
                    return true;
                }
            });
        }

        return convertView;
    }
    public void add(String str)
    {
        list.add(str);
    }

    public void remove(int pos)
    {
        list.remove(pos);
    }
}
