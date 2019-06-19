package cl.security.qaAutomation.services;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		WebElement txtRiesgo = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-power-select-trigger')]"));
		txtRiesgo.click();
		List<WebElement> listRiesgos = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
		switch (riesgo.trim().toLowerCase()) {
		case Constants.RADIACION_IONIZANTE:
			listRiesgos.get(0).click();
			ingresarRadiacionIonizante(nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas,conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando , cualFueRazon, consecuenciasSufridas);
			break;
		case Constants.VUELOS_NO_REGULARES:
			listRiesgos.get(1).click();
			WebElement txtHoras = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'number')]"));
			txtHoras.sendKeys(hhAnuales);
			break;
		case Constants.NINGUNO_ANTERIORES:
			listRiesgos.get(2).click();
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
	
	private static void seleccionarFechaCalendar(String desdeCuando,Integer indexCalendar) throws Exception {
		//formato DD-MM-YYY
		String[] fecha = desdeCuando.trim().split("-");
		String dia = fecha[0];
		String mes = fecha[1];
		String anio = fecha[2];
//		selleciono formato de calendar
		WebElement formatoCalendar = BaseFlow.driver.findElements(By.xpath("//label[contains(@for,'days')]")).get(indexCalendar);
		GenericMethod.scrollElement(formatoCalendar);
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
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(1));
			GenericMethod.clickElement(calendar);
		}else {
			WebElement calendar = GenericMethod.waitForClickeable(2,divAnio.get(6));
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
			listLabortes.get(0).click();
			break;
		case Constants.BOMBERO_AEROPUERTO:
			listLabortes.get(1).click();
			break;
		case Constants.BOMBERO_FORESTAL:
			listLabortes.get(2).click();
			break;
		case Constants.RESCATE_CON_OPERACIONES_EPECIALES:
			listLabortes.get(3).click();
			break;
		case Constants.RESCATE_SIN_OPERACIONES_EPECIALES:
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
			listCilindrada.get(0).click();
			break;
		case Constants.MAS_DE_500:
			listCilindrada.get(1).click();
			break;
		case Constants.MENOS_DE_125:
			listCilindrada.get(2).click();
			break;
		default:
			break;
		}
	}
	public static void ingresoVigenciaSeguroVida(String seguroVidaVigente, String tipoSeguro, String compania, String sumaAsegurada, String fechaCobertura, String resultadoAceptacion,Integer countSeguro)throws Exception {
		ingresoTipoSeguro(tipoSeguro);
		ingresoCompania(compania,countSeguro);
		Thread.sleep(1000);
		WebElement txtSuma;
		if(countSeguro==0) {
			txtSuma = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'input-default')]")).get(0);
		}else {
			txtSuma = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'input-default')]")).get(1);
		}
		txtSuma.sendKeys(sumaAsegurada);
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
			txtCompania = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(1);
		}else {
			txtCompania = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(2);
		}
		Thread.sleep(1000);
		txtCompania.click();
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
		ingresarTiempoEstadia(countViaje, tiempoEstancia, dondeReside,dondeAloja, viajesActividad);;
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
	
	public static void ingresarTiempoEstadia(Integer countViaje, String tiempoEstancia, String dondeReside,String dondeAloja, String viajesActividad)throws Exception{
		Thread.sleep(1000);
		List<WebElement> listTiempo= BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
		switch (countViaje) {
		case 0:
			listTiempo.get(2).click();
			Thread.sleep(1000);
			break;
		case 1:
			listTiempo.get(4).click();
			Thread.sleep(1000);
			break;

		default:
			break;
		}
		seleccionarTiempoEstadia(tiempoEstancia, dondeReside, dondeAloja, viajesActividad);
	}
	
	private static void seleccionarTiempoEstadia(String tiempoEstancia, String dondeReside,String dondeAloja, String viajesActividad) throws Exception{
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
			dondeReside(dondeReside);
			dondeAloja(dondeAloja);
			realizaViajes(viajesActividad);
			break;
		case Constants.ESTADIA_31_A_12_MESES:
			Thread.sleep(1000);
			listMotivo.get(2).click();	
			dondeReside(dondeReside);
			dondeAloja(dondeAloja);
			realizaViajes(viajesActividad);
			break;
		case Constants.ESTADIA_PERMANENTE:
			Thread.sleep(1000);
			listMotivo.get(3).click();
			dondeReside(dondeReside);
			dondeAloja(dondeAloja);
			realizaViajes(viajesActividad);
			break;
		case Constants.ESTADIA_DESCONOCIDA:
			Thread.sleep(1000);
			listMotivo.get(4).click();	
			dondeReside(dondeReside);
			dondeAloja(dondeAloja);
			realizaViajes(viajesActividad);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}