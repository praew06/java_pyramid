public class Praew21 {
    public static void main(String den[]){
        int Praew=5;
        for(int P=1;P<=Praew;P++){
            for(int j=0;j<=((Praew*2)-(P+3));j++){
                System.out.print("*");
            }
            System.out.print(P);
            for(int j=P;j>=1;j--){
                System.out.print("*");
            }
            System.out.println((Praew*2)-(P+2));
        }
    }
}