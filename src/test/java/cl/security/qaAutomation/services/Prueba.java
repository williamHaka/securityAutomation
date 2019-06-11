package cl.security.qaAutomation.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prueba {
	public static void main(String[] args) throws Exception {
		//		EndPointModel model = new EndPointModel();
//		model.setUser("admin");
//		model.setPassword("admin");
//		model = EndPointServices.authPost(model);
//		
//		model.setIdPropuesta("MC64");
//		EndPointServices.applicationGet(model);
//		EndPointServices.getResult(model);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
		LocalDateTime localDate = LocalDateTime.now();
        System.out.println(dtf.format(localDate).toString());
	
	}

}
