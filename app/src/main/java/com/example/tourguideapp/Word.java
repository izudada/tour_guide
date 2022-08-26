package com.example.tourguideapp;

public class Word {
    /** Title of the tourist center */
    private String mTitle;

    /** Description of the tourist center */
    private String mDescription;

    /** Description of the tourist center */
    private String mAddress;

    /** Image resource Id for the word */
    private int mImageResourceId = 0;

    /** states if an image is present or not*/
//    private static int NO_IMAGE_PROVIDED = -1;
//
    public  Word(String title, String description, String address, int imageResourceId) {
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /** Get the title of the tourist center*/
    public String getTitle() {
        return mTitle;
    }

    /** Get the description of the tourist center*/
    public String getDesription() {
        return mDescription;
    }

    /** Get the address of the tourist center*/
    public String getAddress() {
        return mAddress;
    }

    /** Get the image of the tourist center */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
