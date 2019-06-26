package cl.security.qaAutomation.services;

import cl.security.qaAutomation.definition.PropuestaCompassDefinition;

public class IndexServices {

	public static Integer getIndexVIH(Boolean isEmbarazada, Boolean isComplicaciones)throws Exception{
		Integer index=0;
		if(PropuestaCompassDefinition.genero.trim().toLowerCase().equalsIgnoreCase("f")) {
			if(isEmbarazada) {
				if(isComplicaciones) {
					index=18;
				}else {
					index=10;
				}
			}else {
				index=8;
			}
		}else {
			index=6;
		}
		
		return index;
	}
}
