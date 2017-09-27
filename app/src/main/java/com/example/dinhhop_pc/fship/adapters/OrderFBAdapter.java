package com.example.dinhhop_pc.fship.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dinhhop_pc.fship.R;
import com.example.dinhhop_pc.fship.models.OrderItemFB;

import java.util.List;

/**
 * Created by DinhHop-PC on 9/18/2017.
 */

public class OrderFBAdapter extends ArrayAdapter<OrderItemFB> {
    Activity context;
    int resource;
    List<OrderItemFB> objects;
    public OrderFBAdapter(Activity context, int resource, List<OrderItemFB> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View view = inflater.inflate(this.resource, null);
        TextView txtName, txtTime, txtContent;
        ImageView imageFace;
        LinearLayout layoutComment, layoutCall, layoutMessage;
        txtContent = (TextView) view.findViewById(R.id.txtContent);
        txtTime = (TextView) view.findViewById(R.id.txtTime);
        txtName = (TextView) view.findViewById(R.id.txtName);
        imageFace = (ImageView) view.findViewById(R.id.imageFace);
        layoutComment = (LinearLayout) view.findViewById(R.id.layoutComment);
        layoutCall = (LinearLayout) view.findViewById(R.id.layoutCall);
        layoutMessage = (LinearLayout) view.findViewById(R.id.layoutMessage);

        OrderItemFB itemFB = this.objects.get(position);
        layoutComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Comment", Toast.LENGTH_SHORT).show();
            }
        });
        layoutCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Call", Toast.LENGTH_SHORT).show();
            }
        });
        layoutMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Message", Toast.LENGTH_SHORT).show();
            }
        });
        txtContent.setText(itemFB.getContent());
        txtName.setText(itemFB.getName());
        txtTime.setText(itemFB.getTime());
        return view;
    }
}
