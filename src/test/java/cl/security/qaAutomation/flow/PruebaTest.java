package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;
import cl.security.qaAutomation.stageSet.PruebaStageSet;
import cl.security.qaAutomation.stageSet.TC10StageSet;
import cl.security.qaAutomation.stageSet.TC11StageSet;
import cl.security.qaAutomation.stageSet.TC12StageSet;
import cl.security.qaAutomation.stageSet.TC13StageSet;
import cl.security.qaAutomation.stageSet.TC14StageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;
import cl.security.qaAutomation.stageSet.TC7StageSet;
import cl.security.qaAutomation.stageSet.TC8StageSet;
import cl.security.qaAutomation.stageSet.TC9StageSetNOVA;


@SuiteClasses({
	PropuestaCompassStageSet.class,PruebaStageSet.class
})

public class PruebaTest extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(PruebaTest.class);
    @BeforeClass
    public static void flag() throws Exception {
        LOGGER.info("Ejecutando flujo de Prueba formulario DPS");
    }
}
