package com.antikytera.uviz.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antikytera.uviz.contacts.document.vo.ContactsVO;
import com.antikytera.uviz.contacts.service.ContactsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContactsController {
	private final ContactsService service;

	@GetMapping
	public List<ContactsVO> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "testando a pipeline";
	}
}
