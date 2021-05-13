package Company;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Emp e1 = new Emp("rima");
		Emp e2 = new Emp("sila");
		Emp e3 = new Emp("reva");
		Date d1 = new Date(1, 11, 1998);
        Date d2 = new Date(1, 11, 2000);
        Date d3 = new Date(2, 12, 1998);
        Map<Date, Emp> m1;
        m1 = new HashMap<Date, Emp>();
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
        for(Map.Entry<Date,Emp> entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
