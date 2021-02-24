import java.util.HashMap;
import java.util.Set;

import javax.sound.midi.Track;

public class Hashmatique {
    public void songList() {
        HashMap<String, String> Tracklist = new HashMap<String, String>();
        Tracklist.put("Touch The Sky", "Find me here at Your feet again");
        Tracklist.put("Ready or Not", "Are you ready or not");
        Tracklist.put("From the Inside Out", "In my heart and my soul, \n Lord I give You control");
        Tracklist.put("Oceans", "And I will call upon Your name");
        System.out.println("Favorite Song - From the Inside Out : " + Tracklist.get("From the Inside Out"));

        Set<String> fullSet = Tracklist.keySet();
        for (String key : fullSet){
            System.out.println(key + " : " + Tracklist.get(key));
        }
    }
}