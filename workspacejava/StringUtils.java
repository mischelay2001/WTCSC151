
public class StringUtils {
	
	public static String genGauge(String sb) {
		String strAndGauge = sb + "\n";
		for (int i = 0; i < sb.length(); i++) {
			strAndGauge += (i % 10);
		}
		return strAndGauge;
	}

}
