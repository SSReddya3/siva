package ob_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class utilites {

	public static String getProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/env.Properties");
		Properties p= new  Properties();
		
		//Properties p =new Properties();
		p.load(fis);
		
		return p.getProperty(key);
		
	}
	
	public static Long getAccountNum() {
			Random random = new Random();
			Long num = random.nextLong();
			return num;
		}
	
	public static Long getRandomNum() {
		Random random = new Random();
		Long num = random.nextLong();
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
