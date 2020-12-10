//Author: Lucas Coutinho de Almeida

package com.mycompany.introducaojunit5;

public class MathUtil {
    
    public static int mdc(int a, int b) {
        //Propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade 6
        int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propriedade 1
        if (b > 0 && a % b == 0) {
            return b;
        }
        
        //Propriedade 3
        if (b == 0) {
            return a;
        }
        
        //Propriedade 5
        if (a % b != 0) {
            return 1;
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
        } else {
            return -1;
        }
    }
    
}
