package com.example.kodlamaIoDevs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.kodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import com.example.kodlamaIoDevs.entitites.concretes.SoftwareLanguage;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<SoftwareLanguage> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new SoftwareLanguage(1, "Java"));
		languages.add(new SoftwareLanguage(2, "Flutter"));
		languages.add(new SoftwareLanguage(3, "Angular"));
				languages.add(new SoftwareLanguage(4, "Vue"));
	}

	// fonkların içerisi burada doldurulucak

	@Override
	public String add(String name) {
		String msg = "";
		boolean hasName = false;

		for (SoftwareLanguage language : languages) {

			if (language.getName().equals(name)) {
				msg = "Aynı isim tekrar edemez.";
				hasName = true;
				break;
			}
		}
		
		if(name=="" || name==null) 
		{
			msg="İsim boş geçilemez.";
			hasName=true;
		}

		if (hasName == false) {
			int length = languages.size();
			languages.add(new SoftwareLanguage(length + 1, name));
			msg = String.format("Ekleme işlemi başarı ile gerçekleştirildi.");

		}

		return msg;
	}

	@Override
	public String delete(int index) {
		languages.remove(index); // 2. index sil
		String msg = "Silme işlemi başarı ile gerçekleştirildi.";
		return msg;
	}

	@Override
	public String update(int index, String name) {
		languages.set(index, new SoftwareLanguage(index + 1, name));
		String msg = "Güncelleme işlemi başarı ile gerçekleştirildi.";
		return msg;
	}

	@Override
	public List<SoftwareLanguage> getList() {
		return languages;
	}

	@Override
	public SoftwareLanguage getById(int id) {
		SoftwareLanguage filterList = languages.stream().filter(a -> a.getId() == id).collect(Collectors.toList())
				.get(0);
		return filterList;
	}

}
