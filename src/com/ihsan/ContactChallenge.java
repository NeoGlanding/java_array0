package com.ihsan;

import java.util.ArrayList;

class Contact {
    private String name;
    private int code;
    private String number;

    public Contact(String name, int code, String number) {
        this.name = name;
        this.code = code;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    public String getFull() {
        return name + " => (" + code + ") " + number;
    }
}

class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addContact(Contact con) {
        if (contacts.size() == 0) {
            System.out.println(con.getName() + " added");
            contacts.add(con);
            return true;
        }

        for (int i = 0 ; i < contacts.size() ; i++) {
            if (contacts.get(i).getName() == con.getName()) {
                return false;
            }
        }
        contacts.add(con);
        return true;
    }

    public void getAllContacts() {
        for (int i = 0 ; i < contacts.size() ; i++) {
            System.out.println(contacts.get(i).getFull());
        }
    }
}

public class ContactChallenge {
    public static void main(String[] args) {
        Contact yusril = new Contact("Yusril", 62, "865784398");
        Contact dimas1 = new Contact("Dimas", 62, "865784398");
        Contact dimas2 = new Contact("Eko", 62, "865784398");
        MobilePhone myMobile = new MobilePhone("0873847389");

//        System.out.println("tst");
        myMobile.addContact(yusril);
        myMobile.addContact(dimas1);
        myMobile.addContact(dimas2);


        myMobile.getAllContacts();
    }
}
