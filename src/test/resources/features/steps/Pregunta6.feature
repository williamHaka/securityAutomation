Feature: Pregunta Seis
  @P6
  Scenario Outline: Ingreso seguros de vida
    When Ingreso vigencia seguro de vida<seguroVidaVigente>
    And Doy click en boton siguiente

    @P6NO
    Examples: Ingreso No a seguros de vida
      | seguroVidaVigente |
      | "no"              |
