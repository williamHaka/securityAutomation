package cl.security.qaAutomation.services;

import java.util.LinkedHashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import cl.security.qaAutomation.model.CommJson;
import cl.security.qaAutomation.model.EndPointModel;
import cl.security.qaAutomation.utils.Constants;

public class EndPointServices {
//	public static CommJson json = new CommJson();
	
	public static EndPointModel authPost(EndPointModel endpointModel) throws Exception {
		CommJson json = new CommJson();
		json.doTrustToCertificatesSSL();
		json.setConn(Constants.OAUTH);
		json.setRequestMethod("POST");
		json.setRequestProperty("Content-Type", "application/json");

		String jsonBody = "{\"password\":\""+ endpointModel.getPassword() + "\",";
		jsonBody += "\"rememberMe\":" + false + ",";
		jsonBody += "\"username\":\"" + endpointModel.getUser() + "\"";
		jsonBody += "}";	
		json.postParametros(jsonBody);
		
		Integer status = json.getResponseCode();
        if (status == 200) {
        	String jso = json.getJsonData();
            JSONObject body = new JSONObject(jso);
            endpointModel.setToken("Bearer "+body.getString("token"));  
            endpointModel.setId(body.getString("id"));  
        }
        return endpointModel;
	}
	
	public static EndPointModel applicationGet(EndPointModel endpointModel) throws Exception {
		CommJson json = new CommJson();
		json.doTrustToCertificatesSSL();
		LinkedHashMap<String,String> params = new LinkedHashMap<String, String>();
		params.put("createdBy", endpointModel.getUser());
		params.put("description", endpointModel.getIdPropuesta());
		params.put("removed", "false");
		json.setConnParams(Constants.APPLICATION, params);
		json.setRequestMethod("GET");
		json.setRequestProperty("Authorization", endpointModel.getToken());
//		
		
		
		Integer status = json.getResponseCode();
		if (status == 200) {
        	String jso = json.getJsonData();
            JSONObject body = new JSONObject(jso);
            JSONObject content = body.getJSONObject("_embedded");
            JSONArray apl = content.getJSONArray("applicationDtoList");
            String applicationId = "";
            for (int i = 0; i < apl.length(); i++) {
            	JSONObject object = apl.getJSONObject(i);
            	applicationId = (String) object.get("id");
			}
            endpointModel.setApplicationId(applicationId.toString());
        }else {
        	System.out.println(json.getJsonDataError());
        }
		
		return endpointModel;
	}
	
	
	public static void getResult(EndPointModel endpointModel) throws Exception {
		CommJson json = new CommJson();
		json.doTrustToCertificatesSSL();
		json.setConn(Constants.RESULT+"/"+endpointModel.getApplicationId());
		json.setRequestMethod("GET");
		json.setRequestProperty("Authorization", endpointModel.getToken());

		Integer status = json.getResponseCode();
		if (status == 200) {
        	String jso = json.getJsonData();
            JSONObject body = new JSONObject(jso);
        }else {
        	System.out.println(json.getJsonDataError());
        }
	}
}
