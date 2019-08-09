package cl.security.qaAutomation.definition;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.services.FormularioServices;
import cl.security.qaAutomation.utils.Constants;
import cl.security.qaAutomation.utils.GenericMethod;
import cucumber.api.java.en.When;

public class DPSCompassDefinition {
	private static final Logger log = LoggerFactory.getLogger(DPSCompassDefinition.class); 

	@When("^Ingreso la actividad pUno\"([^\"]*)\"$")
	public void ingreso_la_actividad_pUno(String actividad) throws Throwable {
		log.info("Ingreso pregunta 1");
		Thread.sleep(1000);
		WebElement txtActividad = BaseFlow.driver.findElements(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).get(0);
		GenericMethod.ingresarTextoSugerido(txtActividad, actividad);
		Thread.sleep(6000);
	}
	static Integer index=0;
	@When("^Ingreso riesgos pDos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_riesgos_pDos(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas,String conCualesTrabaja,	 String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias,String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas, String hhAnuales) throws Throwable {
		log.info("Ingreso pregunta 2");
		Thread.sleep(1000);
		index = FormularioServices.ingresarRiesgosDps(index,riesgo, nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas, conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando, cualFueRazon, consecuenciasSufridas, hhAnuales);
 		Thread.sleep(1000);
	}
	
	@When("^Ingreso labores de bombero o rescatista voluntario pTres\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_labores_de_bombero_o_rescatista_voluntario_pTres(String realizaLabores, String labor) throws Throwable {
		log.info("Ingreso pregunta 3");
		Thread.sleep(1000);
		List<WebElement> radioRescatista = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (realizaLabores.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioRescatista.get(index).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioRescatista.get(index+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresarLaboresRescatista(labor);
			break;
		default:
			break;
		}
	}

	@When("^Doy click en boton siguiente$")
	public void doy_click_en_boton_siguiente() throws Throwable {
		Thread.sleep(2000);
		log.info("doy click en siguiente");
		WebElement btnNext = GenericMethod.waitForClickeable(10, By.xpath("//div[(@class='footer-right')]"));
		if(btnNext!=null) {
			Thread.sleep(1000);
			btnNext.click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
		}else {
			assertFalse("El boton siguiente no se encuentra habilitado para dar click",true);
		}
		
	}

	@When("^Ingreso motocicleta como medio de transporte pCuatro\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_motocicleta_como_medio_de_transporte_pCuatro(String utilizaMotocicleta, String cilindrada) throws Throwable {
		log.info("Ingreso pregunta 4");
		Thread.sleep(1000);
		List<WebElement> radioMoto = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (utilizaMotocicleta.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioMoto.get(0).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioMoto.get(1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresoMotocicletaComoMedioTransporte(cilindrada);
			break;
		default:
			break;
		}
	}
	
@When("^ingreso deportes aventura pCinco\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_deportes_aventura_pCinco(String deporteAventura,String actividad, String tipoAficionado, String alaska, String antartica, String artico, String groenlandia, String ninguna, String alturaMaxima, String intentoSolitario, String libre, String ninguno, String actividadProxima, String especifique) throws Throwable {
	log.info("Ingreso pregunta 5");	
	Thread.sleep(1000);
		List<WebElement> radioDeportes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (deporteAventura.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioDeportes.get(2).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioDeportes.get(3).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresarDeportesAventura(actividad, tipoAficionado, alaska, antartica, artico, groenlandia, ninguna, alturaMaxima, intentoSolitario, libre, ninguno, actividadProxima, especifique);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
	}
	
	private static Integer countSeguro= 0;
	@When("^Ingreso vigencia seguro de vida pSeis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_vigencia_seguro_de_vida_pSeis(String seguroVidaVigente, String tipoSeguro, String compania, String sumaAsegurada, String fechaCobertura, String resultadoAceptacion) throws Throwable {
		log.info("Ingreso pregunta 6");
		Thread.sleep(2000);
		List<WebElement> radioSeguros = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (seguroVidaVigente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioSeguros.get(0).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioSeguros.get(1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresoVigenciaSeguroVida(seguroVidaVigente, tipoSeguro, compania, sumaAsegurada, fechaCobertura, resultadoAceptacion,countSeguro);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
		countSeguro+=1;
	}
	private static Integer countViaje= 0;
	@When("^Ingreso viajes al extranjero con regularidad psiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_viajes_al_extranjero_con_regularidad_psiete(String viajesExtranjero, String pais, String motivo, String tiempoEstancia, String dondeReside, String dondeAloja, String viajesActividad) throws Throwable {
		log.info("Ingreso pregunta 7");
		countSeguro=0;
		Thread.sleep(1000);
		List<WebElement> radioViaje = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		Thread.sleep(1000);
		switch (viajesExtranjero.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioViaje.get(0).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioViaje.get(1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresoViajesAlExtranjero(pais, motivo, tiempoEstancia, dondeReside, dondeAloja, viajesActividad, countViaje);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
		countViaje+=1;
	}
	
	@When("^Ingreso estatura en centimetros pOcho\"([^\"]*)\"$")
	public void ingreso_estatura_en_centimetros_pOcho(String estatura) throws Throwable {
		log.info("Ingreso pregunta 8");
		countViaje=0;
		Thread.sleep(2000);	
		List<WebElement> txtEstatura = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		GenericMethod.scrollElement(txtEstatura.get(0));
		txtEstatura.get(0).sendKeys(estatura);
	}
	
	@When("^Ingreso peso en kilogramos pNueve\"([^\"]*)\"$")
	public void ingreso_peso_en_kilogramos_pNueve(String peso) throws Throwable {
		log.info("Ingreso pregunta 9");
		Thread.sleep(2000);	
		List<WebElement> txtPeso = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		GenericMethod.scrollElement(txtPeso.get(1));
		txtPeso.get(1).sendKeys(peso);
		Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
	}
	
	private static Integer countBebidas = 0;
	@When("^Ingreso consumo de bebidas alcoholicas pDiez\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_consumo_de_bebidas_alcoholicas_pDiez(String bebidasAlcoholicas, String tipo, String frecuencia) throws Throwable {
		log.info("Ingreso pregunta 10");
		Thread.sleep(2000);
		List<WebElement> radiobebidas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radiobebidas.get(0));
		switch (bebidasAlcoholicas.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radiobebidas.get(0).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radiobebidas.get(1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresoConsumoBebidasAlcoholicas(countBebidas,tipo, frecuencia);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
		countBebidas+=1;
	}
	
	private static Integer countFumador = 0;
	@When("^Ingreso fumador en los ultimos doce meses pOnce\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_fumador_en_los_ultimos_doce_meses_pOnce(String fumador, String queFuma, String frecuenciaFuma) throws Throwable {
		log.info("Ingreso pregunta 11");
		countBebidas = 0;
		Thread.sleep(2000);
		List<WebElement> radioFumador = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioFumador.get(2));
		switch (fumador.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioFumador.get(2).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioFumador.get(3).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresoFumador(countFumador,queFuma, frecuenciaFuma);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
		countFumador +=1;
	}
	
	@When("^Ingreso consumo de drogas pDoce\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_consumo_de_drogas_pDoce(String drogas, String alucinogenos, String anfetaminas, String cocaina, String heroina, String marihuanaFrecuente, String marihuanaOcacional) throws Throwable {
		log.info("Ingreso pregunta 12");
		countFumador=0;
		Thread.sleep(2000);
		List<WebElement> radioDrogas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioDrogas.get(4));
		switch (drogas.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioDrogas.get(4).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioDrogas.get(5).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			FormularioServices.ingresoConsumoDrogas(alucinogenos, anfetaminas, cocaina, heroina, marihuanaFrecuente, marihuanaOcacional);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso embarazo pTrece\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_embarazo_pTrece(String embarazada, String complicaciones, String nombreComplicacion, String fechaDesde, String fechaHasta, String secuelas, String especifiqueSecuelas) throws Throwable {
		log.info("Ingreso pregunta 13");
		Thread.sleep(2000);
		if(PropuestaCompassDefinition.genero.trim().toLowerCase().equalsIgnoreCase("f")) {
			List<WebElement> radioEmbarazada = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioEmbarazada.get(6));
			switch (embarazada.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioEmbarazada.get(6).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;
			case Constants.SI:
				radioEmbarazada.get(7).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				FormularioServices.ingresoEmbarazo(complicaciones, nombreComplicacion, fechaDesde, fechaHasta, secuelas, especifiqueSecuelas);
				break;
			default:
				break;
			}
		}
	}
	public static Integer indexRadio=0;
	@When("^Ingreso prueba de VIH en los ultimos doce meses pCatorce\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_prueba_de_VIH_en_los_ultimos_doce_meses_pCatorce(String pruebaVIH, String resultadoVIH) throws Throwable {
		log.info("Ingreso pregunta 14");
		Thread.sleep(2000);
		if(PropuestaCompassDefinition.genero.trim().toLowerCase().equalsIgnoreCase("f")) {
			indexRadio=18;
		}else {
			indexRadio=6;
		}
		Thread.sleep(1000);
		List<WebElement> radioVIH = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioVIH.get(indexRadio));
		switch (pruebaVIH.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioVIH.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			break;
		case Constants.SI:
			Thread.sleep(1000);
			indexRadio+=1;
			radioVIH.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			List<WebElement> radioResultadoVIH = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			if(resultadoVIH.equals(Constants.NO)){
				Thread.sleep(1000);
				indexRadio+=1;
				radioResultadoVIH.get(indexRadio).click();
				indexRadio+=2;
			}else {
				Thread.sleep(1000);
				indexRadio+=2;
				radioResultadoVIH.get(indexRadio).click();
				indexRadio+=1;
			}
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso a padecido enfermedad congenita pveinticuatro\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_a_padecido_enfermedad_congenita_pveinticuatro(String enfermedadCongenita, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 34");
		Thread.sleep(2000);
		List<WebElement> radioPension = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioPension.get(indexRadio));
		switch (enfermedadCongenita.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioPension.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioPension.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
	}

	
	@When("^Ingreso pension de invalidez pQuince\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_pension_de_invalidez_pQuince(String pensionInvalidez, String motivoPension) throws Throwable {
		log.info("Ingreso pregunta 15");
		Thread.sleep(2000);
		List<WebElement> radioPension = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioPension.get(indexRadio));
		switch (pensionInvalidez.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioPension.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioPension.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			WebElement textArea = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@class,'ember-text-area')]"));
			textArea.sendKeys(motivoPension);
			indexRadio+=2;
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso si ha sido victima de algun accidente pDiesiseis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_ha_sido_victima_de_algun_accidente_pDiesiseis(String accidente, String complicacionesAcc, String especifiqueComplicacionesAcc, String fechaDesdeAcc, String fechaHastaAcc, String trastornoVariasVeces, String secuelasAcc, String especifiqueSecuelasAcc) throws Throwable {
		log.info("Ingreso pregunta 16");
		Thread.sleep(2000);
		List<WebElement> radioAccidentes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (accidente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioAccidentes.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			indexRadio+=1;
			radioAccidentes.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio = FormularioServices.ingresarAccidente(complicacionesAcc, especifiqueComplicacionesAcc, fechaDesdeAcc, fechaHastaAcc, trastornoVariasVeces, secuelasAcc, especifiqueSecuelasAcc,indexRadio);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
	}
	public static Boolean licenciaMedica = null;
	@When("^Ingreso licencia medica vigente pDiesisiete\"([^\"]*)\"$")
	public void ingreso_licencia_medica_vigente_pDiesisiete(String licenciaMedicaVigente) throws Throwable {
		log.info("Ingreso pregunta 17");
		licenciaMedica = licenciaMedicaVigente.equals(Constants.SI)?true:false;
		Thread.sleep(2000);
		List<WebElement> radioLicencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioLicencia.get(indexRadio));
		switch (licenciaMedicaVigente.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioLicencia.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioLicencia.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}

	@When("^Ingreso trastorno sufrido pDiesisiete\"([^\"]*)\"$")
	public void ingreso_trastorno_sufrido_pDiesisiete(String trastornoLicencia) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(2000);
			WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtTrastorno.click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
			GenericMethod.ingresarTextoSugerido(txtSearch, trastornoLicencia);
		}
	}

	@When("^Ingreso si ha afectado los riñones pDiesisiete\"([^\"]*)\"$")
	public void ingreso_si_ha_afectado_los_riñones_pDiesisiete(String afectadoRiñones) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(5000);
			WebElement txtAfectado = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(1);
			txtAfectado.click();
			Thread.sleep(1000);
			List<WebElement> listAfectado = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
			switch (afectadoRiñones) {
			case Constants.BILATERALMENTE:
				Thread.sleep(1000);
				listAfectado.get(0).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;
			case Constants.NINGUNA:
				Thread.sleep(1000);
				listAfectado.get(1).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;
			case Constants.UNILATERAL:
				Thread.sleep(1000);
				listAfectado.get(2).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;
			default:
				break;
			}
		}
	}
	static String frecuenciaSintoma;
	@When("^Ingreso frecuencia en que padece sintomas pDiesisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_frecuencia_en_que_padece_sintomas_pDiesisiete(String frecuenciaSintomas, String sintomasPrimeraVez, String sintomasUltimaVez, String frecuenciaSintomasAnio, String tiempoPromedioSintomas) throws Throwable {
		if(licenciaMedica) {
			frecuenciaSintoma = frecuenciaSintomas;
			Thread.sleep(2000);
			WebElement txtFrecuencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]")).get(2);
			GenericMethod.scrollElement(txtFrecuencia);
			txtFrecuencia.click();
			Thread.sleep(1000);
			List<WebElement> listFrecuencia = BaseFlow.driver.findElements(By.xpath("//li[contains(@class,'ember-power-select-option')]"));
			switch (frecuenciaSintomas) {
			case Constants.CONSTANTEMENTE:
				Thread.sleep(1000);
				listFrecuencia.get(0).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				FormularioServices.seleccionarFechaCalendar(sintomasPrimeraVez, 0);
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasUltimaVez, 1);
				indexRadio+=6;
				break;
			case Constants.REPETIDAS_VECES:
				Thread.sleep(1000);
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				FormularioServices.seleccionarFechaCalendar(sintomasPrimeraVez, 0);
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(sintomasUltimaVez, 1);
				Thread.sleep(1000);
				WebElement txtFrecuenciaAnual = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
				txtFrecuenciaAnual.sendKeys(frecuenciaSintomasAnio);
				Thread.sleep(1000);
				WebElement txtFrecuenciaPromedio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(4);
				txtFrecuenciaPromedio.sendKeys(tiempoPromedioSintomas);
				indexRadio+=6;
				break;
			case Constants.UNA_VEZ:
				Thread.sleep(1000);
				listFrecuencia.get(2).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				FormularioServices.seleccionarFechaCalendar(sintomasUltimaVez, 0);
				Thread.sleep(1000);
				WebElement txtSintomasPromedio = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]")).get(3);
				txtSintomasPromedio.sendKeys(tiempoPromedioSintomas);
				indexRadio+=3;
				break;
			default:
				break;
			}
		}
	}

	@When("^Ingreso si esta bajo seguimiento medico regular pDiesisiete\"([^\"]*)\"$")
	public void ingreso_si_esta_bajo_seguimiento_medico_regular_pDiesisiete(String seguimientoMedicoRegular) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(2000);
			List<WebElement> radioLicencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			switch (seguimientoMedicoRegular.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioLicencia.get(indexRadio).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;
			case Constants.SI:
				Thread.sleep(1000);
				radioLicencia.get(indexRadio+1).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;	
			default:
				break;
			}
			indexRadio+=2;
		}
	}

	static Boolean isCirugia,isCirugiaPrevista, islitotricia, isMedicacion,isOtro,isNinguno;
	@When("^Ingreso metodo de tratamiento pDiesisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_metodo_de_tratamiento_pDiesisiete(String cirugia, String cirugiaPrevista, String litotricia, String medicacion, String otro, String ninguno) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			isCirugia = cirugia.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isCirugiaPrevista = cirugiaPrevista.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			islitotricia = litotricia.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isMedicacion = medicacion.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isOtro = otro.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			isNinguno = ninguno.toLowerCase().trim().equalsIgnoreCase(Constants.SI)?true:false;
			Thread.sleep(1000);
			List<WebElement> listCheck = BaseFlow.driver.findElements(By.xpath("//span[(@class='checkbox-custom')]"));
			if(ninguno.toLowerCase().trim().equals(Constants.SI)) {
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
			WebElement btnLike = BaseFlow.driver.findElement(By.xpath("//span[(@class='icon-Suscribir')]"));
			btnLike.click();
			Thread.sleep(1000);
		}
	}

	@When("^Ingreso respuestas a distintos metodos de tratamiento\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_respuestas_a_distintos_metodos_de_tratamiento(String cuandoSometioCirugia, String especifiqueCirugia, String cuandoSometeraCirugia, String tipoCirugia, String cuandoLitotricia, String queMedicamento, String queOtro, String cuandoComenzo) throws Throwable {
	    if(licenciaMedica) {
	    	Thread.sleep(1000);
	    	 if(!isNinguno) {
	 	    	if(isCirugia) {
	 	    		 Thread.sleep(1000);
	 		    	 FormularioServices.seleccionarFechaCalendar(cuandoSometioCirugia, 2);
	 		    	 indexRadio+=3;
	 		    	 WebElement txtcirugiaRealizada = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique qu')]"));
	 		    	 txtcirugiaRealizada.sendKeys(especifiqueCirugia);
	 		    }
	 		    if(isCirugiaPrevista) {
	 		    	Thread.sleep(1000);
	 		    	FormularioServices.seleccionarFechaCalendar(cuandoSometeraCirugia, 2);
	 		    	indexRadio+=3;
	 		    	Thread.sleep(1000);
	 		    	WebElement txtcirugiaPrevista = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué tipo de cirugía le van a realizar')]"));
	 		    	txtcirugiaPrevista.sendKeys(tipoCirugia);
	 		    }
	 		    if(islitotricia) {
	 		    	
	 		    }
	 		    if(isMedicacion) {
	 		    	Thread.sleep(1000);
	 		    	WebElement txtMedicacion = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué medicación')]"));
	 		    	txtMedicacion.sendKeys(queMedicamento);
	 		    }
	 		    if(isOtro) {
	 		    	Thread.sleep(1000);
	 		    	WebElement txtOtro = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Qué otro tratamiento ha seguido')]"));
	 		    	txtOtro.sendKeys(queOtro);
	 		    	Thread.sleep(1000);
	 		    	FormularioServices.seleccionarFechaCalendar(cuandoComenzo, 1);
	 		    	indexRadio+=3;
	 		    }
	 	    }
	    }
	}

	@When("^Ingreso si se ha realizado examenes de orina pDiesisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_se_ha_realizado_examenes_de_orina_pDiesisiete(String examenOrina, String ultimoExamenOrina, String resultadoExamenOrina) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			List<WebElement> radioOrina = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioOrina.get(indexRadio));
			switch (examenOrina.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioOrina.get(indexRadio).click();
				break;
			case Constants.SI:
				Thread.sleep(1000);
				radioOrina.get(indexRadio+1).click();
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(ultimoExamenOrina, 3);
				indexRadio+=3;
				Thread.sleep(1000);
				WebElement txtAnalisis = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Cuál fue el resultado del análisis de orina')]"));
				txtAnalisis.sendKeys(resultadoExamenOrina);
				break;	
			default:
				break;
			}
			indexRadio+=2;
		}
	}

	@When("^Ingreso si estan analizando la sangre\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_estan_analizando_la_sangre(String analisisSangre, String cuandoAnalisisSangre, String detalleResultados) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			List<WebElement> radioSangre = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioSangre.get(indexRadio));
			switch (analisisSangre.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioSangre.get(indexRadio).click(); 
				break;
			case Constants.SI:
				Thread.sleep(1000);
				radioSangre.get(indexRadio+1).click();
				Thread.sleep(1000);
				FormularioServices.seleccionarFechaCalendar(cuandoAnalisisSangre, 4);
				indexRadio+=3;
				Thread.sleep(1000);
				WebElement txtSangre = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, dé detalles de los resultados')]"));
				txtSangre.sendKeys(detalleResultados);
				break;
			default:
				break;
			}
			indexRadio+=2;
		}
	}

	@When("^Ingreso si tiene sintomas todavia \"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_si_tiene_sintomas_todavia(String sintomasTodavia, String espesifiqueSintomasTodavia) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			List<WebElement> radioSintomasAun = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioSintomasAun.get(indexRadio));
			switch (sintomasTodavia.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioSintomasAun.get(indexRadio).click(); 
				break;
			case Constants.SI:
				Thread.sleep(1000);
				radioSintomasAun.get(indexRadio+1).click();
				Thread.sleep(1000);
				WebElement txtSintomas = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Por favor, especifique sus síntomas o complicaciones')]"));
				txtSintomas.sendKeys(espesifiqueSintomasTodavia);
				break;
			default:
				break;
			}
			indexRadio+=2;
		}
	}

	@When("^Ingreso incapacidad para trabajar\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_incapacidad_para_trabajar(String incapacidad, String cuantoTiempo) throws Throwable {
		if(licenciaMedica) {
			Thread.sleep(1000);
			List<WebElement> radioIncapacidad = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(1000);
			GenericMethod.scrollElement(radioIncapacidad.get(indexRadio));
			switch (incapacidad.toLowerCase().trim()) {
			case Constants.NO:
				Thread.sleep(1000);
				radioIncapacidad.get(indexRadio).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				break;
			case Constants.SI:
				Thread.sleep(1000);
				radioIncapacidad.get(indexRadio+1).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				WebElement txtSintomas = BaseFlow.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Durante cuánto tiempo estuvo de baja')]"));
				txtSintomas.sendKeys(cuantoTiempo);
				break;
			default:
				break;
			}
			indexRadio+=2;
		}
	}
	@When("^Ingreso ha ingresado a un centro hospitalario pDiesiocho\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_ingresado_a_un_centro_hospitalario_pDiesiocho(String ingresoHospitalario, String trastorno, String cuando, String sintomasAun, String especifiqueSintoma, String tratamientoMedico, String fechaInicioTratamiento, String fechaTermino, String sinFechaTermino, String operado, String frecuenciaOperado, String especifiqueOperado, String fechaOperacionUno, String fechaOperacionDos, String fechaOperacionTres, String cirugiaPlaneada, String fechaCirugiaPlaneada, String tipoCirugiaPlaneada, String incapacidad, String fechaDiscapacidad, String promedioIncapacitado, String cambioProfesion, String ocupacion, String ocupacionRecomendada) throws Throwable {
		log.info("Ingreso pregunta 18");
		Thread.sleep(2000);
		List<WebElement> radioHospitalario = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioHospitalario.get(indexRadio));
		switch (ingresoHospitalario.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioHospitalario.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioHospitalario.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
 			indexRadio = FormularioServices.ingresarCentroHospitalario(indexRadio, trastorno, cuando, sintomasAun, especifiqueSintoma, tratamientoMedico, fechaInicioTratamiento, sinFechaTermino, operado, frecuenciaOperado, especifiqueOperado, fechaOperacionUno, fechaOperacionDos, fechaOperacionTres, cirugiaPlaneada, fechaCirugiaPlaneada, tipoCirugiaPlaneada, incapacidad, fechaDiscapacidad, promedioIncapacitado, cambioProfesion, ocupacion, ocupacionRecomendada);
			break;
		default:
			break;
		}
	}

	@When("^Ingreso actualmente se encuentra en observaciones pDiesinueve\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_actualmente_se_encuentra_en_observaciones_pDiesinueve(String encuentraObservacion, String trastorno, String anemiaFerropenica, String fechaFerropenica, String anemiaSangre, String aplasica, String celulasFalciformes, String hemolitica, String hemorragica, String perniciosa, String otro, String causaTrastorno, String fechaSintomas, String tipoTratamiento, String especifiqueTratamientos, String sintomasAun, String fechaLibreSintomas, String complicacionAun, String tratamientoMedico, String inicioTratamientoMedico, String terminoTratamientoMedico, String sinDiagnosticar) throws Throwable {
		log.info("Ingreso pregunta 19");
		Thread.sleep(2000);
		List<WebElement> radioObservacion = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioObservacion.get(indexRadio));
		switch (encuentraObservacion.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radioObservacion.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radioObservacion.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarObservacionesMedicas(indexRadio, trastorno, anemiaFerropenica, fechaFerropenica, anemiaSangre, aplasica, celulasFalciformes, hemolitica, hemorragica, perniciosa, otro, causaTrastorno, fechaSintomas, tipoTratamiento, especifiqueTratamientos, sintomasAun, fechaLibreSintomas, complicacionAun, tratamientoMedico, inicioTratamientoMedico, terminoTratamientoMedico, sinDiagnosticar);
			break;
		default:
			break;
		}
	}
	
	
	@When("^Ingreso le han recetado tratamiento medico pVeinte\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_le_han_recetado_tratamiento_medico_pVeinte(String tratamientoMedico, String trastorno, String fechaPrimeraVez, String sintomasAun, String queSintomasActuales, String fechaLibreSintomas, String promedioTieneSintomas,String frecuencia, String sintomasUltimaVez, String SintomasAnio, String promedioSintomas, String revisionesMedico, String cirugia, String cuandoSometioCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia, String tipoCirugia, String medicacion, String medicacionTomando, String otro, String otroTratamiento, String fechaTratamiento,String sinTratamiento, String continuidadLaboral, String fechaBaja) throws Throwable {
		log.info("Ingreso pregunta 20");
		Thread.sleep(2000);
		List<WebElement> radiotratamiento = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radiotratamiento.get(indexRadio));
		switch (tratamientoMedico.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radiotratamiento.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radiotratamiento.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarTratamientoMedicoPVeinte(indexRadio, trastorno, fechaPrimeraVez, sintomasAun, queSintomasActuales, fechaLibreSintomas, promedioTieneSintomas, frecuencia, sintomasUltimaVez, SintomasAnio, promedioSintomas, revisionesMedico, cirugia, cuandoSometioCirugia, especifiqueCirugia, cirugiaPrevista, cuandoSometeraCirugia, tipoCirugia, medicacion, medicacionTomando, otro, otroTratamiento, fechaTratamiento, sinTratamiento, continuidadLaboral, fechaBaja);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha sido tratado por algun psicologo pVeintiuno\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_sido_tratado_por_algun_psicologo_pVeintiuno(String tratadoPsicologo, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 21");
		indexRadio=0;
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (tratadoPsicologo.toLowerCase().trim()) {
		case Constants.NO:
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
  			break;
		case Constants.SI:
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtTrastorno.click();
			Thread.sleep(1000);
			WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
			GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
			break;
		default:
			break;
		}
		indexRadio+=2;
	}
	
	@When("^Ingreso ha padecido enfermedad respiratoria pVeintidos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_respiratoria_pVeintidos(String enfermedadRespiratoria, String trastorno, String frecuenciaTrastorno, String ultimosSintomas, String frecuenciaSintomas,String sintomasPrimeraVez, String sintomasPromedio, String molestiaAlergia, String detalleAlergia, String tratamientoMedico, String cirugia, String cuandoCirugia, String especifiqueCirugia, String cirugiaPrevista, String cuandoSometeraCirugia,String cirugiaRealizar, String medicacion, String queMedicacion, String terapiaOxigeno, String cuandoInicioTerapia, String otro, String queOtro, String cuandoComenzo, String ninguno, String pruebasPulmonar, String quePruebas, String sintomasAun, String especifiqueSintomasAun, String incapacidadLaboral, String tiempoIncapacidad) throws Throwable {
		log.info("Ingreso pregunta 22");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadRespiratoria.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarEnfermedadRespiratoria(indexRadio, trastorno, frecuenciaTrastorno, ultimosSintomas, frecuenciaSintomas, sintomasPrimeraVez, sintomasPromedio, molestiaAlergia, detalleAlergia, tratamientoMedico, cirugia, cuandoCirugia, especifiqueCirugia, cirugiaPrevista, cuandoSometeraCirugia, cirugiaRealizar, medicacion, queMedicacion, terapiaOxigeno, cuandoInicioTerapia, otro, queOtro, cuandoComenzo, ninguno, pruebasPulmonar, quePruebas, sintomasAun, especifiqueSintomasAun, incapacidadLaboral, tiempoIncapacidad);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso enfermedad de sangre pVeintitres\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_enfermedad_de_sangre_pVeintitres(String enfermedadSangre, String trastorno, String anemiaFerropenica, String fechaFerropenica, String anemiaSangre, String aplasica, String celulasFalciformes, String hemolitica, String hemorragica, String perniciosa, String otro, String causaTrastorno, String fechaSintomas, String tipoTratamiento, String especifiqueTratamientos, String sintomasAun, String fechaLibreSintomas, String complicacionAun, String tratamientoMedico, String inicioTratamientoMedico, String terminoTratamientoMedico, String sinDiagnosticar) throws Throwable {
		log.info("Ingreso pregunta 23");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadSangre.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarObservacionesMedicas(indexRadio, trastorno, anemiaFerropenica, fechaFerropenica, anemiaSangre, aplasica, celulasFalciformes, hemolitica, hemorragica, perniciosa, otro, causaTrastorno, fechaSintomas, tipoTratamiento, especifiqueTratamientos, sintomasAun, fechaLibreSintomas, complicacionAun, tratamientoMedico, inicioTratamientoMedico, terminoTratamientoMedico, sinDiagnosticar);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso enfermedad del aparato circulatorio pVeinticuatro\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_enfermedad_del_aparato_circulatorio_pVeinticuatro(String enfermedadCirculatorio, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 24");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadCirculatorio.toLowerCase().trim()) {
			case Constants.NO:
				radio.get(indexRadio).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				indexRadio+=2;
	  			break;
			case Constants.SI:
				radio.get(indexRadio+1).click();
				Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
				indexRadio+=2;
				Thread.sleep(1000);
				WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
				txtTrastorno.click();
				Thread.sleep(1000);
				WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
				GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
				Thread.sleep(3000);
				break;
			default:
				break;
		}
	}
	
	@When("^Ingreso enfermedad del aparato digestivo pVeinticinco\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_enfermedad_del_aparato_digestivo_pVeinticinco(String enfermedadDigestiva, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 25");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadDigestiva.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			Thread.sleep(1000);
			WebElement txtElement = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtElement.click();
			Thread.sleep(1000);
			WebElement txtBuscar = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
			txtBuscar.sendKeys(trastorno);
			Thread.sleep(1000);
			List<WebElement> list = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
			for(WebElement li : list) {
				if(li.getText().toString().equalsIgnoreCase(trastorno)) {
					Thread.sleep(1000);
					li.click();
					break;
				}
			}
			Thread.sleep(3000);
			break;
		default:
			break;
		}
	}



	@When("^Ingreso ha padecido tumores o cancer pVeintiSeis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_tumores_o_cancer_pVeintiSeis(String cancer, String trastorno, String fechaDiagnosticacion, String cirugia, String quimioterapia, String radioterapia, String otros, String recurrenciaTumor, String extirpadoTotalmente, String otroTratamiento) throws Throwable {
		log.info("Ingreso pregunta 26");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (cancer.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarTumores(indexRadio, trastorno, fechaDiagnosticacion, cirugia, quimioterapia, radioterapia, otros, recurrenciaTumor, extirpadoTotalmente, otroTratamiento);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha padecido enfermedad del aparato genitourinario pVeintisiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_del_aparato_genitourinario_pVeintisiete(String enfermedadGenital, String trastorno, String hospitalizado, String variasVeces) throws Throwable {
		log.info("Ingreso pregunta 27");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadGenital.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			Thread.sleep(1000);
			indexRadio = FormularioServices.ingresarEnfermedadGenital(indexRadio, trastorno, hospitalizado, variasVeces);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha padecido enfermedad del aparato locomotor pVeintiocho\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_del_aparato_locomotor_pVeintiocho(String enfermedadLocomotor, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 28");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadLocomotor.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			Thread.sleep(1000);
			WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtTrastorno.click();
			Thread.sleep(1000);
			WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
			GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
			Thread.sleep(3000);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha padecido enfermedad endocrina pVeintinueve\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_endocrina_pVeintinueve(String enfermedadEndocrina, String trastorno, String tipoDiabetes, String aunDiabetesGestacional, String fechaDiagnostico) throws Throwable {
		log.info("Ingreso pregunta 29");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadEndocrina.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarEnfermedadEndocrina(indexRadio, trastorno, tipoDiabetes, aunDiabetesGestacional, fechaDiagnostico);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha padecido enfermedad infecciosa pTreinta\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_infecciosa_pTreinta(String enfermedadInfecciosa, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 30");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadInfecciosa.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			Thread.sleep(1000);
			WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtTrastorno.click();
			Thread.sleep(1000);
			WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
			GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
			Thread.sleep(3000);
			indexRadio+=2;
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha padecido enfermedad de los ojos pTreintaiuno\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_de_los_ojos_pTreintaiuno(String enfermedadOcular, String trastorno) throws Throwable {
		log.info("Ingreso pregunta 31");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadOcular.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			Thread.sleep(1000);
			WebElement txtTrastorno = BaseFlow.driver.findElement(By.xpath("//div[contains(@class,'ember-basic-dropdown-trigger')]"));
			txtTrastorno.click();
			Thread.sleep(1000);
			WebElement txtSearch = BaseFlow.driver.findElement(By.xpath("//input[contains(@type,'search')]"));
			GenericMethod.ingresarTextoSugerido(txtSearch, trastorno);
			Thread.sleep(3000);
			indexRadio+=2;
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha padecido enfermedad del sistema nervioso\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_del_sistema_nervioso(String enfermedadNerviosa, String trastorno, String doloresUltimaVez, String frecuenciaMedicacion, String frecuenciaMigranias, String horas, String nauseas, String paralisis, String parpadeos, String otro, String queOtro, String ninguno, String incapacidadLaboral, String tiempoIncapacidad) throws Throwable {
		log.info("Ingreso pregunta 32");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadNerviosa.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000);
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarMigrania(indexRadio, trastorno, doloresUltimaVez, frecuenciaMedicacion, frecuenciaMigranias, horas, nauseas, paralisis, parpadeos, otro, queOtro, ninguno, incapacidadLaboral, tiempoIncapacidad);
			break;
		default:
			break;
		}
	}
	
	@When("^Ingreso ha padecido enfermedad de la piel pTreintaitres\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_ha_padecido_enfermedad_de_la_piel_pTreintaitres(String enfermedadPiel, String trastorno, String esMaligno, String seguimiento, String FechaDiagnostico, String cirugia, String quimioterapia, String radioterapia, String otros, String detalleOtro, String Recurrencia, String extirpado, String seguimientoTratamiento, String cuandoDiagnostico, String algunOtroTratamiento, String queOtroTratamiento, String estaCurado) throws Throwable {
		log.info("Ingreso pregunta 33");
		Thread.sleep(2000);
		List<WebElement> radio = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radio.get(indexRadio));
		switch (enfermedadPiel.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(1000);
			radio.get(indexRadio).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
  			break;
		case Constants.SI:
			Thread.sleep(1000); 
			radio.get(indexRadio+1).click();
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
			indexRadio+=2;
			indexRadio = FormularioServices.ingresarEnfermedadPiel(indexRadio, trastorno, esMaligno, seguimiento, FechaDiagnostico, cirugia, quimioterapia, radioterapia, otros, detalleOtro, Recurrencia, extirpado, seguimientoTratamiento, cuandoDiagnostico, algunOtroTratamiento, queOtroTratamiento, estaCurado);
			break;
		default:
			break;
		}
		
		Thread.sleep(2000);
		WebElement btnGuardar = BaseFlow.driver.findElement(By.className("right-header"));
		btnGuardar.click();
	}
}