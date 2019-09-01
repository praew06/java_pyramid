public class Praew07 {
    public static void main(String den[]){
        int Praew=5;
        for(int P=1;P<=Praew;P++){
            for(int j=1;j<=Praew-P;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=P;j++){
                System.out.print(j);
            }
            System.out.print(P);
            for(int j=P;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}