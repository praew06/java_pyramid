public class Praew20 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
	{
            for(int j=1;j<=P;j++)
	    {
                System.out.print(P);
            }
            for(int j=1;j<=P;j++)
	    {
                System.out.print("*");
            }
            for(int j=1;j<=P;j++)
	    {
                System.out.print(P);
            }
            System.out.println();
        }
    }
}