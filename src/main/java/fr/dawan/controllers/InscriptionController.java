package fr.dawan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.dawan.beans.Joueur;
import fr.dawan.dao.InterfaceJoueurDao;

@Controller
public class InscriptionController {
	
	@Autowired
	private InterfaceJoueurDao <Joueur> dao;
	
	@GetMapping("/inscription")
	public String showLogin() {
		return "inscription";
	}
	
	@PostMapping(value = "/inscription", params= {"nom", "prenom","pseudo","email","age"})
	public String subscribeJoueur (Model model, @RequestParam String nom, String prenom, String pseudo, String email, int age, Joueur joueur){
		
	model.addAttribute("nom",nom);
	model.addAttribute("prenom",prenom);
	
	
	model.addAttribute("pseudo",pseudo);
	

	model.addAttribute("email",email);
	model.addAttribute("age",age);
	
    dao.createOrUpdate(joueur);
	return "choice";
	}

}
