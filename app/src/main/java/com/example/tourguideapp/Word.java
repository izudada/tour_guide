package com.example.tourguideapp;

public class Word {
    /** Title of the tourist center */
    private int mTitle;

    /** Description of the tourist center */
    private int mDescription;

    /** Description of the tourist center */
    private int mAddress;

    /** Image resource Id for the word */
    private int mImageResourceId;

    /** states if an image is present or not*/
    private static int NO_IMAGE_PROVIDED = -1;
//
    public  Word(int title, int description, int address, int imageResourceId) {
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /** Get the title of the tourist center*/
    public int getTitle() {
        return mTitle;
    }

    /** Get the description of the tourist center*/
    public int getDesription() {
        return mDescription;
    }

    /** Get the address of the tourist center*/
    public int getAddress() {
        return mAddress;
    }

    /** Get the image of the tourist center */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
