import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] [] matrice=new int [5][5];
        int elementi=0;
        int [] vettore=new int [elementi];
        System.out.println("Inserisci i valori della matrice");
        for (int i=0;i<matrice.length;i++)
        {
            for (int j=0;j<matrice[0].length;j++)
            {
                matrice[i][j]=in.nextInt();
            }
        }
        System.out.println("Inserisci la lunghezza del vettore");
        elementi=in.nextInt();
    }
    private static void Memorizza (int[][]matrice, int [] vettore)
    {
        for (int i=0;i< matrice.length;i++)
        {
            for (int j = 0; j < matrice[0].length; j++)
            {
                for (int a = 0; a < vettore.length; a++)
                {
                    vettore[a] = matrice[i][j];
                }
            }
        }
    }
}