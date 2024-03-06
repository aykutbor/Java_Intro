//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf("e"));
    }
}
/* startsWith  => yazdığımız metnin belirttiğimiz harfle başlayıp başlamadığını kontrol eder.
   endsWith    => yazdığımız metnin son harfinin belirttiğimiz harf olup olmadığını kontrol eder.
   concat      => metne kelime eklemeyi sağlar.
   indexOf     => belirttiğimiz harfin metin içerisindeki index numarasını bulur. NOT: İlk bulduğunu getirir.
   lastIndexOf => harfi veya kelimeyi aramaya en sondan başlar. */


