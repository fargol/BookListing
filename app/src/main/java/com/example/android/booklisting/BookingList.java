package com.example.android.booklisting;

/**
 * Created by farno on 1/4/2018.
 */

public class BookingList {
    private String mTitle;
    private String mAuthor;
    private String mUrl;
    public  BookingList(String title, String author,String url){
        mTitle=title;
        mAuthor=author;
        mUrl= url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }
    public String getUrl() {
        return mUrl;
    }

}
