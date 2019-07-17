package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.TC24StageSet;

@SuiteClasses({NuevaPropuestaHombreStageSet.class,TC24StageSet.class})

public class TC24Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC24Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC24 *");
        LOGGER.info("*****************************************");
    }
}