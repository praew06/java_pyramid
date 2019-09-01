public class Praew32
{
    public static void main(String args[])
    {
        int Praew=3;
        for(int P=1;P<=Praew*2-1;P++)
	{
            for(int j=1;j<=(Praew*2-P+2);j++)
	    {
                System.out.print(j);
            }
            for(int j=Praew;j<=Praew+P+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println(Praew-(Praew-2)+P);
        }
    }
}