package com.example.ram.project2;

/**
 * Created by ram_n on 10/5/2017.
 */

//Dealer class that defines the basic components of the Dealer object
public class Dealer {
    String name;
    String address;

    public Dealer(String name, String address)
    {
        this.address=address;
        this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddr(String address)
    {
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
}
