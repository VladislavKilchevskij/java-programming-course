package homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String line = "cat dog elephant fox bunny fox dog cat fox";
        String[] arrayOfWords = line.split("\\s");
        String str = "";
        for (String word : arrayOfWords) {
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(line);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if (!str.contains(word)) {
                str = String.format(str.concat("%s - %d шт.\n"), word, count);
            }
        }
        System.out.println(str);
    }
}