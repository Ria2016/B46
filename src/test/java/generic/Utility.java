package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Utility {
	public static String getProperty(String path, String key) {
		String value = "";
		try {
			Properties p = new Properties();
			p.load(new FileInputStream(path));
			value = p.getProperty(key);
			System.out.println("inside ppt value is"+value);
		} catch (Exception e) {
          e.printStackTrace();
		}

		return value;
	}
}
