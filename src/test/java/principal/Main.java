package principal;

import io.qameta.allure.testng.AllureTestNg;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void testRunnerFunctionality() {
        System.out.println("Ejecutando prueba de verificación del runner y reportes...");
        Assert.assertTrue(true, "La prueba de verificación siempre pasa.");
    }

    @Listeners({AllureTestNg.class})
    public class TestAllure {

        @Test
        public void testExample() {
            System.out.println("Prueba de Allure en ejecución");
        }
    }
}