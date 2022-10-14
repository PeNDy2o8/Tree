
public class Main{


    public static void tree(){
        int  i,j,k;
        for(i=0;i<7;i++){
            for(k=0;k<7-i;k++){
                System.out.printf(" ");
            }

            for(j=0;j<i;j++){
                System.out.printf("**");
            }
            System.out.printf("*");
            System.out.println();
        }
        System.out.println("      ***");
        System.out.println("      ***");
        System.out.println("      ***");
    }

    public static void main(String[] args) {
        tree();
    }

}