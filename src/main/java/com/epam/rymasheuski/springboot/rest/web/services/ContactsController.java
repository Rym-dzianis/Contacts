package com.epam.rymasheuski.springboot.rest.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/contacts")
public class ContactsController {

	@Autowired
	private ContactsService contactsService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Contact> findAll() {
		return contactsService.getAllContacts();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Contact find(@PathVariable int id) {
		return contactsService.getContactById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public int create(@RequestBody Contact contact) {
		contactsService.saveContact(contact);
		return contact.getId();
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public int update(@RequestBody Contact contact) {
		contactsService.updateContact(contact);
		return contact.getId();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public int delete(@PathVariable int id) {
		contactsService.deleteContact(id);
		return id;
	}
}
