package com.example.ibrahim.tourguideapp.parts.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ibrahim.tourguideapp.R;
import com.example.ibrahim.tourguideapp.parts.Hotel;
import com.example.ibrahim.tourguideapp.parts.adapter.HotelAdapter;

import java.util.ArrayList;

public class HotelFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotel_fragment, container, false);

        ListView list = view.findViewById(R.id.hotel_list_view);

        ArrayList<Hotel> hotelList = new ArrayList<>();

        hotelList.add(new Hotel(R.drawable.mariana_hotel,
                getString(R.string.mariana_name),
                getString(R.string.mariana_address),
                getString(R.string.mariana_phone)));

        hotelList.add(new Hotel(R.drawable.rixos_hotel,
                getString(R.string.rixos_name),
                getString(R.string.rixos_address),
                getString(R.string.rixos_phone)));

        hotelList.add(new Hotel(R.drawable.copthorne_hotel,
                getString(R.string.copthorne_baranan_name),
                getString(R.string.copthorne_baranan_address),
                getString(R.string.copthorne_baranan_phone)));

        HotelAdapter adapter = new HotelAdapter(getContext(), R.layout.hotel_list_item, hotelList);
        list.setAdapter(adapter);

        list.setDividerHeight(0);

        return view;
    }
}
