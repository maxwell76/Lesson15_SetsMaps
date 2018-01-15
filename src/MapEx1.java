
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("ON", "Toronto");
        m.put("PE", "Charllotetown");
        m.put("NF", "St. John's");
        m.put("NS", "Halifax");
        m.put("NB", "Fredricton");
        m.put("PQ", "Quebec City");
        m.put("MB", "Winnipeg");
        m.put("MO", "Winnipeg");
        m.put("SK", "Regina");
        m.put("AB", "Edmonton");
        m.put("BC", "Vancouver");
        m.put("AB", "Calgary");
        System.out.println(m);
        //change BC city
        m.replace("BC", "Victoria");
        //remove with the key
        m.remove("ON");
        System.out.println(m);
        //strange fro loop
        for (Map.Entry<String, String> prov : m.entrySet()) {
            System.out.println(prov.getKey()+"->"+prov.getValue());
        }
        //getting a lid=st of provences
        Set provs = m.keySet();
        Iterator it = provs.iterator();
        System.out.println("The provences are: ");
        while(it.hasNext())
            System.out.print(it.next() + ", ");
        System.out.println("");
        System.out.println("The capital of Mantoba is "+ m.get("MB"));     
    }
    
}
