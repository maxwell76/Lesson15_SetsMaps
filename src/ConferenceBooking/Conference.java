package ConferenceBooking;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.ImageIcon;

public class Conference {
    private String name, description;
    private HashSet<Guest> people;
    private ImageIcon image;
    
    public Conference(String n, String d, String img){
        name = n;
        description = d;
        image = new ImageIcon(getClass().getResource(img));
        people = new HashSet();
    }

    public String getName() {
        return name;
    }
  
    public String getDescription() {
        return description;
    }

    public HashSet<Guest> getPeople() {
        return people;
    }
    
    public ImageIcon getImage() {
        return image;
    }
    
    //to do by you late
    public boolean signup(Guest g){
        return true;
        
    }
    
    public boolean remove(Guest g){
        return true;
    }
    
    public void save(PrintWriter pw, String key){
        Iterator it = people.iterator();
        while(it.hasNext()){
            pw.println(key);
            pw.println(it.next());
        }
    }

    
}
