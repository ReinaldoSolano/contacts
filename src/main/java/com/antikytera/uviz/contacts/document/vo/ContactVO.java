package com.antikytera.uviz.contacts.document.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ContactVO {
	private String name;
    private String email;
    private String phone;
    private String formattedPhone;
    private List<ContactVO> contacts;
}
