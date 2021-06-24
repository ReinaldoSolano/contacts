package com.antikytera.uviz.contacts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.antikytera.uviz.contacts.document.Contact;

public interface ContactRepository extends MongoRepository<Contact, String>{

}
