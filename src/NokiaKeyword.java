import java.util.Scanner;

public class NokiaKeyword {


    static String [] keyboard = {" 0", "1", "abc2", "def3",
                                "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9" };
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Xabarni kiriting: ");
        String message = scannerStr.nextLine().trim();

        String code = encode(message);
        System.out.println("code = " + code);

        System.out.println(decode(code));
    }
    static String encode (String message) {
        String code = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            for (int j = 0; j < keyboard.length; j++) {
                if(keyboard[j].contains(String .valueOf(c))){
                    code = code + j + (keyboard[j].indexOf(c)+1);
                }
            }
        }
        return code;
    }
    static String decode(String code){
        String message = "";
        for (int i = 0; i < code.length() - 1; i+=2) {
            String s2 = code.substring(i, i+2);
            int buttonNumber = s2.charAt(0)-'0';
            int letterIndex = s2.charAt(1)-'0';
            message= message + keyboard[buttonNumber].charAt(letterIndex-1);
        }
        return message;
    }
}
