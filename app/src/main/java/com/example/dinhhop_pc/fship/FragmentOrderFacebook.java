package com.example.dinhhop_pc.fship;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dinhhop_pc.fship.adapters.OrderFBAdapter;
import com.example.dinhhop_pc.fship.models.OrderItemFB;

import java.util.ArrayList;

/**
 * Created by DinhHop-PC on 9/18/2017.
 */

public class FragmentOrderFacebook extends Fragment{
    ListView lvOrderFB;
    ArrayList<OrderItemFB> alOrderItemFBs;
    OrderFBAdapter orderFBAdapter;
    public FragmentOrderFacebook() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_order_fb, container, false);
        lvOrderFB = (ListView) root.findViewById(R.id.lvOrderFB);
        alOrderItemFBs = new ArrayList<>();
        alOrderItemFBs.add(new OrderItemFB("", "Đinh Hợp", "vừa xong", "Chuyển hàng từ 67 Trung Văn, Từ Liêm đến 75 Giải Phóng"));
        alOrderItemFBs.add(new OrderItemFB("", "Nam", "vừa xong", "Chuyển hàng từ 7 Trung Văn, Từ Liêm đến 75 Giải Phóng"));
        alOrderItemFBs.add(new OrderItemFB("", "Phương", "1 phút", "Chuyển hàng từ 17 Trung Văn, Từ Liêm đến 75 Giải Phóng"));
        orderFBAdapter = new OrderFBAdapter(getActivity(), R.layout.item_order_facebook, alOrderItemFBs);
        lvOrderFB.setAdapter(orderFBAdapter);
        orderFBAdapter.notifyDataSetChanged();
        return root;
    }
}
