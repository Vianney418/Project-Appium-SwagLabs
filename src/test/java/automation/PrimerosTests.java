package automation;

import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class PrimerosTests extends BaseTest {
    @Test (groups = regression)
    public void primerTest() {
        Logs.info("Esperar 5 segundos!!");
        sleep(4000);
    }

    @Test (groups = regression)
    public void fallido(){
        Logs.info("Esperando 2 segundos");
        sleep(2000);

        Logs.info("Forzar que falle el test");
        Assert.assertEquals(3,2);
    }
}
