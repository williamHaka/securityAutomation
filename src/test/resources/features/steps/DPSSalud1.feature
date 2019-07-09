Feature: Ingresar respuestas de seccion Salud I 
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
    When Ingreso le han recetado tratamiento medico pVeinte<tratamientoMedico><tratorno><fechaPrimeraVez><sintomasAun><queSintomasActuales><frecuencia><sintomasUltimaVez><SintomasAnio><promedioSintomas><revisionesMedico><cirugia><cuandoSometioCirugia><especifiqueCirugia><cirugiaPrevista><cuandoSometeraCirugia><tipoCirugia><medicacion><medicacionTomando><otro><otroTratamiento><fechaTratamiento><sinTratamiento><continuidadLaboral><fechaBaja>
    And Doy click en boton siguiente

    @P20TC53
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | ""              | ""          | ""                  | ""         | ""                | ""           | ""               | ""               | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | ""             | "no"               | ""        |

    @P20TC54
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | frecuencia        | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia    | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "si"        | "sintomas actuales" | "recurrentemente" | "01-02-2019"      | "2"          | "2"              | "no"             | ""      | ""                   | ""                 | "si"            | "01-03-2019"          | "tipo cirugia" | ""         | ""                | ""   | ""              | ""               | ""             | "no"                 | ""        |

    @P20TC55
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | ""              | ""          | ""                  | ""         | ""                | ""           | ""               | ""               | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | ""             | "no"               | ""        |

    @P20TC56
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | frecuencia        | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento    | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "si"              | "sindrome del colon irritable" | "01-01-2019"    | "si"        | "sintomas actuales" | "permanentemente" | "01-02-2019"      | ""           | ""               | "no"             | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | "si" | "otro tratamiento" | "01-03-2019"     | ""             | "no"               | ""        |

    @P20TC57
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja             |
      | "si"              | "sindrome del colon irritable" | ""              | ""          | ""                  | ""         | ""                | ""           | ""               | ""               | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | "si"           | "no"               | "inactividad laboral" |

    @P20NO
    Examples: Ingreso colon irritable a tratamiento medico
      | tratamientoMedico | tratorno                       | fechaPrimeraVez | sintomasAun | queSintomasActuales | frecuencia | sintomasUltimaVez | SintomasAnio | promedioSintomas | revisionesMedico | cirugia | cuandoSometioCirugia | especifiqueCirugia | cirugiaPrevista | cuandoSometeraCirugia | tipoCirugia | medicacion | medicacionTomando | otro | otroTratamiento | fechaTratamiento | sinTratamiento | continuidadLaboral | fechaBaja |
      | "no"              | "sindrome del colon irritable" | ""              | ""          | ""                  | ""         | ""                | ""           | ""               | ""               | ""      | ""                   | ""                 | ""              | ""                    | ""          | ""         | ""                | ""   | ""              | ""               | ""             | ""                 | ""        |
