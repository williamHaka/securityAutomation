Feature: Flujo end2end compass DPS

	@NuevoAsegurado
  Scenario Outline: Ingresar datos del asegurado
    Given Ingreso a la url"https://vs-as-compass-des.azurewebsites.net/"
    When Ingreso usuario y clave"admin""admin"
    And Doy click en nueva propuesta
    And Ingreso nombre de la nueva propuesta<nombrePropuesta>
    And selecciono tipo de cuestionario"TOUCH_VS"
    And Doy click en siguiente
    And Ingreso nombre<nombre>
    And Ingreso edad<edad>
    And Ingreso rut<rut>
    And Selecciono genero<genero>
    And Selecciono estado civil<estadoCivil>
    And Selecciono cobertura<cobertura>
    And Ingreso renta<renta>
    And Ingreso prima<prima>
    And Ingreso duracion<duracion>
    And Doy click en siguiente
    And Acepto termino de conformidad<aceptoTermino>
   
  @NuevoAseguradoHombre
  Examples: 
    | nombrePropuesta | nombre   | edad | rut    | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino |
    | "TC"           | "nombre"  | "33" | "1-9"  | "M"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | "si"          |
    
	@NuevoAseguradoMujer
  Examples: 
    | nombrePropuesta | nombre   | edad | rut    | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino |
    | "TC"           | "Mujer"   | "33" | "1-9"  | "F"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | "si"          |

  @P1
  Scenario Outline: Ingreso respuesta de pregusta uno
    When Ingreso la actividad pUno<actividad>

    @P1TC1
    Examples: Ingreso actividad FFAA - Carabineros, Investigaciones, Gendarmería
      | actividad                                          |
      | "FFAA - Carabineros, Investigaciones, Gendarmería" |

    @P1TC2
    Examples: Ingreso actividad Guardia de seguridad - con arma
      | actividad                         |
      | "Guardia de seguridad - sin arma" |

    @P1TC3
    Examples: Ingreso actividad Guardia de seguridad - con arma
      | actividad                        |
      | "Guarda de seguridad - con arma" |

    @P1TC4
    Examples: Ingreso actividad Guardaespaldas
      | actividad        |
      | "Guardaespaldas" |

    @P1TC5
    Examples: Ingreso actividad Detective privado
      | actividad           |
      | "Detective privado" |

    @P1TC6
    Examples: Ingreso actividad Bombero
      | actividad |
      | "Bombero" |

    @P1TC7
    Examples: Ingreso actividad Bombero forestal
      | actividad          |
      | "Bombero forestal" |

    @P1TC8
    Examples: Ingreso actividad Bombero en aeropuerto
      | actividad               |
      | "Bombero en aeropuerto" |

    @P1TC9
    Examples: Ingreso actividad Minero amianto
      | actividad        |
      | "Minero amianto" |

    @P1TC10
    Examples: Ingreso actividad Minero mina a cielo abierto
      | actividad                     |
      | "Minero mina a cielo abierto" |

    @P1TC11
    Examples: Ingreso actividad  Minero trabajo subterráneo
      | actividad                     |
      | " Minero trabajo subterráneo" |

    @P1TC12
    Examples: Ingreso actividad Minero manejo de explosivos
      | actividad                     |
      | "Minero manejo de explosivos" |

    @P1TC13
    Examples: Ingreso actividad Minero trabajo en superficies
      | actividad                       |
      | "Minero trabajo en superficies" |

    @P1TC14
    Examples: Ingreso actividad Pescador de bajura/litoral
      | actividad                    |
      | "Pescador de bajura/litoral" |

    @P1TC15
    Examples: Ingreso actividad Pesca de altura - capitán/patrón
      | actividad                          |
      | "Pesca de altura - capitán/patrón" |

    @P1TC16
    Examples: Ingreso actividad Pesca de altura - oficial
      | actividad                   |
      | "Pesca de altura - oficial" |

    @P1TC17
    Examples: Ingreso actividad Pesca de altura - ingeniero
      | actividad                     |
      | "Pesca de altura - ingeniero" |

    @P1TC18
    Examples: Ingreso actividad Pesca de altura - marinero
      | actividad                    |
      | "Pesca de altura - marinero" |

    @P1TC19
    Examples: Ingreso actividad Periodismo - Corresponsal de guerra
      | actividad                             |
      | "Periodismo - Corresponsal de guerra" |

    @P1TC20
    Examples: Ingreso actividad Rodeo
      | actividad |
      | "Rodeo"   |

  @P2
  Scenario Outline: Ingreso respuesta de pregusta dos
    When Ingreso riesgos pDos<riesgo><nombreEmpleador><areaTrabajo><horasSemanales><desdeCuando><sustanciasEncapsuladas><sustanciasNoEncapsuladas><conCualesTrabaja><aparatoRayosX><RayosXDisruptivos><ningunoRayo><microondas><radiacionAlfa><radiacionBeta><radiacionDeNeutrones><radiacionDeRayosX><radiacionDeGamma><radiacionLaser><radiacionMaster><rayosUltravioletasArtificiales><otros><otraRadiacion><ningunoPresenteTareasDiarias><medidasSeguridadDisponibles><controlImpactoRadiacion><sobrepasadoLimiteRadiacion><conQueFrecuencia><ultimaVez><queValores><tratamientoMedicoRadiacion><cuando><cualFueRazon><consecuenciasSufridas><hhAnuales>

    @P2TC2
    Examples: Ingreso riesgo radiacion ionizante
      | riesgo      | nombreEmpleador | areaTrabajo   | horasSemanales | desdeCuando  | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja     | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles        | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "radiacion" | "security"      | "areacontrol" | "40"           | "01-03-2015" | "si"                   | "no"                     | "con cuales trabaja" | "si"          | "no"              | "no"        | "si"       | "no"          | "no"          | "no"                 | "no"              | "si"             | "no"           | "no"            | "no"                           | "no"  | "no"          | "no"                         | "medidas de seguridad disponibles" | "no"                    | "no"                       | ""               | ""        | ""         | "no"                       | ""     | ""           | ""                    | ""        |

    @P2TC3
    Examples: Ingreso riesgo radiacion ionizante
      | riesgo      | nombreEmpleador | areaTrabajo      | horasSemanales | desdeCuando  | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja     | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles        | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando       | cualFueRazon        | consecuenciasSufridas    | hhAnuales |
      | "radiacion" | "security"      | "areavigilancia" | "25"           | "03-01-2013" | "no"                   | "si"                     | "con cuales trabaja" | "no"          | "si"              | "no"        | "no"       | "no"          | "no"          | "si"                 | "no"              | "si"             | "no"           | "no"            | "no"                           | "no"  | "no"          | "no"                         | "medidas de seguridad disponibles" | "si"                    | "no"                       | ""               | ""        | ""         | "si"                       | "18-11-2016" | "cual fue la razon" | "consecuencias sufridas" | ""        |

    @P2TC4
    Examples: Ingreso riesgo radiacion ionizante
      | riesgo      | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando  | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja     | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion  | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles        | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez    | queValores    | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "radiacion" | "security"      | "otraarea"  | "10"           | "03-01-2019" | "si"                   | "si"                     | "con cuales trabaja" | "no"          | "no"              | "si"        | "no"       | "no"          | "no"          | "no"                 | "no"              | "si"             | "no"           | "no"            | "no"                           | "si"  | "ot radiacion" | "no"                         | "medidas de seguridad disponibles" | "si"                    | "si"                       | "100"            | "06-01-2019" | "que valores" | "no"                       | ""     | ""           | ""                    | ""        |

    @P2TC5
    Examples: Ingreso riesgo radiacion ionizante
      | riesgo      | nombreEmpleador | areaTrabajo   | horasSemanales | desdeCuando  | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja     | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles        | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "radiacion" | "security"      | "areacontrol" | "5"            | "01-01-2019" | "si"                   | "no"                     | "con cuales trabaja" | "si"          | "si"              | "no"        | "no"       | "no"          | "no"          | "no"                 | "no"              | "si"             | "no"           | "no"            | "no"                           | "no"  | "no"          | "si"                         | "medidas de seguridad disponibles" | "no"                    | "no"                       | ""               | ""        | ""         | "no"                       | ""     | ""           | ""                    | ""        |

    @P2TC6
    Examples: Ingreso riesgo vuelos no regulares
      | riesgo   | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "vuelos" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""            | ""                | ""          | ""         | ""            | ""            | ""                   | ""                | ""               | ""             | ""              | ""                             | ""    | ""            | ""                           | ""                          | ""                      | ""                         | ""               | ""        | ""         | ""                         | ""     | ""           | ""                    | "90"      |

    @P2TC7
    Examples: Ingreso riesgo vuelos no regulares
      | riesgo   | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "vuelos" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""            | ""                | ""          | ""         | ""            | ""            | ""                   | ""                | ""               | ""             | ""              | ""                             | ""    | ""            | ""                           | ""                          | ""                      | ""                         | ""               | ""        | ""         | ""                         | ""     | ""           | ""                    | "110"     |

    @P2TC8
    Examples: Ingreso riesgo ninguno de los anteriores
      | riesgo    | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "ninguno" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""            | ""                | ""          | ""         | ""            | ""            | ""                   | ""                | ""               | ""             | ""              | ""                             | ""    | ""            | ""                           | ""                          | ""                      | ""                         | ""               | ""        | ""         | ""                         | ""     | ""           | ""                    | ""        |

    @P2TC9
    Examples: Ingreso riesgo vuelos no regulares
      | riesgo   | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "vuelos" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""            | ""                | ""          | ""         | ""            | ""            | ""                   | ""                | ""               | ""             | ""              | ""                             | ""    | ""            | ""                           | ""                          | ""                      | ""                         | ""               | ""        | ""         | ""                         | ""     | ""           | ""                    | "110"     |

    @P2NO
    Examples: Ingreso riesgo ninguno de los anteriores
      | riesgo    | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas | hhAnuales |
      | "ninguno" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""            | ""                | ""          | ""         | ""            | ""            | ""                   | ""                | ""               | ""             | ""              | ""                             | ""    | ""            | ""                           | ""                          | ""                      | ""                         | ""               | ""        | ""         | ""                         | ""     | ""           | ""                    | ""        |

  @P3
  Scenario Outline: Ingreso respuesta de pregunta tres
    When Ingreso labores de bombero o rescatista voluntario pTres<realizaLabores><labor>
    And Doy click en boton siguiente

    @P3TC10
    Examples: Ingreso bombero en rescatista o voluntario
      | realizaLabores | labor     |
      | "si"           | "bombero" |

    @P3TC11
    Examples: Ingreso bombero en aeropuerto en rescatista o voluntario
      | realizaLabores | labor               |
      | "si"           | "bomberoaeropuerto" |

    @P3TC12
    Examples: Ingreso bombero forestal en rescatista o voluntario
      | realizaLabores | labor             |
      | "si"           | "bomberoforestal" |

    @P3TC13
    Examples: Ingreso rescate con operaciones especiales en rescatista o voluntario
      | realizaLabores | labor                             |
      | "si"           | "rescateconoperacionesespeciales" |

    @P3TC14
    Examples: Ingreso rescate con operaciones especiales en rescatista o voluntario
      | realizaLabores | labor                             |
      | "si"           | "rescatesinoperacionesespeciales" |

    @P3NO
    Examples: Ingreso No en rescatista o voluntario
      | realizaLabores | labor |
      | "no"           | ""    |

  @P4
  Scenario Outline: Ingreso respuesta de pregunta cuatro
    When Ingreso motocicleta como medio de transporte pCuatro<utilizaMotocicleta><cilindrada>

    @P4TC10
    Examples: Ingreso entre 125cc y 500cc en medio de transporte
      | utilizaMotocicleta | cilindrada   |
      | "si"               | "menosde125" |

    @P4TC12
    Examples: Ingreso mas de 500cc en medio de transporte
      | utilizaMotocicleta | cilindrada     |
      | "si"               | "entre125y500" |

    @P4TC14
    Examples: Ingreso menos de 125cc en medio de transporte
      | utilizaMotocicleta | cilindrada |
      | "si"               | "masde500" |

    @P4NO
    Examples: Ingreso No en medio de transporte
      | utilizaMotocicleta | cilindrada |
      | "no"               | ""         |

  @P5
  Scenario Outline: Ingreso respuesta pregunta cinco
    When ingreso deportes aventura pCinco<deporteAventura><actividad><tipoAficionado><alaska><antartica><artico><groenlandia><ninguna><alturaMaxima><intentoSolitario><libre><ninguno><actividadProxima><especifique>
    And Doy click en boton siguiente
	
		@P5TC92
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   | tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique          |
      | "si"            | "andinismo" | "amateur"      | "si"   | ""        | ""     | ""          | ""      | "100"        | "si"             | ""    | ""      | "si"             | "actividades varias" |
      
    @P5TC93
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   |  tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique |
      | "si"            | "andinismo" |  "amateur"      | ""     | "si"      | ""     | ""          | ""      | "100"        | ""               | "si"  | ""      | "no"             | ""          |
    
    @P5TC94
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   |  tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique |
      | "si"            | "andinismo" |  "amateur"      | ""     | ""        | "si"   | ""          | ""      | "100"        | ""               | ""    | "si"    | "no"             | ""          |
      
    @P5TC95
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   |  tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique |
      | "si"            | "andinismo" |  "amateur"      | ""     | ""        | ""     | "si"        | ""      | "100"        | "si"             | "si"  | ""      | "no"             | ""          |
      
    @P5TC96
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   |  tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique |
      | "si"            | "andinismo" |  "amateur"      | ""     | ""        | ""     | ""          | "si"    | "100"        | ""               | ""    | "si"    | "no"             | ""          |
      
    @P5TC97
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   | tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique |
      | "si"            | "andinismo" | "amateur"      | "si"   | ""        | "si"   | ""          | ""      | "100"        | ""               | ""    | "si"    | "no"             | ""          |
      
    @P5NO
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividad   | tipoAficionado | alaska | antartica | artico | groenlandia | ninguna | alturaMaxima | intentoSolitario | libre | ninguno | actividadProxima | especifique |
      | "no"            | "andinismo" | "amateur"      | ""     | ""        | ""     | ""          | ""      | ""           | ""               | ""    | ""      | ""               | ""          |

  @P6
  Scenario Outline: Ingreso seguros de vida pregunta seis
    When Ingreso vigencia seguro de vida pSeis<seguroVidaVigente><tipoSeguro><compania><sumaAsegurada><fechaCobertura><resultadoAceptacion>

    @P6TC10
    Examples: Ingreso tipo de seguro accidentes en seguros de vida
      | seguroVidaVigente | tipoSeguro   | compania   | sumaAsegurada | fechaCobertura | resultadoAceptacion |
      | "si"              | "accidentes" | "security" | "2500"        | "01-10-2017"   | "a"                 |

    @P6TC11
    Examples: Ingreso tipo de seguro EG en seguros de vida
      | seguroVidaVigente | tipoSeguro | compania   | sumaAsegurada | fechaCobertura | resultadoAceptacion |
      | "si"              | "eg"       | "security" | "2500"        | "01-10-2017"   | "ar"                |

    @P6TC12
    Examples: Ingreso tipo de seguro IAP en seguros de vida
      | seguroVidaVigente | tipoSeguro | compania   | sumaAsegurada | fechaCobertura | resultadoAceptacion |
      | "si"              | "iap"      | "security" | "2500"        | "01-10-2017"   | "as"                |

    @P6TC13
    Examples: Ingreso tipo de seguro IP en seguros de vida
      | seguroVidaVigente | tipoSeguro | compania   | sumaAsegurada | fechaCobertura | resultadoAceptacion |
      | "si"              | "ip"       | "security" | "2500"        | "01-10-2017"   | "n"                 |

    @P6TC14
    Examples: Ingreso tipo de seguro EG y Vida en seguros de vida
      | seguroVidaVigente | tipoSeguro | compania   | sumaAsegurada | fechaCobertura | resultadoAceptacion |
      | "si"              | "eg"       | "security" | "2500"        | "01-10-2017"   | "as"                |
      | "si"              | "vida"     | "security" | "2500"        | "01-10-2017"   | "a"                 |

    @P6NO
    Examples: Ingreso No a seguros de vida
      | seguroVidaVigente | tipoSeguro | compania | sumaAsegurada | fechaCobertura | resultadoAceptacion |
      | "no"              | ""         | ""       | ""            | ""             | ""                  |

  @P7
  Scenario Outline: Ingreso viajes con regularidad al extranjero pregunta siete
    When Doy click en boton siguiente
    And Ingreso viajes al extranjero con regularidad psiete<viajesExtranjero><pais><motivo><tiempoEstancia><dondeReside><dondeAloja><viajesActividad>
    And Doy click en boton siguiente

    @P7TC15
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais     | motivo        | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "egipto" | "desconocido" | "10diasanio"   | ""          | ""         | ""              |

    @P7TC16
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais     | motivo        | tiempoEstancia | dondeReside | dondeAloja          | viajesActividad |
      | "si"             | "egipto" | "desconocido" | "10a30dias"    | "ciudad"    | "alojamientobasico" | "desconocido"   |

    @P7TC17
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais     | motivo        | tiempoEstancia | dondeReside     | dondeAloja            | viajesActividad |
      | "si"             | "egipto" | "desconocido" | "31a12meses"   | "ciudadcapital" | "alojamientoestandar" | "sinviajes"     |

    @P7TC18
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais     | motivo        | tiempoEstancia       | dondeReside | dondeAloja    | viajesActividad          |
      | "si"             | "egipto" | "desconocido" | "estanciapermanente" | "pueblo"    | "desconocido" | "viajesdistintoslugares" |

    @P7TC19
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais       | motivo        | tiempoEstancia | dondeReside   | dondeAloja         | viajesActividad    |
      | "si"             | "pakistan" | "desconocido" | "desconocido"  | "desconocido" | "residenciadelujo" | "viajesmaslugares" |

    @P7TC20
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais       | motivo        | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "pakistan" | "profesional" | "10diasanio"   | ""          | ""         | ""              |

    @P7TC21
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais       | motivo        | tiempoEstancia | dondeReside | dondeAloja          | viajesActividad |
      | "si"             | "pakistan" | "profesional" | "10a30dias"    | "ciudad"    | "alojamientobasico" | "desconocido"   |

    @P7TC22
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais        | motivo        | tiempoEstancia | dondeReside     | dondeAloja            | viajesActividad |
      | "si"             | "venezuela" | "profesional" | "31a12meses"   | "ciudadcapital" | "alojamientoestandar" | "sinviajes"     |

    @P7TC23
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais        | motivo        | tiempoEstancia       | dondeReside | dondeAloja    | viajesActividad          |
      | "si"             | "venezuela" | "profesional" | "estanciapermanente" | "pueblo"    | "desconocido" | "viajesdistintoslugares" |

    @P7TC24
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais        | motivo        | tiempoEstancia | dondeReside   | dondeAloja         | viajesActividad    |
      | "si"             | "venezuela" | "profesional" | "desconocido"  | "desconocido" | "residenciadelujo" | "viajesmaslugares" |

    @P7TC25
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais        | motivo        | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "venezuela" | "soloprivado" | "10diasanio"   | ""          | ""         | ""              |

    @P7TC26
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais   | motivo        | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "peru" | "soloprivado" | "10a30dias"    | ""          | ""         | ""              |

    @P7TC27
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais   | motivo        | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "peru" | "soloprivado" | "31a12meses"   | ""          | ""         | ""              |

    @P7TC28
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais   | motivo        | tiempoEstancia       | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "peru" | "soloprivado" | "estanciapermanente" | ""          | ""         | ""              |

    @P7TC29
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais   | motivo        | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "si"             | "peru" | "soloprivado" | "desconocido"  | ""          | ""         | ""              |

    @P7NO
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero | pais | motivo | tiempoEstancia | dondeReside | dondeAloja | viajesActividad |
      | "no"             | ""   | ""     | ""             | ""          | ""         | ""              |

  @P8
  Scenario Outline: ingreso estatura en centimetros pregunta ocho
    When Ingreso estatura en centimetros pOcho<estatura>

    @P8NO
    Examples: Ingreso 160 centimetros
      | estatura |
      | "160"    |

  @P9
  Scenario Outline: Ingreso peso en kilogramos pregunta nueve
    When Ingreso peso en kilogramos pNueve<peso>

    @P9NO
    Examples: 
      | peso |
      | "60" |

  @P10
  Scenario Outline: Ingreso consumo de bebidas alcoholicas pregunta diez
    When Ingreso consumo de bebidas alcoholicas pDiez<bebidasAlcoholicas><tipo><frecuencia>

    @P10TC15
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "cerveza" | "10"       |

    @P10TC16
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "cerveza" | "25"       |

    @P10TC17
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "cerveza" | "45"       |

    @P10TC18
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "cerveza" | "55"       |

    @P10TC19
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "champan" | "10"       |

    @P10TC20
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "champan" | "25"       |

    @P10TC21
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "champan" | "45"       |

    @P10TC22
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "champan" | "55"       |

    @P10TC23
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "licores" | "10"       |

    @P10TC24
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "licores" | "25"       |

    @P10TC25
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "licores" | "45"       |

    @P10TC26
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "licores" | "55"       |

    @P10TC27
    Examples: 
      | bebidasAlcoholicas | tipo    | frecuencia |
      | "si"               | "otros" | "10"       |

    @P10TC28
    Examples: 
      | bebidasAlcoholicas | tipo    | frecuencia |
      | "si"               | "otros" | "25"       |

    @P10TC29
    Examples: 
      | bebidasAlcoholicas | tipo    | frecuencia |
      | "si"               | "otros" | "45"       |

    @P10TC30
    Examples: 
      | bebidasAlcoholicas | tipo    | frecuencia |
      | "si"               | "otros" | "55"       |

    @P10TC31
    Examples: 
      | bebidasAlcoholicas | tipo   | frecuencia |
      | "si"               | "vino" | "10"       |

    @P10TC32
    Examples: 
      | bebidasAlcoholicas | tipo   | frecuencia |
      | "si"               | "vino" | "25"       |

    @P10TC33
    Examples: 
      | bebidasAlcoholicas | tipo   | frecuencia |
      | "si"               | "vino" | "45"       |

    @P10TC34
    Examples: 
      | bebidasAlcoholicas | tipo   | frecuencia |
      | "si"               | "vino" | "55"       |

    @P10TC35
    Examples: 
      | bebidasAlcoholicas | tipo      | frecuencia |
      | "si"               | "cerveza" | "10"       |
      | "si"               | "licores" | "25"       |
      | "si"               | "vino"    | "10"       |

    @P10NO
    Examples: 
      | bebidasAlcoholicas | tipo | frecuencia |
      | "no"               | ""   | ""         |

  @P11
  Scenario Outline: Ingreso si es fumador en los ultimos doce meses pregunta once
    When Ingreso fumador en los ultimos doce meses pOnce<fumador><queFuma><fecuenciaFuma>

    @P11TC15
    Examples: Ingreso no fumador
      | fumador | queFuma       | fecuenciaFuma |
      | "si"    | "cigarrillos" | "5"           |

    @P11TC16
    Examples: Ingreso no fumador
      | fumador | queFuma       | fecuenciaFuma |
      | "si"    | "cigarrillos" | "15"          |

    @P11TC17
    Examples: Ingreso no fumador
      | fumador | queFuma       | fecuenciaFuma |
      | "si"    | "cigarrillos" | "25"          |

    @P11TC18
    Examples: Ingreso no fumador
      | fumador | queFuma       | fecuenciaFuma |
      | "si"    | "cigarrillos" | "45"          |

    @P11TC19
    Examples: Ingreso no fumador
      | fumador | queFuma    | fecuenciaFuma |
      | "si"    | "cigarros" | "5"           |

    @P11TC20
    Examples: Ingreso no fumador
      | fumador | queFuma    | fecuenciaFuma |
      | "si"    | "cigarros" | "15"          |

    @P11TC21
    Examples: Ingreso no fumador
      | fumador | queFuma    | fecuenciaFuma |
      | "si"    | "cigarros" | "25"          |

    @P11TC22
    Examples: Ingreso no fumador
      | fumador | queFuma    | fecuenciaFuma |
      | "si"    | "cigarros" | "45"          |

    @P11TC23
    Examples: Ingreso no fumador
      | fumador | queFuma | fecuenciaFuma |
      | "si"    | "pipas" | "5"           |

    @P11TC24
    Examples: Ingreso no fumador
      | fumador | queFuma | fecuenciaFuma |
      | "si"    | "pipas" | "15"          |

    @P11TC25
    Examples: Ingreso no fumador
      | fumador | queFuma | fecuenciaFuma |
      | "si"    | "pipas" | "25"          |

    @P11TC26
    Examples: Ingreso no fumador
      | fumador | queFuma | fecuenciaFuma |
      | "si"    | "pipas" | "45"          |

    @P11TC27
    Examples: Ingreso no fumador
      | fumador | queFuma       | fecuenciaFuma |
      | "si"    | "cigarrillos" | "25"          |
      | "si"    | "cigarros"    | "5"           |

    @P11NO
    Examples: Ingreso no fumador
      | fumador | queFuma | fecuenciaFuma |
      | "no"    | ""      | ""            |

  @P12
  Scenario Outline: Ingresar consumo de drogas pregunta doce
    When Ingreso consumo de drogas pDoce<drogas><alucinogenos><anfetaminas><cocaina><heroina><marihuanaFrecuente><marihuanaOcacional>

    @P12TC15
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | "si"         | ""          | ""      | ""      | ""                 | ""                 |

    @P12TC16
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | ""           | "si"        | ""      | ""      | ""                 | ""                 |

    @P12TC17
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | ""           | ""          | "si"    | ""      | ""                 | ""                 |

    @P12TC18
    Examples: Ingreso si a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | ""           | ""          | ""      | "si"    | ""                 | ""                 |

    @P12TC19
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | ""           | ""          | ""      | ""      | "si"               | ""                 |

    @P12TC20
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | ""           | ""          | ""      | ""      | ""                 | "si"               |

    @P12TC21
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "si"   | "si"         | ""          | "si"    | ""      | "si"               | ""                 |

    @P12NO
    Examples: Ingreso no a consumo de drogas
      | drogas | alucinogenos | anfetaminas | cocaina | heroina | marihuanaFrecuente | marihuanaOcacional |
      | "no"   | ""           | ""          | ""      | ""      | ""                 | ""                 |

  @P13
  Scenario Outline: Ingresar embarazo
    When Ingreso embarazo pTrece<embarazada><complicaciones><nombreComplicacion><fechaDesde><fechaHasta><secuelas><especifiqueSecuelas>

    @P13TC36
    Examples: Ingreso SI a embarazo
      | embarazada | complicaciones | nombreComplicacion | fechaDesde   | fechaHasta   | secuelas | especifiqueSecuelas  |
      | "si"       | "si"           | "preclampsia"      | "01-01-2019" | "01-03-2019" | "si"     | "secuelas multiples" |

    @P13NO
    Examples: Ingreso NO a embarazo
      | embarazada | complicaciones | nombreComplicacion | fechaDesde | fechaHasta | secuelas | especifiqueSecuelas |
      | "no"       | ""             | ""                 | ""         | ""         | ""       | ""                  |

  @P14
  Scenario Outline: Ingresar prueba de VIH en los últimos doce meses
    When Ingreso prueba de VIH en los ultimos doce meses pCatorce<pruebaVIH><resultadoVIH>


    @P14TC37
    Examples: Ingreso no a prueba de VIH
      | pruebaVIH | resultadoVIH |
      | "si"      | "no"         |

    @P14NO
    Examples: Ingreso no a prueba de VIH
      | pruebaVIH | resultadoVIH |
      | "no"      | "no"         |

	@P34
	Scenario Outline: Ingreso a padecido enfermedad congenita pveinticuatro
		When Ingreso a padecido enfermedad congenita pveinticuatro<enfermedadCongenita><trastorno>
	
	@P34NO
    Examples: Ingreso no a enfemedad congenita
      | enfermedadCongenita | trastorno            |
      | "no"                | "sindrome de marfan" |

  @P15
  Scenario Outline: Ingresar pension de invalidez vigente
    When Ingreso pension de invalidez pQuince<pensionInvalidez><motivoPension>

    @P15TC38
    Examples: 
      | pensionInvalidez | motivoPension       |
      | "si"             | "motivo pensionado" |

    @P15NO
    Examples: 
      | pensionInvalidez | motivoPension |
      | "no"             | ""            |

      
  @P16
  Scenario Outline: Ingresar accidentes
    When Ingreso si ha sido victima de algun accidente pDiesiseis<accidente><complicacionesAcc><especifiqueComplicacionesAcc><fechaDesdeAcc><fechaHastaAcc><trastornoVariasVeces><secuelasAcc><especifiqueSecuelasAcc>

    @P16TC39
    Examples: Ingreso NO ha sido victima de algun accidente
      | accidente | complicacionesAcc | especifiqueComplicacionesAcc | fechaDesdeAcc | fechaHastaAcc | trastornoVariasVeces | secuelasAcc | especifiqueSecuelasAcc |
      | "si"      | "si"              | "intoxicacion alimenticia"   | "01-01-2017"  | "01-01-2019"  | "si"                 | "no"        | ""                     |

    @P16TC40
    Examples: Ingreso NO ha sido victima de algun accidente
      | accidente | complicacionesAcc | especifiqueComplicacionesAcc | fechaDesdeAcc | fechaHastaAcc | trastornoVariasVeces | secuelasAcc | especifiqueSecuelasAcc |
      | "si"      | "si"              | "intoxicacion alimenticia"   | "01-01-2017"  | "01-01-2019"  | "no"                 | "si"        | "secuelas varias"      |

    @P16NO
    Examples: Ingreso NO ha sido victima de algun accidente
      | accidente | complicacionesAcc | especifiqueComplicacionesAcc | fechaDesdeAcc | fechaHastaAcc | trastornoVariasVeces | secuelasAcc | especifiqueSecuelasAcc |
      | "no"      | ""                | ""                           | ""            | ""            | ""                   | ""          | ""                     |

  @P17
  Scenario Outline: Ingresar licencia médica
    When Ingreso licencia medica vigente pDiesisiete<licenciaMedicaVigente>
    And Ingreso trastorno sufrido pDiesisiete<trastornoLicencia>
    And Ingreso si ha afectado los riñones pDiesisiete<afectadoRiñones>
    And Ingreso frecuencia en que padece sintomas pDiesisiete<frecuenciaSintomas><sintomasPrimeraVez><sintomasUltimaVez><frecuenciaSintomasAnio><tiempoPromedioSintomas>
    And Ingreso si esta bajo seguimiento medico regular pDiesisiete<seguimientoMedicoRegular>
    And Ingreso metodo de tratamiento pDiesisiete<cirugia><cirugiaPrevista><litotricia><medicacion><otro><ninguno>
    And Ingreso respuestas a distintos metodos de tratamiento<cuandoSometioCirugia><especifiqueCirugia><cuandoSometeraCirugia><tipoCirugia><cuandoLitotricia><queMedicamento><queOtro><cuandoComenzo>
    And Ingreso si se ha realizado examenes de orina pDiesisiete<examenOrina><ultimoExamenOrina><resultadoExamenOrina>
    And Ingreso si estan analizando la sangre<analisisSangre><cuandoAnalisisSangre><detalleResultados>
    And Ingreso si tiene sintomas todavia <sintomasTodavia><espesifiqueSintomasTodavia>
    And Ingreso incapacidad para trabajar<incapacidad><cuantoTiempo>

    @P17TC41
    Examples: Ingreso SI a licencia medica vigente
      | licenciaMedicaVigente | trastornoLicencia | afectadoRiñones  | frecuenciaSintomas | sintomasPrimeraVez | sintomasUltimaVez | frecuenciaSintomasAnio | tiempoPromedioSintomas | seguimientoMedicoRegular | cirugia | cirugiaPrevista | litotricia | medicacion | otro | ninguno | cuandoSometioCirugia | especifiqueCirugia | cuandoSometeraCirugia | tipoCirugia | cuandoLitotricia | queMedicamento          | queOtro | cuandoComenzo | examenOrina | ultimoExamenOrina | resultadoExamenOrina | analisisSangre | cuandoAnalisisSangre | detalleResultados   | sintomasTodavia | espesifiqueSintomasTodavia | incapacidad | cuantoTiempo           |
      | "si"                  | "pielonefritis"   | "bilateralmente" | "constantemente"   | "01-01-2018"       | "01-06-2019"      | ""                     | ""                     | "si"                     | "si"    | ""              | ""         | "si"       | ""   | ""      | "01-01-2019"         | "cirugia prueba"   | ""                    | ""          | ""               | "medicamento de prueba" | ""      | ""            | "si"        | "15-05-2019"      | "resultado positivo" | "si"           | "20-04-2019"         | "resultados prueba" | "si"            | "sintomas todavia prueba"  | "si"        | "cuanto tiempo prueba" |

    @P17TC42
    Examples: Ingreso SI a licencia medica vigente
      | licenciaMedicaVigente | trastornoLicencia | afectadoRiñones | frecuenciaSintomas | sintomasPrimeraVez | sintomasUltimaVez | frecuenciaSintomasAnio | tiempoPromedioSintomas | seguimientoMedicoRegular | cirugia | cirugiaPrevista | litotricia | medicacion | otro | ninguno | cuandoSometioCirugia | especifiqueCirugia | cuandoSometeraCirugia | tipoCirugia           | cuandoLitotricia | queMedicamento | queOtro | cuandoComenzo | examenOrina | ultimoExamenOrina | resultadoExamenOrina | analisisSangre | cuandoAnalisisSangre | detalleResultados | sintomasTodavia | espesifiqueSintomasTodavia | incapacidad | cuantoTiempo |
      | "si"                  | "pielonefritis"   | "ninguna"       | "repetidasveces"   | "01-01-2018"       | "01-06-2019"      | "100"                  | "2"                    | "no"                     | ""      | "si"            | ""         | ""         | ""   | ""      | ""                   | ""                 | "01-01-2019"          | "tipo cirugia prueba" | ""               | ""             | ""      | ""            | "no"        | ""                | ""                   | "no"           | ""                   | ""                | "no"            | ""                         | "no"        | ""           |

    @P17TC43
    Examples: Ingreso SI a licencia medica vigente
      | licenciaMedicaVigente | trastornoLicencia | afectadoRiñones | frecuenciaSintomas | sintomasPrimeraVez | sintomasUltimaVez | frecuenciaSintomasAnio | tiempoPromedioSintomas | seguimientoMedicoRegular | cirugia | cirugiaPrevista | litotricia | medicacion | otro | ninguno | cuandoSometioCirugia | especifiqueCirugia | cuandoSometeraCirugia | tipoCirugia | cuandoLitotricia | queMedicamento | queOtro           | cuandoComenzo | examenOrina | ultimoExamenOrina | resultadoExamenOrina | analisisSangre | cuandoAnalisisSangre | detalleResultados | sintomasTodavia | espesifiqueSintomasTodavia | incapacidad | cuantoTiempo |
      | "si"                  | "pielonefritis"   | "unilateral"    | "unavez"           | ""                 | "01-06-2019"      | ""                     | "2"                    | "no"                     | ""      | ""              | ""         | ""         | "si" | ""      | ""                   | ""                 | ""                    | ""          | ""               | ""             | "que otro prueba" | "01-01-2019"  | "no"        | ""                | ""                   | "no"           | ""                   | ""                | "no"            | ""                         | "no"        | ""           |

    @P17NO
    Examples: Ingreso NO a licencia medica vigente
      | licenciaMedicaVigente | trastornoLicencia | afectadoRiñones | frecuenciaSintomas | sintomasPrimeraVez | sintomasUltimaVez | frecuenciaSintomasAnio | tiempoPromedioSintomas | seguimientoMedicoRegular | cirugia | cirugiaPrevista | litotricia | medicacion | otro | ninguno | cuandoSometioCirugia | especifiqueCirugia | cuandoSometeraCirugia | tipoCirugia | cuandoLitotricia | queMedicamento | queOtro | cuandoComenzo | examenOrina | ultimoExamenOrina | resultadoExamenOrina | analisisSangre | cuandoAnalisisSangre | detalleResultados | sintomasTodavia | espesifiqueSintomasTodavia | incapacidad | cuantoTiempo |
      | "no"                  | ""                | ""              | ""                 | ""                 | ""                | ""                     | ""                     | ""                       | ""      | ""              | ""         | ""         | ""   | ""      | ""                   | ""                 | ""                    | ""          | ""               | ""             | ""      | ""            | ""          | ""                | ""                   | ""             | ""                   | ""                | ""              | ""                         | ""          | ""           |

  @P18
  Scenario Outline: Ingreso si ha permanecido ingresado en un centro hospitalario
    When Ingreso ha ingresado a un centro hospitalario pDiesiocho<ingresoHospitalario><trastorno><cuando><sintomasAun><especifiqueSintoma><tratamientoMedico><fechaInicioTratamiento><fechaTermino><sinFechaTermino><operado><frecuenciaOperado><especifiqueOperado><fechaOperacionUno><fechaOperacionDos><fechaOperacionTres><cirugiaPlaneada><fechaCirugiaPlaneada><tipoCirugiaPlaneada><incapacidad><fechaDiscapacidad><promedioIncapacitado><cambioProfesion><ocupacion><ocupacionRecomendada>

	  @P18TC44
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario | trastorno                | cuando       | sintomasAun | especifiqueSintoma | tratamientoMedico | fechaInicioTratamiento | fechaTermino | sinFechaTermino | operado | frecuenciaOperado | especifiqueOperado | fechaOperacionUno | fechaOperacionDos | fechaOperacionTres | cirugiaPlaneada | fechaCirugiaPlaneada | tipoCirugiaPlaneada | incapacidad | fechaDiscapacidad | promedioIncapacitado | cambioProfesion | ocupacion | ocupacionRecomendada |
      | "si"                | "quemadura de la muñeca" | "01-01-2018" | "no"        | ""                 | ""                | ""                     | ""           | ""              | "no"    | ""                | ""                 | ""                | ""                | ""                 | "no"            | ""                   | ""                  | ""          | ""                | ""                   | ""              | ""        | ""                   |
	
 		@P18TC45
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario | trastorno                | cuando       | sintomasAun | especifiqueSintoma | tratamientoMedico | fechaInicioTratamiento | fechaTermino | sinFechaTermino | operado | frecuenciaOperado | especifiqueOperado | fechaOperacionUno | fechaOperacionDos | fechaOperacionTres | cirugiaPlaneada | fechaCirugiaPlaneada | tipoCirugiaPlaneada | incapacidad | fechaDiscapacidad | promedioIncapacitado | cambioProfesion | ocupacion | ocupacionRecomendada |
      | "si"                | "quemadura de la muñeca" | "01-01-2018" | "si"        | "sintomas"         | "no"              | ""                     | ""           | ""              | "no"    | ""                | ""                 | ""                | ""                | ""                 | "no"            | ""                   | ""                  | "no"        | ""                | ""                   | ""              | ""        | ""                   |

		@P18TC46
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario | trastorno                | cuando       | sintomasAun | especifiqueSintoma | tratamientoMedico | fechaInicioTratamiento | fechaTermino | sinFechaTermino | operado | frecuenciaOperado | especifiqueOperado | fechaOperacionUno | fechaOperacionDos | fechaOperacionTres | cirugiaPlaneada | fechaCirugiaPlaneada | tipoCirugiaPlaneada | incapacidad | fechaDiscapacidad | promedioIncapacitado | cambioProfesion | ocupacion | ocupacionRecomendada |
      | "si"                | "quemadura de la muñeca" | "01-01-2018" | "si"        | "sintomas"         | "si"              | "15-01-2019"           | ""           | ""              | "no"    | ""                | ""                 | ""                | ""                | ""                 | "si"            | "01-03-2019"         | "varias"            | "no"        | ""                | ""                   | ""              | ""        | ""                   |
	
		@P18TC47
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario | trastorno                | cuando       | sintomasAun | especifiqueSintoma | tratamientoMedico | fechaInicioTratamiento | fechaTermino | sinFechaTermino | operado | frecuenciaOperado | especifiqueOperado | fechaOperacionUno | fechaOperacionDos | fechaOperacionTres | cirugiaPlaneada | fechaCirugiaPlaneada | tipoCirugiaPlaneada | incapacidad | fechaDiscapacidad | promedioIncapacitado | cambioProfesion | ocupacion | ocupacionRecomendada |
      | "si"                | "quemadura de la muñeca" | "01-01-2018" | "si"        | "sintomas"         | "si"              | "15-01-2019"           | "01-02-2019" | ""              | "si"    | "repetidasveces"  | "espe. cirugia"    | "01-01-2019"      | ""                | ""                 | "no"            | ""                   | ""                  | "si"        | "01-03-2018"      | "10"                 | "no"            | ""        | ""                   |
	
		@P18TC48
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario | trastorno                | cuando       | sintomasAun | especifiqueSintoma | tratamientoMedico | fechaInicioTratamiento | fechaTermino | sinFechaTermino | operado | frecuenciaOperado | especifiqueOperado | fechaOperacionUno | fechaOperacionDos | fechaOperacionTres | cirugiaPlaneada | fechaCirugiaPlaneada | tipoCirugiaPlaneada | incapacidad | fechaDiscapacidad | promedioIncapacitado | cambioProfesion | ocupacion   | ocupacionRecomendada |
      | "si"                | "quemadura de la muñeca" | "01-01-2018" | "si"        | "sintomas"         | "si"              | "15-01-2019"           | "01-02-2019" | ""              | "si"    | "repetidasveces"  | "espe. cirugia"    | "01-01-2019"      | ""                | ""                 | "no"            | ""                   | ""                  | "si"        | "01-03-2018"      | "10"                 | "si"            | "ocupacion" | "ocu. recomendada"   |
	
    @P18NO
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario | trastorno | cuando | sintomasAun | especifiqueSintoma | tratamientoMedico | fechaInicioTratamiento | fechaTermino | sinFechaTermino | operado | frecuenciaOperado | especifiqueOperado | fechaOperacionUno | fechaOperacionDos | fechaOperacionTres | cirugiaPlaneada | fechaCirugiaPlaneada | tipoCirugiaPlaneada | incapacidad | fechaDiscapacidad | promedioIncapacitado | cambioProfesion | ocupacion | ocupacionRecomendada |
      | "no"                | ""        | ""     | ""          | ""                 | ""                | ""                     | ""           | ""              | ""      | ""                | ""                 | ""                | ""                | ""                 | ""              | ""                   | ""                  | ""          | ""                | ""                   | ""              | ""        | ""                   |

  @P19
  Scenario Outline: Se encuentra actualmente en observacion de examenes
    When Ingreso actualmente se encuentra en observaciones pDiesinueve<encuentraObservacion><trastorno><anemiaFerropenica><fechaFerropenica><anemiaSangre><aplasica><celulasFalciformes><hemolitica><hemorragica><perniciosa><otro><causaTrastorno><fechaSintomas><tipoTratamiento><especifiqueTratamientos><sintomasAun><fechaLibreSintomas><complicacionAun><tratamientoMedico><inicioTratamientoMedico><terminoTratamientoMedico><sinDiagnosticar>

    @P19TC49
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | encuentraObservacion | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno | fechaSintomas | tipoTratamiento | especifiqueTratamientos | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"                 | "anemia"  | "si"              | "01-01-2019"     | ""           | ""       | ""                 | ""         | ""          | ""         | ""   | " "            | ""            | ""              | ""                      | ""          | ""                 | ""              | ""                | ""                      | ""                       | ""              |

    @P19TC50
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | encuentraObservacion | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno | fechaSintomas | tipoTratamiento | especifiqueTratamientos | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"                 | "anemia"  | ""                | ""               | ""           | "si"     | ""                 | "si"       | ""          | ""         | ""   | ""             | ""            | ""              | ""                      | ""          | ""                 | ""              | ""                | ""                      | ""                       | ""              |

    @P19TC51
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | encuentraObservacion | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno    | fechaSintomas | tipoTratamiento           | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"                 | "anemia"  | ""                | ""               | ""           | ""       | ""                 | ""         | ""          | ""         | "si" | "causa trastorno" | "01-02-2018"  | "tipo tratamiento prueba" | "especifico tratamientos" | "no"        | "15-01-2019"       | ""              | "no"              | ""                      | ""                       | ""              |

    @P19TC52
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | encuentraObservacion | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno | fechaSintomas | tipoTratamiento | especifiqueTratamientos | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"                 | "anemia"  | ""                | ""               | ""           | ""       | ""                 | ""         | ""          | ""         | ""   | ""             | ""            | ""              | ""                      | ""          | ""                 | ""              | ""                | ""                      | ""                       | "si"            |

    @P19NO
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | encuentraObservacion | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno | fechaSintomas | tipoTratamiento | especifiqueTratamientos | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "no"                 | ""        | ""                | ""               | ""           | ""       | ""                 | ""         | ""          | ""         | ""   | ""             | ""            | ""              | ""                      | ""          | ""                 | ""              | ""                | ""                      | ""                       | ""              |

  @P20
  Scenario Outline: Le han prescrito durante cierto tiempo algun tratamiento medico
    When Ingreso le han recetado tratamiento medico pVeinte<tratamientoMedico><tratorno><fechaPrimeraVez><sintomasAun><queSintomasActuales><fechaLibreSintomas><promedioTieneSintomas><frecuencia><sintomasUltimaVez><SintomasAnio><promedioSintomas><revisionesMedico><cirugia><cuandoSometioCirugia><especifiqueCirugia><cirugiaPrevista><cuandoSometeraCirugia><tipoCirugia><medicacion><medicacionTomando><otro><otroTratamiento><fechaTratamiento><sinTratamiento><continuidadLaboral><fechaBaja>
    And Doy click en boton siguiente

    @P20TC53
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | fechaLibreSintomas | promedioTieneSintomas | frecuencia        | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "no"        | ""                  | "01-03-2019"       | "7"                   | "permanentemente" | ""                | "2"          | ""               | "no"             | "si"    | "01-02-2018"         | "cirugias varias"  | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | ""             | "no"               | ""        |

    @P20TC54
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | fechaLibreSintomas | promedioTieneSintomas | frecuencia        | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia    | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "si"        | "sintomas actuales" | ""                 | ""                    | "recurrentemente" | "01-02-2019"      | "2"          | "2"              | "no"             | ""      | ""                   | ""                 | "si"            | "01-03-2019"          | "tipo cirugia" | ""         | ""                | ""   | ""              | ""               | ""             | "no"               | ""        |

    @P20TC55
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | fechaLibreSintomas | promedioTieneSintomas | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando  | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "no"        | ""                  | "01-03-2019"       | "7"                   | "unavez"   | ""                | ""           | ""               | "no"             | ""      | ""                   | ""                 | ""              | ""                    | ""          | "si"       | "otra medicamento" | ""   | ""              | ""               | ""             | "no"               | ""        |

    @P20TC56
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | fechaLibreSintomas | promedioTieneSintomas | frecuencia        | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento    | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "si"        | "sintomas actuales" | ""                 | ""                    | "permanentemente" | "01-02-2019"      | ""           | ""               | "no"             | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | "si" | "otro tratamiento" | "01-03-2019"     | ""             | "no"               | ""        |

    @P20TC57
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | fechaLibreSintomas | promedioTieneSintomas | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja             |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "no"        | ""                  | "01-03-2019"       | "41"                  | "unavez"   | ""                | ""           | ""               | "si"             | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | "si"           | "si"               | "inactividad laboral" |

    @P20NO
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno | fechaPrimeraVez | sintomasAun | queSintomasActuales | fechaLibreSintomas | promedioTieneSintomas | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "no"              | ""       | ""              | ""          | ""                  | ""                 | ""                    | ""         | ""                | ""           | ""               | ""               | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | ""             | ""                 | ""        |

      @P21
  Scenario Outline: Ha sido tratado por algun psicologo
    When Ingreso ha sido tratado por algun psicologo pVeintiuno<tratadoPsicologo><trastorno>

    @P21TC58
    Examples: Ingreso NO ha sido tratado por algun psicologo
      | tratadoPsicologo | trastorno              |
      | "si"             | "hemorragia postparto" |

    @P21NO
    Examples: Ingreso NO ha sido tratado por algun psicologo
      | tratadoPsicologo | trastorno |
      | "no"             | ""        |

  @P22
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato respiratorio
    When Ingreso ha padecido enfermedad respiratoria pVeintidos<enfermedadRespiratoria><trastorno><frecuenciaTrastorno><ultimosSintomas><frecuenciaSintomas><sintomasPrimeraVez><sintomasPromedio><molestiaAlergia><detalleAlergia><tratamientoMedico><cirugia><cuandoCirugia><especifiqueCirugia><cirugiaPrevista><cuandoSometeraCirugia><cirugiaRealizar><medicacion><queMedicacion><terapiaOxigeno><cuandoInicioTerapia><otro><queOtro><cuandoComenzo><ninguno><pruebasPulmonar><quePruebas><sintomasAun><especifiqueSintomasAun><incapacidadLaboral><tiempoIncapacidad>

    @P22TC59
    Examples: Ingreso no a enfermedades respiratorias
      | enfermedadRespiratoria | trastorno    | frecuenciaTrastorno | ultimosSintomas | frecuenciaSintomas | sintomasPrimeraVez | sintomasPromedio | molestiaAlergia | detalleAlergia | tratamientoMedico | cirugia | cuandoCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | cirugiaRealizar | medicacion | queMedicacion | terapiaOxigeno | cuandoInicioTerapia | otro | queOtro | cuandoComenzo | ninguno | pruebasPulmonar | quePruebas                 | sintomasAun | especifiqueSintomasAun | incapacidadLaboral | tiempoIncapacidad |
      | "si"                   | "bronquitis" | "2"                 | "01-01-2019"    | "constantemente"   | "01-02-2019"       | ""               | "no"            | ""             | "no"              | "si"    | "15-02-2019"  | "cirugia prueba"   | ""              | ""                    | ""              | ""         | ""            | ""             | ""                  | ""   | ""      | ""            | ""      | "si"            | "pruebas funcion pulmonar" | "no"        | ""                     | "no"               | ""                |

    @P22TC60
    Examples: Ingreso no a enfermedades respiratorias
      | enfermedadRespiratoria | trastorno    | frecuenciaTrastorno | ultimosSintomas | frecuenciaSintomas | sintomasPrimeraVez | sintomasPromedio | molestiaAlergia | detalleAlergia    | tratamientoMedico | cirugia | cuandoCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | cirugiaRealizar      | medicacion | queMedicacion | terapiaOxigeno | cuandoInicioTerapia | otro | queOtro | cuandoComenzo | ninguno | pruebasPulmonar | quePruebas | sintomasAun | especifiqueSintomasAun | incapacidadLaboral | tiempoIncapacidad |
      | "si"                   | "bronquitis" | "2"                 | "01-01-2019"    | "repetidasveces"   | "01-02-2019"       | "2"              | "si"            | "detalle alergia" | "no"              | ""      | ""            | ""                 | "si"            | "01-02-2019"          | "cirugia a realizar" | ""         | ""            | "si"           | "01-03-2019"        | ""   | ""      | ""            | ""      | "no"            | ""         | "si"        | "sintomas varios"      | "no"               | ""                |

    @P22TC61
    Examples: Ingreso no a enfermedades respiratorias
      | enfermedadRespiratoria | trastorno    | frecuenciaTrastorno | ultimosSintomas | frecuenciaSintomas | sintomasPrimeraVez | sintomasPromedio | molestiaAlergia | detalleAlergia | tratamientoMedico | cirugia | cuandoCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | cirugiaRealizar | medicacion | queMedicacion | terapiaOxigeno | cuandoInicioTerapia | otro | queOtro    | cuandoComenzo | ninguno | pruebasPulmonar | quePruebas | sintomasAun | especifiqueSintomasAun | incapacidadLaboral | tiempoIncapacidad |
      | "si"                   | "bronquitis" | "2"                 | "01-01-2019"    | "unavez"           | ""                 | "2"              | "no"            | ""             | "si"              | ""      | ""            | ""                 | ""              | ""                    | ""              | "si"       | "medicacion"  | ""             | ""                  | "si" | "que Otro" | "01-03-2019"  | ""      | "no"            | ""         | "no"        | ""                     | "si"               | "2"               |

    @P22NO
    Examples: Ingreso no a enfermedades respiratorias
      | enfermedadRespiratoria | trastorno | frecuenciaTrastorno | ultimosSintomas | frecuenciaSintomas | sintomasPrimeraVez | sintomasPromedio | molestiaAlergia | detalleAlergia | tratamientoMedico | cirugia | cuandoCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | cirugiaRealizar | medicacion | queMedicacion | terapiaOxigeno | cuandoInicioTerapia | otro | queOtro | cuandoComenzo | ninguno | pruebasPulmonar | quePruebas | sintomasAun | especifiqueSintomasAun | incapacidadLaboral | tiempoIncapacidad |
      | "no"                   | ""        | ""                  | ""              | ""                 | ""                 | ""               | ""              | ""             | ""                | ""      | ""            | ""                 | ""              | ""                    | ""              | ""         | ""            | ""             | ""                  | ""   | ""      | ""            | ""      | ""              | ""         | ""          | ""                     | ""                 | ""                |

  @P23
  Scenario Outline: Padece o ha padecido alguna enfermedad de la sangre
    When Ingreso enfermedad de sangre pVeintitres<enfermedadSangre><trastorno><anemiaFerropenica><fechaFerropenica><anemiaSangre><aplasica><celulasFalciformes><hemolitica><hemorragica><perniciosa><otro><causaTrastorno><fechaSintomas><tipoTratamiento><especifiqueTratamientos><sintomasAun><fechaLibreSintomas><complicacionAun><tratamientoMedico><inicioTratamientoMedico><terminoTratamientoMedico><sinDiagnosticar>

    @P23TC62
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno | fechaSintomas | tipoTratamiento | especifiqueTratamientos | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | "si"              | "01-01-2019"     | ""           | ""       | ""                 | ""         | ""          | ""         | ""   | " "            | ""            | ""              | ""                      | ""          | ""                 | ""              | ""                | ""                      | ""                       | ""              |

    @P23TC63
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno    | fechaSintomas | tipoTratamiento      | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | ""                | ""               | ""           | ""       | ""                 | ""         | ""          | ""         | "si" | "causa trastorno" | "01-01-2019"  | "tratamiento varios" | "tratamiento especifique" | "no"        | "01-2-2019"        | ""              | "no"              | ""                      | ""                       | ""              |

    @P23TC64
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno    | fechaSintomas | tipoTratamiento      | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | ""                | ""               | ""           | "si"     | ""                 | ""         | ""          | ""         | "si" | "causa trastorno" | "01-01-2019"  | "tratamiento varios" | "tratamiento especifique" | "si"        | ""                 | "complicacion"  | "no"              | ""                      | ""                       | ""              |

    @P23TC65
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno    | fechaSintomas | tipoTratamiento      | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | ""                | ""               | ""           | ""       | ""                 | ""         | "si"        | ""         | "si" | "causa trastorno" | "01-01-2019"  | "tratamiento varios" | "tratamiento especifique" | "si"        | ""                 | "complicacion"  | "si"              | "01-02-2019"            | "15-02-2019"             | ""              |

    @P23NO
    Examples: Ingreso NO a enfermedades de la sangre
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno | fechaSintomas | tipoTratamiento | especifiqueTratamientos | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "no"             | ""        | ""                | ""               | ""           | ""       | ""                 | ""         | ""          | ""         | ""   | " "            | ""            | ""              | ""                      | ""          | ""                 | ""              | ""                | ""                      | ""                       | ""              |

  @P24
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato circulatorio
    When Ingreso enfermedad del aparato circulatorio pVeinticuatro<enfermedadCirculatorio><trastorno>

    @P24TC66
    Examples: Ingreso si a enfermedades del aparato circulatorio
      | enfermedadCirculatorio | trastorno          |
      | "si"                   | "soplo diastolico" |

    @P24NO
    Examples: Ingreso no a enfermedades del aparato circulatorio
      | enfermedadCirculatorio | trastorno |
      | "no"                   | ""        |

  @P25
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato digestivo
    When Ingreso enfermedad del aparato digestivo pVeinticinco<enfermedadDigestiva><trastorno>

    @P25TC67
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva | trastorno   |
      | "si"                | "hepatitis" |
      
    @P25TC68
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva | trastorno   |
      | "si"                | "hepatitis" |
      
    @P25TC69
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva | trastorno   |
      | "si"                | "hepatitis" |
      
    @P25NO
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva | trastorno |
      | "no"                | ""        |

  @P26
  Scenario Outline: Padece o ha padecido tumores
    When Ingreso ha padecido tumores o cancer pVeintiSeis<cancer><trastorno><fechaDiagnosticacion><cirugia><quimioterapia><radioterapia><otros><recurrenciaTumor><extirpadoTotalmente><otroTratamiento>

    @P26TC70
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento   |
      | "si"   | "cancer mamario" | "01-01-2019"         | "si"    | ""            | ""           | ""    | "no"             | "si"                | "otro tatamiento" |

    @P26TC71
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "si"   | "cancer mamario" | "01-01-2019"         | ""      | "si"          | ""           | ""    | "no"             | "no"                | ""              |

    @P26TC72
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "si"   | "cancer mamario" | "01-01-2019"         | ""      | ""            | "si"         | ""    | "no"             | "no"                | ""              |

    @P26TC73
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento    |
      | "si"   | "cancer mamario" | "01-01-2019"         | ""      | ""            | ""           | "si"  | "no"             | "no"                | "otro Tratamiento" |

    @P26NO
    Examples: Ingreso No a tumores o cancer
      | cancer | trastorno | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "no"   | ""        | ""                   | ""      | ""            | ""           | ""    | ""               | ""                  | ""              |

  @P27
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato genitourinario
    When Ingreso ha padecido enfermedad del aparato genitourinario pVeintisiete<enfermedadGenital><trastorno><hospitalizado><variasVeces>

    @P27TC74
    Examples: Ingreso No ha padecido enfermedad del aparato genitourinario
      | enfermedadGenital | trastorno                       | hospitalizado | variasVeces |
      | "si"              | "infeccion del tracto urinario" | "no"          | "no"        |

    @P27TC75
    Examples: Ingreso No ha padecido enfermedad del aparato genitourinario
      | enfermedadGenital | trastorno                       | hospitalizado | variasVeces |
      | "si"              | "infeccion del tracto urinario" | "si"          | "no"        |

    @P27TC76
    Examples: Ingreso No ha padecido enfermedad del aparato genitourinario
      | enfermedadGenital | trastorno                       | hospitalizado | variasVeces |
      | "si"              | "infeccion del tracto urinario" | "si"          | "si"        |

    @P27NO
    Examples: Ingreso No ha padecido enfermedad del aparato genitourinario
      | enfermedadGenital | trastorno | hospitalizado | variasVeces |
      | "no"              | ""        | ""            | ""          |

  @P28
  Scenario Outline: Padece o ha padecido alguna enfermedad del sistema locomotor
    When Ingreso ha padecido enfermedad del aparato locomotor pVeintiocho<enfermedadLocomotor><trastorno>

    @P28TC77
    Examples: Ingreso No ha padecido enfermedad del aparato locomotor
      | enfermedadLocomotor | trastorno                                                        |
      | "si"                | "ciatica y sindrome de dolor en la parte inferior de la espalda" |

    @P28NO
    Examples: Ingreso No ha padecido enfermedad del aparato locomotor
      | enfermedadLocomotor | trastorno |
      | "no"                | ""        |

  @P29
  Scenario Outline: Padece o ha padecido alguna enfermedad endocrina
    When Ingreso ha padecido enfermedad endocrina pVeintinueve<enfermedadEndocrina><trastorno><tipoDiabetes><aunDiabetesGestacional><fechaDiagnostico>

    @P29TC78
    Examples: Ingreso No ha padecido enfermedad endocrina
      | enfermedadEndocrina | trastorno  | tipoDiabetes  | aunDiabetesGestacional | fechaDiagnostico |
      | "si"                | "diabetes" | "gestacional" | "si"                   | "01-01-2019"     |

    @P29TC79
    Examples: Ingreso No ha padecido enfermedad endocrina
      | enfermedadEndocrina | trastorno  | tipoDiabetes  | aunDiabetesGestacional | fechaDiagnostico |
      | "si"                | "diabetes" | "gestacional" | "no"                   | ""               |

    @P29NO
    Examples: Ingreso No ha padecido enfermedad endocrina
      | enfermedadEndocrina | trastorno | tipoDiabetes | aunDiabetesGestacional | fechaDiagnostico |
      | "no"                | ""        | ""           | ""                     | ""               |

  @P30
  Scenario Outline: Padece o ha padecido alguna enfermedad infecciosa o de transmisión sexual como VIH o SIDA
    When Ingreso ha padecido enfermedad infecciosa pTreinta<enfermedadInfecciosa><trastorno>

    @P30TC80
    Examples: Ingreso No ha padecido enfermedad infecciosa
      | enfermedadInfecciosa | trastorno     |
      | "si"                 | "amigdalitis" |

    @P30NO
    Examples: Ingreso No ha padecido enfermedad infecciosa
      | enfermedadInfecciosa | trastorno |
      | "no"                 | ""        |

  @P31
  Scenario Outline: Padece o ha padecido alguna enfermedad de los ojos
    When Ingreso ha padecido enfermedad de los ojos pTreintaiuno<enfermedadOcular><trastorno>

    @P31TC81
    Examples: Ingreso No ha padecido enfermedad de los ojos
      | enfermedadOcular | trastorno |
      | "si"             | "miopia"  |

    @P31NO
    Examples: Ingreso No ha padecido enfermedad de los ojos
      | enfermedadOcular | trastorno |
      | "no"             | ""        |

  @P32
  Scenario Outline: Padece o ha padecido alguna enfermedad del sistema nervioso
    When Ingreso ha padecido enfermedad del sistema nervioso<enfermedadNerviosa><trastorno><doloresUltimaVez><frecuenciaMedicacion><frecuenciaMigranias><horas><nauseas><paralisis><parpadeos><otro><queOtro><ninguno><incapacidadLaboral><tiempoIncapacidad>

    @P32TC82
    Examples: Ingreso No ha padecido enfermedad nerviosa
      | enfermedadNerviosa | trastorno | doloresUltimaVez | frecuenciaMedicacion | frecuenciaMigranias | horas | nauseas | paralisis | parpadeos | otro | queOtro    | ninguno | incapacidadLaboral | tiempoIncapacidad |
      | "si"               | "migraña" | "01-01-2019"     | "permanentemente"    | "diariamente"       | "2"   | ""      | ""        | ""        | "si" | "que otro" | ""      | "no"               | ""                |

    @P32TC83
    Examples: Ingreso No ha padecido enfermedad nerviosa
      | enfermedadNerviosa | trastorno | doloresUltimaVez | frecuenciaMedicacion | frecuenciaMigranias | horas | nauseas | paralisis | parpadeos | otro | queOtro | ninguno | incapacidadLaboral | tiempoIncapacidad |
      | "si"               | "migraña" | "01-01-2019"     | "cuandoesnecesario"  | "raras veces"       | "2"   | "si"    | ""        | "si"      | ""   | ""      | ""      | "si"               | "20"              |

    @P32TC84
    Examples: Ingreso No ha padecido enfermedad nerviosa
      | enfermedadNerviosa | trastorno | doloresUltimaVez | frecuenciaMedicacion | frecuenciaMigranias        | horas | nauseas | paralisis | parpadeos | otro | queOtro | ninguno | incapacidadLaboral | tiempoIncapacidad |
      | "si"               | "migraña" | "01-01-2019"     | "cuandoesnecesario"  | "varias veces a la semana" | "2"   | ""      | ""        | ""        | ""   | ""      | "si"    | "no"               | ""                |

    @P32TC85
    Examples: Ingreso No ha padecido enfermedad nerviosa
      | enfermedadNerviosa | trastorno | doloresUltimaVez | frecuenciaMedicacion | frecuenciaMigranias   | horas | nauseas | paralisis | parpadeos | otro | queOtro | ninguno | incapacidadLaboral | tiempoIncapacidad |
      | "si"               | "migraña" | "01-01-2019"     | "cuandoesnecesario"  | "varias veces al mes" | "2"   | ""      | "si"      | ""        | ""   | ""      | ""      | "no"               | ""                |

    @P32NO
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadNerviosa | trastorno | doloresUltimaVez | frecuenciaMedicacion | frecuenciaMigranias | horas | nauseas | paralisis | parpadeos | otro | queOtro | ninguno | incapacidadLaboral | tiempoIncapacidad |
      | "no"               | ""        | ""               | ""                   | ""                  | ""    | ""      | ""        | ""        | ""   | ""      | ""      | ""                 | ""                |

  @P33
  Scenario Outline: Padece o ha padecido alguna enfermedad de la piel
    When Ingreso ha padecido enfermedad de la piel pTreintaitres<enfermedadPiel><trastorno><esMaligno><seguimiento><FechaDiagnostico><cirugia><quimioterapia><radioterapia><otros><detalleOtro><Recurrencia><extirpado><seguimientoTratamiento><cuandoDiagnostico><algunOtroTratamiento><queOtroTratamiento><estaCurado>

	  @P33TC86
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "no"      | "no"        | "01-01-2019"     | "si"    | ""            | ""           | ""    | ""          | "no"        | "no"      | ""                     | ""                | ""                   | ""                 | ""         |
	
		@P33TC87
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "no"      | "si"        | "01-01-2019"     | ""      | "si"          | ""           | ""    | ""          | "si"        | "no"      | ""                     | ""                | ""                   | ""                 | ""         |
		
		@P33TC88
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "no"      | "si"        | "01-01-2019"     | ""      | ""            | "si"         | ""    | ""          | "no"        | "no"      | ""                     | ""                | ""                   | ""                 | ""         |
	
		@P33TC89
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "no"      | "si"        | "01-01-2019"     | ""      | ""            | ""           | "si"  | "otro deta" | "no"        | "no"      | ""                     | ""                | ""                   | ""                 | ""         |
	
		@P33TC90
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "no"      | "si"        | "01-01-2019"     | "si"    | "si"          | ""           | ""    | ""          | "no"        | "no"      | ""                     | ""                | ""                   | ""                 | ""         |
	
		@P33TC91
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "nose"    | ""          | ""               | ""      | ""            | ""           | ""    | ""          | ""          | ""        | "no"                   | "01-01-2019"      | "no"                 | ""                 | "si"       |
	
		@P33TC92
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno       | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "si"           | "lunar carnoso" | "si"      | ""          | ""               | ""      | ""            | ""           | ""    | ""          | ""          | ""        | ""                     | ""                | ""                   | ""                 | ""         |
	
    @P33NO
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel | trastorno | esMaligno | seguimiento | FechaDiagnostico | cirugia | quimioterapia | radioterapia | otros | detalleOtro | Recurrencia | extirpado | seguimientoTratamiento | cuandoDiagnostico | algunOtroTratamiento | queOtroTratamiento | estaCurado |
      | "no"           | ""        | ""        | ""          | ""               | ""      | ""            | ""           | ""    | ""          | ""          | ""        | ""                     | ""                | ""                   | ""                 | ""         |
      