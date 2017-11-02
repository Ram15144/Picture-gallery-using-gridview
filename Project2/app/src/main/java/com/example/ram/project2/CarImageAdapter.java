package com.example.ram.project2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.ram.project2.R.id.imageView;

/**
 * Created by ram_n on 10/3/2017.
 */

public class CarImageAdapter extends BaseAdapter {

    private static final int PADDING = 8;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    private Context mContext;          // Passed to ImageView
    private ArrayList<Car> cars;       // Adapter must store AdapterView's items

    // Save the list of image IDs and the context
    public CarImageAdapter(Context c, ArrayList<Car> cars) {
        mContext = c;
        this.cars = cars;
    }

    // Now the methods inherited from abstract superclass BaseAdapter

    // Return the number of items in the Adapter
    @Override
    public int getCount() {
        return cars.size();
    }

    // Return the data item at position
    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    // Will get called to provide the ID that
    // is passed to OnItemClickListener.onItemClick()
    @Override
    public long getItemId(int position) {
        return cars.get(position).getImg();
    }

    // Return an ImageView for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //View grid;

        LayoutInflater inflater =(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);
        }

        //The views of each image
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView);
        TextView tv= (TextView) convertView.findViewById(R.id.textView);

        Typeface mycustomfont=Typeface.createFromAsset(mContext.getAssets(), "fonts/libel.ttf");
        tv.setTypeface(mycustomfont);


        //Setting the Data of each image in grid view
        img.setImageBitmap(cars.get(position).getBmap());
        tv.setText(cars.get(position).getName());

        return convertView;

    }

}
