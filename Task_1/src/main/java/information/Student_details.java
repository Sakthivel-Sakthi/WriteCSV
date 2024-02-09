package information;

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Student_details {
    public static String Filepath = "StudDetails.csv";

    public static void Writedata(List<String[]> data) {
        try (CSVWriter write = new CSVWriter(new FileWriter(Filepath))) {
            write.writeAll(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Readdata() {
        try {
            CSVReader read = new CSVReader(new FileReader(Filepath));
            String[] nextLine;
            while ((nextLine = read.readNext()) != null) {
                for (String token : nextLine) {
                    System.out.print(token + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String[]> data = new ArrayList<>();
        data.add(new String[] { "Name", "Age", "Roll_no", "District" });
        data.add(new String[] { "Kish", "20", "73152121035", "Namakkal" });
        data.add(new String[] { "Kesavan", "21", "73152121034", "Salem" });
        data.add(new String[] { "Bharath", "21", "73152121009", "Erode" });
        data.add(new String[] { "Sakthi", "20", "73152121047", "Namakkal" });
        data.add(new String[] { "Siva ", "20", "73152121054", "Theni" });
        data.add(new String[] { "Ajay", "20", "73152121002", "Coimbatore" });
        data.add(new String[] { "Sanjay", "21", "73152121048", "Erode" });
        data.add(new String[] { "Jeeva", "20", "73152121029", "Tirupur" });
        data.add(new String[] { "ram", "20", "73152121046", "salem" });
        Writedata(data);
        Readdata();
    }
}
