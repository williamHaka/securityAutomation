Feature: Pregunta Tres
@P3
  Scenario Outline: Ingresar respuestas de rescatista o voluntario
    When Ingreso labores de bombero o rescatista voluntario pTres<realizaLabores><labor>
    And Doy click en boton siguiente

    @P3NO
    Examples: Ingresar No a rescatista o voluntario
      | realizaLabores | labor |
      | "no"           | ""    |