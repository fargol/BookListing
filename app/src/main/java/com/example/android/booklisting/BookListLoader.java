package com.example.android.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

public class BookListLoader extends AsyncTaskLoader<List<BookingList>>{

    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;

    public BookListLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }

}
