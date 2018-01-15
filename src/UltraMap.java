import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UltraMap {

    public static void main(String[] args) {
        HashMap<String, HashSet<Pokemon> > m = new HashMap<String, HashSet<Pokemon> >();
        
        //start Electric Colection and the rest
        m.put("ELECTRIC", new HashSet());
        m.put("WATER", new HashSet());
        m.put("GRASS", new HashSet());
        
        m.get("ELECTRIC").add(new Pokemon(25,"Picachu"));
        m.get("ELECTRIC").add(new Pokemon(100,"Voltorb"));
        m.get("ELECTRIC").add(new Pokemon(25,"Raichu"));
        
        m.get("WATER").add(new Pokemon(7,"SQuirtle"));
        m.get("WATER").add(new Pokemon(9,"Blastoise"));
        
        m.get("GRASS").add(new Pokemon(1,"Bulbasuar"));
        m.get("GRASS").add(new Pokemon(2,"Ivysuar"));
        m.get("GRASS").add(new Pokemon(3,"Venosuar"));
        m.get("GRASS").add(new Pokemon(45,"Vileplume"));
        
        System.out.println(m);
        
        //getting just the grass
        HashSet g = m.get("GRASS");
        Iterator it = g.iterator();
        System.out.println("Here are the Grass Pokemon");
        while(it.hasNext())
            System.out.println(it.next());
        
        //get a list of just the keys -> comes out as a SET
        Set types = m.keySet();
        
        it = types.iterator();
        System.out.println("Here are different types of pokemon");
        
        while(it.hasNext())
            System.out.println(it.next());
        
        /* This is if you are not pointing to a SET
        m.put("FIRE", new Pokemon(4,"Charmander"));
        m.put("WATER", new Pokemon(12,"Squirtle"));
        m.put("ELECTRIC", new Pokemon(5,"Picachu"));
        m.put("ELECTRIC", new Pokemon(26,"Richu"));
        System.out.println(m);
        */
    }
    
}
