package com.example.ram.project2;

import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

import static android.R.attr.id;
import static com.example.ram.project2.R.id.imageView;

public class MainActivity extends AppCompatActivity {

    protected static final String EXTRA_RES_ID = "POS";
    protected static final String DEALER = "DEALER";

    //String holding the names of the cars
    private String[] name={"Bentley","Audi","Lexus","BMW","Jeep","Mercedes","Chevrolet","Honda","Skoda","Jaguar","GMC"};

    //image array holding the integer ID of the images in the drawable folder
    int[] images={R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4, R.drawable.image5,
            R.drawable.image6,R.drawable.image7, R.drawable.image8,
            R.drawable.image9, R.drawable.image10, R.drawable.image11};

    //ArrayList that holds the bitmaps of the images
    private ArrayList<Bitmap> bitmaps;

    //ArrayList that holds the object cars of the type class Car
    ArrayList<Car> cars;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Function that converts images to bitmaps and stores it in bitmaps
        bitmaps=getBitmaps();

        //ArrayList cars that holds the String name, integer ID and bitmaps of every car
        cars =getCars();

        //Getting gridView ID
        GridView gridview = (GridView) findViewById(R.id.gridview);

        //Activate contextMenu for the gridView items so that it can respond on long click
        registerForContextMenu(gridview);

        // Create a new ImageAdapter and set it as the Adapter for this GridView
        gridview.setAdapter(new CarImageAdapter(this, cars));

        // Set an setOnItemClickListener on the GridView
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                //Create an Intent to start the ImageViewActivity
                Intent intent = new Intent(MainActivity.this,
                        ImageViewActivity.class);

                // Add the ID of the thumbnail to display as an Intent Extra
                intent.putExtra(EXTRA_RES_ID, (int) id);

                //Add the name of the car to show the website
                intent.putExtra(DEALER,name[position]);

                String s=Long.toString(id);
                Log.i(EXTRA_RES_ID,s);

                // Start the ImageViewActivity
                startActivity(intent);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        //Creating inflater
        MenuInflater inflater=getMenuInflater();
        //converting the menu xml to a view object
        inflater.inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch(item.getItemId())
        {
            case R.id.option1:  //Create an Intent to start the ImageViewActivity
                                Intent intent = new Intent(MainActivity.this,
                                ImageViewActivity.class);
                                // Add the ID of the thumbnail to display as an Intent Extra
                                intent.putExtra(EXTRA_RES_ID, images[info.position]);
                                //Add the name of the car to show the website
                                intent.putExtra(DEALER,name[info.position]);
                                // Start the ImageViewActivity
                                startActivity(intent);

                                String s=Long.toString(images[info.position]);
                                break;
            case R.id.option2:  //Calling a function to show website depending on the image clicked
                                showWebsite(info.position);
                                break;
            case R.id.option3:  intent=new Intent(MainActivity.this,DealerViewActivity.class);
                                //putting the position of the image to identify the exact dealers to display
                                intent.putExtra(DEALER,name[info.position]);
                                startActivity(intent);
                                break;

        }
        return super.onContextItemSelected(item);
    }

    private void showWebsite(int pos)
    {
        //Getting the car name based on the position
        String car_name=name[pos];
        Uri uri;
        Intent intent;
        //Function that displays the website of the car
        switch(car_name)
        {
            case "Bentley" : uri = Uri.parse("https://www.bentleymotors.com/en.html");
                             intent = new Intent(Intent.ACTION_VIEW, uri);
                             startActivity(intent);
                                break;
            case "Audi"    : uri = Uri.parse("http://www.audi.com/en.html");
                             intent = new Intent(Intent.ACTION_VIEW, uri);
                             startActivity(intent);
                                break;
            case "BMW"     : uri = Uri.parse("https://www.bmw.com/en/home.html");
                             intent = new Intent(Intent.ACTION_VIEW, uri);
                             startActivity(intent);
                                break;
            case "Jeep"    : uri = Uri.parse("https://www.jeep.com/");
                             intent = new Intent(Intent.ACTION_VIEW, uri);
                             startActivity(intent);
                                break;
            case "Mercedes": uri = Uri.parse("https://www.mercedes-benz.co.in/content/india/mpc/mpc_india_website/enng/home_mpc/passengercars.html");
                             intent = new Intent(Intent.ACTION_VIEW, uri);
                             startActivity(intent);
                                break;
            case "Chevrolet":   uri = Uri.parse("http://www.chevrolet.com/");
                                intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                break;
            case "Honda"    :   uri = Uri.parse("http://www.honda.com/");
                                intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                break;
            case "Skoda"    :   uri = Uri.parse("http://www.skoda-auto.co.in/");
                                intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                break;
            case "Jaguar"   :   uri = Uri.parse("http://www.howardorloffjaguar.com/");
                                intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                break;
            case "GMC"      :   uri = Uri.parse("http://www.castlebpg.com/");
                                intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                break;
            case "Lexus"    :   uri = Uri.parse("http://www.lexus.com/");
                                intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                break;
        }
    }

    //Creating the ArrayList of type car
    private ArrayList<Car> getCars()
    {
        ArrayList<Car> cars=new ArrayList<Car>();
        for(int i=0;i<images.length;i++)
        {
            cars.add(new Car(name[i], images[i], bitmaps.get(i)));
        }
        return cars;
    }

    //Creating the Bitmap ArrayList of each image
    public ArrayList<Bitmap> getBitmaps()
    {
        ArrayList<Bitmap> bitmaps=new ArrayList<Bitmap>();
        Bitmap bitmap;
        for(int i=0;i<images.length;i++)
        {
            bitmap=Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.getResources(),images[i]),325  ,370, Boolean.TRUE);
            bitmaps.add(bitmap);
        }
        return bitmaps;
    }
}

