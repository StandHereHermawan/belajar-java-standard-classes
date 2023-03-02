package programmer.zaman.now.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10000);
            System.out.println(value);

        }
    }
}
