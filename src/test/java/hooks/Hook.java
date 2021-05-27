package hooks;

import classesPageObjects.UtilTestePO;
import org.junit.After;

/**
 * @author Juan Castillo
 * @since 01/12/2020
 */
public class Hook extends UtilTestePO {

    @After
    public void afterScenario() {
        fecharBrowser();
    }

}
