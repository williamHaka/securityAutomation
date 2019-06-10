Feature: Validación de formulario DPS


  Scenario Outline: Validacion del flujo ingresar nueva propuesta
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
   
  @NuevaPropuestaTC1
  Examples: 
    | nombrePropuesta | nombre   | edad | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino |
    | "TC1"           | "nombre" | "33" | "M"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | "si"          |
    

    

    
    