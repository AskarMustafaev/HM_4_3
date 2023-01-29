package com.example.HM_4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.HM_4_3.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class ContinentsFragment extends Fragment implements OnClickListener {
    ArrayList<Continent> continentList = new ArrayList<>();
    private FragmentFirstBinding binding;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList, this);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        continentList.clear();
        continentList.add(new Continent("Eurasia", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Eurasia_%28orthographic_projection%29.svg/1200px-Eurasia_%28orthographic_projection%29.svg.png"));
        continentList.add(new Continent("Africa", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Africa_%28satellite_image%29.jpg/926px-Africa_%28satellite_image%29.jpg"));
        continentList.add(new Continent("North America", "https://mirplaneta.ru/images/273.jpg"));
        continentList.add(new Continent("South America", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/South_America_-_Blue_Marble_orthographic.jpg/220px-South_America_-_Blue_Marble_orthographic.jpg"));
        continentList.add(new Continent("Australia", "https://www.nationsonline.org/maps/australia-map-1400px.jpg"));
        continentList.add(new Continent("Antarctica", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Antarctica_surface.jpg/640px-Antarctica_surface.jpg"));
    }

    @Override
    public void onClick(Continent continent) {
        Bundle bundle = new Bundle();
        bundle.putString("country", continent.getContinent());
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();

    }
}