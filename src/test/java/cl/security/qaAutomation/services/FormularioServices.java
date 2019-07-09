package cl.security.qaAutomation.services;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mongodb.annotations.ThreadSafe;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.utils.Constants;
import cl.security.qaAutomation.utils.GenericMethod;

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
	
	
	public static void ingresarRiesgosDps(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas,String conCualesTrabaja, String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias, String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas, String hhAnuales) throws Exception {
		Thread.sleep(1000);
		WebElement txtRiesgo = GenericMethod.implicityWait(2, By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtRiesgo.click();
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, riesgo);
		switch (riesgo.trim().toLowerCase()) {
			case Constants.RADIACION_IONIZANTE:
				Thread.sleep(1000);
				ingresarRadiacionIonizante(nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas,conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando , cualFueRazon, consecuenciasSufridas);
				break;
			case Constants.VUELOS_NO_REGULARES:
				Thread.sleep(1000);
				WebElement txtHoras = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'number')]"));
				txtHoras.sendKeys(hhAnuales);
				break;
			default:
				break;
		}
	}
	
	private static void ingresarRadiacionIonizante(String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas, String conCualesTrabaja, String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias, String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas) throws Exception {
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
		case Constants.AT_AREA_CONTROL:
			optionAreaTrabajo.get(0).click();
			break;
		case Constants.AT_AREA_VIGILANCIA:
			optionAreaTrabajo.get(1).click();
			break;
		case Constants.AT_OTRA_AREA:
			optionAreaTrabajo.get(2).click();
			break;
		default:
			break;
		}
	}
	
	public static void seleccionarFechaCalendar(String desdeCuando,Integer indexCalendar) throws Exception {
		if(desdeCuando!=null || !desdeCuando.equals("")) {
			//formato DD-MM-YYY
			String[] fecha = desdeCuando.trim().split("-");
			String dia = fecha[0];
			String mes = fecha[1];
			String anio = fecha[2];
//			selleciono formato de calendarfr
			WebElement formatoCalendar = BaseFlow.driver.findElements(By.xpath("//label[contains(@for,'days')]")).get(indexCalendar);
//			GenericMethod.scrollElement(formatoCalendar);
			Thread.sleep(1000);
			formatoCalendar.click();
			Thread.sleep(1000);
			formatoCalendar.click();
			Thread.sleep(1000);
			seleccionarAnioCalendar(indexCalendar,anio);
	 		seleccionarMesCalendar(indexCalendar,Integer.parseInt(mes));
			seleccionarDiaCalendar(indexCalendar,Integer.parseInt(dia));
		}else {
			assertFalse("Error no existe fecha para ingresar al calendario",true);
		}
		
	}
	
	private static void seleccionarAnioCalendar(Integer divCalendar, String anio) throws Exception {
		Thread.sleep(1000);
		List<WebElement> divAnio = BaseFlow.driver.findElements(By.xpath("//th[(@class='datepicker-switch')]"));
		Thread.sleep(1000);
		if(divCalendar==0) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(0));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==1){
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(5));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==2) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(10));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==3) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(15));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==4) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(20));
			GenericMethod.clickElement(calendar);
		}
		Thread.sleep(1000);
		List<WebElement> divAnio2 = BaseFlow.driver.findElements(By.xpath("//th[(@class='datepicker-switch')]"));
		if(divCalendar==0) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio2.get(1));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==1){
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio2.get(6));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==2) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio2.get(11));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==3) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(16));
			GenericMethod.clickElement(calendar);
		}else if(divCalendar==4) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(21));
			GenericMethod.clickElement(calendar);
		}
		Thread.sleep(1000);
		Boolean encontroAnio = false;
		while (encontroAnio==false) {
			if(divCalendar==0) {
				for (Integer i=0;i<=11;i++) {
					List<WebElement> listAnios = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'year')]"));
					if(listAnios.get(i).getText().toString().equals(anio)) {
						Thread.sleep(1000);
						listAnios.get(i).click();
						encontroAnio = true;
						break;
					}	else if(i==11){
						WebElement anioPrevio = BaseFlow.driver.findElements(By.xpath("//th[contains(@class,'prev')]")).get(2);
						anioPrevio.click();
						Thread.sleep(1000);
					} 
				}
			}else if(divCalendar==1){
				for (Integer i=13;i<=23;i++) {
					List<WebElement> listAnios = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'year')]"));
					if(listAnios.get(i).getText().toString().equals(anio)) {
						Thread.sleep(1000);
						listAnios.get(i).click();
						encontroAnio = true;
						break;
					}	else if(i==23){
						WebElement anioPrevio = BaseFlow.driver.findElements(By.xpath("//th[contains(@class,'prev')]")).get(2);
						anioPrevio.click();
						Thread.sleep(1000);
					} 
				}
			}else if(divCalendar==2){
				for (Integer i=24;i<=35;i++) {
					List<WebElement> listAnios = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'year')]"));
					if(listAnios.get(i).getText().toString().equals(anio)) {
						Thread.sleep(1000);
						listAnios.get(i).click();
						encontroAnio = true;
						break;
					}	else if(i==35){
						WebElement anioPrevio = BaseFlow.driver.findElements(By.xpath("//th[contains(@class,'prev')]")).get(11);
						anioPrevio.click();
						Thread.sleep(1000);
					} 
				}
			}else if(divCalendar==3){
				for (Integer i=36;i<=47;i++) {
					List<WebElement> listAnios = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'year')]"));
					if(listAnios.get(i).getText().toString().equals(anio)) {
						Thread.sleep(1000);
						listAnios.get(i).click();
						encontroAnio = true;
						break;
					}	else if(i==47){
						WebElement anioPrevio = BaseFlow.driver.findElements(By.xpath("//th[contains(@class,'prev')]")).get(11);
						anioPrevio.click();
						Thread.sleep(1000);
					} 
				}
			}else if(divCalendar==4){
				for (Integer i=48;i<=59;i++) {
					List<WebElement> listAnios = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'year')]"));
					if(listAnios.get(i).getText().toString().equals(anio)) {
						Thread.sleep(1000);
						listAnios.get(i).click();
						encontroAnio = true;
						break;
					}	else if(i==59){
						WebElement anioPrevio = BaseFlow.driver.findElements(By.xpath("//th[contains(@class,'prev')]")).get(22);
						anioPrevio.click();
						Thread.sleep(1000);
					} 
				}
			}
		}
	}
	
	
	private static void seleccionarMesCalendar(Integer divMes,Integer mes) throws Exception {
		Thread.sleep(1000);
		List<WebElement> listMes = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'month')]"));
		if(divMes==0) {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes-1));
			element.click();
		}else if(divMes==1) {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes+11));
			element.click();
		}else if(divMes==2) {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes+24));
			element.click();
		}else if(divMes==3) {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes+35));
			element.click();
		}else if(divMes==4) {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes+47));
			element.click();
		}
	}
	
	private static void seleccionarDiaCalendar(Integer divDIa, Integer dia) throws Exception {
		Thread.sleep(1000);
		List<WebElement> dias = BaseFlow.driver.findElements(By.xpath("//*[(@class='day')]"));
		Thread.sleep(1000);
		if(divDIa==0) {
			if(GenericMethod.existElement(By.xpath("//button[contains(@class,'hidden')]"))) {
				Thread.sleep(1000);
				dias.get(dia-1).click();
			}
		}else if(divDIa==1) {
			if(GenericMethod.existElement(By.xpath("//button[contains(@class,'hidden')]"))) {
				Thread.sleep(1000);
				dias.get(dia+31).click();
			}
		}else if(divDIa==2) {
			if(GenericMethod.existElement(By.xpath("//button[contains(@class,'hidden')]"))) {
				Thread.sleep(1000);
				dias.get(dia+61).click();
			}
		}else if(divDIa==3) {
			if(GenericMethod.existElement(By.xpath("//button[contains(@class,'hidden')]"))) {
				Thread.sleep(1000);
				dias.get(dia+90).click();
			}
		}else if(divDIa==4) {
			if(GenericMethod.existElement(By.xpath("//button[contains(@class,'hidden')]"))) {
				Thread.sleep(1000);
				dias.get(dia+119).click();
			}
		}
	}
	
	private  static void seleccionarSustanciasEncapsuladas(String sustanciasEncapsuladas, String sustanciasNoEncapsuladas) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> listCheckbox = BaseFlow.driver.findElements(By.className("checkbox-custom"));
		GenericMethod.scrollElement(listCheckbox.get(0));
		if(sustanciasEncapsuladas.trim().toLowerCase().equals(Constants.SI)) {
			WebElement checkSustanciasEncapsuladas = listCheckbox.get(0);
			checkSustanciasEncapsuladas.click();
		}
		if(sustanciasNoEncapsuladas.trim().toLowerCase().equals(Constants.SI)) {
			WebElement checkSustanciasNoEncapsuladas = listCheckbox.get(1);
			checkSustanciasNoEncapsuladas.click();
		}
	}
	
	private static void seleccionarTrabajaCon(String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo) throws Exception {
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
	
	private static void seleccionarSobrepasarLimiteRadiacion(String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores) throws Exception {
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
	
	private static void seleccionarTratamientoMedicoPorRadiacion(String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas) throws Exception {
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
	
	public static void ingresarLaboresRescatista(String labor) throws Exception {
		Thread.sleep(1000);
		WebElement txtLabores = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(1);
		txtLabores.click();
		Thread.sleep(1000);
		List<WebElement> listLabortes = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
		switch (labor.toLowerCase().trim()) {
		case Constants.BOMBERO:
			Thread.sleep(1000);
			listLabortes.get(0).click();
			break;
		case Constants.BOMBERO_AEROPUERTO:
			Thread.sleep(1000);
			listLabortes.get(1).click();
			break;
		case Constants.BOMBERO_FORESTAL:
			Thread.sleep(1000);
			listLabortes.get(2).click();
			break;
		case Constants.RESCATE_CON_OPERACIONES_EPECIALES:
			Thread.sleep(1000);
			listLabortes.get(3).click();
			break;
		case Constants.RESCATE_SIN_OPERACIONES_EPECIALES:
			Thread.sleep(1000);
			listLabortes.get(4).click();
			break;
		default:
			break;
		}
	}
	
	public static void ingresoMotocicletaComoMedioTransporte(String cilindrada) throws Exception{
		Thread.sleep(1000);
		WebElement txtCilindrada = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtCilindrada.click();
		Thread.sleep(1000);
		List<WebElement> listCilindrada = BaseFlow.driver.findElements(By.xpath("//li[(@class= 'ember-power-select-option')]"));
		switch (cilindrada.toLowerCase().trim()) {
		case Constants.ENTRE_125_Y_500:
			Thread.sleep(1000);
			listCilindrada.get(0).click();
			break;
		case Constants.MAS_DE_500:
			Thread.sleep(1000);
			listCilindrada.get(1).click();
			break;
		case Constants.MENOS_DE_125:
			Thread.sleep(1000);
			listCilindrada.get(2).click();
			break;
		default:
			break;
		}
	}
	public static void ingresoVigenciaSeguroVida(String seguroVidaVigente, String tipoSeguro, String compania, String sumaAsegurada, String fechaCobertura, String resultadoAceptacion,Integer countSeguro)throws Exception {
		ingresoTipoSeguro(tipoSeguro);
		ingresoCompania(compania,countSeguro);
		WebElement txtSuma;
		if(countSeguro==0) {
			Thread.sleep(1000);
			txtSuma = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'input-default')]")).get(0);
			txtSuma.sendKeys(sumaAsegurada);
			Thread.sleep(1000);
		}else {
			Thread.sleep(1000);
			txtSuma = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'input-default')]")).get(1);
			txtSuma.sendKeys(sumaAsegurada);
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		seleccionarFechaCalendar(fechaCobertura, countSeguro);
		Thread.sleep(1000);
//		cual fue el resultado de aceptacion
		ingresoResultadoAceptacion(resultadoAceptacion,countSeguro);
	}
	
	private static void ingresoTipoSeguro(String tipoSeguro) throws Exception {
		Thread.sleep(1000);
		WebElement txtSeguro = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtSeguro.click();
		Thread.sleep(1000);
		List<WebElement> listSeguros = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
		switch (tipoSeguro.toLowerCase().trim()) {
		case Constants.SEGURO_ACCIDENTES:
			listSeguros.get(0).click();
			break;
		case Constants.SEGURO_EG:
			listSeguros.get(1).click();
			break;
		case Constants.SEGURO_IAP:
			listSeguros.get(2).click();
			break;
		case Constants.SEGURO_IP:
			listSeguros.get(3).click();
			break;
		case Constants.SEGURO_VIDA:
			listSeguros.get(4).click();
			break;
		default:
			break;
		}
	}	
	
	private static void ingresoCompania(String compania,Integer countSeguro) throws Exception {
		Thread.sleep(1000);
		WebElement txtCompania;
		if(countSeguro==0) {
			Thread.sleep(1000);
			txtCompania = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(1);
			txtCompania.click();
		}else {
			Thread.sleep(1000);
			txtCompania = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(2);
			txtCompania.click();
		}
		Thread.sleep(1000);
		WebElement searchCompania = BaseFlow.driver.findElement(By.xpath("//input[(@class='ember-power-select-search-input')]"));
		GenericMethod.ingresarTextoSugerido(searchCompania, compania);
	}

	private static void ingresoResultadoAceptacion(String resultadoAceptacion, Integer countSeguro) throws Exception {
		List<WebElement> txtResultado = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtResultado.get(countSeguro+1).click();
		Thread.sleep(1000);
		List<WebElement> listResultado = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (resultadoAceptacion.toLowerCase().trim()) {
		case Constants.ACEPTADO:
			listResultado.get(0).click();
			break;
		case Constants.ACEPTADO_CON_RECARGO:
			listResultado.get(1).click();
			break;
		case Constants.APLICACION_SIMULTANEA:
			listResultado.get(2).click();
			break;
		case Constants.NO_ACEPTADO:
			listResultado.get(3).click();
			break;
		default:
			break;
		}
	}

	public static void ingresoViajesAlExtranjero (String pais, String motivo, String tiempoEstancia, String dondeReside, String dondeAloja, String viajesActividad, Integer countViaje) throws Exception{
		Thread.sleep(1000);
		WebElement txtViaje = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtViaje.click();
		Thread.sleep(1000);
		WebElement searchViaje = GenericMethod.implicityWait(2, By.xpath("//input[contains(@class,'ember-power-select-search-input')]"));
		GenericMethod.ingresarTextoSugerido(searchViaje, pais);
		ingresarMotivoViaje(countViaje, motivo);
		ingresarTiempoEstadia(countViaje, motivo, tiempoEstancia, dondeReside,dondeAloja, viajesActividad);;
	}
	
	public static void ingresarMotivoViaje(Integer countViaje, String motivo) throws Exception {
		Thread.sleep(1000);
		List<WebElement> listMotivo = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		WebElement txtMotivo= null;
		switch (countViaje) {
		case 0:
			txtMotivo = listMotivo.get(1);
			txtMotivo.click();
			
			break;
		case 1:
			txtMotivo = listMotivo.get(4);
			txtMotivo.click();
			break;
		default:
			break;
		}
		seleccionarMotivoViaje(motivo);
	}
	
	private static void seleccionarMotivoViaje(String motivo) throws Exception {
		Thread.sleep(1000);
		List<WebElement> listMotivo = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
		switch (motivo.toLowerCase().trim()) {
		case Constants.VIAJE_DESCONOCIDO:
			Thread.sleep(1000);
			listMotivo.get(0).click();
			break;
		case Constants.VIAJE_PROFESIONAL:
			Thread.sleep(1000);
			listMotivo.get(1).click();
			break;
		case Constants.VIAJE_SOLO_PRIVADO:
			Thread.sleep(1000);
			listMotivo.get(2).click();
			break;
		default:
			break;
		}
	}
	
	public static void ingresarTiempoEstadia(Integer countViaje,String motivo, String tiempoEstancia, String dondeReside,String dondeAloja, String viajesActividad)throws Exception{
		Thread.sleep(1000);
		List<WebElement> listTiempo= BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		switch (countViaje) {
		case 0:
			Thread.sleep(1000);
			listTiempo.get(2).click();
			break;
		case 1:
			Thread.sleep(1000);
			listTiempo.get(4).click();
			break;

		default:
			break;
		}
		seleccionarTiempoEstadia(motivo, tiempoEstancia, dondeReside, dondeAloja, viajesActividad);
	}
	
	private static void seleccionarTiempoEstadia(String motivo, String tiempoEstancia, String dondeReside,String dondeAloja, String viajesActividad) throws Exception{
		Thread.sleep(1000);
		List<WebElement> listMotivo = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
		switch (tiempoEstancia.toLowerCase().trim()) {
		case Constants.ESTADIA_10_DIAS_AL_ANIO:
			Thread.sleep(1000);
			listMotivo.get(0).click();
			break;
		case Constants.ESTADIA_10_A_30_DIAS:
			Thread.sleep(1000);
			listMotivo.get(1).click();
			if(!motivo.equals(Constants.VIAJE_SOLO_PRIVADO)) {
				dondeReside(dondeReside);
				dondeAloja(dondeAloja);
				realizaViajes(viajesActividad);
			}
			break;
		case Constants.ESTADIA_31_A_12_MESES:
			Thread.sleep(1000);
			listMotivo.get(2).click();	
			if(!motivo.equals(Constants.VIAJE_SOLO_PRIVADO)) {
				dondeReside(dondeReside);
				dondeAloja(dondeAloja);
				realizaViajes(viajesActividad);
			}
			break;
		case Constants.ESTADIA_PERMANENTE:
			Thread.sleep(1000);
			listMotivo.get(3).click();
			if(!motivo.equals(Constants.VIAJE_SOLO_PRIVADO)) {
				dondeReside(dondeReside);
				dondeAloja(dondeAloja);
				realizaViajes(viajesActividad);
			}
			break;
		case Constants.ESTADIA_DESCONOCIDA:
			Thread.sleep(1000);
			listMotivo.get(4).click();	
			if(!motivo.equals(Constants.VIAJE_SOLO_PRIVADO)) {
				dondeReside(dondeReside);
				dondeAloja(dondeAloja);
				realizaViajes(viajesActividad);
			}
			break;
		default:
			assertFalse("Error el dato de entrada para tiempoEstancia no esta mapeado :"+tiempoEstancia,true);
		}
	}
	
	private static void dondeReside(String dondeReside)throws Exception {
		Thread.sleep(1000);
		List<WebElement> txtReside = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtReside.get(3).click();
		Thread.sleep(1000);
		List<WebElement> listReside = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (dondeReside.toLowerCase().trim()) {
		case Constants.RESIDENCIA_CIUDAD:
			listReside.get(0).click();
			break;
		case Constants.RESIDENCIA_CAPITAL:
			listReside.get(1).click();		
			break;
		case Constants.RESIDENCIA_PUEBLO:
			listReside.get(2).click();
			break;
		case Constants.RESIDENCIA_DESCONOCIDA:
			listReside.get(3).click();
			break;
		default:
			assertFalse("Error el dato de entrada dondeReside no esta mapeado ."+dondeReside,true);
		}
	}
	
	private static void dondeAloja(String dondeAloja)throws Exception {
		Thread.sleep(1000);
		List<WebElement> txtAloja = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtAloja.get(4).click();
		Thread.sleep(1000);
		List<WebElement> listReside = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (dondeAloja.toLowerCase().trim()) {
		case Constants.ALOJAMIENTO_BASICO:
			listReside.get(0).click();
			break;
		case Constants.ALOJAMIENTO_ESTANDAR:
			listReside.get(1).click();		
			break;
		case Constants.ALOJAMIENTO_DESCONOCIDO:
			listReside.get(2).click();
			break;
		case Constants.ALOJAMIENTO_LUJO:
			listReside.get(3).click();
			break;
		default:
			assertFalse("Error el dato de entrada dondeAloja no esta mapeado : "+dondeAloja,true);
		}
	}
	
	private static void realizaViajes(String viajesActividad)throws Exception {
		Thread.sleep(1000);
		List<WebElement> txtviajes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtviajes.get(5).click();
		Thread.sleep(1000);
		List<WebElement> listViaje = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (viajesActividad.toLowerCase().trim()) {
		case Constants.VIAJES_DESCONOCIDO:
			listViaje.get(0).click();
			break;
		case Constants.VIAJES_NO:
			listViaje.get(1).click();		
			break;
		case Constants.VIAJES_DISTINTOS_LUGARES:
			listViaje.get(2).click();
			break;
		case Constants.VIAJES_A_MAS_LUGARES:
			listViaje.get(3).click();
			break;
		default:
			assertFalse("Error el dato de entrada viajesActividad no esta mapeado : "+viajesActividad,true);
		}
	}
	
	
	public static void ingresoConsumoBebidasAlcoholicas(Integer countBebidas, String tipo, String frecuencia)throws Exception{
		Thread.sleep(1000);
		List<WebElement> txtBebida = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtBebida.get(0).click();
		ingresoBebida(tipo);
		Thread.sleep(1000);
		switch (countBebidas) {
		case 0:
			WebElement txtUnidades = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(2);
			txtUnidades.sendKeys(frecuencia);
			break;
		case 1:
			WebElement txtUnidades2 = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
			txtUnidades2.sendKeys(frecuencia);
			break;
		case 2:
			WebElement txtUnidades3 = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(4);
			txtUnidades3.sendKeys(frecuencia);
			break;
		default:
			break;
		}
		
	}
	
	private static void ingresoBebida(String tipo)throws Exception {
		Thread.sleep(1000);
		List<WebElement> listBebida = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (tipo) {
		case Constants.CERVEZA:
			Thread.sleep(1000);
			listBebida.get(0).click();
			break;
		case Constants.CHAMPAN:
			Thread.sleep(1000);
			listBebida.get(1).click();
			break;
		case Constants.LICORES:
			Thread.sleep(1000);
			listBebida.get(2).click();
			break;
		case Constants.OTROS:
			Thread.sleep(1000);
			listBebida.get(3).click();
			break;
		case Constants.VINO:
			Thread.sleep(1000);
			listBebida.get(4).click();
			break;
		default:
			assertFalse("Error el valor del dato tipo no esta mapeado :"+tipo,true);
		}
	}
	
	
	public static void ingresoFumador(Integer countFumador, String queFuma, String frecuenciaFuma)throws Exception{
		Thread.sleep(1000);
		List<WebElement> txtFumador = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtFumador.get(1).click();
		Thread.sleep(1000);
		List<WebElement> listFumador = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (queFuma) {
		case Constants.FUMA_CIGARRILLOS:
			Thread.sleep(1000);
			listFumador.get(0).click();
			break;
		case Constants.FUMA_CIGARROS_O_PUROS:
			Thread.sleep(1000);
			listFumador.get(1).click();
			break;
		case Constants.FUMA_PIPAS:
			Thread.sleep(1000);
			listFumador.get(2).click();
			break;			
		default:
			assertFalse("Error el valor del dato queFuma no esta mapeado :"+queFuma,true);
		}
		ingresoFrecuenciaFumador(countFumador, frecuenciaFuma);
	}
	
	private static void ingresoFrecuenciaFumador(Integer countFumador,String frecuenciaFuma) throws Exception{
		Thread.sleep(1000);
		List<WebElement> txtCantidad = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		if(countFumador==0) {
			Thread.sleep(1000);
			txtCantidad.get(3).sendKeys(frecuenciaFuma);
		}else if(countFumador==1) {
			Thread.sleep(1000);
			txtCantidad.get(4).sendKeys(frecuenciaFuma);
		}
		
	}
	
	public static void ingresoConsumoDrogas(String alucinogenos, String anfetaminas, String cocaina, String heroina, String marihuanaFrecuente, String marihuanaOcacional)throws Exception{
		Thread.sleep(1000);
		List<WebElement> listDrogas = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'checkbox-custom')]"));
		if(alucinogenos.equals(Constants.SI)) {
			Thread.sleep(1000);
			listDrogas.get(0).click();
		}if(anfetaminas.equals(Constants.SI)) {
			Thread.sleep(1000);
			listDrogas.get(1).click();
		}if(cocaina.equals(Constants.SI)) {
			Thread.sleep(1000);
			listDrogas.get(2).click();
		}if(heroina.equals(Constants.SI)) {
			Thread.sleep(1000);
			listDrogas.get(3).click();
		}if(marihuanaFrecuente.equals(Constants.SI)) {
			Thread.sleep(1000);
			listDrogas.get(4).click();
		}if(marihuanaOcacional.equals(Constants.SI)) {
			Thread.sleep(1000);
			listDrogas.get(5).click();
		}
		Thread.sleep(1000);
		WebElement iconGrabar = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'icon-Suscribir')]")).get(4);
		iconGrabar.click();
		Thread.sleep(1000);
	}
	
	public static void ingresoEmbarazo(String complicaciones, String nombreComplicacion, String fechaDesde, String fechaHasta, String secuelas, String especifiqueSecuelas) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioEmbarazada = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (complicaciones) {
		case Constants.NO:
			Thread.sleep(1000);
			radioEmbarazada.get(8).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioEmbarazada.get(9).click();
			ingresarComplicacionEmbarazo(nombreComplicacion, fechaDesde, fechaHasta, secuelas, especifiqueSecuelas);
			break;
		default:
			break;
		}
	}
	
	private static void ingresarComplicacionEmbarazo( String nombreComplicacion, String fechaDesde, String fechaHasta, String secuelas, String especifiqueSecuelas) throws Exception {
		Thread.sleep(1000);
		List<WebElement> listComplicaciones = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		listComplicaciones.get(0).click();
		Thread.sleep(1000);
		WebElement txtSearch = GenericMethod.implicityWait(2, By.xpath("//input[(@class='ember-power-select-search-input')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, nombreComplicacion);
		Thread.sleep(1000);
		GenericMethod.implicityWait(10, By.xpath("//div[(@class='left ')]"));
		ingresarFechaDesdeHasta(fechaDesde, fechaHasta);
		Thread.sleep(1000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (secuelas) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(16).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(17).click();
			Thread.sleep(1000);
			WebElement txtSecuelas = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(4);
			txtSecuelas.sendKeys(especifiqueSecuelas);
			break;
		default:
			break;
		}
	}
	
	private static void ingresarFechaDesdeHasta(String fechaDesde, String fechaHasta)throws Exception{
		Thread.sleep(1000);
		String[] fecha = fechaDesde.trim().split("-");
		String mes = fecha[1];
		String anio = fecha[2];
		seleccionarAnioDesde(anio);
		seleccionarMesDesde(Integer.parseInt(mes));
		
		Thread.sleep(1000);
		String[] fechaH= fechaHasta.trim().split("-");
		String mes2 = fechaH[1];
		String anio2= fechaH[2];
		seleccionarAnioHasta(anio2);
		seleccionarMesHasta(Integer.parseInt(mes2)+11);
		
		Thread.sleep(1000);
		WebElement btnGuardar = GenericMethod.implicityWait(2, By.xpath("//button[(@id='calendar')]"));
		btnGuardar.click();
	}
	
	private static void seleccionarAnioDesde(String anio) throws Exception {
		Thread.sleep(1000);
		Boolean seleccionAnio = false;
		do {
			WebElement years = BaseFlow.driver.findElements(By.xpath("//th[(@class='datepicker-switch')]")).get(1);
			if(anio.equals(years.getText().toString())) {
				seleccionAnio=true; 
				break;
			}else {
				WebElement prev = BaseFlow.driver.findElements(By.xpath("//th[(@class='prev')]")).get(1);
				prev.click();
			}
		} while (seleccionAnio==false);
	}
	
	private static void seleccionarMesDesde(Integer mes) throws Exception {
		Thread.sleep(1000);
		List<WebElement> months = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'month')]"));
		GenericMethod.scrollElement(months.get(mes-1));
		Thread.sleep(1000);
		months.get(mes-1).click();
	}
	
	private static void seleccionarAnioHasta(String anio) throws Exception {
		Thread.sleep(1000);
		Boolean seleccionAnio = false;
		do {
			WebElement years = BaseFlow.driver.findElements(By.xpath("//th[(@class='datepicker-switch')]")).get(6);
			if(anio.equals(years.getText().toString())) {
				seleccionAnio=true; 
				break;
			}else {
				WebElement prev = BaseFlow.driver.findElements(By.xpath("//th[(@class='prev')]")).get(1);
				prev.click();
			}
		} while (seleccionAnio==false);
	}
	
	private static void seleccionarMesHasta(Integer mes) throws Exception {
		Thread.sleep(1000);
		List<WebElement> months = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'month')]"));
		months.get(mes).click();
	}
	
	public static Integer indexRadio = 0;
	public static Integer ingresarAccidente(String complicacionesAcc, String especifiqueComplicacionesAcc, String fechaDesdeAcc, String fechaHastaAcc, String trastornoVariasVeces, String secuelasAcc, String especifiqueSecuelasAcc, Integer index) throws Exception{
		indexRadio = index;
		Thread.sleep(1000);
		List<WebElement> radioAccidentes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (complicacionesAcc.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			indexRadio+=1;
			radioAccidentes.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			indexRadio+=2;
			radioAccidentes.get(indexRadio).click();
			ingresarComplicaciones(especifiqueComplicacionesAcc, fechaDesdeAcc, fechaHastaAcc, trastornoVariasVeces, secuelasAcc, especifiqueSecuelasAcc);
			Thread.sleep(1000);
			break;
		default:
			break;
		}
		return indexRadio;
	}
	
	
	private static void ingresarComplicaciones(String especifiqueComplicacionesAcc, String fechaDesdeAcc, String fechaHastaAcc, String trastornoVariasVeces, String secuelasAcc, String especifiqueSecuelasAcc) throws Exception{
		Thread.sleep(1000);
		WebElement txtComplicacion = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtComplicacion.click();
		Thread.sleep(1000);
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, especifiqueComplicacionesAcc);
		Thread.sleep(1000);
		ingresarFechaDesdeHasta(fechaDesdeAcc, fechaHastaAcc);
		Thread.sleep(1000);
		ingresarTrastornoPorAccidente(trastornoVariasVeces);
		Thread.sleep(1000);
		ingresarSecuelasAccidentes(secuelasAcc,especifiqueSecuelasAcc);
		Thread.sleep(1000);
		
	}
	private static void ingresarTrastornoPorAccidente(String trastornoVariasVeces)throws Exception{
		Thread.sleep(1000);
		indexRadio+=7;
		List<WebElement> radioTrastorno = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (trastornoVariasVeces.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioTrastorno.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioTrastorno.get(indexRadio+1).click();
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	private static void ingresarSecuelasAccidentes(String secuelasAcc,String especifiqueSecuelasAcc) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioSecuelas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (secuelasAcc.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioSecuelas.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioSecuelas.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtSecuelas = BaseFlow.driver.findElement(By.xpath("//input[contains(@placeholder,'Describa las complicaciones o secuelas')]"));
			txtSecuelas.sendKeys(especifiqueSecuelasAcc);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	
	public static Integer ingresarCentroHospitalario(Integer index,String trastorno, String cuando, String sintomasAun, String especifiqueSintoma, String tratamientoMedico, String fechaInicioTratamiento, String fechaTermino, String operado, String frecuenciaOperado, String especifiqueOperado, String fechaOperacionUno, String fechaOperacionDos, String fechaOperacionTres, String cirugiaPlaneada, String fechaCirugiaPlaneada, String tipoCirugiaPlaneada, String incapacidad, String fechaDiscapacidad, String promedioIncapacitado, String cambioProfesion, String ocupacion, String ocupacionRecomendada)throws Exception{
		indexRadio = index;
		Thread.sleep(1000);
		WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtTrastorno.click();
		Thread.sleep(1000);
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
		FormularioServices.seleccionarFechaCalendar(cuando, 0);
		indexRadio+=3;
		ingresoSintomasHopitalario(sintomasAun, especifiqueSintoma, tratamientoMedico, fechaInicioTratamiento, fechaTermino, operado, frecuenciaOperado, especifiqueOperado, fechaOperacionUno, fechaOperacionDos, fechaOperacionTres, cirugiaPlaneada, fechaCirugiaPlaneada, tipoCirugiaPlaneada, incapacidad, fechaDiscapacidad, promedioIncapacitado, cambioProfesion, ocupacion, ocupacionRecomendada);
		return indexRadio;
	}
	
	private static void ingresoSintomasHopitalario(String sintomasAun, String especifiqueSintoma, String tratamientoMedico, String fechaInicioTratamiento, String fechaTermino, String operado, String frecuenciaOperado, String especifiqueOperado, String fechaOperacionUno, String fechaOperacionDos, String fechaOperacionTres, String cirugiaPlaneada, String fechaCirugiaPlaneada, String tipoCirugiaPlaneada, String incapacidad, String fechaDiscapacidad, String promedioIncapacitado, String cambioProfesion, String ocupacion, String ocupacionRecomendada) throws Exception {
		Thread.sleep(1000);
		List<WebElement> radioSintomasAun = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (sintomasAun.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioSintomasAun.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioSintomasAun.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtSintoma = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique sus complicaciones')]"));
			txtSintoma.sendKeys(especifiqueSintoma);
			indexRadio+=2;
			ingresoTratamientoMedicoHospitalario(tratamientoMedico, fechaInicioTratamiento, fechaTermino);
			ingresoOperadoHospitalario(operado, frecuenciaOperado, especifiqueOperado, fechaOperacionUno, fechaOperacionDos, fechaOperacionTres);
			ingresoCirugiaHospitalario(cirugiaPlaneada, fechaCirugiaPlaneada, tipoCirugiaPlaneada);
			ingresoIncapacidadHospitalario(incapacidad, fechaDiscapacidad, promedioIncapacitado, cambioProfesion, ocupacion, ocupacionRecomendada);
			break;
		default:
			break;
		}
	}
	
	private static void ingresoTratamientoMedicoHospitalario(String tratamientoMedico, String fechaInicioTratamiento, String fechaTermino) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioMedico = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (tratamientoMedico.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioMedico.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioMedico.get(indexRadio+1).click();
			FormularioServices.seleccionarFechaCalendar(fechaInicioTratamiento, 1);
			if(fechaTermino.equals("")) {
				Thread.sleep(1000);
				List<WebElement> iconDate = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'icon-cuestionario')]"));
				iconDate.get(0).click();
			}else {
				FormularioServices.seleccionarFechaCalendar(fechaInicioTratamiento, 2);
				indexRadio +=3;
			}
			indexRadio+=6;
			break;
		default:
			break;
		}
		indexRadio+=2;
	} 
	
	private static void ingresoOperadoHospitalario(String operado, String frecuenciaOperado, String especifiqueOperado, String fechaOperacionUno, String fechaOperacionDos, String fechaOperacionTres)throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioOperado = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (operado.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioOperado.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioOperado.get(indexRadio+1).click();
			Thread.sleep(1000);
			List<WebElement> radioFrecuenciaOperado = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			switch (frecuenciaOperado.toLowerCase().trim()) {
				case Constants.REPETIDAS_VECES:
					Thread.sleep(1000);
					radioFrecuenciaOperado.get(indexRadio).click();
					indexRadio+=2;
					break;
				case Constants.UNA_VEZ:
					Thread.sleep(1000);
					radioFrecuenciaOperado.get(indexRadio+1).click();
					indexRadio+=2;
					break;
				default:
					break;
			}
			Thread.sleep(1000);
			WebElement txtEspecifiqueCirugia = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique la cirugía realizada')]"));
			txtEspecifiqueCirugia.sendKeys(especifiqueOperado);
			Thread.sleep(1000);
			FormularioServices.seleccionarFechaCalendar(fechaOperacionUno, 3);
			if(fechaOperacionDos.equals("")) {
				Thread.sleep(1000);
				List<WebElement> iconDate = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'icon-cuestionario')]"));
				iconDate.get(1).click();
			}else {
				seleccionarFechaCalendar(fechaOperacionDos, 4);
			}
			
			if(fechaOperacionTres.equals("")) {
				Thread.sleep(1000);
				List<WebElement> iconDate = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'icon-cuestionario')]"));
				iconDate.get(2).click();
			}else {
				seleccionarFechaCalendar(fechaOperacionTres, 5);
			}
			indexRadio+=2;
			break;
		default:
			break;
		}
	}
	
	private static void ingresoCirugiaHospitalario(String  cirugiaPlaneada, String fechaCirugiaPlaneada, String tipoCirugiaPlaneada) throws Exception{
		//TODO 
	}
	
	private static void ingresoIncapacidadHospitalario(String incapacidad, String fechaDiscapacidad, String promedioIncapacitado, String cambioProfesion, String ocupacion, String ocupacionRecomendada) throws Exception{
		//TODO
	}
	
	public static Integer ingresarObservacionesMedicas(Integer index, String trastorno, String anemiaFerropenica, String fechaFerropenica, String anemiaSangre, String aplasica, String celulasFalciformes, String hemolitica, String hemorragica, String perniciosa, String otro, String causaTrastorno, String fechaSintomas, String tipoTratamiento, String especifiqueTratamientos, String sintomasAun, String fechaLibreSintomas, String complicacionAun, String tratamientoMedico, String inicioTratamientoMedico, String terminoTratamientoMedico, String sinDiagnosticar) throws Exception{
		indexRadio = index;
		Thread.sleep(1000);
		WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtTrastorno.click();
		Thread.sleep(1000);
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
		Thread.sleep(1000);
		ingresarTipoAnemia(anemiaFerropenica, fechaFerropenica, anemiaSangre, aplasica, celulasFalciformes, hemolitica, hemorragica, perniciosa, otro, causaTrastorno, fechaSintomas, tipoTratamiento, especifiqueTratamientos, sintomasAun, fechaLibreSintomas, complicacionAun, tratamientoMedico, inicioTratamientoMedico, terminoTratamientoMedico, sinDiagnosticar);
		return indexRadio; 
	}
	
	private static void ingresarTipoAnemia(String anemiaFerropenica, String fechaFerropenica, String anemiaSangre, String aplasica, String celulasFalciformes, String hemolitica, String hemorragica, String perniciosa, String otro, String causaTrastorno, String fechaSintomas, String tipoTratamiento, String especifiqueTratamientos, String sintomasAun, String fechaLibreSintomas, String complicacionAun, String tratamientoMedico, String inicioTratamientoMedico, String terminoTratamientoMedico, String sinDiagnosticar)throws Exception {
		List<WebElement> listCheck = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'checkbox-custom')]"));
		if(anemiaFerropenica.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(0).click();
		}if(anemiaSangre.equals(Constants.SI)) {
			Thread.sleep(1000);	
			listCheck.get(1).click();
		}if(aplasica.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(2).click();
		}if(celulasFalciformes.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(3).click();
		}if(hemorragica.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(4).click();
		}if(hemolitica.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(5).click();
		}if(perniciosa.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(6).click();
		}if(otro.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(7).click();
		}if(sinDiagnosticar.equals(Constants.SI)) {
			Thread.sleep(1000);
			listCheck.get(8).click();
		}
		
		if(indexRadio<10) {
			WebElement btnLike = BaseFlow.driver.findElement(By.xpath("//span[contains(@class,'icon-Suscribir')]"));
			btnLike.click();
		}else {
			WebElement btnLike = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'icon-Suscribir')]")).get(2);
			btnLike.click();
		}
		if(anemiaFerropenica.equals(Constants.SI)) {
			Thread.sleep(1000);
			seleccionarFechaCalendar(fechaFerropenica, 0);
			indexRadio+=3;
		}if(otro.equals(Constants.SI)) {
			ingresarOpcionOtroAnemia(causaTrastorno, fechaSintomas, tipoTratamiento, especifiqueTratamientos, sintomasAun, fechaLibreSintomas, complicacionAun, tratamientoMedico, inicioTratamientoMedico, terminoTratamientoMedico);
		}
	}
	private static void ingresarOpcionOtroAnemia(String causaTrastorno, String fechaSintomas, String tipoTratamiento, String especifiqueTratamientos, String sintomasAun, String fechaLibreSintomas, String complicacionAun, String tratamientoMedico, String inicioTratamientoMedico, String terminoTratamientoMedico) throws Exception {
		Thread.sleep(1000);
		WebElement txtCausaTrastorno = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'es la causa de su trastorno')]"));
		txtCausaTrastorno.sendKeys(causaTrastorno);
		Thread.sleep(1000);
		seleccionarFechaCalendar(fechaSintomas, 0);
		indexRadio+=3;
		Thread.sleep(1000);
		WebElement txtTipoTrastorno = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'tipo de tratamiento se está sometiendo')]"));
		txtTipoTrastorno.sendKeys(tipoTratamiento);
		Thread.sleep(1000);
		WebElement txtEspecifiqueTratamiento = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique la medicación')]"));
		txtEspecifiqueTratamiento.sendKeys(especifiqueTratamientos);
		Thread.sleep(1000);
		List<WebElement> radioAunSintomas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (sintomasAun.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioAunSintomas.get(indexRadio).click();
			indexRadio+=2;
			Thread.sleep(1000);
			seleccionarFechaCalendar(fechaLibreSintomas, 1);
			indexRadio+=3;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioAunSintomas.get(indexRadio+1).click();
			indexRadio+=2;
			Thread.sleep(2000);
			WebElement txtSintomas = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué síntomas/complicaciones tiene')]"));
			txtSintomas.sendKeys(complicacionAun);
			break;
		default:
			break;
		}
		Thread.sleep(1000);
		List<WebElement> radioTratamiento = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (tratamientoMedico.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioTratamiento.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioTratamiento.get(indexRadio+1).click();
			indexRadio+=2;
			Thread.sleep(1000);
			seleccionarFechaCalendar(inicioTratamientoMedico, 1);
			indexRadio+=3;
			Thread.sleep(1000);
			seleccionarFechaCalendar(terminoTratamientoMedico, 2);
			indexRadio+=3;
			break;
		default:
			break;
		}
	}
	
	public static Integer ingresarTratamientoMedicoPVeinte(Integer index,String trastorno, String fechaPrimeraVez, String sintomasAun, String queSintomasActuales, String frecuencia, String sintomasUltimaVez, String SintomasAnio, String promedioSintomas, String revisionesMedico, String cirugia, String cuandoSometioCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia, String tipoCirugia, String medicacion, String medicacionTomando, String otro, String otroTratamiento, String fechaTratamiento, String sinTratamiento, String continuidadLaboral, String fechaBaja) throws Exception{
		indexRadio = index;
		Thread.sleep(1000);
		WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtTrastorno.click();
		Thread.sleep(1000);
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
		Thread.sleep(1000);
		if(GenericMethod.implicityWait(20, By.xpath("//div[contains(@class,'calendar monthly')]"))!=null){
			seleccionarFechaCalendar(fechaPrimeraVez, 0);
			indexRadio+=3;
			ingresarSintomasAun(sintomasAun, queSintomasActuales, frecuencia, sintomasUltimaVez, SintomasAnio, promedioSintomas, revisionesMedico, cirugia, cuandoSometioCirugia, especifiqueCirugia, cirugiaPrevista, cuandoSometeraCirugia, tipoCirugia, medicacion, medicacionTomando, otro, otroTratamiento, fechaTratamiento, sinTratamiento, continuidadLaboral, fechaBaja);
		}
		return indexRadio;
	}
	
	private static void ingresarSintomasAun(String sintomasAun, String queSintomasActuales, String frecuencia, String sintomasUltimaVez, String SintomasAnio, String promedioSintomas, String revisionesMedico, String cirugia, String cuandoSometioCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia, String tipoCirugia, String medicacion, String medicacionTomando, String otro, String otroTratamiento, String fechaTratamiento, String sinTratamiento, String continuidadLaboral, String fechaBaja) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioSintomasAun = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (sintomasAun.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioSintomasAun.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioSintomasAun.get(indexRadio+1));
			Thread.sleep(1000);
			radioSintomasAun.get(indexRadio+1).click();
			indexRadio+=2;
			ingresarSintomasActuales(queSintomasActuales);
			ingresarFrecuenciaSintomas(frecuencia, sintomasUltimaVez, SintomasAnio, promedioSintomas);
			ingresarRevisionesRegularesMedico(revisionesMedico);
			seleccionarQueTratamientosSigue(cirugia, cuandoSometioCirugia, especifiqueCirugia, cirugiaPrevista, cuandoSometeraCirugia, tipoCirugia, medicacion, medicacionTomando, otro, otroTratamiento, fechaTratamiento,sinTratamiento);
			seleccionarInactividadLaboral(continuidadLaboral, fechaBaja);
			break;
		default:
			break;
		}
	}
	
	private static void ingresarSintomasActuales(String queSintomasActuales)throws Exception{
		Thread.sleep(1000);
		WebElement txtSintomasActuales = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'padece en la actualidad')]"));
		Thread.sleep(1000);
		GenericMethod.scrollElement(txtSintomasActuales);
		Thread.sleep(1000);
		txtSintomasActuales.sendKeys(queSintomasActuales);
	}
	
	private static void ingresarFrecuenciaSintomas(String frecuencia, String sintomasUltimaVez, String SintomasAnio, String promedioSintomas)throws Exception{
		Thread.sleep(1000);
		WebElement txtFrecuencia = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'ember-power-select-status-icon')]")).get(1);
		txtFrecuencia.click();
		Thread.sleep(1000);
		if(!GenericMethod.existElement(By.xpath("//li[contains(@class,'ember-power-select-option')]"))) {
			Thread.sleep(1000);
			WebElement txtFrecuencia2 = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'ember-power-select-status-icon')]")).get(1);
			txtFrecuencia2.click();
		}
		Thread.sleep(1000);
		List<WebElement> listFrecuencia = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (frecuencia.toLowerCase().trim()) {
		case Constants.PERMANENTEMENTE:
			Thread.sleep(1000);
		    listFrecuencia.get(0).click();
		    Thread.sleep(1000);
		    seleccionarFechaCalendar(sintomasUltimaVez, 1);
		    indexRadio+=3;
			break;
		case Constants.RECURRENTEMENTE:
			Thread.sleep(1000);
		    listFrecuencia.get(1).click();
		    Thread.sleep(1000);
		    seleccionarFechaCalendar(sintomasUltimaVez, 1);
		    indexRadio+=3;
		    Thread.sleep(1000);
		    WebElement txtSintomasAnio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
		    txtSintomasAnio.sendKeys(SintomasAnio);
		    Thread.sleep(1000);
		    WebElement txtSintomasPromedio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(4);
		    txtSintomasPromedio.sendKeys(promedioSintomas);
			break;
		case Constants.UNA_VEZ:
			Thread.sleep(1000);
		    listFrecuencia.get(2).click();
		    Thread.sleep(1000);
		    WebElement txtSintomasProm = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
		    txtSintomasProm.sendKeys(promedioSintomas);
			break;
		default:
			break;
		}
		
	}
	
	private static void ingresarRevisionesRegularesMedico(String revisionesMedico) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioRevision = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (revisionesMedico.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioRevision.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioRevision.get(indexRadio+1).click();
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	private static void seleccionarQueTratamientosSigue(String cirugia, String cuandoSometioCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia, String tipoCirugia, String medicacion, String medicacionTomando, String otro, String otroTratamiento,String fechaTratamiento, String sinTratamiento) throws Exception{
		Thread.sleep(1000);
		List<WebElement> listTratamientos = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'checkbox-custom')]"));
		GenericMethod.scrollElement(listTratamientos.get(0));
		Thread.sleep(1000);
		if(sinTratamiento.toLowerCase().trim().equals(Constants.SI)) {
			Thread.sleep(1000);
			listTratamientos.get(4).click();
		}else {
			if(cirugia.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				listTratamientos.get(0).click();
			}if(cirugiaPrevista.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				listTratamientos.get(1).click();
			}if(medicacion.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				listTratamientos.get(2).click();
			}if(otro.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				listTratamientos.get(3).click();
			}
		}
		
		Thread.sleep(1000);
		List<WebElement> btnLike = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'icon-Suscribir')]"));
		
		if(!sinTratamiento.toLowerCase().trim().equals(Constants.SI)) {
			if(cirugia.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				seleccionarFechaCalendar(cuandoSometioCirugia, 2);
				indexRadio+=3;
				Thread.sleep(1000);
				WebElement txtEspecifiqueCirugia = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique')]"));
				txtEspecifiqueCirugia.sendKeys(especifiqueCirugia);
			}if(cirugiaPrevista.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				btnLike.get(5).click();
				Thread.sleep(1000);
				seleccionarFechaCalendar(cuandoSometeraCirugia, 2);
				indexRadio+=3;
				Thread.sleep(1000);
				WebElement txtCirugiaRealizar = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué tipo de cirugía le van a realizar')]"));
				txtCirugiaRealizar.sendKeys(tipoCirugia);
			}if(medicacion.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				WebElement txtMedicacion = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué medicación está tomando')]"));
				txtMedicacion.sendKeys(medicacionTomando);
			}if(otro.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				btnLike.get(3).click();
				Thread.sleep(1000);
				WebElement txtOtro = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué otro tratamiento ha seguido')]"));
				txtOtro.sendKeys(otroTratamiento);
				Thread.sleep(1000);
				seleccionarFechaCalendar(fechaTratamiento, 2);
				indexRadio+=3;
			}
		}
	}
	
	private static void seleccionarInactividadLaboral(String continuidadLaboral, String fechaBaja)throws Exception {
		Thread.sleep(1000);
		List<WebElement> radioRevision = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (continuidadLaboral.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioRevision.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioRevision.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtTiempoBaja = BaseFlow.driver.findElement(By.xpath(""));
			txtTiempoBaja.sendKeys(fechaBaja);
			break;
		default:
			assertFalse("No se puede seleccionar opcion de continuidad laboral",true);
			break;
		}
		indexRadio+=2;
	}
	
	public static Integer ingresarEnfermedadRespiratoria(Integer index, String trastorno, String frecuenciaTrastorno, String ultimosSintomas, String frecuenciaSintomas,String sintomasPrimeraVez, String sintomasPromedio, String molestiaAlergia, String detalleAlergia, String tratamientoMedico, String cirugia, String cuandoCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia,String cirugiaRealizar, String medicacion, String queMedicacion, String terapiaOxigeno, String cuandoInicioTerapia, String otro, String queOtro, String cuandoComenzo, String ninguno, String pruebasPulmonar, String quePruebas, String sintomasAun, String especifiqueSintomasAun, String incapacidadLaboral, String tiempoIncapacidad) throws Exception{
		Thread.sleep(1000);
		indexRadio = index;
		WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtTrastorno.click();
		Thread.sleep(1000);
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
//		GenericMethod.implicityWait(10, By.xpath("//span[(@class='focusRed')]"));
		Thread.sleep(3000);
		WebElement txtFrecuencia = BaseFlow.driver.findElement(By.xpath("//input[contains(@class,'ember-text-field') and @type='number']"));
		txtFrecuencia.sendKeys(frecuenciaTrastorno);
		Thread.sleep(1000);
		seleccionarFechaCalendar(ultimosSintomas, 0);
		indexRadio+=3;
		ingresarFrecuenciaSintomasRespiratorio(frecuenciaSintomas, sintomasPrimeraVez, sintomasPromedio);
		ingresarMolestiaAlergiaRespiratorio(molestiaAlergia, detalleAlergia);
		ingresarSeguimientoMedicoRespiratorio(tratamientoMedico);
		ingresarTratamientoRecibidoRespiratorio(cirugia, cuandoCirugia, especifiqueCirugia, cirugiaPrevista, cuandoSometeraCirugia, cirugiaRealizar, medicacion, queMedicacion, terapiaOxigeno, cuandoInicioTerapia, otro, queOtro, cuandoComenzo, ninguno);
		IngresarPruebasPulmonRespiratorio(pruebasPulmonar, quePruebas);
		ingresarComplicacionRespiratorio(sintomasAun, especifiqueSintomasAun);
		ingresarIncapacidadRespiratorio(incapacidadLaboral, tiempoIncapacidad);
		return indexRadio;
	}
	
	private static void ingresarFrecuenciaSintomasRespiratorio(String frecuenciaSintomas,String sintomasPrimeraVez, String sintomasPromedio)throws Exception {
		Thread.sleep(1000);
		WebElement txtFrecuencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(1);
		txtFrecuencia.click();
		Thread.sleep(1000);
		List<WebElement> ListFrecuencia = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
		switch (frecuenciaSintomas.toLowerCase().trim()) {
		case Constants.CONSTANTEMENTE:
			Thread.sleep(1000);
			ListFrecuencia.get(0).click();
			Thread.sleep(2000);
			seleccionarFechaCalendar(sintomasPrimeraVez, 1);
			indexRadio+=3;
			break;
		case Constants.REPETIDAS_VECES:
			Thread.sleep(1000);
			ListFrecuencia.get(1).click();
			Thread.sleep(2000);
			seleccionarFechaCalendar(sintomasPrimeraVez, 1);
			indexRadio+=3;
			Thread.sleep(1000);
			WebElement txtPromedio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(2);
			txtPromedio.sendKeys(sintomasPromedio);
			break;
		case Constants.UNA_VEZ:
			Thread.sleep(1000);
			ListFrecuencia.get(2).click();
			Thread.sleep(2000);
			WebElement txtPromedio2 = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(2);
			txtPromedio2.sendKeys(sintomasPromedio);
			break;
		default:
			break;
		}
	}
	
	private static void ingresarMolestiaAlergiaRespiratorio(String molestiaAlergia, String detalleAlergia)throws Exception {
		Thread.sleep(1000);
		List<WebElement> radioAlergia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (molestiaAlergia) {
		case Constants.NO:
			Thread.sleep(1000);
			radioAlergia.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioAlergia.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtAlergia = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, dé detalles de esta alergia')]"));
			txtAlergia.sendKeys(detalleAlergia);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	private static void ingresarSeguimientoMedicoRespiratorio(String tratamientoMedico)throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioMedico = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (tratamientoMedico.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioMedico.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioMedico.get(indexRadio+1).click();
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	private static void ingresarTratamientoRecibidoRespiratorio(String cirugia, String cuandoCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia,String cirugiaRealizar, String medicacion, String queMedicacion, String terapiaOxigeno, String cuandoInicioTerapia, String otro, String queOtro, String cuandoComenzo, String ninguno)throws Exception{
		Thread.sleep(1000);
		List<WebElement> listTratamiento = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'checkbox-custom')]"));
		Thread.sleep(1000);
		if(ninguno.trim().equalsIgnoreCase(Constants.SI)) {
			listTratamiento.get(5).click();
		}else {
			if(cirugia.trim().equalsIgnoreCase(Constants.SI)) {
				Thread.sleep(1000);
				listTratamiento.get(0).click();
				List<WebElement> btnLike = BaseFlow.driver.findElements(By.xpath("//button[contains(@class,'btn-ok')]"));
				btnLike.get(1).click();
			}if(cirugiaPrevista.trim().equalsIgnoreCase(Constants.SI)) {
				Thread.sleep(1000);
				listTratamiento.get(1).click();
			}if(medicacion.trim().equalsIgnoreCase(Constants.SI)) {
				Thread.sleep(1000);
				listTratamiento.get(2).click();
			}if(terapiaOxigeno.trim().equalsIgnoreCase(Constants.SI)) {
				Thread.sleep(1000);
				listTratamiento.get(3).click();
				Thread.sleep(1000);
				List<WebElement> btnLike = BaseFlow.driver.findElements(By.xpath("//button[contains(@class,'btn-ok')]"));
				btnLike.get(3).click();
			}if(otro.trim().equalsIgnoreCase(Constants.SI)) {
				Thread.sleep(1000);
				listTratamiento.get(4).click();
				List<WebElement> btnLike = BaseFlow.driver.findElements(By.xpath("//button[contains(@class,'btn-ok')]"));
				btnLike.get(2).click();
			}
		}
		Thread.sleep(1000);
		if(cirugia.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			seleccionarFechaCalendar(cuandoCirugia, 2);
			indexRadio+=3;
			Thread.sleep(1000);
			WebElement txtExpecifique = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique qué cirugía se realizó')]"));
			txtExpecifique.sendKeys(especifiqueCirugia);
		}if(cirugiaPrevista.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			seleccionarFechaCalendar(cuandoSometeraCirugia, 2);
			indexRadio+=3;
			Thread.sleep(1000);
			WebElement txtCirugiaRealizar = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué tipo de cirugía le van a realizar')]"));
			txtCirugiaRealizar.sendKeys(cirugiaRealizar);
		}if(medicacion.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			WebElement txtMedicacion = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué medicación está tomando')]"));
			txtMedicacion.sendKeys(queMedicacion);
		}if(terapiaOxigeno.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			seleccionarFechaCalendar(cuandoInicioTerapia, 3);
			indexRadio+=3;
		}if(otro.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			WebElement txtQueOtro =BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'¿Qué otro tratamiento ha seguido?')]"));
			txtQueOtro.sendKeys(queOtro);
			Thread.sleep(1000);
			seleccionarFechaCalendar(cuandoComenzo, 1); 
			indexRadio+=3;
		}
	}
	
	private static void IngresarPruebasPulmonRespiratorio(String pruebasPulmonar, String quePruebas)throws Exception {
		Thread.sleep(1000);
		List<WebElement> radioPruebasPulmonar = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (pruebasPulmonar.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioPruebasPulmonar.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioPruebasPulmonar.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtQuePrueba = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué prueba de función pulmonar le realizaron')]"));
			txtQuePrueba.sendKeys(quePruebas);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	private static void ingresarComplicacionRespiratorio(String sintomasAun, String especifiqueSintomasAun)throws Exception {
		Thread.sleep(1000);
		List<WebElement> radioComplicacion = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (sintomasAun.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioComplicacion.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioComplicacion.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtComplicacion = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique sus síntomas o complicaciones')]"));
			txtComplicacion.sendKeys(especifiqueSintomasAun);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	private static void ingresarIncapacidadRespiratorio(String incapacidadLaboral, String tiempoIncapacidad)throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioIncapacidad = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (incapacidadLaboral.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioIncapacidad.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioIncapacidad.get(indexRadio+1).click();
			Thread.sleep(1000);
			WebElement txtIncapacidad = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Durante cuánto tiempo estuvo de baja')]"));
			txtIncapacidad.sendKeys(tiempoIncapacidad);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	public static Integer ingresarTumores(Integer index, String trastorno, String fechaDiagnosticacion, String cirugia, String quimioterapia, String radioterapia, String otros, String recurrenciaTumor, String extirpadoTotalmente, String otroTratamiento) throws Exception {
		indexRadio = index;
		Thread.sleep(1000);
		WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		txtTrastorno.click();
		Thread.sleep(1000);
		WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
		GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
		Thread.sleep(3000);
		seleccionarFechaCalendar(fechaDiagnosticacion, 0);
		indexRadio+=3;
		ingresarTratamientoTumores(cirugia, quimioterapia, radioterapia, otros);
		ingresarRecurrenciaTumor(recurrenciaTumor);
		ingresarExtirpadoTotalmenteTumor(extirpadoTotalmente, otroTratamiento);
		return indexRadio;
	}
	
	private static void ingresarTratamientoTumores(String cirugia, String quimioterapia, String radioterapia, String otros) throws Exception{
		Thread.sleep(1000);
		List<WebElement> listTratamiento = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'checkbox-custom')]"));
		if(cirugia.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			listTratamiento.get(0).click();
		}if(quimioterapia.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			listTratamiento.get(1).click();
		}if(radioterapia.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			listTratamiento.get(2).click();
		}if(otros.trim().equalsIgnoreCase(Constants.SI)) {
			Thread.sleep(1000);
			listTratamiento.get(3).click();
		}
		Thread.sleep(1000);
		WebElement btnLike = BaseFlow.driver.findElement(By.xpath("//span[contains(@class,'icon-Suscribir')]"));
		btnLike.click();
	}
	
	private static void ingresarRecurrenciaTumor(String recurrenciaTumor) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioRecurrencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (recurrenciaTumor.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioRecurrencia.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioRecurrencia.get(indexRadio+1).click();
			indexRadio+=2;
			break;
		default:
			break;
		}
	}
	
	private static void ingresarExtirpadoTotalmenteTumor(String extirpadoTotalmente, String otroTratamiento) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioRecurrencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (extirpadoTotalmente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioRecurrencia.get(indexRadio).click();
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioRecurrencia.get(indexRadio+1).click();
			indexRadio+=2;
			Thread.sleep(1000);
			break;
		default:
			break;
		}
	}
	
	
	
	
	
	
	
}