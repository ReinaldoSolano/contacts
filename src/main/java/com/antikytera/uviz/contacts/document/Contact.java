package com.antikytera.uviz.contacts.document;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document
public class Contact {

	private String name;
	private String email;
	private String phone;
	private String formattedPhone;
	private List<Contact> contacts;

}
