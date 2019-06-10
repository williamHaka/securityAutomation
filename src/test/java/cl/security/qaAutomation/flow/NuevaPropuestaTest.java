package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC1StageSet;
import cl.security.qaAutomation.stageSet.TC2StageSet;


@SuiteClasses({
		TC1StageSet.class
//		,TC2StageSet.class
})

public class NuevaPropuestaTest extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(NuevaPropuestaTest.class);
    @BeforeClass
    public static void flag() throws Exception {
        LOGGER.info("Ejecutando flujo de formulario DPS");
    }
}
