@IngresoRespuestasFormularioDPS
Feature: Ingresar respuestas de formulario DPS

  ##actividad: Guardia de seguridad sin arma, Guardia de seguridad con arma, Guardaespaldas, Detective privado, Bombero, Bombero forestal, Bombero en aeropuerto, Minero amianto, Minero mina a cielo abierto, Minero trabajo subterráneo, Minero manejo de explosivos, Minero trabajo en superficies, Pescador de bajura/litoral, Pesca de altura - capitán/patrón, Pesca de altura - oficial
  @P1
  Scenario Outline: Ingresar respuestas de pregusta uno
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
    Examples: ingreso actividad Bombero forestal
      | actividad          |
      | "Bombero forestal" |

    @P1TC8
    Examples: ingreso actividad Bombero en aeropuerto
      | actividad               |
      | "Bombero en aeropuerto" |

    @P1TC9
    Examples: ingreso actividad Minero amianto
      | actividad        |
      | "Minero amianto" |

    @P1TC10
    Examples: ingreso actividad Minero mina a cielo abierto
      | actividad                     |
      | "Minero mina a cielo abierto" |

    @P1TC11
    Examples: ingreso actividad  Minero trabajo subterráneo
      | actividad                     |
      | " Minero trabajo subterráneo" |

    @P1TC12
    Examples: ingreso actividad Minero manejo de explosivos
      | actividad                     |
      | "Minero manejo de explosivos" |

    @P1TC13
    Examples: ingreso actividad Minero trabajo en superficies
      | actividad                       |
      | "Minero trabajo en superficies" |

    @P1TC14
    Examples: ingreso actividad Pescador de bajura/litoral
      | actividad                    |
      | "Pescador de bajura/litoral" |

    @P1TC15
    Examples: ingreso actividad Pesca de altura - capitán/patrón
      | actividad                          |
      | "Pesca de altura - capitán/patrón" |

    @P1TC16
    Examples: ingreso actividad Pesca de altura - oficial
      | actividad                   |
      | "Pesca de altura - oficial" |

    @P1TC17
    Examples: ingreso actividad Pesca de altura - ingeniero
      | actividad                     |
      | "Pesca de altura - ingeniero" |

    @P1TC18
    Examples: ingreso actividad Pesca de altura - marinero
      | actividad                    |
      | "Pesca de altura - marinero" |

    @P1TC19
    Examples: ingreso actividad Periodismo - Corresponsal de guerra
      | actividad                             |
      | "Periodismo - Corresponsal de guerra" |

    @P1TC20
    Examples: ingreso actividad Rodeo
      | actividad |
      | "Rodeo"   |

  @P2
  Scenario Outline: Ingresar respuestas de pregusta dos
    When Ingreso riesgos pDos<riesgo><nombreEmpleador><areaTrabajo><horasSemanales><desdeCuando><sustanciasEncapsuladas><sustanciasNoEncapsuladas><conCualesTrabaja><aparatoRayosX><RayosXDisruptivos><ningunoRayo><microondas><radiacionAlfa><radiacionBeta><radiacionDeNeutrones><radiacionDeRayosX><radiacionDeGamma><radiacionLaser><radiacionMaster><rayosUltravioletasArtificiales><otros><otraRadiacion><ningunoPresenteTareasDiarias><medidasSeguridadDisponibles><controlImpactoRadiacion><sobrepasadoLimiteRadiacion><conQueFrecuencia><ultimaVez><queValores><tratamientoMedicoRadiacion><cuando><cualFueRazon><consecuenciasSufridas>

    @P2TC2
    Examples: Ingreso riesgo radiacion ionizante
      | riesgo               | nombreEmpleador | areaTrabajo   | horasSemanales | desdeCuando  | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja     | aparatoRayosX | RayosXDisruptivos | ningunoRayo | microondas | radiacionAlfa | radiacionBeta | radiacionDeNeutrones | radiacionDeRayosX | radiacionDeGamma | radiacionLaser | radiacionMaster | rayosUltravioletasArtificiales | otros | otraRadiacion | ningunoPresenteTareasDiarias | medidasSeguridadDisponibles        | controlImpactoRadiacion | sobrepasadoLimiteRadiacion | conQueFrecuencia | ultimaVez | queValores | tratamientoMedicoRadiacion | cuando | cualFueRazon | consecuenciasSufridas |
      | "radiacionionizante" | "security"      | "areacontrol" | "40"           | "01-03-2015" | "si"                   | "no"                     | "con cuales trabaja" | "si"          | "si"              | "no"        | "si"       | "no"          | "no"          | "no"                 | "no"              | "si"             | "no"           | "no"            | "no"                           | "no"  | "no"          | "no"                         | "medidas de seguridad disponibles" | "no"                    | "si"                       | ""               | ""        | ""         | ""                         | ""     | ""           | ""                    |
##   @P2TC2
##   Examples: Ingreso riesgo vuelos no regulares
##     | riesgos             | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | trabajaCon | tipoRadiacion | 
##     | "vuelosnoregulares" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""         | ""            | 
##
##   @P2TC3
##   Examples: Ingreso riesgo ninguno de los anteriores
##     | riesgos                  | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | trabajaCon | tipoRadiacion |
##     | "ningunodelosanteriores" | ""              | ""          | ""             | ""          | ""                     | ""                       | ""               | ""         | ""            |
