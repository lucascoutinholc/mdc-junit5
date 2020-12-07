//Author: Lucas Coutinho de Almeida

package com.mycompany.introducaojunit5;

public class MathUtil {
    
    public static int mdc(int a, int b) {
        if (b > 0 && a % b == 0) {
            return b;
        }
        
        return -1;
    }

    public static int mdc(int a, int b, int c) {
        if (a % c == 0 && b % c == 0) {
            if (c % mdc(a,b) == 0) {
                return b;
            }
            
            return c % mdc(a, b);
        } else if (a % c == 0 && (b % c) % 2 == 0) {
            return b;
        }
        
        return -1;
    }
    
}
