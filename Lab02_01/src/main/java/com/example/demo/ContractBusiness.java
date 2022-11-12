package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ContractBusiness {
	public List<Contact> getContactList(){
		List<Contact> listContact = new ArrayList<>();
		
		listContact.add(new Contact("Marry John","marry.john@gmail.com","USA"));
		listContact.add(new Contact("Tom Smith","Tomsmith@outlook.com","England"));
		listContact.add(new Contact("Siva Krishna","sivakrishna@gmail.com","India"));
		
		return listContact;
	}
}
