package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public String readPropData(String dataToBeRead) throws IOException {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "//src//test//resources//config//config.properties";

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String nameOfBrowser = prop.getProperty(dataToBeRead);

		System.out.println(nameOfBrowser);
		
		return nameOfBrowser;

	}

	
}
