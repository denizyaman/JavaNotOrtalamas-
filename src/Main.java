import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat= inp.nextInt();
        System.out.print("Fizik notunuz:");
        fizik= inp.nextInt();
        System.out.print("Kimya notunuz:");
        kimya= inp.nextInt();
        System.out.print("Türkçe notunuz:" );
        turkce= inp.nextInt();
        System.out.print("Tarih notunuz:");
        tarih=inp.nextInt();
        System.out.print("Müzik notunuz:");
        muzik=inp.nextInt();
        double toplam= mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc= toplam / 6;
        System.out.println(sonuc);
        boolean kosul1= sonuc>=60;
        boolean sonuc2= kosul1;
        String str= (sonuc2) ? "Geçti" :"Kaldı";
        System.out.println(str);
    }
}