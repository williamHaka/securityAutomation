package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC70StageSet;

@SuiteClasses({TC70StageSet.class})

public class TC70Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC70Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC70 *");
        LOGGER.info("*****************************************");
    }
}
