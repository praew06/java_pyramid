public class Praew28 {
    public static void main(String den[]){
        int Praew=5;
        for(int P=1;P<=Praew;P++){
            for(int j=Praew;j>=P;j--){
                System.out.print(j);
            }
            for(int j=1;j<=P*2-1;j++){
                System.out.print("*");
            }
            for(int j=P;j<=Praew;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}