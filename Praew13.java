public class Praew13 {
    public static void main(String den[]){
        int Praew=5;
        for(int P=1;P<=Praew;P++){
            for(int j=1;j<P*2-1;j++){
                System.out.print(" ");
            }
            for(int j=Praew*2-(P*2-1);j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}