package com.antikytera.uviz.contacts.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.antikytera.uviz.contacts.document.vo.ContactsVO;
import com.antikytera.uviz.contacts.service.ContactsService;
@Service
public class ContactsServiceImpl implements ContactsService {

	@Override
	public List<ContactsVO> getAll() {
		List<ContactsVO> vos = new ArrayList<>();
		ContactsVO vo1 = ContactsVO.builder().name("Reinaldo Solano").email("reinaldo.solano@antikytera.com")
				.phone("+5511919919911").formattedPhone("BRA919919911").build();
		ContactsVO vo2 = ContactsVO.builder().name("Pedro Miranda").email("pedro.miranda@antikytera.com")
				.phone("+5511929929922").formattedPhone("BRA929929922").build();
		ContactsVO vo3 = ContactsVO.builder().name("Eduardo Seige").email("eduardo.seige@antikytera.com")
				.phone("+5511939939933").formattedPhone("BRA939939933").build();
		vos.add(vo1);
		vos.add(vo2);
		vos.add(vo3);
		return vos;
	}

}
