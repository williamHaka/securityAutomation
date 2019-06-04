@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Validacion del formulario dps con parametros de entrada
    Given Ingreso a la url
    When Ingreso usuario y clave
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
    And Ingreso la actividad<actividad>
    And Ingreso riesgos<riesgos>
    And Ingreso respuesta de rescatista o voluntario<rescatistaVoluntario>
    And Doy click en siguiente

    Examples: 
      | nombrePropuesta | nombre   | edad | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino | actividad                        | riesgos | rescatistaVoluntario |
      | "TC1"           | "nombre" | "33" | "M"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | ""            | "Guarda de seguridad - con arma" | "0"     | "no"                 |
