package homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2PatMatchEx {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int valNm = (int) (Math.random() * 1001);
            stringBuilder.append(valNm).append(" ");
        }
        System.out.println(stringBuilder); // check
        Pattern pattern = Pattern.compile("(?<=\\s|^)\\d{2}(?=\\s|$)");
        Matcher matcher = pattern.matcher(stringBuilder);
        StringBuilder stringBuilder1 = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder1, "-1");
        }
        matcher.appendTail(stringBuilder1);
        System.out.println(stringBuilder1);
    }
}