package com.example.customlistview;
public class ListData {
    public String name;
    public String time;
    int ingredients, desc;
    public int image;

    public ListData(String name, String time, int ingredients, int desc, int image) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
        this.desc = desc;
        this.image = image;
    }
}