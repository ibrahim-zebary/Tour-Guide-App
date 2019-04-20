package com.example.ibrahim.tourguideapp.parts.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibrahim.tourguideapp.R;
import com.example.ibrahim.tourguideapp.parts.Restaurant;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    private Context context;
    private int resource;
    private ArrayList<Restaurant> objects;

    public RestaurantAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Restaurant> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        RestaurantViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, null);

            viewHolder = new RestaurantViewHolder();
            viewHolder.restaurantImage = convertView.findViewById(R.id.restaurant_image);
            viewHolder.restaurantName = convertView.findViewById(R.id.restaurant_name);
            viewHolder.restaurantAddress = convertView.findViewById(R.id.restaurant_address);
            viewHolder.restaurantOpenCloseTime = convertView.findViewById(R.id.restaurant_open_close_time);
            viewHolder.restaurantPhone = convertView.findViewById(R.id.restaurant_phone);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (RestaurantViewHolder) convertView.getTag();
        }

        Restaurant restaurant = objects.get(position);
        viewHolder.restaurantImage.setImageResource(restaurant.getRestaurantImage());
        viewHolder.restaurantName.setText(restaurant.getRestaurantName());
        viewHolder.restaurantAddress.setText(restaurant.getRestaurantAddress());
        viewHolder.restaurantOpenCloseTime.setText(restaurant.getRestaurantOpenCloseTime());
        viewHolder.restaurantPhone.setText(restaurant.getRestaurantPhone());

        return convertView;
    }
}

class RestaurantViewHolder {
    ImageView restaurantImage;
    TextView restaurantName;
    TextView restaurantAddress;
    TextView restaurantOpenCloseTime;
    TextView restaurantPhone;
}
