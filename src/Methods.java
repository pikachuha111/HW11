import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Methods {

    public Methods() {
    }

    public void outString(String string) {
        System.out.println(string);
    }

    public void palindroms(String string) {
        String[] firstArray = string.split(" ");

        for (String a : firstArray) {
            String b = new StringBuffer(a).reverse().toString();
            if (a.equalsIgnoreCase(b)) {
                System.out.println(a + " - палиндром");
            }
        }
    }

    public void wordLength (String string) {
        String[] array = string.split(" ");
        for (String a : array) {
            int countByte = a.getBytes().length;
            if (countByte >= 3 && countByte <= 5) {
                System.out.println(a);
            }
        }
    }

    public void minLength (String string) {
        String[] array = string.split(" ");
        int min  = Integer.MAX_VALUE;
        String result = null ;
        for (String a : array ) {
            int count = a.getBytes().length;
            if (count <= min) {
                min = count;
                result = a;
            }
        }
        System.out.println(result);
    }

    public void maxLength (String string) {
        String[] array = string.split(" ");
        int max  = Integer.MIN_VALUE;
        String result = null ;
        for (String a : array ) {
            int count = a.getBytes().length;
            if (count >= max) {
                max = count;
                result = a;
            }
        }
        System.out.println(result);
    }

    public void firstLastPart (String string) {
        String[] array = string.split(" ");
        int first = array[0].length()/2;
        int second = array[1].length()/2;
        System.out.println(array[0].substring(0, first) + array[1].substring(second, array[1].length()));
    }

}
