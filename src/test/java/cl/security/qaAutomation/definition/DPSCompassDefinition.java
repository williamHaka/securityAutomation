package cl.security.qaAutomation.definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.services.FormularioServices;
import cl.security.qaAutomation.utils.Constants;
import cl.security.qaAutomation.utils.GenericMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class DPSCompassDefinition {

	@When("^Ingreso la actividad pUno\"([^\"]*)\"$")
	public void ingreso_la_actividad_pUno(String actividad) throws Throwable {
		Thread.sleep(2000);
		WebElement txtActividad = BaseFlow.driver.findElements(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).get(0);
		GenericMethod.ingresarTextoSugerido(txtActividad, actividad);
	}

	@When("^Ingreso riesgos pDos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_riesgos_pDos(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas,String conCualesTrabaja,	 String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias,String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas, String hhAnuales) throws Throwable {
		Thread.sleep(2000);
		FormularioServices.ingresarRiesgosDps(riesgo, nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas, conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando, cualFueRazon, consecuenciasSufridas, hhAnuales);
	}
	
	@When("^Ingreso labores de bombero o rescatista voluntario pTres\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_labores_de_bombero_o_rescatista_voluntario_pTres(String realizaLabores, String labor) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioRescatista = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'radio-custom')]"));
		switch (realizaLabores.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioRescatista.get(0).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioRescatista.get(1).click();
			FormularioServices.ingresarLaboresRescatista(labor);
			break;
		default:
			break;
		}
	}

	@When("^Doy click en boton siguiente$")
	public void doy_click_en_boton_siguiente() throws Throwable {
		Thread.sleep(2000);
		WebElement btnNext = BaseFlow.driver.findElement(By.xpath("//button[contains(@class,'next')]"));
		btnNext.click();
		Thread.sleep(2000);
	}

	@When("^Ingreso motocicleta como medio de transporte pCuatro\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_motocicleta_como_medio_de_transporte_pCuatro(String utilizaMotocicleta, String cilindrada) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioMoto = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (utilizaMotocicleta.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioMoto.get(0).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioMoto.get(1).click();
			FormularioServices.ingresoMotocicletaComoMedioTransporte(cilindrada);
			break;
		default:
			break;
		}
	}
	
	@When("^ingreso deportes aventura pCinco\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_deportes_aventura_pCinco(String deporteAventura, String actividades) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioDeportes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (deporteAventura.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioDeportes.get(2).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioDeportes.get(3).click();
//			TODO ingresar actividades
			break;
		default:
			break;
		}
	}
	private static Integer countSeguro= 0;
	@When("^Ingreso vigencia seguro de vida pSeis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_vigencia_seguro_de_vida_pSeis(String seguroVidaVigente, String tipoSeguro, String compania, String sumaAsegurada, String fechaCobertura, String resultadoAceptacion) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioSeguros = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (seguroVidaVigente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioSeguros.get(0).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioSeguros.get(1).click();
			FormularioServices.ingresoVigenciaSeguroVida(seguroVidaVigente, tipoSeguro, compania, sumaAsegurada, fechaCobertura, resultadoAceptacion,countSeguro);
			break;
		default:
			break;
		}
		countSeguro+=1;
	}
	private static Integer countViaje= 0;
	@When("^Ingreso viajes al extranjero con regularidad psiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_viajes_al_extranjero_con_regularidad_psiete(String viajesExtranjero, String pais, String motivo, String tiempoEstancia, String dondeReside, String dondeAloja, String viajesActividad) throws Throwable {
		countSeguro=0;
		Thread.sleep(2000);
		List<WebElement> radioViaje = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (viajesExtranjero.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioViaje.get(0).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioViaje.get(1).click();
			FormularioServices.ingresoViajesAlExtranjero(pais, motivo, tiempoEstancia, dondeReside, dondeAloja, viajesActividad, countViaje);
			break;
		default:
			break;
		}
		countViaje+=1;
	}
	
	@When("^Ingreso estatura en centimetros pOcho\"([^\"]*)\"$")
	public void ingreso_estatura_en_centimetros_pOcho(String estatura) throws Throwable {
		countViaje=0;
		Thread.sleep(2000);	
		List<WebElement> txtEstatura = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		GenericMethod.scrollElement(txtEstatura.get(0));
		txtEstatura.get(0).sendKeys(estatura);
	}
	
	@When("^Ingreso peso en kilogramos pNueve\"([^\"]*)\"$")
	public void ingreso_peso_en_kilogramos_pNueve(String peso) throws Throwable {
		Thread.sleep(2000);	
		List<WebElement> txtPeso = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		GenericMethod.scrollElement(txtPeso.get(1));
		txtPeso.get(1).sendKeys(peso);
	}
	private static Integer countBebidas = 0;
	@When("^Ingreso consumo de bebidas alcoholicas pDiez\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_consumo_de_bebidas_alcoholicas_pDiez(String bebidasAlcoholicas, String tipo, String frecuencia) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radiobebidas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radiobebidas.get(0));
		switch (bebidasAlcoholicas.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radiobebidas.get(0).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radiobebidas.get(1).click();
			FormularioServices.ingresoConsumoBebidasAlcoholicas(countBebidas,tipo, frecuencia);
			break;
		default:
			break;
		}
		countBebidas+=1;
	}
	
	private static Integer countFumador = 0;
	@When("^Ingreso fumador en los ultimos doce meses pOnce\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_fumador_en_los_ultimos_doce_meses_pOnce(String fumador, String queFuma, String frecuenciaFuma) throws Throwable {
		countBebidas = 0;
		Thread.sleep(2000);
		List<WebElement> radioFumador = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioFumador.get(2));
		switch (fumador.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioFumador.get(2).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioFumador.get(3).click();
			FormularioServices.ingresoFumador(countFumador,queFuma, frecuenciaFuma);
			break;
		default:
			break;
		}
		countFumador +=1;
	}
	
	@When("^Ingreso consumo de drogas pDoce\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_consumo_de_drogas_pDoce(String drogas, String alucinogenos, String anfetaminas, String cocaina, String heroina, String marihuanaFrecuente, String marihuanaOcacional) throws Throwable {
		countFumador=0;
		Thread.sleep(2000);
		List<WebElement> radioDrogas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioDrogas.get(4));
		switch (drogas.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioDrogas.get(4).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioDrogas.get(5).click();
			FormularioServices.ingresoConsumoDrogas(alucinogenos, anfetaminas, cocaina, heroina, marihuanaFrecuente, marihuanaOcacional);
			break;
		default:
			break;
		}
	}
	
	private static Boolean isEmbarazada, isComplicaciones = false;
	@When("^Ingreso embarazo pTrece\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_embarazo_pTrece(String embarazada, String complicaciones, String nombreComplicacion, String fechaDesde, String fechaHasta, String secuelas, String especifiqueSecuelas) throws Throwable {
		Thread.sleep(2000);
		if(PropuestaCompassDefinition.genero.trim().toLowerCase().equalsIgnoreCase("f")) {
			isEmbarazada = embarazada.equals(Constants.SI)?true:false;
			isComplicaciones = complicaciones.equals(Constants.SI)?true:false;
			List<WebElement> radioEmbarazada = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioEmbarazada.get(6));
			switch (embarazada.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioEmbarazada.get(6).click();
				break;
			case Constants.SI:
				radioEmbarazada.get(7).click();
				Thread.sleep(1000);
				FormularioServices.ingresoEmbarazo(complicaciones, nombreComplicacion, fechaDesde, fechaHasta, secuelas, especifiqueSecuelas);
				break;
			default:
				break;
			}
		}
	}
	public static Integer indexRadio=6;
	@When("^Ingreso prueba de VIH en los ultimos doce meses pCatorce\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_prueba_de_VIH_en_los_ultimos_doce_meses_pCatorce(String pruebaVIH, String resultadoVIH) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioVIH = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioVIH.get(indexRadio));
		switch (pruebaVIH.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioVIH.get(6).click();
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioVIH.get(7).click();
//			Thread.sleep(1000);
//			List<WebElement> radioResultadoVIH = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
//			if(resultadoVIH.equals(Constants.NO)){
//				Thread.sleep(1000);
//				indexRadio+=1;
//				radioResultadoVIH.get(8).click();
//			}else {
//				Thread.sleep(1000);
//				indexRadio+=2;
//				radioResultadoVIH.get(9).click();
//			}
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso pension de invalidez pQuince\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_pension_de_invalidez_pQuince(String pensionInvalidez, String motivoPension) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioPension = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioPension.get(indexRadio+1));
		switch (pensionInvalidez.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioPension.get(8).click();
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioPension.get(9).click();
			Thread.sleep(1000);
			WebElement textArea = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@class,'ember-text-area')]"));
			textArea.sendKeys(motivoPension);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso si ha sido victima de algun accidente pDiesiseis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_ha_sido_victima_de_algun_accidente_pDiesiseis(String accidente, String complicacionesAcc, String especifiqueComplicacionesAcc, String fechaDesdeAcc, String fechaHastaAcc, String trastornoVariasVeces, String secuelasAcc, String especifiqueSecuelasAcc) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioAccidentes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (accidente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioAccidentes.get(10).click();
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioAccidentes.get(11).click();
			indexRadio = FormularioServices.ingresarAccidente(complicacionesAcc, especifiqueComplicacionesAcc, fechaDesdeAcc, fechaHastaAcc, trastornoVariasVeces, secuelasAcc, especifiqueSecuelasAcc,indexRadio);
			break;
		default:
			break;
		}
	}
	public static Boolean licenciaMedica = null;
	@When("^Ingreso licencia medica vigente pDiesisiete\"([^\"]*)\"$")
	public void ingreso_licencia_medica_vigente_pDiesisiete(String licenciaMedicaVigente) throws Throwable {
		licenciaMedica = licenciaMedicaVigente==Constants.SI?true:false;
		Thread.sleep(2000);
		List<WebElement> radioLicencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioLicencia.get(12));
		switch (licenciaMedicaVigente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioLicencia.get(12).click();
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioLicencia.get(13).click();
			break;
		default:
			break;
		}
	}

	@When("^Ingreso trastorno sufrido pDiesisiete\"([^\"]*)\"$")
	public void ingreso_trastorno_sufrido_pDiesisiete(String trastornoLicencia) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtTrastorno.click();
			Thread.sleep(1000);
			WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
			GenericMethod.ingresarTextoSugerido(txtSearch, trastornoLicencia);
		}
	}

	@When("^Ingreso si ha afectado los riñones pDiesisiete\"([^\"]*)\"$")
	public void ingreso_si_ha_afectado_los_riñones_pDiesisiete(String afectadoRiñones) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			List<WebElement> listAfectado = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
			switch (afectadoRiñones) {
			case Constants.BILATERALMENTE:
				Thread.sleep(1000);
				listAfectado.get(0).click();
				break;
			case Constants.NINGUNA:
				Thread.sleep(1000);
				listAfectado.get(1).click();
				break;
			case Constants.UNILATERAL:
				Thread.sleep(1000);
				listAfectado.get(2).click();
				break;
			default:
				break;
			}
		}
	}

	@When("^Ingreso frecuencia en que padece sintomas pDiesisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_frecuencia_en_que_padece_sintomas_pDiesisiete(String frecuenciaSintomas, String sintomasPrimeraVez, String sintomasUltimaVez, String frecuenciaSintomasAnio, String tiempoPromedioSintomas) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			List<WebElement> listFrecuencia = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
			switch (frecuenciaSintomas) {
			case Constants.CONSTANTEMENTE:
				Thread.sleep(1000);
				listFrecuencia.get(0).click();
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasPrimeraVez, 0);
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasUltimaVez, 1);
				break;
			case Constants.REPETIDAS_VECES:
				Thread.sleep(1000);
				listFrecuencia.get(1).click();
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasPrimeraVez, 0);
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasUltimaVez, 1);
				Thread.sleep(1000);
				WebElement txtFrecuenciaAnual = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
				txtFrecuenciaAnual.sendKeys(frecuenciaSintomasAnio);
				Thread.sleep(1000);
				WebElement txtFrecuenciaPromedio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(4);
				txtFrecuenciaPromedio.sendKeys(tiempoPromedioSintomas);
				break;
			case Constants.UNA_VEZ:
				Thread.sleep(1000);
				listFrecuencia.get(2).click();
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasUltimaVez, 0);
				Thread.sleep(1000);
				WebElement txtSintomasPromedio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
				txtSintomasPromedio.sendKeys(tiempoPromedioSintomas);
				break;
			default:
				break;
			}
		}
	}

	@When("^Ingreso si esta bajo seguimiento medico regular pDiesisiete\"([^\"]*)\"$")
	public void ingreso_si_esta_bajo_seguimiento_medico_regular_pDiesisiete(String seguimientoMedicoRegular) throws Throwable {
		if(licenciaMedica) {
			List<WebElement> radioLicencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			switch (seguimientoMedicoRegular.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioLicencia.get(19).click();
				break;
			case Constants.SI:
				Thread.sleep(1000);
				radioLicencia.get(20).click();
				break;	
			default:
				break;
			}
		}
	}

	static Boolean isCirugia,isCirugiaPrevista, islitotricia, isMedicacion,isOtro,isNinguno;
	@When("^Ingreso metodo de tratamiento pDiesisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_metodo_de_tratamiento_pDiesisiete(String cirugia, String cirugiaPrevista, String litotricia, String medicacion, String otro, String ninguno) throws Throwable {
		if(licenciaMedica) {
			isCirugia = cirugia.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isCirugiaPrevista = cirugiaPrevista.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			islitotricia = litotricia.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isMedicacion = medicacion.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isOtro = otro.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isNinguno = ninguno.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			Thread.sleep(1000);
			List<WebElement> listCheck = BaseFlow.driver.findElements(By.xpath("//span[(@class='checkbox-custom')]"));
			if(otro.toLowerCase().trim().equals(Constants.SI)) {
				Thread.sleep(1000);
				listCheck.get(5).click();
			}else {
				if(cirugia.toLowerCase().trim().equals(Constants.SI)) {
					Thread.sleep(1000);
					listCheck.get(0).click();
				}
				if(cirugiaPrevista.toLowerCase().trim().equals(Constants.SI)) {
					Thread.sleep(1000);
					listCheck.get(1).click();
				}
				if(litotricia.toLowerCase().trim().equals(Constants.SI)) {
					Thread.sleep(1000);
					listCheck.get(2).click();
				}
				if(medicacion.toLowerCase().trim().equals(Constants.SI)) {
					Thread.sleep(1000);	
					listCheck.get(3).click();
				}
				if(otro.toLowerCase().trim().equals(Constants.SI)) {
					Thread.sleep(1000);
					listCheck.get(4).click();
				}
			}
			Thread.sleep(1000);
			WebElement btnLike = BaseFlow.driver.findElements(By.xpath("//span[(@class='icon-Suscribir')]")).get(3);
			btnLike.click();
			Thread.sleep(1000);
		}
	}

	@When("^Ingreso respuestas a distintos metodos de tratamiento\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_respuestas_a_distintos_metodos_de_tratamiento(String cuandoSometioCirugia, String especifiqueCirugia, String cuandoSometeraCirugia, String tipoCirugia, String cuandoLitotricia, String queMedicamento, String queOtro, String cuandoComenzo) throws Throwable {
	    Thread.sleep(1000);
	    if(licenciaMedica) {
	    	 if(!isNinguno) {
	 	    	if(isCirugia) {
	 		    	 FormularioServices.seleccionarFechaCalendar(cuandoSometioCirugia, 0);
	 		    	 Thread.sleep(1000);
	 		    	 WebElement txtcirugiaRealizada = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique qu')]"));
	 		    	 txtcirugiaRealizada.sendKeys(especifiqueCirugia);
	 		    }
	 		    if(isCirugiaPrevista) {
	 		    	
	 		    }
	 		    if(islitotricia) {
	 		    	
	 		    }
	 		    if(isMedicacion) {
	 		    	
	 		    }
	 		    if(isOtro) {
	 		    	
	 		    }
	 	    }
	    }
	}

	@When("^Ingreso si se ha realizado examenes de orina pDiesisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_se_ha_realizado_examenes_de_orina_pDiesisiete(String examenOrina, String ultimoExamenOrina, String resultadoExamenOrina) throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si estan analizando la sangre\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_estan_analizando_la_sangre(String analisisSangre, String cuandoAnalisisSangre, String detalleResultados) throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si tiene sintomas todavia \"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_tiene_sintomas_todavia(String sintomasTodavia, String espesifiqueSintomasTodavia) throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso incapacidad para trabajar\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_incapacidad_para_trabajar(String incapacidad, String cuantoTiempo) throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso trastorno sufrido pDiesisiete<trastornoLicencia>$")
	public void ingreso_trastorno_sufrido_pDiesisiete_trastornoLicencia() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si ha afectado los riñones pDiesisiete<afectadoRiñones>$")
	public void ingreso_si_ha_afectado_los_riñones_pDiesisiete_afectadoRiñones() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso frecuencia en que padece sintomas pDiesisiete<frecuenciaSintomas><sintomasPrimeraVez><sintomasUltimaVez><frecuenciaSintomasAnio><tiempoPromedioSintomas>$")
	public void ingreso_frecuencia_en_que_padece_sintomas_pDiesisiete_frecuenciaSintomas_sintomasPrimeraVez_sintomasUltimaVez_frecuenciaSintomasAnio_tiempoPromedioSintomas() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si esta bajo seguimiento medico regular pDiesisiete<seguimientoMedicoRegular>$")
	public void ingreso_si_esta_bajo_seguimiento_medico_regular_pDiesisiete_seguimientoMedicoRegular() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso metodo de tratamiento pDiesisiete<cirugia><cuandoSometioCirugia><especifiqueCirugia><cirugiaPrevista><cuandoSometeraCirugia><tipoCirugia><litotricia><cuandoLitotricia><medicacion><queMedicamento><otro><queOtro><cuandoComenzo>$")
	public void ingreso_metodo_de_tratamiento_pDiesisiete_cirugia_cuandoSometioCirugia_especifiqueCirugia_cirugiaPrevista_cuandoSometeraCirugia_tipoCirugia_litotricia_cuandoLitotricia_medicacion_queMedicamento_otro_queOtro_cuandoComenzo() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si se ha realizado examenes de orina pDiesisiete<examenOrina><ultimoExamenOrina><resultadoExamenOrina>$")
	public void ingreso_si_se_ha_realizado_examenes_de_orina_pDiesisiete_examenOrina_ultimoExamenOrina_resultadoExamenOrina() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si estan analizando la sangre<analisisSangre><cuandoAnalisisSangre><detalleResultados>$")
	public void ingreso_si_estan_analizando_la_sangre_analisisSangre_cuandoAnalisisSangre_detalleResultados() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso si tiene sintomas todavia <sintomasTodavia><espesifiqueSintomasTodavia>$")
	public void ingreso_si_tiene_sintomas_todavia_sintomasTodavia_espesifiqueSintomasTodavia() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	@When("^Ingreso incapacidad para trabajar<incapacidad><cuantoTiempo>$")
	public void ingreso_incapacidad_para_trabajar_incapacidad_cuantoTiempo() throws Throwable {
		if(licenciaMedica) {
			
		}
	}

	
	
	
	
	
	

	@When("^Ingreso ha ingresado a un centro hospitalario\"([^\"]*)\"$")
	public void ingreso_ha_ingresado_a_un_centro_hospitalario(String ingresoHospitalario) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioHospitalario = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioHospitalario.get(14));
		switch (ingresoHospitalario.toLowerCase().trim()) {
		case Constants.NO:
			radioHospitalario.get(14).click();
                  			break;
		case Constants.SI:
			radioHospitalario.get(15).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso actualmente se encuentra en observaciones\"([^\"]*)\"$")
	public void ingreso_actualmente_se_encuentra_en_observaciones(String encuentraObservacion) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radioObservacion = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioObservacion.get(16));
		switch (encuentraObservacion.toLowerCase().trim()) {
		case Constants.NO:
			radioObservacion.get(16).click();
                  			break;
		case Constants.SI:
			radioObservacion.get(17).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso le han recetado tratamiento medico\"([^\"]*)\"$")
	public void ingreso_le_han_recetado_tratamiento_medico(String tratamientoMedico) throws Throwable {
//TODO filtrar por genero
		Thread.sleep(2000);
		List<WebElement> radiotratamiento = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radiotratamiento.get(18));
		switch (tratamientoMedico.toLowerCase().trim()) {
		case Constants.NO:
			radiotratamiento.get(18).click();
  			break;
		case Constants.SI:
			radiotratamiento.get(19).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha sido tratado por algun psicologo\"([^\"]*)\"$")
	public void ingreso_ha_sido_tratado_por_algun_psicologo(String tratadoPsicologo) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(0));
		switch (tratadoPsicologo.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(0).click();
  			break;
		case Constants.SI:
			radio.get(1).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad respiratoria\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_respiratoria(String enfermedadRespiratoria) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(2));
		switch (enfermedadRespiratoria.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(2).click();
  			break;
		case Constants.SI:
			radio.get(3).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso enfermedad de sangre\"([^\"]*)\"$")
	public void ingreso_enfermedad_de_sangre(String enfermedadSangre) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(4));
		switch (enfermedadSangre.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(4).click();
  			break;
		case Constants.SI:
			radio.get(5).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso enfermedad del aparato circulatorio\"([^\"]*)\"$")
	public void ingreso_enfermedad_del_aparato_circulatorio(String enfermedadCirculatorio) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(6));
		switch (enfermedadCirculatorio.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(6).click();
  			break;
		case Constants.SI:
			radio.get(7).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso enfermedad del aparato digestivo\"([^\"]*)\"$")
	public void ingreso_enfermedad_del_aparato_digestivo(String enfermedadDigestiva) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(8));
		switch (enfermedadDigestiva.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(8).click();
  			break;
		case Constants.SI:
			radio.get(9).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido tumores o cancer\"([^\"]*)\"$")
	public void ingreso_ha_padecido_tumores_o_cancer(String cancer) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(10));
		switch (cancer.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(10).click();
  			break;
		case Constants.SI:
			radio.get(11).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad del aparato genitourinario\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_del_aparato_genitourinario(String enfermedadGenital) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(12));
		switch (enfermedadGenital.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(12).click();
  			break;
		case Constants.SI:
			radio.get(13).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad del aparato locomotor\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_del_aparato_locomotor(String enfermedadLocomotor) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(14));
		switch (enfermedadLocomotor.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(14).click();
  			break;
		case Constants.SI:
			radio.get(15).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad endocrina\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_endocrina(String enfermedadEndocrina) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(16));
		switch (enfermedadEndocrina.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(16).click();
  			break;
		case Constants.SI:
			radio.get(17).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad infecciosa\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_infecciosa(String enfermedadInfecciosa) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(18));
		switch (enfermedadInfecciosa.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(18).click();
  			break;
		case Constants.SI:
			radio.get(19).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad de los ojos\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_de_los_ojos(String enfermedadOcular) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(20));
		switch (enfermedadOcular.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(20).click();
  			break;
		case Constants.SI:
			radio.get(21).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad del sistema nervioso\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_del_sistema_nervioso(String enfermedadNerviosa) throws Throwable {
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(22));
		switch (enfermedadNerviosa.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(22).click();
  			break;
		case Constants.SI:
			radio.get(23).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad de la piel\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_de_la_piel(String enfermedadPiel) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(24));
		switch (enfermedadPiel.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(24).click();
  			break;
		case Constants.SI:
			radio.get(25).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
		
		Thread.sleep(1000);
		WebElement btnGuardar = BaseFlow.driver.findElement(By.className("right-header"));
		btnGuardar.click();
	}

	
}
