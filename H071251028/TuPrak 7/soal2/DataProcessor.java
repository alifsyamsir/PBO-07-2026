package soal2;

import java.util.Random;

public class DataProcessor {

    private Random random = new Random();

    public int process(String fileName) {
        try {
            int time = random.nextInt(1501) + 500;
            Thread.sleep(time);

            int words = random.nextInt(400) + 50; 
            return words;

        } catch (InterruptedException e) {
            return 0;
        }
    }
}