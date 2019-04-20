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
import com.example.ibrahim.tourguideapp.parts.Park;

import java.util.ArrayList;

public class ParkAdapter extends ArrayAdapter<Park> {

    private Context context;
    private int resource;
    private ArrayList<Park> objects;

    public ParkAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Park> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ParkViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, null);

            viewHolder = new ParkViewHolder();
            viewHolder.parkImage = convertView.findViewById(R.id.park_image);
            viewHolder.parkName = convertView.findViewById(R.id.park_name);
            viewHolder.parkAddress = convertView.findViewById(R.id.park_address);
            viewHolder.parkOpenCloseTime = convertView.findViewById(R.id.park_open_close_time);
            viewHolder.parkOverview = convertView.findViewById(R.id.park_overview);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ParkViewHolder) convertView.getTag();
        }

        Park park = objects.get(position);
        viewHolder.parkImage.setImageResource(park.getParkImage());
        viewHolder.parkName.setText(park.getParkName());
        viewHolder.parkAddress.setText(park.getParkAddress());
        viewHolder.parkOpenCloseTime.setText(park.getParkOpenCloseTime());
        viewHolder.parkOverview.setText(park.getParkOverview());

        return convertView;
    }
}

class ParkViewHolder {
    ImageView parkImage;
    TextView parkName;
    TextView parkAddress;
    TextView parkOpenCloseTime;
    TextView parkOverview;
}
