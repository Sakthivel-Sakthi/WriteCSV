package information;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReaddatafromCSV {
	public static void main(String[] args) throws CsvValidationException {
		String filePath = "new_data.csv";
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			String[] rowData;
			while ((rowData = reader.readNext()) != null) {
				for (String data : rowData) {
					System.out.print(data + " ");
				}
				System.out.println();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Data are read");
	}
}
