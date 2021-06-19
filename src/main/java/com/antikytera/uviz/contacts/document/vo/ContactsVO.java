package com.antikytera.uviz.contacts.document.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ContactsVO {
	private String name;
    private String email;
    private String phone;
    private String formattedPhone;
}
