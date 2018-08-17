package com.example.spandanroy.travelbuddy.Others;

import android.net.Uri;

public class Place {

    private String mPlace;
    private int mImageResourceId;
    private Uri mLocationId;
    private String mAddress;


    public Place(String place, int imageResourceId, Uri locationId,String address) {
        mPlace = place;
        mImageResourceId = imageResourceId;
        mLocationId = locationId;
        mAddress=address;
    }

    public String getPlace() {
        return mPlace;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Uri getLocationId() {
        return mLocationId;
    }

    public String getAddress() { return mAddress; }
}
