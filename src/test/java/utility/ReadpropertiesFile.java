package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr =new FileReader("C:\\Users\\Shahe alam\\eclipse-workspace\\SeleniumAutomationFramework\\TestAutomationFramework\\src\\test\\resources\\configfile\\config.properties");
		
		Properties p =new Properties();
		
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));

	}

}
 