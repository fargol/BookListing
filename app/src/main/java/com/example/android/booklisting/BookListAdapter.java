package com.example.android.booklisting;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.Date;
import java.util.List;

public class BookListAdapter extends ArrayAdapter<BookList> {
    public BookListAdapter(Context context, List<BookList> booklists) {
        super(context, 0, booklists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.booklist_item, parent, false);
        }

        BookList currentBookLists = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentWord.getTitle());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.author);
        defaultTextView.setText(currentWord.getAuthor());
    }
