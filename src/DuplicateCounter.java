import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DuplicateCounter {
    static Map <String,Integer> wordCounter = new HashMap<>();
    public static void count(String dataFile) throws FileNotFoundException {
        String word;
        Scanner scnr = new Scanner(new File(dataFile));
        while (scnr.hasNext()) {
            word = scnr.next();
            if (wordCounter.containsKey(word)) {
                wordCounter.put(word , wordCounter.get(word) + 1);
            }
            else{
                wordCounter.put(word, 1);
            }
        }
        return;
    }
    public static void write(String outputFile) throws IOException {
        FileWriter fileWriter = new FileWriter(outputFile);
        File fileData = new File(outputFile);
        try {
            if (!fileData.exists()) {
                fileData.createNewFile();
            }
            fileWriter.write(wordCounter.toString());
            fileWriter.close();
            wordCounter.clear();
        } catch (IOException error) {
            System.out.println("IOException error");
            System.exit(0);
        }
        return;
    }
}
