import java.util.Scanner;

public class vaqtincha {
    public static void main(String[] args){
        Scanner scannner = new Scanner(System.in);
        System.out.println("Biror bir harf kiriting: ");
        char ch;
        ch=scannner.next().charAt(0);
         int a = ch;
        System.out.println("ASCII code: " + ch + "ni ASCII code teng=> " + a);
    }
}
