
public class Praew23 {
    public static void main(String den[]){
        int Praew=5;
        for(int P=1;P<=Praew;P++){
            System.out.print(P);
            for(int j=P;j<=Praew+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<P;j++){
                System.out.print(" ");
            }
            System.out.println(P);
        }
    }
}
