package com.example.kodlamaIoDevs.business.abstracts;

import java.util.List;

import com.example.kodlamaIoDevs.entitites.concretes.SoftwareLanguage;

public interface LanguageService {
	
	String add(String name);
	String delete(int index);
	String update(int index,String name);
	List<SoftwareLanguage> getList();
	SoftwareLanguage getById(int id);
	

}
