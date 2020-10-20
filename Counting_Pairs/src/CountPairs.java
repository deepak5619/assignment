import java.util.*;

class CountPairs {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Integer, Integer> col = new HashMap<Integer, Integer>();
        
        while(n-- > 0) {
            int c = scn.nextInt();
            Integer frequency = col.get(c);
            
            // If any new color found ,then  add it to map
            if(frequency == null) {
                col.put(c, 1);
            }
            else { // Increment frequency of existing color
                col.put(c, frequency + 1);
            }
        }
        scn.close();
        
        // Count the number of pairs
        int pairs = 0;
        for(Integer frequency : col.values()) {
            pairs += frequency >> 1;
        }
        System.out.println(pairs);
    }
}