package Triangulos;

import java.util.InputMismatchException;

public final class Main {
    public static void main(String[] args)
    {
        try{
            int lado1 = Utility.Helper.getUserInput("Primeiro lado do triangulo");
            int lado2 = Utility.Helper.getUserInput("Segundo lado do triangulo");
            int lado3 = Utility.Helper.getUserInput("Terceiro lado do triangulo");

            Triangulos.classificaTriangulo(lado1, lado2, lado3);
        }catch(Exception e)
        {
            System.out.println("ERRO: O numero deve ser um inteiro maior que 0.");
        }
    }

}
