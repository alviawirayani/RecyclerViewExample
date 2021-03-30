package com.example.recyclerviewexample;

import android.os.Parcel;
import android.os.Parcelable;


public class Bag implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Bag(){

    }

    protected Bag(Parcel in){
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();

    }
    public static final Creator<Bag> CREATOR = new Creator<Bag>(){
       @Override
        public Bag createFromParcel(Parcel in){
           return new Bag(in);
       }
       @Override
        public Bag[] newArray(int size) {
           return new Bag[size];
       }
    };
    public String getName() {return name; }
    public void setName(String name) {this.name = name; }
    public  String getDetail() {return detail; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
