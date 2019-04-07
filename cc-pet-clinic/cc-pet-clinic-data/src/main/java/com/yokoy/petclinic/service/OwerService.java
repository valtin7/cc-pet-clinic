package com.yokoy.petclinic.service;

import com.yokoy.petclinic.model.Owner;

public interface OwerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
