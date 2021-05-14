import java.util.*;

public class oddLength {
    static String removeOddLengthCharacters(String s) {
        HashMap<Character, Integer> m = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            Integer count = m.get(p);
            if( count == null)
            {
                count=0;
                m.put(p,1);
            }
            else
                m.put(p,count + 1);
        }
        String new_string = "";
        for (int i = 0; i < s.length(); i++) {
            if ((m.get(s.charAt(i))& 1)==1)
                continue;
            new_string += s.charAt(i);
        }
        return new_string;
    }
    public static void main(String []args)
    {
        String str = "worldforworld";
        str = removeOddLengthCharacters(str);
        System.out.print(str);
    }

}
