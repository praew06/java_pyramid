public class Praew18 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
	{
            System.out.print(P);
            for(int j=1;j<=P;j++)
	    {
                System.out.print("*");
            }
            System.out.print(P);
            for(int j=Praew;j>=P;j--)
	    {
                System.out.print("*");
            }
            System.out.println(Praew*2-P);
        }
    }
}