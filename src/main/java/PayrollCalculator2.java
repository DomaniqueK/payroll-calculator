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
                String[] sections = input.split("\\|");
                Employee employee = new Employee(Integer.parseInt(sections[0].trim()), sections[1].trim(), Double.parseDouble(sections[2].trim()), Double.parseDouble(sections[3].trim()));
                System.out.printf("Employee %d: %s made %.2f gross for the month. \n ", employee.getId(),employee.getName(), employee.calculateGrossPay());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }

    }
}
