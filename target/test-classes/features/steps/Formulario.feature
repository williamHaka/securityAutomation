
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Validacion del formulario dps con parametros de entrada
    Given Ingreso a la url
    When Ingreso actividad <actividad>
    Then Valido id de formulario 

    Examples: 
      | actividad | 
      | name1     |
      | name2     |
