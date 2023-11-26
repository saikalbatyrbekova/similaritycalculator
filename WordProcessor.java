import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class WordProcessor {
    private Set<String> distinctWords;

    public WordProcessor() {
        this.distinctWords = new HashSet<>();
    }

    public void readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words and add them to the set
                String[] words = line.split("\\s+");
                for (String word : words) {
                    distinctWords.add(word.toLowerCase()); // Convert to lowercase for case-insensitivity
                }
            }
        }
    }

    public Set<String> getDistinctWords() {
        return distinctWords;
    }
}
