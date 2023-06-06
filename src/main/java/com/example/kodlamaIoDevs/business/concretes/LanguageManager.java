package com.example.kodlamaIoDevs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.kodlamaIoDevs.business.abstracts.LanguageService;
import com.example.kodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import com.example.kodlamaIoDevs.entitites.concretes.SoftwareLanguage;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository repo;

	public LanguageManager(LanguageRepository repo) {
		this.repo = repo;
	}

	@Override
	public String add(String name){
		return repo.add(name);
	}

	@Override
	public String delete(int index) {
		return repo.delete(index);

	}

	@Override
	public String update(int index,String name) {
		return repo.update(index,name);

	}

	@Override
	public List<SoftwareLanguage> getList() {
		// TODO Auto-generated method stub
		return repo.getList();
	}

	@Override
	public SoftwareLanguage getById(int id) {
		return repo.getById(id);

	}

}
