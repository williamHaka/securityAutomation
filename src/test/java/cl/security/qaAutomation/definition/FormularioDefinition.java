package cl.security.qaAutomation.definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.services.EndPointServices;
import cl.security.qaAutomation.services.FormularioServices;
import cl.security.qaAutomation.utils.GenericMethod;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FormularioDefinition {
	
	@Given("^Ingreso a la url\"([^\"]*)\"$")
	public void ingreso_a_la_url(String url) throws Throwable {
		BaseFlow.driver.manage().deleteAllCookies();
		BaseFlow.driver.get(url);
	}


	@When("^Ingreso usuario y clave\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_usuario_y_clave(String user, String pass) throws Throwable {
		BaseFlow.endpointModel.setUser(user);
		BaseFlow.endpointModel.setPassword(pass);
		FormularioServices.loginCompass(user, pass);
	}

	@When("^Doy click en nueva propuesta$")
	public void doy_click_en_nuevRa_propuesta() throws Throwable {
		Thread.sleep(1000);
	    BaseFlow.pageModel.getBtnNuevaPropuesta().click();
	}

	@When("^Ingreso nombre de la nueva propuesta\"([^\"]*)\"$")
	public void ingreso_nombre_de_la_nueva_propuesta(String nombre) throws Throwable {
		BaseFlow.endpointModel.setIdPropuesta(nombre);
	   BaseFlow.pageModel.getTxtNuevaPropuesta().sendKeys(nombre);
	   Thread.sleep(2000);
	}

	@When("^Doy click en siguiente$")
	public void doy_click_en_siguiente() throws Throwable {
	   BaseFlow.pageModel.getBtnSiguiente().click();
	}

	@When("^Ingreso nombre\"([^\"]*)\"$")
	public void ingreso_nombre(String nombreCliente) throws Throwable {
		Thread.sleep(2000);
		BaseFlow.pageModel.getTxtNombreCliente().sendKeys(nombreCliente);
	}

	@When("^Ingreso edad\"([^\"]*)\"$")
	public void ingreso_edad(String edadCliente) throws Throwable {
		Thread.sleep(1000);
	    BaseFlow.pageModel.getTxtEdadCliente().sendKeys(edadCliente);
	}

	@When("^Selecciono genero\"([^\"]*)\"$")
	public void selecciono_genero(String sexo) throws Throwable {
		Thread.sleep(1000);
		FormularioServices.seleccionarGenero(sexo);
	}

	@When("^Selecciono estado civil\"([^\"]*)\"$")
	public void selecciono_estado_civil(String estadoCivil) throws Throwable {
		FormularioServices.selecionarEstadoCivil(estadoCivil);
	}

	@When("^Selecciono cobertura\"([^\"]*)\"$")
	public void selecciono_cobertura(String arg1) throws Throwable {
		//pot negocio siempre se selecciona la opcion vida
		BaseFlow.pageModel.getSelectCobertura().click();
	    List<WebElement> coverturas = BaseFlow.pageModel.getSelectValueCobertura().findElements(By.xpath("//li"));
	    coverturas.get(6).click();
	}

	@When("^Ingreso renta\"([^\"]*)\"$")
	public void ingreso_renta(String renta) throws Throwable {
		Thread.sleep(1000);
		WebElement txtRenta = BaseFlow.pageModel.getListCoverturaOpciones().get(1);
		txtRenta.sendKeys(renta); 
	}

	@When("^Ingreso prima\"([^\"]*)\"$")
	public void ingreso_prima(String prima) throws Throwable {
		WebElement txtPrima = BaseFlow.pageModel.getListCoverturaOpciones().get(2);
		txtPrima.sendKeys(prima); 
	}

	@When("^Ingreso duracion\"([^\"]*)\"$")
	public void ingreso_duracion(String duracion) throws Throwable {
		WebElement txtDuracion = BaseFlow.pageModel.getListCoverturaOpciones().get(3);
		txtDuracion.sendKeys(duracion); 
	}


	@When("^Acepto termino de conformidad\"([^\"]*)\"$")
	public void acepto_termino_de_conformidad(String aceptoTerminos) throws Throwable {
		Thread.sleep(1000);
		BaseFlow.driver.switchTo().parentFrame();
		List<WebElement> listAccept = BaseFlow.pageModel.getListErrorButton();
		switch (aceptoTerminos.toLowerCase().trim()) {
		case "si":
			WebElement btnAccept = listAccept.get(0).findElement(By.xpath("//button[contains(@class,'error-accept')]"));
			btnAccept.click();
			break;
		case "no":
			WebElement btnNoAccept = listAccept.get(1).findElement(By.xpath("//button[contains(@class,'error-accept')]"));
			btnNoAccept.click();
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso la actividad pUno\"([^\"]*)\"$")
	public void ingreso_la_actividad_pUno(String actividad) throws Throwable {
		WebElement txtActividad = BaseFlow.driver.findElements(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).get(0);
		GenericMethod.ingresarTextoSugerido(txtActividad, actividad);
	}
	


	@When("^Ingreso riesgos pDos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_riesgos_pDos(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas,String conCualesTrabaja,	 String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias,String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas) throws Throwable {
		FormularioServices.ingresarRiesgosDps(riesgo, nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas, conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando, cualFueRazon, consecuenciasSufridas);
	}
	
	
	

	@When("^execute endpoint Auth$")
	public void execute_endpoint_Auth() throws Throwable {
		BaseFlow.endpointModel = EndPointServices.authPost(BaseFlow.endpointModel);
	}

	@When("^execute endpoint application$")
	public void execute_endpoint_application() throws Throwable {
		BaseFlow.endpointModel = EndPointServices.applicationGet(BaseFlow.endpointModel);
	}

	@When("^execute endpoint result$")
	public void execute_endpoint_result() throws Throwable {
		EndPointServices.getResult(BaseFlow.endpointModel);
		//TODO falta validar lo esperado con lo obtenido
	}
}
