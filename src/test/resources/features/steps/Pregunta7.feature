Feature: Pregunta Siete
 @P7
  Scenario Outline: Ingreso viajes con regularidad al extranjero
    When Ingreso viajes al extranjero con regularidad<viajesExtranjero>
    And Doy click en boton siguiente

    @P7NO
    Examples: Ingreso no a viajes con regularidad
      | viajesExtranjero |
      | "no"             |
