package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC28StageSet;

@SuiteClasses({TC28StageSet.class})

public class TC28Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC28Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC28 *");
        LOGGER.info("*****************************************");
    }
}
