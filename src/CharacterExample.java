public class CharacterExample {
    public static void main(String[] args) {

        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        System.out.println("Character.isDigit('7') = " + Character.isDigit('7'));
        System.out.println("Character.isDigit(55) = " + Character.isDigit(55));

        System.out.println("Character.isLetter('j') = " + Character.isLetter('j'));
        System.out.println("Character.isLetter((int)'j') = " + Character.isLetter((int) 'j'));


        System.out.println("Character.isLetter('?') = " + Character.isLetter('?'));
        System.out.println("Character.isLetter('5') = " + Character.isLetter('5'));
        System.out.println("Character.isLetter('B') = " + Character.isLetter('B'));

        System.out.println("Character.isLowerCase('a') = " + Character.isLowerCase('a'));
        System.out.println("Character.isLowerCase('A') = " + Character.isLowerCase('A'));

        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isUpperCase('A') = " + Character.isUpperCase('A'));

        System.out.println("Character.isSpaceChar(' ') = " + Character.isSpaceChar(' '));
        System.out.println("Character.isSpaceChar('\t') = " + Character.isSpaceChar('\t'));
        System.out.println("Character.isSpaceChar('\n') = " + Character.isSpaceChar('\n'));
        System.out.println("Character.isSpaceChar('\r') = " + Character.isSpaceChar('\r'));

        System.out.println("Character.getNumericValue('J') = " + Character.getNumericValue('J'));

        System.out.println("Character.toLowerCase('J') = " + Character.toLowerCase('J'));
        System.out.println("Character.toUpperCase('j') = " + Character.toUpperCase('j'));

        System.out.println("Character.isWhitespace(' ') = " + Character.isWhitespace(' '));
        System.out.println("Character.isWhitespace('\t') = " + Character.isWhitespace('\t'));
        System.out.println("Character.isWhitespace('\r') = " + Character.isWhitespace('\r'));
        System.out.println("Character.isWhitespace('\n') = " + Character.isWhitespace('\n'));
        System.out.println("Character.isWhitespace('\b') = " + Character.isWhitespace('\b'));



        char c = '?';
        if(Character.isSpaceChar(c)){
            System.out.println((char)(int)c+32);
        }
        System.out.println(c);
    }
}