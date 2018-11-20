package fr.dawan.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.dawan.beans.Joueur;
import fr.dawan.dao.InterfaceJoueurDao;
import fr.dawan.dao.JoueurDao;

@Controller
public class LoginController {

	@Autowired
	private InterfaceJoueurDao <Joueur> dao;
	
	@GetMapping("/login")
	public ModelAndView showLogin() {
		return new ModelAndView("login");
	}

	@PostMapping("/login")	
	public ModelAndView checkLogin(Joueur joueur, HttpSession session) {
		String returnUrl = "login";
		Joueur joueurFromDb = dao.findByEmail(joueur.getEmail());
		

		if (joueurFromDb != null && joueur.getEmail() != null && joueur.getPassword() != null && joueur.getEmail() != ""
				&& joueur.getPassword() != "" && joueur.getPassword().equals(joueurFromDb.getPassword())) {
			session.setAttribute("joueur", joueurFromDb);
			System.out.println(joueurFromDb.getPseudo());

			returnUrl = "/animaljoueur";
		}

		return new ModelAndView(returnUrl);
	}
	
	public String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		    return null;
		}
	

}
