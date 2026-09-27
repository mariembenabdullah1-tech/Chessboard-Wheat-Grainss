public class Chessboard
{
  public static void main(String[] args)
  {
    double grains = 1;
    double total =  1;

    for (int square =1; square<64;square++)
    {
      grains= grains*2;
      total= total+ grains;

    }

    System.out.println(grains);
    System.out.println(total);


  }

}

