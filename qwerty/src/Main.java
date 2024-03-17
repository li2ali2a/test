import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while (isContinue){
            System.out.println("choose direction of motion;: \n 1 - up \n 2 - down \n 3 - right \n - left");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                x++;
            } else if (input == 2) {
                x--;
            } else if (input == 3) {
                y++;
            } else if (input == 4) {
                y--;
            } else {
                System.out.println("error");
                isContinue = false;
        }
            System.out.println("rn at the:x=" + x + " , y=" + y );
        }
    }
}