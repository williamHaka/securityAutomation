Feature: Pregunta Cinco

 @P5
  Scenario Outline: Ingreso Deportes aventura
    When ingreso deportes aventura<deporteAventura><actividades>
    And Doy click en boton siguiente

    @P5NO
    Examples: Ingreso No a deportes aventura
      | deporteAventura | actividades |
      | "no"            | ""          |
