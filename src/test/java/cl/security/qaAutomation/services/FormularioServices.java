package cl.security.qaAutomation.services;

import java.util.List;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.mockito.internal.matchers.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.utils.Constants;
import cl.security.qaAutomation.utils.GenericMethod;
import io.appium.java_client.MobileElement;

public class FormularioServices {

	public static void loginCompass(String user, String pass) throws InterruptedException {
		BaseFlow.pageModel.getUsername().sendKeys(user);
		BaseFlow.pageModel.getPassword().sendKeys(pass);
		//selecciono idioma
		login();
	}
	
	public static void loginCompass() throws InterruptedException {
		BaseFlow.pageModel.getUsername().sendKeys("admin");
		BaseFlow.pageModel.getPassword().sendKeys("admin");
		login();
		}
	
	public static void login() throws InterruptedException {
		BaseFlow.driver.findElement(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).click();
		Thread.sleep(1000);
		BaseFlow.driver.findElements(By.className("ember-power-select-option")).get(2).click();
		BaseFlow.pageModel.getBtnEntrar().click();
	}
	
	public static void seleccionarGenero(String sexo) {
		List<WebElement> divGenero = BaseFlow.driver.findElements(By.className("radio-buttons"));
	    List<WebElement> genero = divGenero.get(0).findElements(By.className("yes-no-radio"));
	    if(sexo.toString().toLowerCase().equals("m")) {
	    	genero.get(0).click();
	    }else {
	    	genero.get(1).click();
	    }
	}
	
	public static void selecionarEstadoCivil(String estadoCivil) throws InterruptedException {
		List<WebElement> divGenero = BaseFlow.driver.findElements(By.className("radio-buttons"));
		List<WebElement> listestadoCivil = divGenero.get(1).findElements(By.className("yes-no-radio"));
		Thread.sleep(1000);
		switch (estadoCivil.trim()) {
			case "soltero":
				listestadoCivil.get(0).click();
				break;
			case "casado":
				listestadoCivil.get(1).click();
				break;
			case "convivienteCivil":
				listestadoCivil.get(2).click();
				break;
			default:
				break;
		}
	}
	
	
	public static void ingresarRiesgosDps(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas,String conCualesTrabaja, String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias, String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas) throws InterruptedException {
		WebElement txtRiesgo = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-power-select-trigger')]"));
		txtRiesgo.click();
		List<WebElement> listRiesgos = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (riesgo.trim().toLowerCase()) {
		case "radiacionionizante":
			listRiesgos.get(0).click();
//			ingresarRadiacionIonizante(nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas,conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando , cualFueRazon, consecuenciasSufridas);
			break;
		case "vuelosnoregulares":
			listRiesgos.get(1).click();
			WebElement txtHoras = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'number')]"));
//			txtHoras.sendKeys(hhAnuales);
			break;
		case "ningunodelosanteriores":
			listRiesgos.get(2).click();
			break;
		default:
			break;
		}
	}
	
	private static void ingresarRadiacionIonizante(String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas, String conCualesTrabaja, String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias, String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas) throws InterruptedException {
//		nombre empleador
		WebElement txtEmpleador =  BaseFlow.driver.findElement(By.xpath("//textarea[(@tabindex=\"1\")]"));
		txtEmpleador.sendKeys(nombreEmpleador);
		GenericMethod.scrollElement(txtEmpleador);
//		en que area trabaja
		Thread.sleep(500);
		seleccionarAreaTrabajo(areaTrabajo);
//		Ingreso horas a la semana
		Thread.sleep(500);
		WebElement horasTrabajo = BaseFlow.driver.findElement(By.xpath("//input[contains(@class,'input-default')]"));
		horasTrabajo.sendKeys(horasSemanales);
//		Ingreso fecha antiguedad
		GenericMethod.scrollElement(horasTrabajo);
		seleccionarFechaCalendar(desdeCuando,0);
//		Son las sustancias radiactivas? 
		seleccionarSustanciasEncapsuladas(sustanciasEncapsuladas, sustanciasNoEncapsuladas);
//		con que sustancias radioactivas trabaja?
		Thread.sleep(500);
		WebElement txtSustanciasRadiactivas =BaseFlow.driver.findElements(By.xpath("//textarea[contains(@class,'ember-text-area ember-view')]")).get(1);
		GenericMethod.scrollElement(txtSustanciasRadiactivas);
		txtSustanciasRadiactivas.sendKeys(conCualesTrabaja);
//		trabajo con
		seleccionarTrabajaCon(aparatoRayosX,RayosXDisruptivos,ningunoRayo);
//		que tipo de radiacion esta presente en sus tareas diarias
		seleccionarRadiacionPresenteTareasDiarias(microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias);
//		que medidas de seguridad estan disponibles
		Thread.sleep(500);
		WebElement txtmedidasDisponibles =BaseFlow.driver.findElements(By.xpath("//textarea[contains(@class,'ember-text-area ember-view')]")).get(2);
		GenericMethod.scrollElement(txtmedidasDisponibles);
		txtmedidasDisponibles.sendKeys(medidasSeguridadDisponibles);
//		le estan controlando por el impacto  de la radiacion
		seleccionarControlRadiacion(controlImpactoRadiacion);
		seleccionarSobrepasarLimiteRadiacion(sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez,queValores);
//		tuvo alguna vez un tratamiento medico por dalos de radiacion
		seleccionarTratamientoMedicoPorRadiacion(tratamientoMedicoRadiacion, cuando, cualFueRazon, consecuenciasSufridas);
	}
	
	private static void seleccionarAreaTrabajo(String areaTrabajo) {
		WebElement ListAreaTrabajo = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger') and @tabindex=\"0\"]")).get(1);
		ListAreaTrabajo.click();
		List<WebElement> optionAreaTrabajo = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (areaTrabajo.trim().toLowerCase()) {
		case "areacontrol":
			optionAreaTrabajo.get(0).click();
			break;
		case "areavigilancia":
			optionAreaTrabajo.get(1).click();
			break;
		case "otrarea":
			optionAreaTrabajo.get(2).click();
			break;
		default:
			break;
		}
	}
	
	private static void seleccionarFechaCalendar(String desdeCuando,Integer indexCalendar) throws InterruptedException {
		//formato DD-MM-YYY
		String[] fecha = desdeCuando.trim().split("-");
//		String dia = fecha[0];
		String mes = fecha[1];
		String anio = fecha[2];
		Thread.sleep(1000);
		WebElement divCalendar = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'calendarElement')]")).get(indexCalendar);
//		selleciono formato de calendar
		List<WebElement> formatoCalendar = divCalendar.findElements(By.xpath("//div[contains(@class,'yes-no-container col-4')]"));
		Thread.sleep(1000);
		GenericMethod.focusElement(formatoCalendar.get(2));
		Thread.sleep(1000);
		formatoCalendar.get(2).click();
		seleccionarAnioCalendar(anio);
		seleccionarMesCalendar(mes);
//		seleccionarDiaCalendar(dia);
	}
	
	private static void seleccionarAnioCalendar(String anio) throws InterruptedException {
		BaseFlow.driver.findElements(By.className("datepicker-switch")).get(0).click();
		Thread.sleep(500);
		BaseFlow.driver.findElements(By.className("datepicker-switch")).get(1).click();
		Boolean encontroAnio = false;
		while (encontroAnio==false) {
			for (Integer i=0;i<=11;i++) {
				List<WebElement> listAnios = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'year')]"));
				if(listAnios.get(i).getText().toString().equals(anio)) {
					Thread.sleep(1000);
					listAnios.get(i).click();
					encontroAnio = true;
					break;
				}else if(i==11){
					WebElement anioPrevio = BaseFlow.driver.findElements(By.xpath("//th[contains(@class,'prev')]")).get(2);
					anioPrevio.click();
					Thread.sleep(1000);
				} 
			}
		}
	}
	
	private static void seleccionarMesCalendar(String mes) {
		List<WebElement> listMes = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'month')]"));
		Integer iMes = Integer.parseInt(mes);
		listMes.get(iMes-1).click();
	}
	
	private static void seleccionarDiaCalendar(String dia) {
		List<WebElement> dias = BaseFlow.driver.findElements(By.className("day"));
		Integer iDia = Integer.parseInt(dia);
		dias.get(iDia-1).click();
	}
	
	private  static void seleccionarSustanciasEncapsuladas(String sustanciasEncapsuladas, String sustanciasNoEncapsuladas) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> listCheckbox = BaseFlow.driver.findElements(By.className("checkbox-custom"));
		GenericMethod.scrollElement(listCheckbox.get(0));
		if(sustanciasEncapsuladas.trim().toLowerCase().equals("si")) {
			WebElement checkSustanciasEncapsuladas = listCheckbox.get(0);
			checkSustanciasEncapsuladas.click();
		}
		if(sustanciasNoEncapsuladas.trim().toLowerCase().equals("si")) {
			WebElement checkSustanciasNoEncapsuladas = listCheckbox.get(1);
			checkSustanciasNoEncapsuladas.click();
		}
	}
	
	private static void seleccionarTrabajaCon(String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> listCheckbox = BaseFlow.driver.findElements(By.xpath("//label[contains(@class,'custom-checkbox')]"));
		GenericMethod.scrollElement(listCheckbox.get(2));
		if (!aparatoRayosX.equals("") && aparatoRayosX.trim().toLowerCase().equals(Constants.SI)) {
			GenericMethod.clickElement(listCheckbox.get(2));
		}
		if (!RayosXDisruptivos.equals("") && RayosXDisruptivos.trim().toLowerCase().equals(Constants.SI)) {
			listCheckbox.get(3).click();
		}
		if (!ningunoRayo.equals("") && ningunoRayo.trim().toLowerCase().equals(Constants.SI)) {
			listCheckbox.get(4).click();
		}
	}
	
	private static void seleccionarRadiacionPresenteTareasDiarias(String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> listCheckbox = BaseFlow.driver.findElements(By.xpath("//label[contains(@class,'custom-checkbox')]"));
		GenericMethod.scrollElement(listCheckbox.get(5));
		if(!microondas.equals("") && microondas.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(5).click();
		}
		if(!radiacionAlfa.equals("") && radiacionAlfa.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(6).click();
		}
		if(!radiacionBeta.equals("") && radiacionBeta.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(7).click();
		}
		if(!radiacionDeNeutrones.equals("") && radiacionDeNeutrones.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(8).click();
		}
		if(!radiacionDeRayosX.equals("") && radiacionDeRayosX.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(9).click();
		}
		if(!radiacionDeGamma.equals("") && radiacionDeGamma.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(10).click();
		}
		if(!radiacionLaser.equals("") && radiacionLaser.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(11).click();
		}
		if(!radiacionMaster.equals("") && radiacionMaster.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(12).click();
		}
		if(!rayosUltravioletasArtificiales.equals("") && rayosUltravioletasArtificiales.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(13).click();
		}
		if(!otros.equals("") && otros.trim().toLowerCase().equals(Constants.SI) ) {
			//otraRadiacion
			listCheckbox.get(14).click();
		}
		if(!ningunoPresenteTareasDiarias.equals("") && ningunoPresenteTareasDiarias.trim().toLowerCase().equals(Constants.SI) ) {
			listCheckbox.get(15).click();
		}
		
	}
	
	private static void seleccionarControlRadiacion(String controlImpactoRadiacion) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> radioControlRadiacion = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container col-2')]"));
		GenericMethod.scrollElement(radioControlRadiacion.get(0));
		switch (controlImpactoRadiacion.trim().toLowerCase()) {
		case Constants.NO:
			radioControlRadiacion.get(0).click();
			break;
		case Constants.SI:
			radioControlRadiacion.get(1).click();
			break;
		default:
			break;
		}
	}
	
	private static void seleccionarSobrepasarLimiteRadiacion(String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> radioControlRadiacion = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container col-2')]"));
		GenericMethod.scrollElement(radioControlRadiacion.get(3));
		switch (sobrepasadoLimiteRadiacion.trim().toLowerCase()) {
		case Constants.NO:
			radioControlRadiacion.get(2).click();
			break;
		case Constants.SI:
			radioControlRadiacion.get(3).click();
//			 con que frecuencia
			WebElement txtFrecuencia = BaseFlow.driver.findElements(By.xpath("//input[contains(@type,'number')]")).get(1);
			GenericMethod.scrollElement(txtFrecuencia);
			txtFrecuencia.sendKeys(conQueFrecuencia);
//			 cuando fue por ultima vez
			seleccionarFechaCalendar(ultimaVez,1);
//			que valores
			WebElement txtQueValores = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field ember-view')]")).get(3);
			txtQueValores.sendKeys(queValores);
			break;
		default:
			break;
		}
	}
	
	private static void seleccionarTratamientoMedicoPorRadiacion(String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> radioTratamientoMedico = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container col-2')]"));
	    GenericMethod.scrollElement(radioTratamientoMedico.get(4));
		switch (tratamientoMedicoRadiacion) {
		case Constants.NO:
			radioTratamientoMedico.get(4).click();
			break;
		case Constants.SI:
			radioTratamientoMedico.get(5).click();
//			cuando
			seleccionarFechaCalendar(cuando,2);
//			cual fue la razon
			WebElement textARazon = BaseFlow.driver.findElements(By.xpath("//textarea[contains(@class,'ember-text-area ember-view')]")).get(3);
			textARazon.sendKeys(cualFueRazon);
//			que consecuencias sufrio
			WebElement textAConsecuencias = BaseFlow.driver.findElements(By.xpath("//textarea[contains(@class,'ember-text-area ember-view')]")).get(4);
			textAConsecuencias.sendKeys(consecuenciasSufridas);
			
			

			break;
		default:
			break;
		}
		
	  
	    
		
	}
	
	
	
	
}