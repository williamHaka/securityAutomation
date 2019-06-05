package cl.security.qaAutomation.services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

import cl.security.qaAutomation.flow.BaseFlow;
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
	
	
	public static void ingresarRiesgosDps(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas, String conCualesTrabaja, String trabajaCon, String tipoRadiacion, String otraRadiacion, String medidasSeguridadDisponibles, String controlandoRadiacion, String sobrepasadoLimiteRadiacion, String frecuencia, String ultimaVez, String queValores, String tratamientoMedico, String cuando, String razon, String consecuenciasSufridas, String hhAnuales) throws InterruptedException {
		WebElement txtRiesgo = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-power-select-trigger')]"));
		txtRiesgo.click();
		List<WebElement> listRiesgos = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (riesgo.trim()) {
		case "0":
			listRiesgos.get(0).click();
			ingresarRadiacionIonizante(nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas, conCualesTrabaja, trabajaCon, tipoRadiacion, otraRadiacion, medidasSeguridadDisponibles, controlandoRadiacion, sobrepasadoLimiteRadiacion, frecuencia, ultimaVez, queValores, tratamientoMedico, cuando, razon, consecuenciasSufridas);
			break;
		case "1":
			listRiesgos.get(1).click();
			WebElement txtHoras = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'number')]"));
			txtHoras.sendKeys(hhAnuales);
			break;
		case "2":
			listRiesgos.get(2).click();
			break;
		default:
			break;
		}
	}
	
	private static void ingresarRadiacionIonizante(String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas, String conCualesTrabaja, String trabajaCon, String tipoRadiacion, String otraRadiacion, String medidasSeguridadDisponibles, String controlandoRadiacion, String sobrepasadoLimiteRadiacion, String frecuencia, String ultimaVez, String queValores, String tratamientoMedico, String cuando, String razon, String consecuenciasSufridas) throws InterruptedException {
//		nombre empleador
		WebElement txtEmpleador =  BaseFlow.driver.findElement(By.xpath("//textarea[(@tabindex=\"1\")]"));
		txtEmpleador.sendKeys(nombreEmpleador);
		GenericMethod.scrollElement(txtEmpleador);
//		seleccionar area de trabajo
		Thread.sleep(500);
		WebElement ListAreaTrabajo = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger') and @tabindex=\"0\"]")).get(1);
		ListAreaTrabajo.click();
		List<WebElement> optionAreaTrabajo = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		optionAreaTrabajo.get(Integer.parseInt(areaTrabajo)).click();
//		Ingreso horas a la semana
		Thread.sleep(500);
		WebElement horasTrabajo = BaseFlow.driver.findElement(By.xpath("//input[contains(@class,'input-default')]"));
		horasTrabajo.sendKeys(horasSemanales);
//		Ingreso fecha antiguedad
		Thread.sleep(1000);
		GenericMethod.scrollElement(horasTrabajo);
		seleccionarFechaCalendar(desdeCuando);
	}
	
	private static void seleccionarFechaCalendar(String desdeCuando) throws InterruptedException {
		//formato DD-MM-YYY
		String[] fecha = desdeCuando.trim().split("-");
		String dia = fecha[0];
		String mes = fecha[1];
		String anio = fecha[2];
		Thread.sleep(1000);
//		selleciono formato de calendar
		List<WebElement> formatoCalendar = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container col-4')]"));
		formatoCalendar.get(2).click();
		Thread.sleep(500);
//		formatoCalendar.get(2).click();
		seleccionarAnioCalendar(anio);
		seleccionarMesCalendar(mes);
		seleccionarDiaCalendar(dia);
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
	
	
	
	
	
	
	
	
}