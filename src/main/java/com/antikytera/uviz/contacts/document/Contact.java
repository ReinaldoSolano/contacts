package com.antikytera.uviz.contacts.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Contact {

	private String name;
	private String email;
	private String phone;
	private String formattedPhone;

}
