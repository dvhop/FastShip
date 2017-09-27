package com.example.dinhhop_pc.fship;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dinhhop_pc.fship.adapters.OrderAdapter;
import com.example.dinhhop_pc.fship.models.OrderItem;

import java.util.ArrayList;

/**
 * Created by DinhHop-PC on 9/14/2017.
 */

public class FragmentOrder extends Fragment{
    ListView lvOrder;
    ArrayList<OrderItem> alOrder;
    OrderAdapter orderAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_order, container, false);
        lvOrder = (ListView) root.findViewById(R.id.lvOrder);
        alOrder = new ArrayList<>();
        OrderItem orderItem = new OrderItem();
        orderItem.setId("DH00123");
        orderItem.setStartLocation("100 Trần Thái Tông, Cầu Giấy, Hà Nội");
        orderItem.setEndLocation("10 Trần Thái Tông, Nam Từ Liêm, Hà Nội");
        orderItem.setImageStore("");
        orderItem.setMoneyBy(300000);
        orderItem.setMoneyShip(40000);
        orderItem.setNameStore("Cửa hàng dồ ăn");
        OrderItem orderItem1 = new OrderItem();
        orderItem1.setId("DH00124");
        orderItem1.setStartLocation("100 Trần Thái Tông, Cầu Giấy, Hà Nội");
        orderItem1.setEndLocation("67 Trung Văn, Nam Từ Liêm, Hà Nội");
        orderItem1.setImageStore("");
        orderItem1.setMoneyBy(900000);
        orderItem1.setMoneyShip(40000);
        orderItem1.setNameStore("Cửa hàng dồ ăn");
        OrderItem orderItem2 = new OrderItem();
        orderItem2.setId("DH00133");
        orderItem2.setStartLocation("100 Trần Thái Tông, Cầu Giấy, Hà Nội");
        orderItem2.setEndLocation("7 Trung Văn, Nam Từ Liêm, Hà Nội");
        orderItem2.setImageStore("");
        orderItem2.setMoneyBy(1000000);
        orderItem2.setMoneyShip(40000);
        orderItem2.setNameStore("Cửa hàng dồ ăn");
        alOrder.add(orderItem);
        alOrder.add(orderItem1);
        alOrder.add(orderItem2);
        orderAdapter = new OrderAdapter(getActivity(), R.layout.item_order, alOrder);
        lvOrder.setAdapter(orderAdapter);
        orderAdapter.notifyDataSetChanged();
        return root;
    }
}
