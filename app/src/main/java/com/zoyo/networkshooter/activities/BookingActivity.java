package com.zoyo.networkshooter.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.zoyo.networkshooter.R;
import com.zoyo.networkshooter.adapters.BookingAdapter;
import com.zoyo.networkshooter.pojo.BookingsModel;

import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity {

    ImageView drawerOpen;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    BookingAdapter bookingAdapter;
    ArrayList<BookingsModel> bookingsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerSizeandprize);
        set_adapter();
    }

    private void set_adapter() {
        bookingAdapter = new BookingAdapter(BookingActivity.this, bookingsList);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(bookingAdapter);
    }
}
