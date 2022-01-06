public class Example {
    public static void main(String[] args) {
        System.out.println("String.valueOf(100) = " + String.valueOf(100));

        int num3 = Integer.parseInt("AB", 16);
        System.out.println("num3 = " + num3);

        int a = Integer.compare(10, 20);
        System.out.println("a = " + a);

        int max = Integer.max(100, 200);
        System.out.println("max = " + max);

        int min = Integer.min(100, 200);
        System.out.println("min = " + min);

        Integer intObj = 500;
        String s = intObj.toString();

        int a1=500;

        System.out.println(intObj.equals(a1));


    }
}
