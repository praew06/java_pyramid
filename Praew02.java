public class Praew02 {
	public static void main(String args[]) {
		int totalP = 4;
		for (int P=1; P <= totalP; P++) {
			for (int col=P; col <= (P+2); col++) { System.out.print(col); }
			for (int col=1; col <= (2+P); col++) { System.out.print("*"); }
			System.out.println();
		}
	}
}