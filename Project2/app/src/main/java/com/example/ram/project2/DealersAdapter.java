package com.example.ram.project2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ram_n on 10/5/2017.
 */

public class DealersAdapter extends BaseAdapter {

    Activity activity;
    ArrayList<Dealer> dealers;

    public DealersAdapter(DealerViewActivity dealerViewActivity, ArrayList<Dealer> dealer) {
        activity=dealerViewActivity;
        dealers=dealer;
    }

    @Override
    public int getCount() {
        return dealers.size();
    }

    @Override
    public Object getItem(int position) {
        return dealers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater)activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            //inflate the each row view of the dealer preent in dealer_item_model.xml
            convertView=inflater.inflate(R.layout.dealer_item_model,parent,false);
        }

        //Getting the id's of the name and address of each dealer to set them
        TextView dealer_name= (TextView)convertView.findViewById(R.id.dealer_name);
        TextView dealer_addr= (TextView)convertView.findViewById(R.id.dealer_addr);

        //Setting the Name and Addres for each dealer
        dealer_name.setText(dealers.get(position).getName());
        dealer_addr.setText(dealers.get(position).getAddress());

        return convertView;
    }
}
