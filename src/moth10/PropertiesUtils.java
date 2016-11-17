package moth10;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtils {
	
	public static String readByKey(final String filePath, final String key) {
		String value = null;
		Properties prop = new Properties();
		InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream(filePath);
		try {
			prop.load(in);
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static Map<String, String> readProperties(final String filePath) {
		Map<String, String> kvDatas = null;
		Properties prop = new Properties();
		InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream(filePath);
		try {
			prop.load(in);
			kvDatas = new HashMap<String, String>();
			Set<Object> keys = prop.keySet();
			Iterator<Object> iter = keys.iterator();
			while (iter.hasNext()) {
				Object key = iter.next();
				if (null != key) {
					String keyStr = String.valueOf(key);
					kvDatas.put(keyStr, prop.getProperty(keyStr));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return kvDatas;
	}
	public static void main(String[] args) {
//	    String name=PropertiesUtils.readByKey("zhai.properties","zhai");
//	    
//	    System.out.println(name);
		Map<String, String> prop = PropertiesUtils.readProperties("zhai.properties");
		System.out.println(prop.get("zhai"));
	}
}
