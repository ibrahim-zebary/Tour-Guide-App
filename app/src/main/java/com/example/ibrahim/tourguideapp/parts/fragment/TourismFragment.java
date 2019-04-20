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
import com.example.ibrahim.tourguideapp.parts.Tourism;
import com.example.ibrahim.tourguideapp.parts.adapter.TourismAdapter;

import java.util.ArrayList;

public class TourismFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tourism_fragment, container, false);

        ArrayList<Tourism> tourismList = new ArrayList<>();
        tourismList.add(new Tourism(R.drawable.gali_ali_bag,
                getString(R.string.geli_ali_beg_name),
                getString(R.string.geli_ali_beg_address),
                getString(R.string.geli_ali_beg_detail)));

        tourismList.add(new Tourism(R.drawable.deralok_kurdistan,
                getString(R.string.gali_sherana_name),
                getString(R.string.gali_sherana_address),
                getString(R.string.gali_sherana_detail)));

        tourismList.add(new Tourism(R.drawable.ahmad_awa,
                getString(R.string.ahmad_awa_name),
                getString(R.string.ahmad_awa_address),
                getString(R.string.ahmad_awa_detail)));

        TourismAdapter adapter = new TourismAdapter(getContext(), R.layout.tourism_list_item, tourismList);

        ListView list = view.findViewById(R.id.tourism_list_view);
        list.setDividerHeight(0);
        list.setAdapter(adapter);

        return view;
    }
}
