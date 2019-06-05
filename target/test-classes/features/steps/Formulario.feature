@FormularioDPS
Feature: Title of your feature
  I want to use this template for my feature file

  @completarDPS
  Scenario Outline: Validacion del formulario dps con parametros de entrada
    Given Ingreso a la url"http://10.62.4.76:8170"
    When Ingreso usuario y clave"admin""admin"
    And Doy click en nueva propuesta
    And Ingreso nombre de la nueva propuesta<nombrePropuesta>
    And Doy click en siguiente
    And Ingreso nombre<nombre>
    And Ingreso edad<edad>
    And Selecciono genero<genero>
    And Selecciono estado civil<estadoCivil>
    And Selecciono cobertura<cobertura>
    And Ingreso renta<renta>
    And Ingreso prima<prima>
    And Ingreso duracion<duracion>
    And Doy click en siguiente
    And Acepto termino de conformidad<aceptoTermino>
    And Ingreso la actividad pUno<actividad>
    And Ingreso riesgos pDos<riesgos><nombreEmpleador><areaTrabajo><horasSemanales><desdeCuando><sustanciasEncapsuladas><sustanciasNoEncapsuladas><conCualesTrabaja><trabajaCon><tipoRadiacion><otraRadiacion><medidasSeguridadDisponibles><controlandoRadiacion><sobrepasadoLimiteRadiacion><frecuencia><ultimaVez><queValores><tratamientoMedico><cuando><razon><consecuenciasSufridas><hhAnuales>
    And Doy click en siguiente
    
  Examples: 
    | nombrePropuesta | nombre   | edad | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino | actividad                        | riesgos | nombreEmpleador | areaTrabajo | horasSemanales | desdeCuando  | sustanciasEncapsuladas | sustanciasNoEncapsuladas | conCualesTrabaja | trabajaCon | tipoRadiacion | otraRadiacion | medidasSeguridadDisponibles | controlandoRadiacion | sobrepasadoLimiteRadiacion | frecuencia | ultimaVez | queValores | queValores | tratamientoMedico | cuando | razon | consecuenciasSufridas | hhAnuales |
    | "TC1"           | "nombre" | "33" | "M"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | "si"          | "Guarda de seguridad - con arma" | "0"     | "Security"      | "0"         | "45"           | "01-01-2000" | ""                     | ""                       | ""               | ""         | ""            | ""            | ""                          | ""                   | ""                         | ""         | ""        | ""         | ""         | ""                | ""     | ""    | ""                    | "100"     |

    
    
    
    
    