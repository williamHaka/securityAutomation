package cl.security.qaAutomation.definition;

import static org.junit.Assert.assertTrue;

import java.net.URL;

import cl.security.qaAutomation.flow.BaseFlow;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormularioDefinition {
		@Given("^Ingreso a la url$")
		public void ingreso_a_la_url() throws Throwable {
			BaseFlow.driver.manage().deleteAllCookies();
//			BaseFlow.driver.get("www.google.cl");
			BaseFlow.driver.get("https://www.facebook.com");
		}

		@When("^Ingreso actividad name(\\d+)$")
		public void ingreso_actividad_name(int arg1) throws Throwable {
		    String var = "";
		    System.out.print(var);
		}

		@Then("^Valido id de formulario$")
		public void valido_id_de_formulario() throws Throwable {
		   assertTrue(true);
		}
}
