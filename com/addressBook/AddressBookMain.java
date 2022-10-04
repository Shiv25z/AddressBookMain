package com.addressBook;

import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("--------------Welcome to Address Book Program--------------");
        Contacts.newContact("Shivam","Zagade","Pune","Maharashtra","411010","9219123194","ajfnakj@gmail.com");
    }
    class Contacts{
        static void newContact(String firstName, String lastName, String address, String state, String zipCode, String phoneNo, String email){
            ArrayList<String> contact = new ArrayList<>(7); // using arraylist to store the details of person in addressbook
            contact.add(firstName);
            contact.add(lastName);
            contact.add(address);
            contact.add(state);
            contact.add(zipCode);
            contact.add(phoneNo);
            contact.add(email);

            System.out.println(contact);


        }
    }
}
