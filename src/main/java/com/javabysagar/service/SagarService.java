package com.javabysagar.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabysagar.Dao.SagarDao;
@Service
public class SagarService {

	@Autowired
	SagarDao sagarDao;
	public Set<String> getAllEmploee() throws Exception {
		// TODO Auto-generated method stub
		Set<String> listOfEmp = sagarDao.getAllEmploee();
		return listOfEmp;
	}

}
