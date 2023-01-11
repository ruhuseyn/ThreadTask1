package task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        String line;

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        int totalLength = 0;
        while ((line = reader.readLine()) != null) {

            final String tempLine = line;

            Future<Integer> number = executorService.submit(()->tempLine.split(" ").length);
            totalLength += number.get();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        executorService.shutdown();
        System.out.println(totalLength);
    }
}
