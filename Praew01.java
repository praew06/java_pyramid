public class Praew01 {
	public static void main(String args[]) {
		int totalP = 4;
		for (int row=1; row <= totalP; row++) {
			
			for (int col=2; col <= row; col++) { System.out.print(" "); }
			System.out.print(row + "" + row);
			for (int col=totalP; col >= (row + 1); col--) { System.out.print("**"); }
			System.out.println( row + "" + row);
		}
	}
}