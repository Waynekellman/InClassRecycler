package com.nyc.inclassrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nyc.inclassrecycler.controller.BookAdapter;
import com.nyc.inclassrecycler.model.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Into the Water","Paula Hawkins","Riverhead Books"));
        books.add(new Book("The Hate U Give","Angie Thomas","Balzer + Bray"));
        books.add(new Book("A Court of Wings and Ruin (A Court of Thorns and Roses #3)", "Sarah J. Maas", "Bloomsbury Childrens Books"));
        books.add(new Book("Norse Mythology","Neil Gaiman","W. W. Norton & Company"));
        books.add(new Book("Caraval (Caraval #1)","Stephanie Garber","Flatiron Books"));
        books.add(new Book("Into the Water","Paula Hawkins","Riverhead Books"));
        books.add(new Book("The Hate U Give","Angie Thomas","Balzer + Bray"));
        books.add(new Book("A Court of Wings and Ruin (A Court of Thorns and Roses #3)", "Sarah J. Maas", "Bloomsbury Childrens Books"));
        books.add(new Book("Norse Mythology","Neil Gaiman","W. W. Norton & Company"));
        books.add(new Book("Caraval (Caraval #1)","Stephanie Garber","Flatiron Books"));

        BookAdapter bookAdapter = new BookAdapter(books);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(layoutManager);

    }
}
