package com.epam.rymasheuski.springboot.soap.web.services.contacts.contact;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.epam.rymasheuski.springboot.soap.web.services.contacts.Contact;

@Component
public class ContactRepository {
	private static final List<Contact> contacts = new ArrayList<Contact>();

	@PostConstruct
	public void initData() {
		Contact contact_1 = new Contact();
		contact_1.setId(1);
		contact_1.setName("Denis");
		contact_1.setAddress("Denis address");
		contacts.add(contact_1);
		
		Contact contact_2 = new Contact();
		contact_2.setId(2);
		contact_2.setName("Slava");
		contact_2.setAddress("Slava address");
		contacts.add(contact_2);
	}

	List<Contact> getAllContacts() {
		return contacts;
	}

	public Contact getContactById(int id) {
		Contact contact = contacts.stream().filter(cont -> cont.getId() == id).findFirst()
				.orElseThrow(() -> new RuntimeException());
		return contact;
	}

	public void saveContact(Contact contact) {
		Integer id = contact.getId();
		if (contacts.stream().anyMatch(cont -> cont.getId() == id)){
			throw new RuntimeException();
		}
		contacts.add(contact);
	}
	
	public void updateContact(Contact newContact) {
		Integer id = newContact.getId();
		
		Contact contact = contacts.stream().filter(cont -> cont.getId() == id).findFirst()
				.orElseThrow(() -> new RuntimeException());
		
		contacts.remove(contact);
		contacts.add(newContact);
	}
	
	public void deleteContact(int id) {
		contacts.removeIf(cont -> cont.getId() == id);
	}
}
