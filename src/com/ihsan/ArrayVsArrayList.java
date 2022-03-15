package com.ihsan;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
//        Create an array
        String[] myFriends = new String[4];
        String[] myFriends2 = {"Fadel" , "Daffa", "Wildan"};


//        Creating an arrayList
        ArrayList<String> myFriendsArrayList = new ArrayList<>();

//        Inserting element
        myFriends[0] = "Dimas";
        myFriends[1] = "Dedy";
        myFriends[2] = "Dodit";
        myFriends[3] = "Dodo";

        myFriendsArrayList.add("Carl Johnson");
        myFriendsArrayList.add("Russel Northrope");

//        Accessing element
        System.out.println(myFriends[0]);
        System.out.println(myFriendsArrayList.get(0));
        System.out.println(myFriendsArrayList.get(1));

//        Editing element
        myFriendsArrayList.set(1, "Jonas Donkey");
        System.out.println(myFriendsArrayList.get(1));

//        Removing an element
        myFriendsArrayList.remove(1);
        System.out.println(myFriendsArrayList.get(0));

//        Adding an element
        myFriendsArrayList.add("Hello");

        System.out.println(myFriendsArrayList.size());
    }

}
