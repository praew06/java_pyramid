public class Praew24 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
	{
            System.out.print(P);
            for(int j=1;j<=P*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=P;j<=Praew*2-P;j++)
	    {
                System.out.print(P);
            }
	    System.out.print(P);
            System.out.println();
        }
    }
}