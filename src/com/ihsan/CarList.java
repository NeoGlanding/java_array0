package com.ihsan;

import java.util.ArrayList;

public class CarList {
    private ArrayList<String> arrayList = new ArrayList<String>();

    public void addItem(String name) {
        arrayList.add(name);
    }

    public String getItem(int position) {
        return arrayList.get(position);
    }

    public void modifiyList(int position, String name) {
        arrayList.set(position, name);
    }

    public void showSize() {
        System.out.println("You have " + arrayList.size() + " total of items");
        for (int i = 0 ; i < arrayList.size() ; i++) {
            System.out.println((i + 1) + ". " + arrayList.get(i));
        }
    }

}
