package com.example.HM_4_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.HM_4_3.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private final ArrayList<Country> countryList = new ArrayList<>();
    private FragmentCountryBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        CountryAdapter adapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void loadData() {
        if (getArguments() != null) {
            switch (getArguments().getString("country")) {
                case "Eurasia":
                    countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/1024px-Flag_of_Kyrgyzstan.svg.png"));
                    countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/1024px-Flag_of_Kyrgyzstan.svg.png"));
                    countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/1024px-Flag_of_Kyrgyzstan.svg.png"));
                    countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/1024px-Flag_of_Kyrgyzstan.svg.png"));
                    countryList.add(new Country("Kazakhstan", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1024px-Flag_of_Kazakhstan.svg.png"));
                    countryList.add(new Country("Kazakhstan", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1024px-Flag_of_Kazakhstan.svg.png"));
                    countryList.add(new Country("Kazakhstan", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1024px-Flag_of_Kazakhstan.svg.png"));
                    countryList.add(new Country("Kazakhstan", "Astana", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1024px-Flag_of_Kazakhstan.svg.png"));
                    countryList.add(new Country("Russia", "Moscow", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1024px-Flag_of_Russia.svg.png"));
                    countryList.add(new Country("Russia", "Moscow", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1024px-Flag_of_Russia.svg.png"));
                    countryList.add(new Country("Russia", "Moscow", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1024px-Flag_of_Russia.svg.png"));
                    countryList.add(new Country("Russia", "Moscow", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1024px-Flag_of_Russia.svg.png"));
                    break;
                case "Africa":
                    countryList.add(new Country("Egypt", "Cairo", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1024px-Flag_of_Egypt.svg.png"));
                    countryList.add(new Country("Egypt", "Cairo", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1024px-Flag_of_Egypt.svg.png"));
                    countryList.add(new Country("Egypt", "Cairo", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1024px-Flag_of_Egypt.svg.png"));
                    countryList.add(new Country("Egypt", "Cairo", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1024px-Flag_of_Egypt.svg.png"));
                    countryList.add(new Country("Niger", "Niamey", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Flag_of_Niger.svg/1024px-Flag_of_Niger.svg.png"));
                    countryList.add(new Country("Niger", "Niamey", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Flag_of_Niger.svg/1024px-Flag_of_Niger.svg.png"));
                    countryList.add(new Country("Niger", "Niamey", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Flag_of_Niger.svg/1024px-Flag_of_Niger.svg.png"));
                    countryList.add(new Country("Niger", "Niamey", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Flag_of_Niger.svg/1024px-Flag_of_Niger.svg.png"));
                    countryList.add(new Country("Uganda", "Kampala", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/1024px-Flag_of_Uganda.svg.png"));
                    countryList.add(new Country("Uganda", "Kampala", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/1024px-Flag_of_Uganda.svg.png"));
                    countryList.add(new Country("Uganda", "Kampala", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/1024px-Flag_of_Uganda.svg.png"));
                    countryList.add(new Country("Uganda", "Kampala", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/1024px-Flag_of_Uganda.svg.png"));
                    break;

                case "North America":
                    countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1024px-Flag_of_the_United_States.svg.png"));
                    countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1024px-Flag_of_the_United_States.svg.png"));
                    countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1024px-Flag_of_the_United_States.svg.png"));
                    countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1024px-Flag_of_the_United_States.svg.png"));
                    countryList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
                    countryList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
                    countryList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
                    countryList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
                    countryList.add(new Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
                    countryList.add(new Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
                    countryList.add(new Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
                    countryList.add(new Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
                    break;

                case "South America":
                    countryList.add(new Country("Brazil", "Brasilia", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1024px-Flag_of_Brazil.svg.png"));
                    countryList.add(new Country("Brazil", "Brasilia", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1024px-Flag_of_Brazil.svg.png"));
                    countryList.add(new Country("Brazil", "Brasilia", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1024px-Flag_of_Brazil.svg.png"));
                    countryList.add(new Country("Brazil", "Brasilia", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1024px-Flag_of_Brazil.svg.png"));
                    countryList.add(new Country("Argentina", "Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/240px-Flag_of_Argentina.svg.png"));
                    countryList.add(new Country("Argentina", "Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/240px-Flag_of_Argentina.svg.png"));
                    countryList.add(new Country("Argentina", "Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/240px-Flag_of_Argentina.svg.png"));
                    countryList.add(new Country("Argentina", "Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/240px-Flag_of_Argentina.svg.png"));
                    countryList.add(new Country("Chile", "Santiago", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/1024px-Flag_of_Chile.svg.png"));
                    countryList.add(new Country("Chile", "Santiago", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/1024px-Flag_of_Chile.svg.png"));
                    countryList.add(new Country("Chile", "Santiago", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/1024px-Flag_of_Chile.svg.png"));
                    countryList.add(new Country("Chile", "Santiago", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/1024px-Flag_of_Chile.svg.png"));
                    break;

                case "Australia":
                    countryList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/1024px-Flag_of_Australia_%28converted%29.svg.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/1024px-Flag_of_Australia_%28converted%29.svg.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/1024px-Flag_of_Australia_%28converted%29.svg.png"));
                    countryList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/1024px-Flag_of_Australia_%28converted%29.svg.png"));
                    countryList.add(new Country("NewZeeland", "Wellington", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1024px-Flag_of_New_Zealand.svg.png"));
                    countryList.add(new Country("NewZeeland", "Wellington", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1024px-Flag_of_New_Zealand.svg.png"));
                    countryList.add(new Country("NewZeeland", "Wellington", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1024px-Flag_of_New_Zealand.svg.png"));
                    countryList.add(new Country("NewZeeland", "Wellington", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1024px-Flag_of_New_Zealand.svg.png"));
                    break;
                case  "Antarctica":
                    countryList.add(new Country("Антарктика","тут никого нет","https://kino.vl.ru/kino/images/big_10486.jpg"));

            }
        }
    }
}
