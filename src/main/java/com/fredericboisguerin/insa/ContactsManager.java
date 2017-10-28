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
        String contact2Print=null;
        while(iterator.hasNext()){
            contact=iterator.next();
            if (contact.name != null) {
                contact2Print = "contact: " + contact.name;
                if (contact.email != null)
                    contact2Print = contact2Print + ", " + contact.email;
                if (contact.phoneNumber != null)
                    contact2Print = contact2Print + ", " + contact.phoneNumber;
            }
            System.out.println(contact2Print);
        }
    }

    public void searchContactByName(String name) {
    /** Pour changer, utilisation d'un simple indice et non pas d'iterateur **/
        Contact contact=new Contact();
        String contact2Print=null;
        for (int i=0;i<this.contacts.size();i++) {
        //System.out.println(i);
            contact = this.contacts.get(i);
            if (contact.name.contains(name)){
                    contact2Print = contact.name;
                if (contact.email != null) contact2Print = contact2Print + ", " + contact.email;
                if (contact.phoneNumber != null)
                    contact2Print = contact2Print + ", " + contact.phoneNumber;
                System.out.println(contact2Print);
            }
        }
    }
}
