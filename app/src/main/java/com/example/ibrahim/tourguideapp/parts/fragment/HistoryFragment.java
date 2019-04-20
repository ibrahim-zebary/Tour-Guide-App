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
import com.example.ibrahim.tourguideapp.parts.History;
import com.example.ibrahim.tourguideapp.parts.adapter.HistoryAdapter;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.history_fragment, container, false);

        ArrayList<History> historyList = new ArrayList<>();

        historyList.add(new History(R.drawable.erbil_citadel,
                getString(R.string.erbil_citadel_name),
                getString(R.string.erbil_citadel_detail),
                null));

        historyList.add(new History(R.drawable.amedi,
                getString(R.string.amedi_name),
                getString(R.string.amedi_detail),
                null));

        historyList.add(new History(R.drawable.sherwana_castle,
                getString(R.string.sherwana_castle_name),
                getString(R.string.sherwana_castle_detail),
                null));

        HistoryAdapter adapter = new HistoryAdapter(getContext(), R.layout.history_list_item, historyList);

        ListView list = view.findViewById(R.id.history_list_view);
        list.setDividerHeight(0);
        list.setAdapter(adapter);

        return view;
    }
}
