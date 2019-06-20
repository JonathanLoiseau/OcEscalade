package org.oc.escalade.webapp.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class ControlerAccCrea {

	@RequestMapping("/accountCreation")
	public String AccCrea(Model model) {
	return "accountCreation";
	}
	
}
