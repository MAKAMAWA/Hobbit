package com.example.yuding.hobbit2;

/**
 * Created by yuding on 2017/3/8.
 */

public class Info {

    private String hName;

    private String hInformation;

    private int hImageResourceId;

    public Info(String name, String information){
        hName=name;
        hInformation=information;
    }

    public Info(String name, String information, int imageResourceId){
        hName=name;
        hInformation=information;
        hImageResourceId=imageResourceId;
    }

    public String getName(){
        return hName;
    }

    public String getInformation(){
        return hInformation;
    }

    public int getImageResourceId(){return hImageResourceId;}
}
