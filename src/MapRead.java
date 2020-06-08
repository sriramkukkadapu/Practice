import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator; 
  
public class MapRead  
{ 
    public static void main(String[] arg) 
    { 
        Map<String,String> gfg = new HashMap<String,String>(); 
      
        // enter name/url pair 
        gfg.put("GFG", "geeksforgeeks.org"); 
        gfg.put("Practice", "practice.geeksforgeeks.org"); 
        gfg.put("Code", "code.geeksforgeeks.org"); 
        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
          
        // using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<String,String> entry : gfg.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
        
        Set set=gfg.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
        	Map.Entry entry = (Map.Entry)(itr.next());
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
    } 
} 