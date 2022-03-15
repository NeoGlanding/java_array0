package com.ihsan;

import java.util.ArrayList;
import java.util.Scanner;

class NewList {
    private ArrayList<String> list = new ArrayList<>();

    public void insertElement(String name) {
        list.add(name);
    }
    public void removeElement(int position) {
        list.remove(position);
    }

    public String find(int position) {
        return list.get(position);
    }

    public void showAll() {
        for (int i = 0 ; i < list.size() ; i++) System.out.println(list.get(i));
    }
}

public class TestMain {
    private static Scanner scanner = new Scanner(System.in);
    private static NewList list = new NewList();

    public static void main(String[] args) {

        boolean loop = true;
        while(loop) {
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    addElement();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }

    }

    public static void addElement() {
        System.out.println("Enter a New Element");
        String data = scanner.next();
        list.insertElement(data);
    }

    public static void showAll() {
        list.showAll();
    }

}
