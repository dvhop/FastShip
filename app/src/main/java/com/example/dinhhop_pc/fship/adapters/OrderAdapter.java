package com.example.dinhhop_pc.fship.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dinhhop_pc.fship.DetailOrderActivity;
import com.example.dinhhop_pc.fship.MapsActivity;
import com.example.dinhhop_pc.fship.R;
import com.example.dinhhop_pc.fship.models.OrderItem;

import java.util.List;

/**
 * Created by DinhHop-PC on 9/14/2017.
 */

public class OrderAdapter extends ArrayAdapter<OrderItem> {
    Activity context;
    int resource;
    List<OrderItem> objects;
    public OrderAdapter(Activity context, int resource, List<OrderItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater inflater = this.context.getLayoutInflater();
        View view = inflater.inflate(this.resource, null);
        TextView txtIdOrder,
                txtStartLoction, txtEndLoction,
                txtCostShip, txtMoneyBy, txtNameStore;
        Button btnReceive;
        LinearLayout layoutReceive;
        ImageView imageShop;
        layoutReceive = (LinearLayout) view.findViewById(R.id.layoutReceive);
        imageShop = (ImageView) view.findViewById(R.id.imageStore);
        btnReceive = (Button) view.findViewById(R.id.btnDetail);
        txtIdOrder = (TextView)view.findViewById(R.id.idOrder);
        txtStartLoction = (TextView) view.findViewById(R.id.txtStartLocation);
        txtEndLoction = (TextView) view.findViewById(R.id.txtEndLocation);
        txtCostShip = (TextView) view.findViewById(R.id.txtMoneyShip);
        txtMoneyBy = (TextView) view.findViewById(R.id.txtMoneyBy);
        txtNameStore = (TextView) view.findViewById(R.id.txtNameStore);

        OrderItem item = this.objects.get(position);
        txtIdOrder.setText(item.getId());
        txtStartLoction.setText(item.getStartLocation());
        txtEndLoction.setText(item.getEndLocation());
        txtCostShip.setText(item.getMoneyShip()+"");
        txtMoneyBy.setText(item.getMoneyBy()+"");
        txtNameStore.setText(item.getNameStore());
        btnReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailOrderActivity.class);
                getContext().startActivity(intent);
            }
        });
        layoutReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MapsActivity.class);
                getContext().startActivity(intent);
            }
        });
        return view;
    }
}
