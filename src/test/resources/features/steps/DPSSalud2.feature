Feature: Ingresar respuestas de seccion Salud II

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
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno     | fechaSintomas | tipoTratamiento      | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | ""                | ""               | ""           | ""       | ""                 | ""         | ""          | ""         | "si" | "causa trastorno"  | "01-01-2019"  | "tratamiento varios" | "tratamiento especifique" | "no"        | "01-2-2019"        | ""              | "no"              | ""                      | ""                       | ""              |

		@P23TC64
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno     | fechaSintomas | tipoTratamiento      | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | ""                | ""               | ""           | "si"     | ""                 | ""         | ""          | ""         | "si" | "causa trastorno"  | "01-01-2019"  | "tratamiento varios" | "tratamiento especifique" | "si"        | ""                 | "complicacion"  | "no"              | ""                      | ""                       | ""              |

		@P23TC65
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | enfermedadSangre | trastorno | anemiaFerropenica | fechaFerropenica | anemiaSangre | aplasica | celulasFalciformes | hemolitica | hemorragica | perniciosa | otro | causaTrastorno     | fechaSintomas | tipoTratamiento      | especifiqueTratamientos   | sintomasAun | fechaLibreSintomas | complicacionAun | tratamientoMedico | inicioTratamientoMedico | terminoTratamientoMedico | sinDiagnosticar |
      | "si"             | "anemia"  | ""                | ""               | ""           | ""       | ""                 | ""         | "si"        | ""         | "si" | "causa trastorno"  | "01-01-2019"  | "tratamiento varios" | "tratamiento especifique" | "si"        | ""                 | "complicacion"  | "si"              | "01-02-2019"            | "15-02-2019"             | ""              |

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
    When Ingreso enfermedad del aparato digestivo<enfermedadDigestiva>

    @P25NO
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva |
      | "no"                |

  @P26
  Scenario Outline: Padece o ha padecido tumores
    When Ingreso ha padecido tumores o cancer pVeintiSeis<cancer><trastorno><fechaDiagnosticacion><cirugia><quimioterapia><radioterapia><otros><recurrenciaTumor><extirpadoTotalmente><otroTratamiento>

 		@P26TC73
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento   |
      | "si"   | "cancer mamario" | "01-01-2019"         | "si"    | ""            | ""           | ""    | "no"             | "si"                | "otro tatamiento" |

		@P26TC74
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "si"   | "cancer mamario" | "01-01-2019"         | ""      | "si"          | ""           | ""    | "no"             | "no"                | ""              |

		@P26TC75
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "si"   | "cancer mamario" | "01-01-2019"         | ""      | ""            | "si"         | ""    | "no"             | "no"                | ""              |

		@P26TC76
    Examples: Ingreso SI a tumores o cancer
      | cancer | trastorno        | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "si"   | "cancer mamario" | "01-01-2019"         | ""      | ""            | ""           | "si"  | "no"             | "no"                | ""              |
	

    @P26NO
    Examples: Ingreso No a tumores o cancer
      | cancer | trastorno | fechaDiagnosticacion | cirugia | quimioterapia | radioterapia | otros | recurrenciaTumor | extirpadoTotalmente | otroTratamiento |
      | "no"   | ""        | ""                   | ""      | ""            | ""           | ""    | ""               | ""                  | ""              |

  @P27
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato genitourinario como infecciones urinarias a repetición, cálculos renales, pielonefritis, riñones poliquísticos, insuficiencia renal, o de los testículos, próstata, útero, ovarios, mamas u otras enfermedades del aparato genital masculino o femenino
    When Ingreso ha padecido enfermedad del aparato genitourinario<enfermedadGenital>

    @P27NO
    Examples: Ingreso No ha padecido enfermedad del aparato genitourinario
      | enfermedadGenital |
      | "no"              |

  @P28
  Scenario Outline: Padece o ha padecido alguna enfermedad del sistema locomotor como enfermedades de los huesos y articulaciones, lumbago, afecciones de la columna vertebral, artritis, artrosis, ciática, reumatismo, escoliosis, atrofia muscular, tendinitis, mutilación o malformación de algún miembro, u otra alteración
    When Ingreso ha padecido enfermedad del aparato locomotor<enfermedadLocomotor>

    @P28NO
    Examples: Ingreso No ha padecido enfermedad del aparato locomotor
      | enfermedadLocomotor |
      | "no"                |

  @P29
  Scenario Outline: Padece o ha padecido alguna enfermedad endocrina o metabólica como diabetes, colesterol elevado, bocio, hipotiroidismo, mal de Addison, gota, hemocromatosis u otros trastornos endocrinos o metabólicos
    When Ingreso ha padecido enfermedad endocrina<enfermedadEndocrina>

    @P29NO
    Examples: Ingreso No ha padecido enfermedad endocrina
      | enfermedadEndocrina |
      | "no"                |

  @P30
  Scenario Outline: Padece o ha padecido alguna enfermedad infecciosa o de transmisión sexual como VIH o SIDA, fiebre tifoidea, escarlatina, hepatitis, difteria, amigdalitis, meningitis, septicemia, malaria, dengue sífilis, gonorrea, virus del papiloma humano u otra
    When Ingreso ha padecido enfermedad infecciosa<enfermedadInfecciosa>

    @P30NO
    Examples: Ingreso No ha padecido enfermedad infecciosa
      | enfermedadInfecciosa |
      | "no"                 |

  @P31
  Scenario Outline: Padece o ha padecido alguna enfermedad de los ojos (astigmatismo, miopía, cataratas, glaucoma, hipermetropía), de la nariz (pólipos, sinusitis crónica), de la garganta (hipertrofia de las amígdalas), o de los oídos (otitis crónica, supuración, sordera) u otras
    When Ingreso ha padecido enfermedad de los ojos<enfermedadOcular>

    @P31NO
    Examples: Ingreso No ha padecido enfermedad de los ojos
      | enfermedadOcular |
      | "no"             |

  @P32
  Scenario Outline: Padece o ha padecido alguna enfermedad del sistema nervioso (cefaleas, migrañas, ictus, esclerosis múltiple, epilepsia) o mental (ansiedad, depresión, estrés) u otras
    When Ingreso ha padecido enfermedad del sistema nervioso<enfermedadNerviosa>

    @P32NO
    Examples: Ingreso No ha padecido enfermedad del sistema nervioso
      | enfermedadNerviosa |
      | "no"               |

  @P33
  Scenario Outline: Padece o ha padecido alguna enfermedad de la piel (eccema, dermatitis, psoriasis, eritema, pénfigo, extirpación de lunares, esclerosis sistémica difusa) u otras
    When Ingreso ha padecido enfermedad de la piel<enfermedadPiel>

    @P33NO
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel |
      | "no"           |
