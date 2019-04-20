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
import com.example.ibrahim.tourguideapp.parts.Hotel;
import com.example.ibrahim.tourguideapp.parts.fragment.HotelFragment;

import java.util.ArrayList;

public class HotelAdapter extends ArrayAdapter<Hotel> {
    Context context;
    int resource;
    ArrayList<Hotel> objects;
    public HotelAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Hotel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        HotelViewHolder viewHolder = null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, null);

            viewHolder = new HotelViewHolder();
            viewHolder.hotelImage = convertView.findViewById(R.id.hotel_image);
            viewHolder.hotelName = convertView.findViewById(R.id.hotel_name);
            viewHolder.hotelAddress = convertView.findViewById(R.id.hotel_address);
            viewHolder.hotelPhone = convertView.findViewById(R.id.hotel_phone);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (HotelViewHolder) convertView.getTag();
        }

        Hotel hotel = objects.get(position);

        viewHolder.hotelImage.setImageResource(hotel.getHotelImage());
        viewHolder.hotelName.setText(hotel.getHotelName());
        viewHolder.hotelAddress.setText(hotel.getHotelAddress());
        viewHolder.hotelPhone.setText(hotel.getHotelPhone());

        return convertView;
    }
}
class HotelViewHolder {
    ImageView hotelImage;
    TextView hotelName;
    TextView hotelAddress;
    TextView hotelPhone;

}
