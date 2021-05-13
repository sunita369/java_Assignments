import java.util.Iterator;  
import java.util.LinkedHashSet;  

public class LinkedHashSetDemo {
    public static void main(String args[]){    
        LinkedHashSet<String> lh=new LinkedHashSet();     
               lh.add("A");    
               
               lh.add("B");      
               lh.add("C");     
               lh.add("D");    
               lh.add("E");    
               Iterator<String> i=lh.iterator(); // Traversing objects    
               while(i.hasNext()) // Return true if the Scanner has another token input    
               {    
               System.out.println(i.next());// printing elements     
               }    
 }    

}
