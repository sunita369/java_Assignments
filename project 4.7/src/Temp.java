import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Temp {
	   public static void main(String[] cmd_lineParams) {
		      Map<String, String> map = new HashMap<>(5);
		      map.put("name1", "value1");
		      map.put("name2", "{\"x\": \"y\"}");
		      map.put("name3", "value3");
		      map.put("name4", "value4");
		      map.put("name5", "value5");
		      forLoop(map);
		      resetAllValues(new HashMap<String, String>(map));
		      streamy(new HashMap<String, String>(map));
		   }
		   private static void streamy(HashMap<String, String> hashMap) {
		
	}
		private static void resetAllValues(HashMap<String, String> hashMap) {
		
	}
		private static final Matcher matcher = Pattern.compile("\"").matcher("ignored input");
		   private static final void forLoop(Map<String, String> map) {
		      StringBuilder builder = new StringBuilder();
		      for(Map.Entry<String, String> entry : map.entrySet()) {
		         String value = matcher.reset(entry.getValue()).replaceAll("\\\\\"");
		         builder.append("--").append(entry.getKey()).append(" \"").append(value).append("\"");
		      }
		      System.out.println("forLoop: " + builder.toString());
		   }


}
