package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Janek");
        set.add("Basia");
        set.add("Asia");
        set.add("Olek");

        System.out.println(set.size());
        System.out.println(set);
        set.remove("Basia");
        System.out.println(set);

        for (String currentString: set){
            System.out.println(currentString);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String currentElement = iterator.next();
            System.out.println(currentElement);
        }
    }
}
