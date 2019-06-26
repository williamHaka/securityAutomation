package cl.security.qaAutomation.services;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cl.security.qaAutomation.definition.DPSCompassDefinition;
import cl.security.qaAutomation.definition.PropuestaCompassDefinition;
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
		//formato DD-MM-YYY
		String[] fecha = desdeCuando.trim().split("-");
		String dia = fecha[0];
		String mes = fecha[1];
		String anio = fecha[2];
//		selleciono formato de calendar
		WebElement formatoCalendar = BaseFlow.driver.findElements(By.xpath("//label[contains(@for,'days')]")).get(indexCalendar);
//		GenericMethod.scrollElement(formatoCalendar);
		formatoCalendar.click();
		Thread.sleep(1000);
		formatoCalendar.click();
		Thread.sleep(1000);
		seleccionarAnioCalendar(indexCalendar,anio);
		seleccionarMesCalendar(indexCalendar,Integer.parseInt(mes));
		seleccionarDiaCalendar(indexCalendar,Integer.parseInt(dia));
	}
	
	private static void seleccionarAnioCalendar(Integer divCalendar, String anio) throws Exception {
		Thread.sleep(1000);
		List<WebElement> divAnio = BaseFlow.driver.findElements(By.xpath("//th[(@class='datepicker-switch')]"));
		Thread.sleep(1000);
		if(divCalendar==0) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(0));
			GenericMethod.clickElement(calendar);
		}else {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(5));
			GenericMethod.clickElement(calendar);
		}
		Thread.sleep(1000);
		List<WebElement> divAnio2 = BaseFlow.driver.findElements(By.xpath("//th[(@class='datepicker-switch')]"));
		if(divCalendar==0) {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio2.get(1));
			GenericMethod.clickElement(calendar);
		}else {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio2.get(6));
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
			}
		}
	}
	
	
	private static void seleccionarMesCalendar(Integer divMes,Integer mes) throws Exception {
		Thread.sleep(1000);
		List<WebElement> listMes = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'month')]"));
		if(divMes==0) {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes-1));
			element.click();
		}else {
			WebElement element =  GenericMethod.waitForClickeable(2,listMes.get(mes+11));
			element.click();
		}
	}
	
	private static void seleccionarDiaCalendar(Integer divDIa, Integer dia) throws Exception {
		if(!GenericMethod.existElement(By.xpath("//button[contains(@class,'custom-label')]"))) {
			if(divDIa==0) {
				Thread.sleep(1000);
				List<WebElement> dias = BaseFlow.driver.findElements(By.xpath("//*[(@class='day')]"));
				Thread.sleep(1000);
				dias.get(dia-1).click();
			}else {
				Thread.sleep(1000);
				List<WebElement> dias = BaseFlow.driver.findElements(By.xpath("//*[(@class='day')]"));
				Thread.sleep(1000);
				dias.get(dia-1).click();
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
			listFumador.get(0).click();
			break;
		case Constants.FUMA_CIGARROS_O_PUROS:
			listFumador.get(1).click();
			break;
		case Constants.FUMA_PIPAS:
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
			txtCantidad.get(3).click();
			Thread.sleep(1000);
			txtCantidad.get(3).sendKeys(frecuenciaFuma);
			Thread.sleep(1000);
		}else if(countFumador==1) {
			txtCantidad.get(4).click();
			Thread.sleep(1000);
			txtCantidad.get(4).sendKeys(frecuenciaFuma);
			Thread.sleep(1000);
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
		List<WebElement> radioTrastorno = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (trastornoVariasVeces.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			indexRadio+=5;
			radioTrastorno.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			indexRadio+=6;
			radioTrastorno.get(indexRadio).click();
			break;
		default:
			break;
		}
	}
	
	private static void ingresarSecuelasAccidentes(String secuelasAcc,String especifiqueSecuelasAcc) throws Exception{
		Thread.sleep(1000);
		List<WebElement> radioSecuelas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (secuelasAcc.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			indexRadio+=1;
			radioSecuelas.get(indexRadio).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			indexRadio+=2;
			radioSecuelas.get(indexRadio).click();
			Thread.sleep(1000);
			WebElement txtSecuelas = BaseFlow.driver.findElement(By.xpath("//input[contains(@placeholder,'Describa las complicaciones o secuelas')]"));
			txtSecuelas.sendKeys(especifiqueSecuelasAcc);
			break;
		default:
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}