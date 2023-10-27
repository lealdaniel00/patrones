import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSuma(){
        Calculadora calculator = new Calculadora();
        int res= calculator.sumar(5,20);
        int valEsp = 20;
        assertEquals(res,valEsp);
    }
}