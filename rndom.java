import java.util.Random;
import java.util.Scanner;

public class rndom{
    public static void main(String[] args){
        Scanner jup = new Scanner(System.in);
        Random ack = new Random();
        boolean lnjt = true;
        
        while(lnjt){
            int a = ack.nextInt(100) + 1;
            int b = ack.nextInt(100) + 1;
            
            char[] jlo = {'*','/','%'};
            char jla = jlo[ack.nextInt(jlo.length)];
            
            int hasil;
            if(jla == '*'){
                hasil = a * b;
            }else if(jla == '/'){
                hasil = a / b;
                
            }else{
                hasil = a % b;
            }
            System.out.printf("%d %c %d =",a,jla,b);
            
            int jwbn = jup.nextInt();
            
            if(jwbn == hasil){
                System.out.println("Jawaban Benar");
            }else{
                System.out.println("Salah, jadi itu hasilnya %d %n" + hasil);
            }
            System.out.println("Mau lanjut? (y/gk)");
            String pilih = jup.next();
            
            if(pilih.equalsIgnoreCase("gk")){
                lnjt = false;
                System.out.println("Terimakasih!!!");
                jup.close();
            }
            // Soal 3 Sedang//
        }
        // if(nilai lebih besar dari 90){
        //System.out.println("Nilai Sangat Bagus");
        //}else{
        //}

        /*
        for(int i = 1;  i >= 50; i++){
        }System.out.println("Iya");
        ///  */
        
        
    }
    
}
