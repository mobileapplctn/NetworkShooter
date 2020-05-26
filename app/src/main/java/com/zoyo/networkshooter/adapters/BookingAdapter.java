package com.zoyo.networkshooter.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.zoyo.networkshooter.R;
import com.zoyo.networkshooter.pojo.BookingsModel;

import java.util.ArrayList;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.BookingData> {
    private ArrayList<BookingsModel> bookinglist = new ArrayList<>();
    Context context;

    public BookingAdapter(Context context, ArrayList<BookingsModel> bookinglist) {
        this.bookinglist = bookinglist;
        this.context = context;
        notifyDataSetChanged();
    }
    @Override
    public BookingData onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_bookingslist, parent, false);
        return new BookingData(view);
    }


    @Override
    public void onBindViewHolder( BookingData holder, int position) {
        try {
            Log.i("list", String.valueOf(position));
//            BookingsModel bookingDetail = bookinglist.get(position);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
//        return bookinglist.size();
        return 3;
    }

    public static class BookingData extends RecyclerView.ViewHolder {
        private final View mView;
        private final TextView tvSize,tvPrize;
        private final CheckBox cbBooked;

        public BookingData(View itemView) {
            super(itemView);
            mView = itemView;
            tvSize = (TextView) itemView.findViewById(R.id.tvSize);
            tvPrize = (TextView) itemView.findViewById(R.id.tvPrize);
            cbBooked = (CheckBox) itemView.findViewById(R.id.cbBooked);

        }
    }
}
