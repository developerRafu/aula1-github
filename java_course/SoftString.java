package java_course;

/**
 *
 * @author Rafu
 */
public class SoftString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ abc  DEFG";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("Original = "+original);
        System.out.println("Minúscula"+s01);
        System.out.println("Maiuscula"+s02);
        System.out.println("NoSpace = "+s03);
        System.out.println("2ª em diante = "+s04);
        System.out.println("2ª a 9ª = "+s05);
        System.out.println("a por x = "+s06);
        System.out.println("abc por xy = "+s07);
        System.out.println("Primeira ocorrência de bc = "+i);
        System.out.println("Última ocorrência de bc = "+j);
    }
}
