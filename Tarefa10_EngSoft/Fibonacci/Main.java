package Fibonacci;

public final class Main {
    public static void main(String[] args)
    {
        try{
            int num = Utility.Helper.getUserInput("Numero na sequencia");
            num = Fibonacci.mostraTermo(num);
            
            System.out.print("Resultado: ");
            System.out.println(num);
        }catch(Exception e)
        {
            System.out.println("ERRO: O numero deve ser um inteiro maior que 0.");
        }

    }
}
