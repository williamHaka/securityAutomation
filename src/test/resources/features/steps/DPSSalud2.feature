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
    When Ingreso enfermedad del aparato digestivo<enfermedadDigestiva>

    @P25NO
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva |
      | "no"                |

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
    When Ingreso ha padecido enfermedad de la piel<enfermedadPiel>

    @P33NO
    Examples: Ingreso No ha padecido enfermedad de la piel
      | enfermedadPiel |
      | "no"           |
