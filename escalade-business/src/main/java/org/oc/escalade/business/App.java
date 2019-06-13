package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.consumer.ApplicationConfiguration;
import org.oc.escalade.modele.Utilisateur;
import org.oc.escalade.modele.Voie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    	
    	UtilService utilService =(UtilService)context.getBean("utilService");
//    	Utilisateur maurice = new Utilisateur("pedro","joze","tralala","puetpuet");
//    	Utilisateur pepito = new Utilisateur("pepito","pepita","chapo","plop");
//    	utilService.addUtil(pepito);
//    	utilService.deleteUtil(5);
//    	List<Utilisateur> userList =  utilService.findAll();
//    	System.out.println(userList.size());
//    	Utilisateur user = utilService.findUtil(1);
//    	
    	VoieService voieService = (VoieService)context.getBean("voieService");
    	Voie voie = voieService.findVoie(1);
//    	Voie voieVarap= new Voie("varapace",20,"5c",5,2);
//    	voieService.addVoie(voieVarap);
    	System.out.println(voie);
//    	System.out.println(user);
    	//List<Voie> listVoie=voieService.findAll();
    	//System.out.println(listVoie.size());
    	
    	

    }
}
