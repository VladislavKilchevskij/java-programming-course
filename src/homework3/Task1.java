package homework3;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i <=100 ; i++) {
            int nums = (int) (Math.random()*1001);
            str = str.concat(nums + " ");
        }
        System.out.println(str); //String example

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int valNm = (int) (Math.random() * 1001);
            stringBuilder.append(valNm).append(" ");
        }
        System.out.println(stringBuilder); // StringBuilder example
    }
}