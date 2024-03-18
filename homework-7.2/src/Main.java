import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i];
        }
        double average = (double) sum / people.length;
        System.out.println("Средний возраст: " + average);
    }
}