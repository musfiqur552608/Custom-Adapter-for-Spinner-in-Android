package com.example.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private String[] player;
    private String[] details;
    private int[] image;
    private Context context;

    public MyAdapter(Context context,String[] player, String[] details, int[] image) {
        this.player = player;
        this.details = details;
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
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
        if(view==null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_item,null,false);

        }
        ImageView imageView = view.findViewById(R.id.sigleImageId);
        imageView.setImageResource(image[i]);

        TextView textView = view.findViewById(R.id.singleNameId);
        textView.setText(player[i]);

        TextView textView1 = view.findViewById(R.id.singleDetailsId);
        textView1.setText(details[i]);
        return view;
    }


}
