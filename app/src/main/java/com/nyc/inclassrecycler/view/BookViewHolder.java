package com.nyc.inclassrecycler.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nyc.inclassrecycler.R;
import com.nyc.inclassrecycler.model.Book;

/**
 * Created by c4q on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder{
    private TextView title;
    private TextView author;
    private TextView publisher;

    public BookViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.book_title_textview);
        author = (TextView) itemView.findViewById(R.id.book_author_textview);
        publisher = (TextView) itemView.findViewById(R.id.book_publisher_textview);
    }
    public void onBind(Book book) {
        title.setText("Title: " + book.getTitle());
        author.setText("Author: " + book.getAuthor());
        publisher.setText("Publisher: " + book.getPublisher());
    }
}
