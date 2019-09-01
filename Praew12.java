public class Praew12 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
	{
            for(int j=1;j<P;j++)
	    {
                System.out.print(" ");
            }
            for(int j=P;j<=(Praew*2-P);j++)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}