import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Vazifa {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Xabarni kiriting: ");
        String password = scanner.nextLine();
        if(password.length()>=8){
            boolean hasU = false, hasL = false, hasD = false, hasO = false;
            for (int i = 0; i < password.length(); i++) {
                char letter = password.charAt(i);
                if(Character.isUpperCase(letter)){
                    hasU = true;
                }else  if(Character.isDigit(letter)){
                    hasD = true;
                }else if(Character.isLowerCase(letter)){
                    hasL = true;
                }else {
                    hasO = true;
                }
            }     System.out.println("\nNatija: " + (hasU && hasL && hasD && hasO));
        }else{
            System.out.println("Parol 8 tadan kam bo'lmagan bo'lishi kerak!");
        }


        }
    }
