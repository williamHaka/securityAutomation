package cl.security.qaAutomation.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {

	
	public String getReportConfigPath() throws IOException{
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("C:/Users/Matias Briso/eclipse-workspace/securityAutomation/Configs/Configuration.properties");
			// load a properties file
			prop.load(input);
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
    private static ConfigFileReader instance = null;
    private ConfigFileReader() {
    }

    public static ConfigFileReader getInstance() {
        if (instance == null) {
            instance = new ConfigFileReader();
        }
        return instance;
    }

}
