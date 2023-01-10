import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        String line;
        FutureTask[] returnedTask = new FutureTask[5];

        while((line = reader.readLine()) != null){

            Callable callable = new MyCallable();
            final String tempLine = line;
//            Thread t =  Thread.currentThread().getName() + "-" + tempLine.split(" ").length)

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            };

    }
}
