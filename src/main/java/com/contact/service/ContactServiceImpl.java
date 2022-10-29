package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.contact.entity.Contact;

@Service 
public class ContactServiceImpl implements ContactService {
	
	//Dummy List of Contact
	List<Contact> list = List.of(
			      new Contact(1001L,"scoot@outlook.co","scoot",1990L),
			      new Contact(1002L,"kevin@outlook.co","kevin",1980L),
                  new Contact(1003L,"David@outlook.co","David",1700L),
                  new Contact(1004L,"samuels@outlook.co","samuels",1840L),
                  new Contact(1005L,"Johnathan@outlook.co","Johnathan",3090L)
                    );
			
	
	@Override	
	public List<Contact> getContactOfUser(Long userId){
		return list.stream().filter(c -> c.getUserId().equals(userId)).collect(Collectors.toList());
		
	}
	

}
