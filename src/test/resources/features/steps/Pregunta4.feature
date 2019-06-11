Feature: Pregunta cuatro

  @P4
  Scenario Outline: Ingreso motocicleta como medio de transporte
    When Ingreso motocicleta como medio de transporte pCuatro<utilizaMotocicleta><cilindrada>

    @P4NO
    Examples: 
      | utilizaMotocicleta | cilindrada |
      | "no"               | ""         |
