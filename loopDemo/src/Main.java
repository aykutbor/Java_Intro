import java.lang.*;


public class Main {
    public static void main(String[] args) {
        // for
        for(int i = 1; i <= 10; i++){
            System.out.println("Döngü " + i);
        }
            System.out.println("For Döngüsü bitti");

        // while
        int i=1;

        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");


        // Do-While
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");

    }

}
