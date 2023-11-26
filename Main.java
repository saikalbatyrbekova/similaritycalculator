import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            // Instantiate WordProcessor and SimilarityCalculator
            WordProcessor wordProcessor = new WordProcessor();
            SimilarityCalculator similarityCalculator = new SimilarityCalculator();

            // Read text from files
            wordProcessor.readFile("file1.txt");
            Set<String> set1 = wordProcessor.getDistinctWords();

            wordProcessor = new WordProcessor(); // Reset for the second file
            wordProcessor.readFile("file2.txt");
            Set<String> set2 = wordProcessor.getDistinctWords();

            // Calculate and display similarity
            double similarity = similarityCalculator.calculateSimilarity(set1, set2);
            System.out.println("Jaccard Similarity: " + similarity);

        } catch (IOException e) {
            e.printStackTrace();
            // Handle file-related exceptions
        }
    }
}