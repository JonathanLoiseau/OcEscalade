package org.oc.escalade.consumer;

import java.util.List;

import org.oc.escalade.consumer.impl.ApplicationConfiguration;
import org.oc.escalade.consumer.interf.DaoVoie;
import org.oc.escalade.modele.Utilisateur;
import org.oc.escalade.modele.Voie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        DaoUtilisateur daoUtil = ctx.getBean(DaoUtilisateur.class);
    	DaoVoie daoVoie = ctx.getBean(DaoVoie.class);
    	List<Voie> voies = daoVoie.findAll();
    	System.out.println(voies.size());
       
    }
}
