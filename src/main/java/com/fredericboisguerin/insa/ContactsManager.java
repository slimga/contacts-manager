package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.Iterator;


public class ContactsManager {

    ArrayList<Contact> contacts=new ArrayList<Contact> ();
    public void addContact(String name, String email, String phoneNumber) {
        Contact contact=new Contact();
        contact.name=name;
        contact.email=email;
        contact.phoneNumber=phoneNumber;
        this.contacts.add(contact);
    }

    public void printAllContacts() {
        Iterator <Contact> iterator=this.contacts.iterator();
        Contact contact=new Contact();
        while(iterator.hasNext()){
            System.out.println("Name"+ iterator.next().name);
        }
    }

    public void searchContactByName(String name) {

    }
}
