package com.example.ibrahim.tourguideapp.parts.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibrahim.tourguideapp.R;
import com.example.ibrahim.tourguideapp.parts.History;

import java.util.ArrayList;

public class HistoryAdapter extends ArrayAdapter<History> {

    private Context context;
    private int resource;
    private ArrayList<History> objects;

    public HistoryAdapter(@NonNull Context context, int resource, @NonNull ArrayList<History> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        HistoryViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, null);

            viewHolder = new HistoryViewHolder();
            viewHolder.historyImage = convertView.findViewById(R.id.history_image);
            viewHolder.historyName = convertView.findViewById(R.id.history_name);
            viewHolder.historyDetail = convertView.findViewById(R.id.history_detail);
            viewHolder.historyLocation = convertView.findViewById(R.id.history_location);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (HistoryViewHolder) convertView.getTag();
        }

        History history = objects.get(position);
        viewHolder.historyImage.setImageResource(history.getHistoryImage());
        viewHolder.historyName.setText(history.getHistoryName());
        viewHolder.historyDetail.setText(history.getHistoryDetail());
        viewHolder.historyLocation.setOnClickListener(getLocation);

        return convertView;
    }

    View.OnClickListener getLocation = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}

class HistoryViewHolder {
    ImageView historyImage;
    TextView historyName;
    TextView historyDetail;
    Button historyLocation;
}
