package com.example.HM_4_3;

public class Country{
     private final String country;
     private final String capital;
     private final String flag;

    public Country(String country, String capital, String flag) {
        this.country = country;
        this.capital = capital;
        this.flag = flag;
    }

    public String getName() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public String getFlag() {
        return flag;
    }
}