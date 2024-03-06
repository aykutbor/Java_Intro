//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";

        System.out.println(mesaj.replace(' ', '-'));

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}

    /* replace => metin üzerinde değiştirmek istediğimiz kısmı yenisiyle değiştirmemizi sağlar.
    Örneğe göre ilk değer oldChar ' ' metindeki boşlukları, newChar '-' işareti ile değiştirmek için kullanılır.
    -----
    substring ise metinde, belirttiğimiz yerden itibaren parçalamaya başlar.
    beginindex i 2 verdik, endindex i 4 verseydik 4.ncü indexe kadar kesecekti ve 4.ncü indexi dahil etmeyecekti.
    -----
    trim, string ifadelerin başındaki ve sonundaki boşlukları siler.
     */
