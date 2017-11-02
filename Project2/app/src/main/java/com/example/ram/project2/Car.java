package com.example.ram.project2;

import android.graphics.Bitmap;

/**
 * Created by ram_n on 10/4/2017.
 */

//Car class that defines the basic components of the car object
public class Car {
    private String name;
    private Bitmap bitmap;
    private int img;

    public Car(String name, int img, Bitmap bitmap)
    {
        this.name=name;
        this.img=img;
        this.bitmap=bitmap;
    }
    public String getName()
    {
        return name;
    }
    public int getImg()
    {
        return img;
    }
    public Bitmap getBmap()
    {
        return bitmap;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public void setImg(int img)
    {
        this.img=img;
    }
    public void setBmap(Bitmap bitmap)
    {
        this.bitmap=bitmap;
    }
}
