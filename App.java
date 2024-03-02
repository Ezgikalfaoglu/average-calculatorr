import java.util.Scanner;

public class App{
   public static void main(String[] args){
    
       int mat, fizik, kimya, turkce, tarih;
       Scanner scanner= new Scanner(System.in);
       System.out.println("Matematik notunuz : ");
       mat= scanner.nextInt();
       System.out.println("Fizik notunuz : ");
       fizik= scanner.nextInt();
       System.out.println("kimya notunuz: ");
       kimya= scanner.nextInt();
       System.out.println("Turkce notunuz:");
       turkce= scanner.nextInt();
       System.out.println("Tarih notunuz:");
       tarih=scanner.nextInt();
       int toplam= (mat + fizik + kimya + turkce + tarih);
       double sonuc= toplam/5;
       System.out.println("Ortalamanız:" + sonuc);
       
       
       
       
}
 
}