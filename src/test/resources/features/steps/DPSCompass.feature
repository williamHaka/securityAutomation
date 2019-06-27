Feature: Ingresar respuestas de formulario DPS

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
    When ingreso deportes aventura pCinco<deporteAventura><actividades>
    And Doy click en boton siguiente

    @P5NO
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividades |
      | "no"            | ""          |

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
      | "no"              | ""         | ""       | "2500"        | "01-10-2017"   | "a"                 |

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
    Examples: Ingreso 170 centimetros
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
