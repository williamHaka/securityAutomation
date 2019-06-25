Feature: Ingresar respuestas de  preguntas 16 a 33 en formulario DPS

  @P16
  Scenario Outline: Ha sido víctima de algún accidente (de automóvil, intoxicación u otro)
    When Ingreso si ha sido victima de algun accidente<accidente>

    @P16NO
    Examples: INgreso NO ha sido victima de algun accidente
      | accidente |
      | "no"      |

  @P17
  Scenario Outline: Está actualmente con licencia médica o ha interrumpido su trabajo durante más de 3 semanas por causa médica o accidente? (desconsiderar licencias por maternidad)
    When Ingreso licencia medica vigente<licenciaMedicaVigente>

    @P17NO
    Examples: Ingreso NO a licencia medica vigente
      | licenciaMedicaVigente |
      | "no"                  |

  @P18
  Scenario Outline: En los últimos 5 años, ¿ha permanecido ingresado en un centro hospitalario o similar? (no considerar: cirugía por apendicitis, vasectomía, fimosis, circuncisión, amigdalitis crónica, cirugía de vesícula por extracción de cálculos, y parto o cesárea con antigüedad mayor o igual a un año)
    When Ingreso ha ingresado a un centro hospitalario<ingresoHospitalario>

    @P18NO
    Examples: ingreso no ha centro hospitalario
      | ingresoHospitalario |
      | "no"                |

  @19
  Scenario Outline: Se encuentra actualmente en estudio, observación o realizándose exámenes por alguna dolencia o enfermedad, o le van a realizar alguna intervención quirúrgica
    When Ingreso actualmente se encuentra en observaciones<encuentraObservacion>

    @P19NO
    Examples: Ingreso NO a si se encuentra actualmente en observaciones
      | encuentraObservacion |
      | "no"                 |

  @20
  Scenario Outline: Le han prescrito durante cierto tiempo algún tratamiento médico (farmacológico, psicológico, rehabilitación, etc.), o lo sigue en la actualidad? Por favor, no considere los indicados para resfriados o estados gripales
    When Ingreso le han recetado tratamiento medico<tratamientoMedico>
    And Doy click en boton siguiente

    @P20NO
    Examples: Ingreso NO a tratamiento medico
      | tratamientoMedico |
      | "no"              |

  @P21
  Scenario Outline: Ha sido tratado por algún psicólogo o por otro profesional de la salud o de medicina alternativa
    When Ingreso ha sido tratado por algun psicologo<tratadoPsicologo>

    @P21NO
    Examples: Ingreso NO ha sido tratado por algun psicologo
      | tratadoPsicologo |
      | "no"             |

  @P22
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato respiratorio como asma, bronquitis crónica, neumonía enfisema pulmonar, apnea del sueño, neumotórax, tuberculosis pulmonar o cualquier otra del aparato respiratorio
    When Ingreso ha padecido enfermedad respiratoria<enfermedadRespiratoria>

    @P22NO
    Examples: Ingreso no a enfermedades respiratorias
      | enfermedadRespiratoria |
      | "no"                   |

  @P23
  Scenario Outline: Padece o ha padecido alguna enfermedad de la sangre como anemia, hemofilia, leucemia, o cualquier otra
    When Ingreso enfermedad de sangre<enfermedadSangre>

    @P23NO
    Examples: Ingreso NO a enfermedades de la sangre
      | enfermedadSangre |
      | "no"             |

  @P24
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato circulatorio como hipertensión arterial, infarto, arritmias, dolor en el pecho, bypass, soplo al corazón, síndrome de Raynaud, defecto cardiaco congénito, flebitis, varices u otras enfermedades del corazón, las arterias o las venas
    When Ingreso enfermedad del aparato circulatorio<enfermedadCirculatorio>

    @P24NO
    Examples: Ingreso no a enfermedades del aparato circulatorio
      | enfermedadCirculatorio |
      | "no"                   |

  @P25
  Scenario Outline: Padece o ha padecido alguna enfermedad del aparato digestivo como trastorno de estómago, intestino o hígado, gastritis, úlceras, hepatitis, varices esofágicas, reflujo, ictericia, cirrosis, elevación de las enzimas hepáticas, cálculos en la vesícula, diarrea crónica, hemorroides, fístulas del recto u otras
    When Ingreso enfermedad del aparato digestivo<enfermedadDigestiva>

    @P25NO
    Examples: Ingreso NO a enfermedad del aparato digestivo
      | enfermedadDigestiva |
      | "no"                |

  @P26
  Scenario Outline: Padece o ha padecido tumores (benignos o malignos) o cáncer
    When Ingreso ha padecido tumores o cancer<cancer>

    @P26NO
    Examples: Ingreso No a tumores o cancer
      | cancer |
      | "no"   |

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