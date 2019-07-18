package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC19StageSet;

@SuiteClasses({TC19StageSet.class})

public class TC19Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC19Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC19 *");
        LOGGER.info("*****************************************");
    }
}
