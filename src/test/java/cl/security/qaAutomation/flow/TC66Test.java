package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.TC66StageSet;

@SuiteClasses({NuevaPropuestaHombreStageSet.class,TC66StageSet.class})

public class TC66Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC66Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC66 *");
        LOGGER.info("*****************************************");
    }
}