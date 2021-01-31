package homework3;

public class Task2ReplaceAllEx {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int valNm = (int) (Math.random() * 1001);
            stringBuilder.append(valNm).append(" ");
        }
        System.out.println(stringBuilder);
        String regex = "(?<=\\s|^)\\d{2}(?=\\s|$)";
        System.out.println(stringBuilder.toString().replaceAll(regex,
                "-1"));
    }
}