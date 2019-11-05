import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {
     public static ArrayList<String> uniqueWords = new ArrayList<String>();

        public static void remove(String dataFile) throws FileNotFoundException
        {
            String testString = "";
            String testString2;
            Scanner scnr = new Scanner(new File(dataFile));
            while (scnr.hasNext()) {
                testString2 = scnr.next();
                    if (!testString.equals(testString2)) {
                        uniqueWords.add(testString2);
                    }
                    testString = testString2;
            }
            return;
        }
        public static void write(String outputFile)throws IOException {
            int i;
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(outputFile);
            try {
                    fileWriter.write(uniqueWords.toString());
                    fileWriter.close();
            } catch (IOException error) {
                System.out.println("IOException Error");
                System.exit(0);
            }
        return;
        }

    }
