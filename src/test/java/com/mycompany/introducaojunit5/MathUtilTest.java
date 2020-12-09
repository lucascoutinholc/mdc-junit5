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
    
}
