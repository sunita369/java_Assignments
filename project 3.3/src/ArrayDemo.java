import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
 
public class ArrayDemo {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Mercury", "Venus", "Earth","Mars", "Jupiter","Saturn", "Uranus", "Neptune");
 
        ListIterator<String> itr = list.listIterator(list.size());
 
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }

}
