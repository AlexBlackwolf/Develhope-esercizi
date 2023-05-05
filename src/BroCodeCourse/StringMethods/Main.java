package BroCodeCourse.StringMethods;

public class Main {
    public static void main(String[] args) {
        String name = "Hunter ";
        boolean result = name.equals("Hunter");
        boolean result1 = name.equalsIgnoreCase("hunter");//ignore caps
        int result2= name.length();
        char result3=name.charAt(0);
        int result4= name.indexOf("H");
        boolean result5 = name.isEmpty();
        String result6 = name.toUpperCase();
        String result7 = name.toLowerCase();
        String result8 = name.trim();//remove empty space
        String result9 = name.replace("H","V");

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
    }
}
