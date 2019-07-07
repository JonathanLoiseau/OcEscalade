package org.oc.escalade.webapp.controler;

import org.oc.escalade.business.interf.UtilService;
import org.oc.escalade.consumer.impl.ApplicationConfiguration;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
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
	 
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	UtilService utilservice=(UtilService)context.getBean("utilService");
	

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView showForm() {
		
		return new ModelAndView("login","Utilisateur",new Utilisateur());
		
	}
	
	@RequestMapping(value = "/displayUser", method = RequestMethod.POST)
    public String submit( @ModelAttribute("Utilisateur")Utilisateur utilisateur, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";}
        
       // model.addAttribute("password", utilisateur.getPassword());
       // model.addAttribute("username",utilisateur.getId());
        
       try { Utilisateur user =utilservice.findUtil(utilisateur.getId());
        model.addAttribute("username",user.getUsername());
        model.addAttribute("password",user.getPassword());
        System.out.println("Aurevoir");
        return"displayUser"; 
       	} catch(EmptyResultDataAccessException e) {
       		model.addAttribute("log",false);
       		utilisateur= new Utilisateur();
       				System.out.println("bonjour");
       		return " login";
       		
       	}
       	
        
       
        }
	
}
	

