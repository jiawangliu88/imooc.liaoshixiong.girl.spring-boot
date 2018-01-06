package com.ultrapower.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ultrapower.domain.Girl;
import com.ultrapower.repository.GirlRepository;

@Service
public class GirlService {

	@Autowired
	private GirlRepository girlRepository;
	
	@Transactional
	public void inertTwo() {
		
		Girl girl1 = new Girl();
		girl1.setAge(14);
		girl1.setCupSize("B");
		
		Girl girl2 = new Girl();
		girl2.setAge(15);
		girl2.setCupSize("BB");
		
		girlRepository.save(girl1);
		girlRepository.save(girl2);
	}
}
