package BasicLambda7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Iteration1 {
	public static void main(String[] args){
        Map<Integer, String> h=new HashMap<Integer, String>();
        h.put(1,"one");
        h.put(2,"two");
        h.put(3,"three");
        List<String> list=new ArrayList<String>(h.values());
        List<Integer> list1=new ArrayList<Integer>(h.keySet());
        StringBuilder sb=new StringBuilder();
        for(String s:list){
            sb.append(s);
        }
        for(Integer s1:list1){
            sb.append(s1);
        }
        System.out.println(sb.toString());
    }

}
