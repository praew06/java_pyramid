public class Praew08
{
    public static void main(String args[])
    {
        int Praew=7;
        for(int P=1;P<=Praew;P++)
	{
            for(int j =1;j<P;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(P+""+(P+1)+""+(P+2));
            for(int j=0;j<=P;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}