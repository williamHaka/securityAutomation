package cl.security.qaAutomation.services;

import org.json.JSONObject;

public class Prueba {
	public static void main(String[] args) throws Exception {
	
		String jso = "{\r\n" + 
				"		   \"Codigo\": \"0\",\r\n" + 
				"		   \"Glosa\": {\r\n" + 
				"		       \"Activo\": null,\r\n" + 
				"		       \"Cod\": null,\r\n" + 
				"		       \"Descripcion\": \"Los favoritos se utilizan para guarda una dirección o un usuario que se utilizará reiterativamente en formularios, evitando re digitarlo.\",\r\n" + 
				"		       \"Icon\": null,\r\n" + 
				"		       \"Id\": \"20032\",\r\n" + 
				"		       \"Nombre\": \"Favoritos\",\r\n" + 
				"		       \"Orden\": null,\r\n" + 
				"		       \"Pais\": null,\r\n" + 
				"		       \"SegundoNombre\": null,\r\n" + 
				"		       \"Tipo\": null\r\n" + 
				"		   },\r\n" + 
				"		   \"Mensaje\": \"Datos obtenidos correctamente\"\r\n" + 
				"		}";
        JSONObject body = new JSONObject(jso);
        System.out.println(jso);
        JSONObject glosa = new JSONObject(body.getString("Glosa"));
        String descripcion = glosa.getString("Descripcion");
        System.out.println(descripcion);
		
		
//	StringSelection stringSelection = new StringSelection("C:\\Users\\Matias Briso\\Desktop\\cencosud_test");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//	Robot robot = new Robot();
//	Thread.sleep(3000);
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_V);
//	robot.keyPress(KeyEvent.VK_ENTER);
//	
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	robot.keyRelease(KeyEvent.VK_V);
//	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
