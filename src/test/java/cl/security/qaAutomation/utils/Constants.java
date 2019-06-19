package cl.security.qaAutomation.utils;

public class Constants {
//	constant end point 
	public static final String URL_BASE = "http://10.62.4.76:8170/compass-api/";
	public static final String OAUTH =URL_BASE+"auth"; 
	public static final String APPLICATION =URL_BASE+"api/v1/compass/application";
	public static final String RESULT =URL_BASE+"api/v1/compass/result";
	
//	PARAMETROS FEATURE
	public static final String SI = "si";
	public static final String NO = "no";
//	PREGUNTA 2
	public static final String RADIACION_IONIZANTE = "radiacionionizante";
		// AREA DE TRABAJO 
		public static final String AT_AREA_CONTROL = "areacontrol";
		public static final String AT_AREA_VIGILANCIA = "areavigilancia";
		public static final String AT_OTRA_AREA = "otraarea";
	public static final String VUELOS_NO_REGULARES = "vuelosnoregulares";
	public static final String NINGUNO_ANTERIORES = "ningunodelosanteriores";
	
//	PREGUNTA 3
	public static final String BOMBERO = "bombero";
	public static final String BOMBERO_AEROPUERTO = "bomberoaeropuerto";
	public static final String BOMBERO_FORESTAL = "bomberoforestal";
	public static final String RESCATE_CON_OPERACIONES_EPECIALES = "rescateconoperacionesespeciales";
	public static final String RESCATE_SIN_OPERACIONES_EPECIALES = "rescatesinoperacionesespeciales";
//	PREGUNTA 4
	public static final String ENTRE_125_Y_500 = "entre125y500";
	public static final String MAS_DE_500 = "masde500";
	public static final String MENOS_DE_125 = "menosde125";
//	PREGUNTA 5
	//TODO POR MAPEAR
	
//	PREGUNTA 6
	// TIPO DE SEGURO
	public static final String SEGURO_ACCIDENTES = "accidentes";
	public static final String SEGURO_EG = "eg";
	public static final String SEGURO_IAP = "iap";
	public static final String SEGURO_IP = "ip";
	public static final String SEGURO_VIDA = "vida";
	// RESULTADO ACEPTACION
	public static final String ACEPTADO = "a";
	public static final String ACEPTADO_CON_RECARGO = "ar";
	public static final String APLICACION_SIMULTANEA = "as";
	public static final String NO_ACEPTADO = "n";
	
//	PREGUNTA 7
	// MOTIVO DE VIAJE
	public static final String VIAJE_DESCONOCIDO = "desconocido";
	public static final String VIAJE_PROFESIONAL = "profesional";
	public static final String VIAJE_SOLO_PRIVADO = "soloprivado";
	// TIEMPO DE ESTADIA
	public static final String ESTADIA_10_DIAS_AL_ANIO = "10diasanio";
	public static final String ESTADIA_10_A_30_DIAS = "10a30dias";
	public static final String ESTADIA_31_A_12_MESES = "31a12meses";
	public static final String ESTADIA_PERMANENTE = "estanciapermanente";
	public static final String ESTADIA_DESCONOCIDA = "desconocido";
	// DONDE RESIDE
	public static final String RESIDENCIA_CIUDAD = "ciudad";
	public static final String RESIDENCIA_CAPITAL = "ciudadcapital";
	public static final String RESIDENCIA_PUEBLO = "pueblo";
	public static final String RESIDENCIA_DESCONOCIDA = "desconocido";
	// DONDE ALOJA
	public static final String ALOJAMIENTO_BASICO = "alojamientobasico";
	public static final String ALOJAMIENTO_ESTANDAR = "alojamientoestandar";
	public static final String ALOJAMIENTO_LUJO = "residenciadelujo";
	public static final String ALOJAMIENTO_DESCONOCIDO = "desconocido";
	// REALIZA VIAJES RELACIONADOS CON SU ACTIVIDAD
	public static final String VIAJES_NO = "sinviajes";
	public static final String VIAJES_DISTINTOS_LUGARES = "viajesdistintoslugares";
	public static final String VIAJES_A_MAS_LUGARES = "viajesmaslugares";
	public static final String VIAJES_DESCONOCIDO = "desconocido";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}