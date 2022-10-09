import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Chatbot
{
  public static void main (String [] args)
    {
      boolean done = new boolean(false);

      Scanner scan = new Scanner(System.in);
      Domain domain = new Domain();

      scan = scan.nextLine().toLowerCase()

      domain.getInput(scan);
      domain.determineDomain();
    }
}
