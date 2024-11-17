import java.util.*;
public class smsMesajBoyu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int message = 2 , i;
        double smsLength = 0;

        for (i = 1; i <= message; i += smsLength) {

            System.out.print("Mesajınızı giriniz : ");
            String msg = input.nextLine();

            smsLength = (msg.length() / 160) + 1;

                System.out.println("Mesajınız " + msg.length() + " karakterden oluşuyor ve " + (int) Math.ceil(smsLength) + "kadar SMS'e bölünebilir.");

                System.out.println();

                System.out.println("Kalan SMS hakkınız : " + (message - i));

                System.out.println();
        }
        System.out.println();

        System.out.println("Maalesef SMS hakkınız bitmiştir. Tekrardan yükleme yapınız.");
    }
}
// Math.floor = kendisinden küçük olan en büyük tam sayı,
// Math.ceil = kendisinden büyük olan en küçük tam sayı.
// asdad.length.() kaç karakter girildiğini gösterir.