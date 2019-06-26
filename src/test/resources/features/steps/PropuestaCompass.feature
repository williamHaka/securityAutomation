Feature: Flujo previo a DPS

@NuevoAsegurado
  Scenario Outline: Validacion del flujo ingresar nueva propuesta
    Given Ingreso a la url"https://vs-as-compass-des.azurewebsites.net/"
    When Ingreso usuario y clave"admin""admin"
    And Doy click en nueva propuesta
    And Ingreso nombre de la nueva propuesta<nombrePropuesta>
    And selecciono tipo de cuestionario"TOUCH_VS"
    And Doy click en siguiente
    And Ingreso nombre<nombre>
    And Ingreso edad<edad>
    And Ingreso rut<rut>
    And Selecciono genero<genero>
    And Selecciono estado civil<estadoCivil>
    And Selecciono cobertura<cobertura>
    And Ingreso renta<renta>
    And Ingreso prima<prima>
    And Ingreso duracion<duracion>
    And Doy click en siguiente
    And Acepto termino de conformidad<aceptoTermino>
   
  @NuevoAseguradoHombre
  Examples: 
    | nombrePropuesta | nombre   | edad | rut    | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino |
    | "TC_"           | "nombre" | "33" | "1-9"  | "M"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | "si"          |
    
	@NuevoAseguradoMujer
  Examples: 
    | nombrePropuesta | nombre   | edad | rut    | genero | estadoCivil | cobertura | renta  | prima | duracion | aceptoTermino |
    | "TC_"           | "Mujer"  | "33" | "1-9"  | "F"    | "soltero"   | "vida"    | "2500" | "2"   | "15"     | "si"          |
    

    
    