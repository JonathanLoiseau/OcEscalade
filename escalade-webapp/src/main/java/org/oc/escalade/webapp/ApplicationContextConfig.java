package org.oc.escalade.webapp;
 
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
 
@ComponentScan("org.oc.escalade.webapp.controler")
public class ApplicationContextConfig {
 
   @Bean(name = "viewResolver")
   public InternalResourceViewResolver getViewResolver() {
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
 
       viewResolver.setPrefix("/WEB-INF/pages/");
       viewResolver.setSuffix(".jsp");
 
       return viewResolver;
   }
    
   
   
    
   @Bean(name = "localeResolver")
   public LocaleResolver getLocaleResolver()  {
       CookieLocaleResolver resolver= new CookieLocaleResolver();
       resolver.setCookieDomain("myAppLocaleCookie");
       resolver.setCookieMaxAge(60*60);
       return resolver;
   }
    
 
}