import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        String value = "I like java!!!";
        String textPalindroms = "дед довод врач ретр€нсл€тор закказ м€ч комок тут";
        Scanner sc = new Scanner(System.in);

//        methods.outString(value);
//        System.out.println(value.charAt(10));
//        System.out.println(value.endsWith("!!!"));
//        System.out.println(value.startsWith("I like"));
//        System.out.println(value.contains("like"));
//        System.out.println(value.indexOf("java"));
//        System.out.println(value.replace('a', 'o'));
//        System.out.println(value.toUpperCase());
//        System.out.println(value.toLowerCase());
//        System.out.println(value.substring(2, 6));
//        System.out.println(Arrays.toString(textPalindroms.split(" ")));
//        methods.palindroms(textPalindroms);
//        methods.wordLength(textPalindroms);
//        methods.minLength(textPalindroms);
//        methods.maxLength(textPalindroms);

//        StringBuilder stringBuilder = new StringBuilder("");
//        System.out.println(stringBuilder.append("3")
//                .append(" - ")
//                .append("56")
//                .append(" = ")
//                .append("-53"));
//
//        StringBuilder stringBuilder1 = new StringBuilder("");
//        System.out.println(stringBuilder1.append("3")
//                .append(" + ")
//                .append("56")
//                .append(" = ")
//                .append("59"));
//
//        StringBuilder stringBuilder2 = new StringBuilder("");
//        System.out.println(stringBuilder2.append("3")
//                .append(" - ")
//                .append("56")
//                .append(" = ")
//                .append("-53"));

        String twoWords = sc.nextLine();
        methods.firstLastPart(twoWords);
    }
}
