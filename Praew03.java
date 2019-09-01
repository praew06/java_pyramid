public class pyramid03 {
	public static void main(String args[])   {
		int totalP = 4;
		for (int P=1; P <= totalP; P++) {
			System.out.print(P + "" + (P + 4));
			for (int col=1; col <= (4 + P); col++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}