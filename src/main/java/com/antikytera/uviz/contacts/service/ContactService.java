package com.antikytera.uviz.contacts.service;

import java.util.List;

import com.antikytera.uviz.contacts.document.Contact;
import com.antikytera.uviz.contacts.document.vo.ContactVO;

public interface ContactService {

	List<ContactVO> getAll();

	void create(Contact contact);

}
