package cl.security.qaAutomation.definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cl.security.qaAutomation.flow.BaseFlow;
import cl.security.qaAutomation.services.FormularioServices;
import cl.security.qaAutomation.utils.Constants;
import cl.security.qaAutomation.utils.GenericMethod;
import cucumber.api.java.en.When;

public class DPSCompassDefinition {

	@When("^Ingreso la actividad pUno\"([^\"]*)\"$")
	public void ingreso_la_actividad_pUno(String actividad) throws Throwable {
		WebElement txtActividad = BaseFlow.driver.findElements(By.xpath("//*[contains(@class,'ember-power-select-trigger')]")).get(0);
		GenericMethod.ingresarTextoSugerido(txtActividad, actividad);
	}

	@When("^Ingreso riesgos pDos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_riesgos_pDos(String riesgo, String nombreEmpleador, String areaTrabajo, String horasSemanales, String desdeCuando, String sustanciasEncapsuladas, String sustanciasNoEncapsuladas,String conCualesTrabaja,	 String aparatoRayosX, String RayosXDisruptivos, String ningunoRayo, String microondas, String radiacionAlfa, String radiacionBeta, String radiacionDeNeutrones, String radiacionDeRayosX, String radiacionDeGamma, String radiacionLaser, String radiacionMaster, String rayosUltravioletasArtificiales, String otros, String otraRadiacion, String ningunoPresenteTareasDiarias,String medidasSeguridadDisponibles, String controlImpactoRadiacion, String sobrepasadoLimiteRadiacion, String conQueFrecuencia, String ultimaVez, String queValores, String tratamientoMedicoRadiacion, String cuando , String cualFueRazon, String consecuenciasSufridas, String hhAnuales) throws Throwable {
		FormularioServices.ingresarRiesgosDps(riesgo, nombreEmpleador, areaTrabajo, horasSemanales, desdeCuando, sustanciasEncapsuladas, sustanciasNoEncapsuladas, conCualesTrabaja, aparatoRayosX, RayosXDisruptivos, ningunoRayo, microondas, radiacionAlfa, radiacionBeta, radiacionDeNeutrones, radiacionDeRayosX, radiacionDeGamma, radiacionLaser, radiacionMaster, rayosUltravioletasArtificiales, otros, otraRadiacion, ningunoPresenteTareasDiarias, medidasSeguridadDisponibles, controlImpactoRadiacion, sobrepasadoLimiteRadiacion, conQueFrecuencia, ultimaVez, queValores, tratamientoMedicoRadiacion, cuando, cualFueRazon, consecuenciasSufridas, hhAnuales);
	}
	
	@When("^Ingreso labores de bombero o rescatista voluntario pTres\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_labores_de_bombero_o_rescatista_voluntario_pTres(String realizaLabores, String labor) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radioRescatista = BaseFlow.driver.findElements(By.xpath("//span[contains(@class,'radio-custom')]"));
		switch (realizaLabores.toLowerCase().trim()) {
		case Constants.NO:
			radioRescatista.get(0).click();
			break;
		case Constants.SI:
			radioRescatista.get(1).click();
			FormularioServices.ingresarLaboresRescatista(labor);
			break;
		default:
			break;
		}
	}

	@When("^Doy click en boton siguiente$")
	public void doy_click_en_boton_siguiente() throws Throwable {
		Thread.sleep(1000);
		WebElement btnNext = BaseFlow.driver.findElement(By.xpath("//button[contains(@class,'next')]"));
		btnNext.click();
		Thread.sleep(2000);
	}

	@When("^Ingreso motocicleta como medio de transporte pCuatro\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_motocicleta_como_medio_de_transporte_pCuatro(String utilizaMotocicleta, String cilindrada) throws Throwable {
		Thread.sleep(500);
		List<WebElement> radioMoto = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (utilizaMotocicleta.toLowerCase().trim()) {
		case Constants.NO:
			radioMoto.get(0).click();
			break;
		case Constants.SI:
			radioMoto.get(1).click();
			FormularioServices.ingresoMotocicletaComoMedioTransporte(cilindrada);
			break;
		default:
			break;
		}
	}
	
	@When("^ingreso deportes aventura pCinco\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_deportes_aventura_pCinco(String deporteAventura, String actividades) throws Throwable {
		Thread.sleep(500);
		List<WebElement> radioDeportes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (deporteAventura.toLowerCase().trim()) {
		case Constants.NO:
			Thread.sleep(500);
			radioDeportes.get(2).click();
			break;
		case Constants.SI:
			Thread.sleep(500);
			radioDeportes.get(3).click();
//			TODO ingresar actividades
			break;
		default:
			break;
		}
	}
	public static Integer countSeguro= 0;
	@When("^Ingreso vigencia seguro de vida pSeis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_vigencia_seguro_de_vida_pSeis(String seguroVidaVigente, String tipoSeguro, String compania, String sumaAsegurada, String fechaCobertura, String resultadoAceptacion) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radioSeguros = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (seguroVidaVigente.toLowerCase().trim()) {
		case Constants.NO:
			radioSeguros.get(0).click();
			break;
		case Constants.SI:
			radioSeguros.get(1).click();
			FormularioServices.ingresoVigenciaSeguroVida(seguroVidaVigente, tipoSeguro, compania, sumaAsegurada, fechaCobertura, resultadoAceptacion,countSeguro);
			break;
		default:
			break;
		}
		countSeguro+=1;
	}
	public static Integer countViaje= 0;
	@When("^Ingreso viajes al extranjero con regularidad psiete\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_viajes_al_extranjero_con_regularidad_psiete(String viajesExtranjero, String pais, String motivo, String tiempoEstancia, String dondeReside, String dondeAloja, String viajesActividad) throws Throwable {
		countSeguro=0;
		Thread.sleep(1000);
		List<WebElement> radioViaje = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		switch (viajesExtranjero.toLowerCase().trim()) {
		case Constants.NO:
			radioViaje.get(0).click();
			break;
		case Constants.SI:
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
		Thread.sleep(1000);	
		List<WebElement> txtEstatura = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		GenericMethod.scrollElement(txtEstatura.get(0));
		txtEstatura.get(0).sendKeys(estatura);
	}
	
	@When("^Ingreso peso en kilogramos pNueve\"([^\"]*)\"$")
	public void ingreso_peso_en_kilogramos_pNueve(String peso) throws Throwable {
		Thread.sleep(1000);	
		List<WebElement> txtPeso = BaseFlow.driver.findElements(By.xpath("//input[contains(@class,'ember-text-field')]"));
		GenericMethod.scrollElement(txtPeso.get(1));
		txtPeso.get(1).sendKeys(peso);
	}
	public static Integer countBebidas = 0;
	@When("^Ingreso consumo de bebidas alcoholicas pDiez\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_consumo_de_bebidas_alcoholicas_pDiez(String bebidasAlcoholicas, String tipo, String frecuencia) throws Throwable {
		Thread.sleep(1000);
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
	
	public static Integer countFumador = 0;
	@When("^Ingreso fumador en los ultimos doce meses pOnce\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_fumador_en_los_ultimos_doce_meses_pOnce(String fumador, String queFuma, String frecuenciaFuma) throws Throwable {
		countBebidas = 0;
		Thread.sleep(1000);
		List<WebElement> radioFumador = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioFumador.get(2));
		switch (fumador.toLowerCase().trim()) {
		case Constants.NO:
			radioFumador.get(2).click();
			break;
		case Constants.SI:
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
		Thread.sleep(1000);
		List<WebElement> radioDrogas = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioDrogas.get(4));
		switch (drogas.toLowerCase().trim()) {
		case Constants.NO:
			radioDrogas.get(4).click();
			break;
		case Constants.SI:
			radioDrogas.get(5).click();
			FormularioServices.ingresoConsumoDrogas(alucinogenos, anfetaminas, cocaina, heroina, marihuanaFrecuente, marihuanaOcacional);
			break;
		default:
			break;
		}
	}

	@When("^Ingreso embarazo\"([^\"]*)\"$")
	public void ingreso_embarazo(String embarazada) throws Throwable {
		if(PropuestaCompassDefinition.genero.trim().toLowerCase().equalsIgnoreCase("f")) {
			List<WebElement> radioEmbarazada = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
			Thread.sleep(500);
			GenericMethod.scrollElement(radioEmbarazada.get(6));
			switch (embarazada.toLowerCase().trim()) {
			case Constants.NO:
				radioEmbarazada.get(6).click();
				break;
			case Constants.SI:
				radioEmbarazada.get(7).click();
//				TODO ingresar fumador
				break;
			default:
				break;
			}
		}
	}

	@When("^Ingreso prueba de VIH en los ultimos doce meses\"([^\"]*)\"$")
	public void ingreso_prueba_de_VIH_en_los_ultimos_doce_meses(String pruebaVIH) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radioVIH = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioVIH.get(6));
		switch (pruebaVIH.toLowerCase().trim()) {
		case Constants.NO:
			radioVIH.get(6).click();
			break;
		case Constants.SI:
			radioVIH.get(7).click();
//				TODO ingresar fumador
			break;
		default:
			break;
		}
	}

	@When("^Ingreso pension de invalidez\"([^\"]*)\"$")
	public void ingreso_pension_de_invalidez(String pensionInvalidez) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radioPension = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioPension.get(8));
		switch (pensionInvalidez.toLowerCase().trim()) {
		case Constants.NO:
			radioPension.get(8).click();
                  			break;
		case Constants.SI:
			radioPension.get(9).click();
//				TODO ingresar fumador
			break;
		default:
			break;
		}
	}

	@When("^Ingreso si ha sido victima de algun accidente\"([^\"]*)\"$")
	public void ingreso_si_ha_sido_victima_de_algun_accidente(String accidente) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radioAccidentes = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioAccidentes.get(10));
		switch (accidente.toLowerCase().trim()) {
		case Constants.NO:
			radioAccidentes.get(10).click();
                  			break;
		case Constants.SI:
			radioAccidentes.get(11).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso licencia medica vigente\"([^\"]*)\"$")
	public void ingreso_licencia_medica_vigente(String licenciaMedicaVigente) throws Throwable {
		Thread.sleep(1000);
		List<WebElement> radioLicencia = BaseFlow.driver.findElements(By.xpath("//div[contains(@class,'yes-no-container')]"));
		GenericMethod.scrollElement(radioLicencia.get(12));
		switch (licenciaMedicaVigente.toLowerCase().trim()) {
		case Constants.NO:
			radioLicencia.get(12).click();
                  			break;
		case Constants.SI:
			radioLicencia.get(13).click();
//				TODO ingresar accidentes
			break;
		default:
			break;
		}
	}

	@When("^Ingreso ha ingresado a un centro hospitalario\"([^\"]*)\"$")
	public void ingreso_ha_ingresado_a_un_centro_hospitalario(String ingresoHospitalario) throws Throwable {
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
