package com.epam.rymasheuski.springboot.soap.web.services.contacts.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.epam.rymasheuski.springboot.soap.web.services.contacts.Contact;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.DeleteContactRequest;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.DeleteContactResponse;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.GetAllContactsRequest;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.GetAllContactsResponse;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.GetContactRequest;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.GetContactResponse;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.SaveContactRequest;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.SaveContactResponse;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.UpdateContactRequest;
import com.epam.rymasheuski.springboot.soap.web.services.contacts.UpdateContactResponse;


@Endpoint
public class ContactEndpoint {
	private static final String NAMESPACE_URI = "http://services.web.soap.springboot.rymasheuski.epam.com/contacts";
	
	private ContactRepository contactRepository;
	
	@Autowired
	public ContactEndpoint(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetContactRequest")
	@ResponsePayload
	public GetContactResponse getContactById(@RequestPayload GetContactRequest request) {
		Contact contact = contactRepository.getContactById(request.getId());
		
		GetContactResponse response = new GetContactResponse();
		response.setContact(contact);

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAllContactsRequest")
	@ResponsePayload
	public GetAllContactsResponse getAllContacts(@RequestPayload GetAllContactsRequest request) {
		List<Contact> contacts = contactRepository.getAllContacts();
		
		GetAllContactsResponse response = new GetAllContactsResponse();
		response.getContacts().addAll(contacts);

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteContactRequest")
	@ResponsePayload
	public DeleteContactResponse getContactById(@RequestPayload DeleteContactRequest request) {
		contactRepository.deleteContact(request.getId());
		
		DeleteContactResponse response = new DeleteContactResponse();
		response.setId(request.getId());

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateContactRequest")
	@ResponsePayload
	public UpdateContactResponse getContactById(@RequestPayload UpdateContactRequest request) {
		contactRepository.updateContact(request.getContact());
		
		UpdateContactResponse response = new UpdateContactResponse();
		response.setId(request.getContact().getId());

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SaveContactRequest")
	@ResponsePayload
	public SaveContactResponse getContactById(@RequestPayload SaveContactRequest request) {
		contactRepository.saveContact(request.getContact());
		
		SaveContactResponse response = new SaveContactResponse();
		response.setId(request.getContact().getId());

		return response;
	}
}
