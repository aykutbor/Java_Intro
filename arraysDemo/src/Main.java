import java.lang.String;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Aykut";
        String ogrenci2 = "Engin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);


        System.out.println("-------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Aykut";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4] = "Ali";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }


    }
}
