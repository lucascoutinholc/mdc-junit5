//Author: Lucas Coutinho de Almeida
package com.mycompany.introducaojunit5;

import java.util.Objects;

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
        
        //Propriedade 8
        if (a == b) {
            return a;
        }

        return mdc(a - b, b);
    }

    public static int mdc(int a, int b, int c) {
        if (a % c == 0 && b % c == 0) {
            if (c % mdc(a, b) == 0) {
                return b;
            }

            return c % mdc(a, b);
        } else if (a % c == 0 && (b % c) % 2 == 0) {
            return b;
        } else if (mdc(a, mdc(b, c)) == 1 && mdc(mdc(a, b), c) == 1) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public static int mdcVarArgs(int ...valores) {
        Objects.requireNonNull(valores, 
                "O parâmetro valores não pode ser nulo para calcular o MDC");
        
        if (valores.length == 0) {
            throw new IllegalArgumentException(
                    "É preciso indicar ao menos um valor para calcular o MDC.");
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        return a;
    }

}
