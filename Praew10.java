public class Praew10 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
	{
            for(int j=P;j<Praew;j++)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=P;j++)
	    {
                System.out.print(j);
            }
            System.out.print(Praew-P+1);
            for(int j=P;j>=1;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}