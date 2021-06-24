package com.antikytera.uviz.contacts.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.antikytera.uviz.contacts.document.Contact;
import com.antikytera.uviz.contacts.document.vo.ContactVO;
import com.antikytera.uviz.contacts.model.request.ContactRequest;
import com.antikytera.uviz.contacts.service.ContactService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContactController {
	private final ModelMapper modelMapper;
	private final ContactService service;

	@ApiOperation(	
			value="Cadastrar um novo contato", 
			response=ContactVO.class, 
			notes="Essa operação salva um novo registro com as informações de um contato.")
	@ApiResponses(value= {
			@ApiResponse(
					code=201, 
					message="Retorna um ResponseModel com uma mensagem de sucesso",
					response=ContactVO.class
					),
			@ApiResponse(
					code=500, 
					message="Caso tenhamos algum erro vamos retornar um ResponseModel com a Exception",
					response=ContactVO.class
					)
 
	})
	@PostMapping
	public void create(@RequestBody ContactRequest request) {
		service.create(modelMapper.map(request, Contact.class));
	}

	@GetMapping
	public List<ContactVO> getAll() {
		return service.getAll();
	}

}
