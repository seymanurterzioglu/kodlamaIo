package com.example.kodlamaIoDevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlamaIoDevs.business.abstracts.LanguageService;
import com.example.kodlamaIoDevs.entitites.concretes.SoftwareLanguage;

@RestController // bilgilendirme ifadesii // annotatin
@RequestMapping("/api/language")  
public class LanguageController {
	
	private LanguageService languageService;

	// IoC yapısı kullanım
	// autowired: git parametrelerine bak (şuan brandService) , git uygulamayı tara
	// bu parametreyi kim implemente ediyor , onun new lenmiş halini bana ver
	
	@Autowired   
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/add")
	public String add() {
		return languageService.add("React");
		
	}
	
	@GetMapping("/delete")
	public String delete() {
		return languageService.delete(2);  // 2.index sil
	
	}
	
	@GetMapping("/update")
	public String update(){
		return languageService.update(1,"React");
		
	}
	
	@GetMapping("/list")
	public List<SoftwareLanguage> getList(){
		return languageService.getList();
	}
	
	@GetMapping("/getId")
	public SoftwareLanguage getId() {
		return languageService.getById(2);
	}
	
	

}
