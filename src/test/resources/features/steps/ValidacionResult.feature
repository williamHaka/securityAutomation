Feature: Validacion de reglas desde servicio Result

  @executeResult
  Scenario Outline: validacion de reglas obtenidas del servicio result
    Given Realizo consulta a servicio result con el applicationId<applicationId>
    When Realizo mapeo de json result
    Then Valido reglas esperadas<reglas>

    @resultTC1
    Examples: 
      | applicationId  | reglas |
      | "NKBaSSsCU8q7" | ""     |
      