package hackerrank;

import java.util.*;

/**
 * Created by rohan on 4/7/16.
 * Sort the Hash map based on values
 */
public class SortingHashMap {
    private static Map<String, String> sortByComparator(Map<String, String> unsortMap) {

        List<Map.Entry<String,String>> list = new ArrayList<>(unsortMap.entrySet());


        // Sort list with comparator, to compare the Map values
//        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//            public int compare(Map.Entry<String, String> o1,
//                               Map.Entry<String, String> o2) {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });

        Collections.sort(list, entryComparator);


        // Convert sorted map back to a Map
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (Iterator<Map.Entry<String, String>> it = list.iterator(); it.hasNext();) {
            Map.Entry<String, String> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static  Comparator<Map.Entry<String,String>> entryComparator = new Comparator<Map.Entry<String, String>>() {
        @Override
        public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
             return (o1.getValue().compareTo(o2.getValue()));
        }
    };
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey()
                    + " [Value] : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("z", "a");
        unsortMap.put("b", "x");
        unsortMap.put("a", "b");
        unsortMap.put("c", "c");


        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......");
        Map<String, String> sortedMap = sortByComparator(unsortMap);
        printMap(sortedMap);

    }
}
