import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args){
        try {
            DuplicateRemover.remove("src/problem1.txt");
            DuplicateRemover.write("src/unique_words.txt");
            DuplicateCounter.count("src/problem2.txt");
            DuplicateCounter.write("src/unique_word_counts.txt");
        }
        catch (IOException error){
            System.out.println("IOException Error");
            System.exit(0);
        }
        return;
        }

    }
