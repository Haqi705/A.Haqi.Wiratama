import java. util.Scanner;
public class sedang{
    public static void main(String [] args){
        Scanner masu = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat non negatif");
        int b = masu.nextInt();

        long faktorial = 1;

        for(int i = 1; i <= b; i++){
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + b + " adalah " + faktorial);
        masu.close();
    } 
}