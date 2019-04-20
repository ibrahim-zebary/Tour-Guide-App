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
import com.example.ibrahim.tourguideapp.parts.Park;
import com.example.ibrahim.tourguideapp.parts.adapter.ParkAdapter;

import java.util.ArrayList;

public class ParkFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.park_fragment, container, false);

        ArrayList<Park> parkList = new ArrayList<>();
        parkList.add(new Park(R.drawable.shanidar_park,
                getString(R.string.shanadar_park_name),
                getString(R.string.shanadar_park_address),
                getString(R.string.shanadar_park_open_close_time),
                getString(R.string.shanadar_park_detail)));

        parkList.add(new Park(R.drawable.panormaya_azadi_park,
                getString(R.string.panorama_azadi_name),
                getString(R.string.panorama_azadi_address),
                getString(R.string.panorama_azadi_open_close_time),
                getString(R.string.panorama_azadi_detail)));

        parkList.add(new Park(R.drawable.azadi_park,
                getString(R.string.azadi_name),
                getString(R.string.azadi_address),
                getString(R.string.azadi_open_close_time),
                getString(R.string.azadi_detail)));

        ParkAdapter adapter = new ParkAdapter(getContext(), R.layout.park_list_item, parkList);

        ListView list = view.findViewById(R.id.park_list_view);
        list.setDividerHeight(0);
        list.setAdapter(adapter);

        return view;
    }
}
