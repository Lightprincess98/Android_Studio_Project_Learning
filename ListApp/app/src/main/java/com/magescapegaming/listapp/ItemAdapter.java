package com.magescapegaming.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflator;
    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context context, String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        descriptions = d;
        mInflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflator.inflate(R.layout.my_listview_detail, null);
        TextView txtNameView = (TextView) v.findViewById(R.id.txtNameView);
        TextView txtPriceView = (TextView) v.findViewById(R.id.txtPriceView);
        TextView txtDescriptionView = (TextView) v.findViewById(R.id.txtDescprtionView);

        String name = items[position];
        String description = descriptions[position];
        String price = prices[position];

        txtNameView.setText(name);
        txtPriceView.setText(price);
        txtDescriptionView.setText(description);

        return v;
    }
}
