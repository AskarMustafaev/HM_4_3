package com.example.HM_4_3;

import java.io.Serializable;

public class Continent implements Serializable {

    String continent;
    private final String shape;

    public Continent(String continent, String shape) {
        this.continent = continent;
        this.shape = shape;
    }

    public String getContinent() {
        return continent;
    }

    public String getShape() {
        return shape;
    }
}