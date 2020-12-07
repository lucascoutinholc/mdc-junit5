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
        int a = 4;
        int b = 2;
        int c = 1;
        int esperado = c;
        int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcXDivisorIgualAP2() {
        int a = 8;
        int b = 4;
        int x = 8;
        int esperado = b;
        int obtido = MathUtil.mdc(a, b, x);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcXDivisorIgualBP2() {
        int a = 8;
        int b = 4;
        int x = 4;
        int esperado = x;
        int obtido = MathUtil.mdc(a, b, x);
        assertEquals(esperado, obtido);
    }
    
}
