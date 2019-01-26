//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.27 at 02:11:01 AM MSK 
//


package com.epam.rymasheuski.springboot.soap.web.services.contacts;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.rymasheuski.springboot.soap.web.services.contacts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.rymasheuski.springboot.soap.web.services.contacts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllContactsResponse }
     * 
     */
    public GetAllContactsResponse createGetAllContactsResponse() {
        return new GetAllContactsResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link DeleteContactRequest }
     * 
     */
    public DeleteContactRequest createDeleteContactRequest() {
        return new DeleteContactRequest();
    }

    /**
     * Create an instance of {@link DeleteContactResponse }
     * 
     */
    public DeleteContactResponse createDeleteContactResponse() {
        return new DeleteContactResponse();
    }

    /**
     * Create an instance of {@link GetContactResponse }
     * 
     */
    public GetContactResponse createGetContactResponse() {
        return new GetContactResponse();
    }

    /**
     * Create an instance of {@link GetContactRequest }
     * 
     */
    public GetContactRequest createGetContactRequest() {
        return new GetContactRequest();
    }

    /**
     * Create an instance of {@link SaveContactResponse }
     * 
     */
    public SaveContactResponse createSaveContactResponse() {
        return new SaveContactResponse();
    }

    /**
     * Create an instance of {@link GetAllContactsRequest }
     * 
     */
    public GetAllContactsRequest createGetAllContactsRequest() {
        return new GetAllContactsRequest();
    }

    /**
     * Create an instance of {@link UpdateContactRequest }
     * 
     */
    public UpdateContactRequest createUpdateContactRequest() {
        return new UpdateContactRequest();
    }

    /**
     * Create an instance of {@link UpdateContactResponse }
     * 
     */
    public UpdateContactResponse createUpdateContactResponse() {
        return new UpdateContactResponse();
    }

    /**
     * Create an instance of {@link SaveContactRequest }
     * 
     */
    public SaveContactRequest createSaveContactRequest() {
        return new SaveContactRequest();
    }

}
