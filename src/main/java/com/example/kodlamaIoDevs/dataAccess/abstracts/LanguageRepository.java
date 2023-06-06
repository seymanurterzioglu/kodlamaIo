package com.example.kodlamaIoDevs.dataAccess.abstracts;

import java.util.List;

import com.example.kodlamaIoDevs.entitites.concretes.SoftwareLanguage;

public interface LanguageRepository {
	
	String add(String name);
	String delete(int index);
	String update(int index,String name);
	List<SoftwareLanguage> getList();
	SoftwareLanguage getById(int id);

}
