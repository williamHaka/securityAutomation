package cl.security.qaAutomation.definition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.services.FormularioServices;
import cl.security.qaAutomation.utils.GenericMethod;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PropuestaCompassDefinition {
	public static String genero ="";
	private static final Logger log = LoggerFactory.getLogger(PropuestaCompassDefinition.class); 
	
	@Given("^Ingreso a la url\"([^\"]*)\"$")
	public void ingreso_a_la_url(String url) throws Throwable {
		log.info("Ingreso a la url "+url);
		BaseFlow.driver.manage().deleteAllCookies();
		BaseFlow.driver.get(url);
	}


	@When("^Ingreso usuario y clave\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_usuario_y_clave(String user, String pass) throws Throwable {
		log.info("Ingreso usuario "+user+" y clave "+pass);
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
		log.info("Ingreso nombre de propuesta"+nombre);
		String idPropuesta = nombre+GenericMethod.getDate();
		BaseFlow.endpointModel.setIdPropuesta(idPropuesta);
		BaseFlow.pageModel.getTxtNuevaPropuesta().sendKeys(idPropuesta);
		Thread.sleep(2000);
	}
	
	@When("^selecciono tipo de cuestionario\"([^\"]*)\"$")
	public void selecciono_tipo_de_cuestionario(String tipoCuestionario) throws Throwable {
		log.info("Ingreso tipo de cuestionario "+tipoCuestionario);
		Boolean valid = false;
		BaseFlow.pageModel.getBtnTipoCustionario().click();
  		List<WebElement> listA = BaseFlow.driver.findElements(By.xpath("//a[(@href='#')]"));
		for(WebElement a : listA) {
			if(a.getText().toString().trim().contains(tipoCuestionario)) {
				Thread.sleep(1000);
				a.click();
				valid = true;	
				break;
			}
		}
		assertTrue("No se encontro el tipo de cuestanario especificado : "+tipoCuestionario,valid);
	}


	
	@When("^Doy click en siguiente$")
	public void doy_click_en_siguiente() throws Throwable {
	   BaseFlow.pageModel.getBtnSiguiente().click();
	}

	@When("^Ingreso nombre\"([^\"]*)\"$")
	public void ingreso_nombre(String nombreCliente) throws Throwable {
		log.info("Ingreso nombre asegurado "+nombreCliente);
		Thread.sleep(2000);
		BaseFlow.pageModel.getTxtNombreCliente().sendKeys(nombreCliente);
	}

	@When("^Ingreso edad\"([^\"]*)\"$")
	public void ingreso_edad(String edadCliente) throws Throwable {
		log.info("Ingreso edad asegurado "+edadCliente);
		Thread.sleep(1000);
	    BaseFlow.pageModel.getTxtEdadCliente().sendKeys(edadCliente);
	}

	@When("^Ingreso rut\"([^\"]*)\"$")
	public void ingreso_rut(String rut) throws Throwable {
		log.info("Ingreso rut asegurado "+rut);
		Thread.sleep(1000);
	    BaseFlow.pageModel.getTxtRutCliente().sendKeys(rut);
	}
	
	@When("^Selecciono genero\"([^\"]*)\"$")
	public void selecciono_genero(String sexo) throws Throwable {
		log.info("Ingreso genero asegurado "+sexo);
		genero = sexo;
		Thread.sleep(1000);
		FormularioServices.seleccionarGenero(sexo);
	}

	@When("^Selecciono estado civil\"([^\"]*)\"$")
	public void selecciono_estado_civil(String estadoCivil) throws Throwable {
		log.info("Ingreso estado civil asegurado "+ estadoCivil);
		FormularioServices.selecionarEstadoCivil(estadoCivil);
	}

	@When("^Selecciono cobertura\"([^\"]*)\"$")
	public void selecciono_cobertura(String arg1) throws Throwable {
		log.info("Ingreso cobertura "+ arg1);
		BaseFlow.pageModel.getSelectCobertura().click();
	    List<WebElement> coverturas = BaseFlow.pageModel.getSelectValueCobertura().findElements(By.xpath("//li"));
	    coverturas.get(6).click();
	}

	@When("^Ingreso renta\"([^\"]*)\"$")
	public void ingreso_renta(String renta) throws Throwable {
		log.info("Ingreso renta "+ renta);
		Thread.sleep(1000);
		WebElement txtRenta = BaseFlow.pageModel.getListCoverturaOpciones().get(1);
		txtRenta.sendKeys(renta); 
	}

	@When("^Ingreso prima\"([^\"]*)\"$")
	public void ingreso_prima(String prima) throws Throwable {
		log.info("Ingreso prima "+ prima);
		WebElement txtPrima = BaseFlow.pageModel.getListCoverturaOpciones().get(2);
		txtPrima.sendKeys(prima); 
	}

	@When("^Ingreso duracion\"([^\"]*)\"$")
	public void ingreso_duracion(String duracion) throws Throwable {
		log.info("Ingreso duracion "+ duracion);
		WebElement txtDuracion = BaseFlow.pageModel.getListCoverturaOpciones().get(3);
		txtDuracion.sendKeys(duracion); 
	}


	@When("^Acepto termino de conformidad\"([^\"]*)\"$")
	public void acepto_termino_de_conformidad(String aceptoTerminos) throws Throwable {
		log.info("acepto terminos");
		Thread.sleep(1000);
		WebElement btnConforme = GenericMethod.implicityWait(10,By.xpath("//button[(@data-text='conforme')]"));
		if(btnConforme!=null) {
			switch (aceptoTerminos.toLowerCase().trim()) {
			case "si":
				GenericMethod.focusElement(btnConforme);
				Thread.sleep(1000);
				btnConforme.click();
				break;
			case "no":
				WebElement btnNoConforme =  GenericMethod.implicityWait(10,By.xpath("//label[(@data-text='no conforme')]"));
				GenericMethod.focusElement(btnNoConforme);
				Thread.sleep(1000);
				btnNoConforme.click();
				break;
			default:
				break;
			}
			
		}else {
			assertFalse("",true);
		}
	}
}
