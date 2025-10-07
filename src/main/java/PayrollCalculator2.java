import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator2 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String input;
            while((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }

    }
}
