package Fibonacci;

import java.util.InputMismatchException;

public final class Fibonacci{
    private Fibonacci(){}

    public static int mostraTermo(final int n) throws InputMismatchException
    {
        int fn_1 = 1; // Termo inicial
        int fn_2 = 1; // Termo inicial
        int fn_atual = 0; // Termo atual
        if(n < 1)
        {
            throw new InputMismatchException();
        }
        /* Se n for 1 ou 2, retornamos os termos iniciais */
        if (n == 1)
            return fn_1;
        if (n == 2)
            return fn_2;

        /* Calcula o proximo termo n-2 vezes */
        for(int i = 0; i < n-2; i++)
        {
            fn_atual = fn_1 + fn_2;
            fn_1 = fn_2;
            fn_2 = fn_atual;
            System.out.print(fn_atual);
            System.out.print(" ");
        }

        System.out.print("\n");
        return fn_atual;
    }

}