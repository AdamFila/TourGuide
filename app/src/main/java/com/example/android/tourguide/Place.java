package com.example.android.tourguide;

class Place {

    /** Default translation for the word */
    private String mName;

    /** Miwok translation for the word */
    private String mAddress;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public Place(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the address of the place.
     */
    public String getAddress() { return mAddress;}

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
