public class Praew06
{
    public static void main(String args[])
    {
        int Praew =7;
        for(int P=Praew;P>=1;P--)
        { 
            for(int j=Praew;j>P;j--)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=P*2-1;j++)
	    {
                System.out.print((j%2));
            }
            System.out.println();
        }
    }
}