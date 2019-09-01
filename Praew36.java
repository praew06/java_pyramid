public class Praew36 {
    public static void main(String den[]){
        int Praew=3;
        for(int P=1;P<=Praew;P++){
            for(int j=P;j<=Praew;j++){
                System.out.print(j);
            }
            for(int j=1;j<=P*2-1;j++){
                System.out.print("*");
            }
            for(int j=Praew;j>=P;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int P=Praew-1;P>=1;P--){
            for(int j=P;j<=Praew;j++){
                System.out.print(j);
            }
            for(int j=1;j<=P*2-1;j++){
                System.out.print("*");
            }
            for(int j=Praew;j>=P;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}