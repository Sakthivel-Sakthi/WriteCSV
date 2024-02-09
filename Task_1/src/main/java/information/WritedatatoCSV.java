package information;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritedatatoCSV {
	public static String filePath = "new_data.csv";

	public static void writedata(List<Object[]> data) {
		try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
			List<String[]> stringData = new ArrayList<>();
			for (Object[] objArray : data) {
				String[] stringArray = new String[objArray.length];
				for (int i = 0; i < objArray.length; i++) {
					stringArray[i] = objArray[i].toString(); 
				}
				stringData.add(stringArray);
			}
			writer.writeAll(stringData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		List<Object[]> data = new ArrayList<>();
		data.add(new Object[] { "Name", "Age", "Roll_no", "District" });
		data.add(new Object[] { "Kish", "20", "73152121035", "Namakkal" });
		data.add(new Object[] { "Kesavan", "21", "73152121034", "Salem" });
		data.add(new Object[] { "Bharath", "21", "73152121009", "Erode" });
		data.add(new Object[] { "Sakthi", "20", "73152121047", "Namakkal" });
		data.add(new Object[] { "Siva ", "20", "73152121054", "Theni" });

		System.out.println("CSV file created and Data are writed");

		writedata(data);
	}
}
