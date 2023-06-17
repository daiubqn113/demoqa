package common;

public class Utils {
	/**
	 * This is a class which contains all common handling not related to Selenium 
	 * Including: read/write files (csv, json, Excel, word,...); capture evidences; ...
	 */
	
	//Cắt chuỗi từ 1 kí tự bất kì đến cuối string
	public static String getSubStringFromCharacter(String originalStr, String fromCharacter) {
		int startIndex = originalStr.indexOf(fromCharacter) + 1;
		String result = originalStr.substring(startIndex);
		return result;
	}
}
