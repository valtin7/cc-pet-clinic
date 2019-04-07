package com.yokoy.petclinic.service;

import com.yokoy.petclinic.model.Owner;

public interface OwerService {
	
	Owner findByLastName(String lastName);

}
