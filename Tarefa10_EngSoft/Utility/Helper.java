package Utility;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Helper {
  public static int getUserInput(String prompt) throws InputMismatchException, NoSuchElementException {
    System.out.print(prompt + ": ");
    Scanner scanner = new Scanner(System.in);
    try{
    return scanner.nextInt();
    }
    catch(Exception e)
    {
      throw e;
    }
  }
}
