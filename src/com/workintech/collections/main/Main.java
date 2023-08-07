package com.workintech.collections.main;

import com.workintech.collections.model.Contact;
import com.workintech.collections.model.GroceryList;
import com.workintech.collections.model.MobilePhone;


public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = Contact.createContact("Alice", "31415926");
        Contact contact2 = Contact.createContact("Bob", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");
        Contact contact4 = Contact.createContact("Jane", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        mobilePhone.printContacts();

        Contact updatedContact = Contact.createContact("Jane", "5245845");
        mobilePhone.updateContact(contact4, updatedContact);
        mobilePhone.printContacts();

        mobilePhone.removeContact(contact2);
        mobilePhone.printContacts();

//        Contact foundContact = mobilePhone.queryContact("Alice");
//        if (foundContact != null) {
//            System.out.println("Bulunan Kişi: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
//        } else {
//            System.out.println("Kişi bulunamadı.");
//        }
        Contact foundContact= mobilePhone.queryContact("Bob");
        if (foundContact != null) {
            System.out.println("Bulunan Kişi: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Kişi bulunamadı.");
        }
    }
}