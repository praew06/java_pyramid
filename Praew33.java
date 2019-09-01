public class Praew33 {
    public static void main(String den[]){
        int Praew=3;
            for(int P=1;P<=Praew;P++){
                for(int j=P;j<=Praew+1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=P*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int P=1;P<Praew;P++){
                for(int j=1;j<=P+2;j++){
                    System.out.print(" ");
                }
                for(int j=P;j<=(Praew-1)*2-P;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
       
    }
}