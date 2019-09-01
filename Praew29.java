public class Praew29 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
	{
            System.out.print(P+"*"+(P+2));
            for(int j=1;j<=P+2;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}