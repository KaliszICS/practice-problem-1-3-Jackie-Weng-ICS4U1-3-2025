import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

    public static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            
            return "Error reading file: " ;
        }
        return content.toString();
    }

    public static String backwardsReadFile(String filename) { //
        String content = "";
        try {
            content = readFile(filename); 
        } catch (Exception e) {
            return "Error reading file: " ;
        }
        return new StringBuilder(content).reverse().toString(); 
    }

    public static void main(String[] args) {
        
        String filename = "example.txt"; 
        System.out.println("File Content:");
        System.out.println(readFile(filename));
        
        System.out.println("Reversed File Content:");
        System.out.println(backwardsReadFile(filename));
    }
}