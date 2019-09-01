public class Praew14 
{
    public static void main(String args[])
    {
        int Praew=5;
        for(int P=1;P<=Praew;P++)
    	{
            for(int j=P;j>1;j--)
	    {
                System.out.print(" ");
            }
            System.out.print(P+""+(P+1));
            for(int j=Praew;j>P;j--)
	    {
                System.out.print("  ");
            }
            System.out.println((P+1)+""+P);
        }
    }
}