package cl.security.qaAutomation.definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cl.security.qaAutomation.flow.BaseFlow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FormularioDefinition {
		@Given("^Ingreso a la url$")
		public void ingreso_a_la_url() throws Throwable {
			BaseFlow.driver.manage().deleteAllCookies();
			BaseFlow.driver.get("http://10.62.4.76:8170/");
		}

		@When("^Ingreso usuario y clave$")
		public void ingreso_usuario_y_clave() throws Throwable {
		   BaseFlow.pageModel.getUsername().sendKeys("admin");
		   BaseFlow.pageModel.getPassword().sendKeys("admin");
		   //selecciono idioma
		   BaseFlow.driver.findElement(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).click();
		   Thread.sleep(1000);
		   BaseFlow.driver.findElements(By.className("ember-power-select-option")).get(2).click();
		   BaseFlow.pageModel.getBtnEntrar().click();
		}

		@When("^Doy click en nueva propuesta$")
		public void doy_click_en_nuevRa_propuesta() throws Throwable {
			Thread.sleep(1000);
		    BaseFlow.pageModel.getBtnNuevaPropuesta().click();
		}

		@When("^Ingreso nombre de la nueva propuesta\"([^\"]*)\"$")
		public void ingreso_nombre_de_la_nueva_propuesta(String nombre) throws Throwable {
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
		    List<WebElement> divGenero = BaseFlow.driver.findElements(By.className("radio-buttons"));
		    List<WebElement> genero = divGenero.get(0).findElements(By.className("yes-no-radio"));
		    if(sexo.toString().toLowerCase().equals("m")) {
		    	genero.get(0).click();
		    }else {
		    	genero.get(1).click();
		    }
		}

		@When("^Selecciono estado civil\"([^\"]*)\"$")
		public void selecciono_estado_civil(String eCivil) throws Throwable {
			//casado = c- soltero = s - conviviente civil = cc
			List<WebElement> divGenero = BaseFlow.driver.findElements(By.className("radio-buttons"));
			List<WebElement> estadoCivil = divGenero.get(1).findElements(By.className("yes-no-radio"));
			Thread.sleep(1000);
			switch (eCivil) {
				case "soltero":
					estadoCivil.get(0).click();
					break;
				case "casado":
					estadoCivil.get(1).click();
					break;
				case "convivienteCivil":
					estadoCivil.get(2).click();
					break;
				default:
					break;
			}
		}

		@When("^Selecciono cobertura\"([^\"]*)\"$")
		public void selecciono_cobertura(String arg1) throws Throwable {
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
		public void acepto_termino_de_conformidad(String arg1) throws Throwable {
//			WebElement div = BaseFlow.driver.findElements(By.className("error-modal-body")).get(0);
			BaseFlow.driver.switchTo().parentFrame();
		    WebElement accept = BaseFlow.pageModel.getListErrorButton().get(0);
		    accept.findElement(By.xpath("//button[contains(@class,'error-accept')]"));
		    accept.click();
		}
		
		@When("^Ingreso la actividad\"([^\"]*)\"$")
		public void ingreso_la_actividad(String actividad) throws Throwable {
		    WebElement txtActividad = BaseFlow.driver.findElements(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).get(0);
		    txtActividad.sendKeys(actividad);
		}

		@When("^Ingreso riesgos\"([^\"]*)\"$")
		public void ingreso_riesgos(String riesgo) throws Throwable {
		    WebElement txtRiesgo = BaseFlow.driver.findElements(By.className("ember-power-select-option")).get(Integer.parseInt(riesgo));
		    txtRiesgo.click();
		}
		
		@When("^Ingreso respuesta de rescatista o voluntario\"([^\"]*)\"$")
		public void ingreso_respuesta_de_rescatista_o_voluntario(String respuesta) throws Throwable {
		   BaseFlow.driver.findElement(By.xpath("//*[contains(@class,'yes-no-container')]"));
		}

}
