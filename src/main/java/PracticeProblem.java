
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PracticeProblem {
    public static String readFile(String filename) {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get(filename);
            return new String(java.nio.file.Files.readAllBytes(path));
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return ""; 
        }
    }



public static String backwardsReadFile(String filename) {
    try {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new StringBuilder(content).reverse().toString();
    } catch (IOException e) {
        e.printStackTrace();
        return ""; 
    }
}
}