package com.example.ibrahim.tourguideapp;

import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ibrahim.tourguideapp.databinding.ActivityMainBinding;
import com.example.ibrahim.tourguideapp.parts.fragment.HistoryFragment;
import com.example.ibrahim.tourguideapp.parts.fragment.HotelFragment;
import com.example.ibrahim.tourguideapp.parts.fragment.ParkFragment;
import com.example.ibrahim.tourguideapp.parts.fragment.RestaurantFragment;
import com.example.ibrahim.tourguideapp.parts.fragment.TourismFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ArrayList fragments = new ArrayList<>();
        fragments.add(new HotelFragment());
        fragments.add(new RestaurantFragment());
        fragments.add(new TourismFragment());
        fragments.add(new ParkFragment());
        fragments.add(new HistoryFragment());

        FragmentPagerAdapter adapter = new FragmentViewAdapter(getSupportFragmentManager(), fragments);

        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

    }
}
