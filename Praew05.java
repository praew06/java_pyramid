public class Praew05 {
    public static void main(String den[]){
        int totalP=4;
        for(int P=1;P<=totalP;P++){
            for(int col=totalP-1;col>=P;col--){
                System.out.print(" ");
            }
            System.out.print(P);
            for(int col=1;col<P;col++){
                System.out.print("**");
            }
            System.out.println(P);
        }
        for(int P=1;P<totalP;P++){
            for(int col=1;col<=P;col++){
                System.out.print(" ");
            }
            System.out.print(totalP-P);
            for(int col=totalP-1;col>P;col--){
                System.out.print("**");
            }
            System.out.println(totalP-P);
        }
    }
}