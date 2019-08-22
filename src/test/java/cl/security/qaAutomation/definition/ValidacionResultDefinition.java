package cl.security.qaAutomation.definition;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.model.EndPointModel;
import cl.security.qaAutomation.services.EndPointServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidacionResultDefinition {
	private EndPointModel model;
	
	
	@Given("^Realizo consulta a servicio result con el applicationId\"([^\"]*)\"$")
	public void realizo_consulta_a_servicio_result_con_el_applicationId(String applicationId) throws Throwable {
		model = new EndPointModel();
		model.setApplicationId(applicationId);
		model = EndPointServices.getResult(model);
	}
	
	@When("^Realizo mapeo de json result$")
	public void realizo_mapeo_de_json_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


	@Then("^Valido reglas esperadas\"([^\"]*)\"$")
	public void valido_reglas_esperadas(String regla) throws Throwable {
//		TODO validacion de reglas esperadas contra las obtenidas del result
	}
	

	@When("^Realizo consulta a servicio get application$")
	public void realizo_consulta_a_servicio_get_application() throws Throwable {
		model = new EndPointModel();
		EndPointModel model = EndPointServices.applicationGet(BaseFlow.endpointModel);
//		model.setApplicationId(applicationId);
		model = EndPointServices.getResult(model);
	}


}
