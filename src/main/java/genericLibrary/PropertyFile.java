package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String getProperty(String key) throws IOException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(Constant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);// getProperty() method is an inbuilt method of String
		
		
	}
}
