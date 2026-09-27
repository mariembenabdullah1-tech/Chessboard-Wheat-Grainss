import java.util.Scanner;
public class Exercice1
{
  public static void main (String[] args)
  {
    Scanner input= new Scanner(System.in);


        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("a)");
        for (int i = 1; i <= n; i++)
        {
          System.out.print(i + " ");
        }

        System.out.println("\nb)");
        for (int i = 1; i <= n; i++)
        {
          System.out.print(2 * i + " ");
        }

        System.out.println("\nc)");
        for (int i = 1; i <= n; i++)
        {
          System.out.print(i * i + " ");
        }

        System.out.println("\nd)");
        for (int i = 1; i <= n; i++)
        {
          System.out.print(i * i * i + " ");
        }
      }

  }


