
public class firstLetter {
    static String firstLetterWord(String str) {
        String result = "";
        boolean v = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
            {
                v = true;
            }
            else if (str.charAt(i) != ' ' && v == true)
            {
                result += (str.charAt(i));
                v = false;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String str = "Sun Up Shine Up";
        System.out.println(firstLetterWord(str));
    }
}
