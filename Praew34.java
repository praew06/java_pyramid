public class Praew34 
{
    public static void main(String args[])
    {
        int Praew=3;
        for(int P = 1; P <= Praew; P++)
	{
			for(int j = 1; j <= 6 - P; j++){	System.out.print(" ");}
        	System.out.print("*");
			for(int j = 1; j <= (P * 2 - 1); j++){	System.out.print(P);	}
		System.out.print("*");
		System.out.println();
	}
			for(int P = 2; P >= 1; P--){
				for(int j = 1; j <= 6 - P; j++)	{	System.out.print(" ");	}
				System.out.print("*");
				for(int j = 1; j <= (P * 2 - 1); j++)
				{
					System.out.print(P);
				}
				System.out.print("*");
				System.out.println();
			}
        
    }    
}