//Author: Lucas Coutinho de Almeida

package com.mycompany.introducaojunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testMdcAParP1() {
        final int a = 4;
        final int b = 2;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcXDivisorComumP2() {
        final int a = 4;
        final int b = 2;
        final int c = 1;
        final int esperado = c;
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcXDivisorIgualAP2() {
        final int a = 8;
        final int b = 4;
        final int x = 8;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b, x);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcXDivisorIgualBP2() {
        final int a = 8;
        final int b = 4;
        final int x = 4;
        final int esperado = x;
        final int obtido = MathUtil.mdc(a, b, x);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAParB0P3() {
        final int a = 4;
        final int b = 0;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparB0P3() {
        final int a = 3;
        final int b = 0;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumeroMImparP4() {
        final int a = 6;
        final int b = 2;
        final int m = 3;
        final int esperado = b * m;
        final int obtido = MathUtil.mdc(a * m, b * m);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumeroMParP4() {
        final int a = 6;
        final int b = 2;
        final int m = 4;
        final int esperado = b * m;
        final int obtido = MathUtil.mdc(a * m, b * m);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcCParP5() {
        final int a = 8;
        final int b = 1;
        final int c = 3;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(a, c) * MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcCImparP5() {
        final int a = 8;
        final int b = 1;
        final int c = 2;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(a, c) * MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcB3P5() {
        final int a = 8;
        final int b = 3;
        final int c = 2;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(a, c) * MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumerosParesP6() {
        final int a = 4;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumerosImparesP6() {
        final int a = 5;
        final int b = 3;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumerosNegativosP7() {
        final int a = -9;
        final int b = -3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumeroRepetidoP8() {
        final int a = 3;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumerosRepetidosNegativoP8() {
        final int a = -4;
        final int esperado = -4;
        final int obtido = MathUtil.mdc(a, a);
        assertNotEquals(esperado, obtido);
    }
    
    @Test
    void testMdc1e2IgualdadesP9() {
        final int a = 8;
        final int b = 6;
        final int c = 3;
        final int esperado = MathUtil.mdc(MathUtil.mdc(a, b), c);
        final int obtido = MathUtil.mdc(a, MathUtil.mdc(b, c));
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdc1e3IgualdadesP9() {
        final int a = 8;
        final int b = 6;
        final int c = 3;
        final int esperado = MathUtil.mdc(a, MathUtil.mdc(b, c));
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumeroPrimo3P12() {
        final int a = 4;
        final int p = 3;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNumeroPrimo113P12() {
        final int a = 8;
        final int p = 113;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }
    
}
