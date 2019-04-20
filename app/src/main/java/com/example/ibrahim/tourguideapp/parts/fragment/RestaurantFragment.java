package com.example.ibrahim.tourguideapp.parts.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.ibrahim.tourguideapp.R;
import com.example.ibrahim.tourguideapp.parts.Restaurant;
import com.example.ibrahim.tourguideapp.parts.adapter.RestaurantAdapter;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.restaurant_fragment, container, false);

        ArrayList<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.samad_resturant,
                getString(R.string.sammad_name),
                getString(R.string.sammad_address),
                getString(R.string.sammad_open_close_time),
                getString(R.string.sammad_phone)));

        restaurantList.add(new Restaurant(R.drawable.malta_resturant,
                getString(R.string.malta_name),
                getString(R.string.malta_address),
                getString(R.string.malta_open_close_time),
                getString(R.string.malta_phone)));

        restaurantList.add(new Restaurant(R.drawable.diwan_resturant,
                getString(R.string.diwan_name),
                getString(R.string.diwan_address),
                getString(R.string.diwan_open_close_time),
                getString(R.string.diwan_phone)));

        RestaurantAdapter adapter = new RestaurantAdapter(getContext(), R.layout.restaurant_list_item, restaurantList);

        ListView list = view.findViewById(R.id.restaurant_list_view);
        list.setDividerHeight(0);
        list.setAdapter(adapter);


        return view;
    }
}
