package com.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("--------------Welcome to Address Book Program--------------");
        Contacts.newContact();

        Contacts.editContact();
    }

    static class Contacts {

        static ArrayList<String> contact = new ArrayList<>(7); // using arraylist to store the details of person in addressbook


        static void newContact() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the contact details  : ");
            System.out.println("Firstname\t LastName\t Address\t State\t Zipcode\t PhoneNo\t EmailId\t  : ");
            for (int i = 0; i < 7; i++) {
                String s = sc.nextLine();
                contact.add(s);
            }
            System.out.println(contact);
        }


        static void editContact() {
            Scanner sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Select parameters to edit : ");
            System.out.println("FirstName\t LastName\t Address\t State\t Zipcode\t PhoneNo\t EmailId\t  : ");

            String choice = sc.nextLine();

            switch (choice) {
                case "FirstName":
                    System.out.println("Enter new First name   : ");
                    String firstname = sc.nextLine();
                    contact.set(0, firstname);
                    break;
                case "LastName":
                    System.out.println("Enter the new Last name : ");
                    String lastname = sc.nextLine();
                    contact.set(1, lastname);
                    break;
                case "city":
                    System.out.println("Enter new Address : ");
                    String address = sc.nextLine();
                    contact.set(2, address);
                    break;
                case "state":
                    System.out.println("Enter the name to edit  : ");
                    String state = sc.nextLine();
                    contact.set(3, state);
                    break;
                case "zip":
                    System.out.println("Enter the name to edit  : ");
                    String zip = sc.nextLine();
                    contact.set(4, zip);
                    break;
                case "phone":
                    System.out.println("Enter the name to edit  : ");
                    String phone = sc.nextLine();
                    contact.set(5, phone);
                    break;
                case "email":
                    System.out.println("Enter the name to edit  : ");
                    String email = sc.nextLine();
                    contact.set(6, email);
                    break;
                default:
                    System.out.println("Enter proper field to edit ");


            }
            System.out.println(contact);
        }
    }
}


