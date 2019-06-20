package org.oc.escalade.webapp.controler;

import org.oc.escalade.modele.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class ControlerLogin {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView showForm() {
		
		return new ModelAndView("login","Utilisateur",new Utilisateur());
		
	}
	
	@RequestMapping(value = "/displayUser", method = RequestMethod.POST)
    public String submit( @ModelAttribute("Utilisateur")Utilisateur utilisateur, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";}
        
        model.addAttribute("password", utilisateur.getPassword());
        model.addAttribute("username",utilisateur.getUsername());
        return"displayUser";
        }
	
}
