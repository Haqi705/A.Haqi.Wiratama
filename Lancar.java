import java.util.Scanner;
public class Lancar{
    public static void main(String[] args){
        Scanner itung = new Scanner(System.in);
        System.out.println("Masukkan bilangan a");
        int a = itung.nextInt();
        if(a % 2 == 0){
            System.out.println("Bilangan anda genap");
        }else{
            System.out.println("Bilangan anda ganjil");
        }// String iya = "Halo";
    }
    
    
}

