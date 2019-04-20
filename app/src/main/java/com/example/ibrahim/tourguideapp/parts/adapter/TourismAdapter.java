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
import com.example.ibrahim.tourguideapp.parts.Tourism;

import java.util.ArrayList;

public class TourismAdapter extends ArrayAdapter<Tourism> {
    private Context context;
    private int resource;
    private ArrayList<Tourism> objects;

    public TourismAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Tourism> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TourismViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, null);

            viewHolder = new TourismViewHolder();
            viewHolder.tourismImage = convertView.findViewById(R.id.tourism_image);
            viewHolder.tourismName = convertView.findViewById(R.id.tourism_name);
            viewHolder.tourismAddress = convertView.findViewById(R.id.tourism_address);
            viewHolder.tourismDetail = convertView.findViewById(R.id.tourism_overview);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (TourismViewHolder) convertView.getTag();
        }

        Tourism tourism = objects.get(position);
        viewHolder.tourismImage.setImageResource(tourism.getTourismImage());
        viewHolder.tourismName.setText(tourism.getTourismName());
        viewHolder.tourismAddress.setText(tourism.getTourismAddress());
        viewHolder.tourismDetail.setText(tourism.getTourismDetail());

        return convertView;
    }
}

class TourismViewHolder {
    ImageView tourismImage;
    TextView tourismName;
    TextView tourismAddress;
    TextView tourismDetail;
}
