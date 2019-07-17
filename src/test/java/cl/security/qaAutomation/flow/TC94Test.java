package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.TC94StageSet;

@SuiteClasses({NuevaPropuestaHombreStageSet.class,TC94StageSet.class})

public class TC94Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC94Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC94 *");
        LOGGER.info("*****************************************");
    }
}