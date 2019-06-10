package cl.security.qaAutomation.services;

import cl.security.qaAutomation.model.CommJson;
import cl.security.qaAutomation.model.EndPointModel;

public class Prueba {
	public static void main(String[] args) throws Exception {
		EndPointModel model = new EndPointModel();
		model.setUser("admin");
		model.setPassword("admin");
		model = EndPointServices.authPost(model);
		
		model.setIdPropuesta("MC64");
		EndPointServices.applicationGet(model);
		EndPointServices.getResult(model);
		
	
	}

}
