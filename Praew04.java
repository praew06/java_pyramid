public class Praew04 
{
    public static void main(String args[])
    {
        int totalP=4;
        for(int P=1;P<=totalP;P++)
	{
            for(int col=1;col<=P;col++)
	    {
                System.out.print("*");
            }
            for(int col=P;col>=1;col--)
	    {
                System.out.print(col);
            }
            for(int col=1;col<P;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}