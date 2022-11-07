package Triangulos;

import java.util.InputMismatchException;

public final class Triangulos {
    private Triangulos(){}
    public static void classificaTriangulo(int lado1, int lado2, int lado3)
    {
        if(lado1 < 1 || lado2 < 1 || lado3 < 1)
            throw new InputMismatchException();

        if(lado1 == lado2 && lado2 == lado3)
            System.out.println("Triangulo Equilatero.");
        else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1)
            System.out.println("Triangulo Isosceles.");
        else System.out.println("Triangulo Escaleno.");
    }
}
