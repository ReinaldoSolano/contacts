package com.antikytera.uviz.contacts.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antikytera.uviz.contacts.document.Contact;
import com.antikytera.uviz.contacts.document.vo.ContactVO;
import com.antikytera.uviz.contacts.repository.ContactRepository;
import com.antikytera.uviz.contacts.service.ContactService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContactServiceImpl implements ContactService {

	private final ModelMapper modelMapper;
	private final ContactRepository repository;

	@Override
	public void create(Contact contact) {
		contact.setFormattedPhone(formatPhone(contact.getPhone()));
		
		
		repository.save(contact);

	}

	@Override
	public List<ContactVO> getAll() {

		List<Contact> list = repository.findAll();

		List<ContactVO> vos = list.stream().map(c -> modelMapper.map(c, ContactVO.class)).collect(Collectors.toList());
		return vos;
	}

	private String formatPhone(String phone) {

		return "BRA" + phone;
	}

}
