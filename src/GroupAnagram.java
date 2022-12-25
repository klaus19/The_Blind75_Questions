import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {

        //strs =["eat","tea","tan","ate","nat","bat"]

        // Create a map to store the anagrams
        Map<String, List<String>> anagramsMap = new HashMap<>();

        // Loop through the list of strings
        for (String str : strs) {
            // Convert the current string to a char array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            // Convert the sorted char array back to a string
            String sortedStr = new String(chars);

            // Check if the sorted string is already in the map
            if (!anagramsMap.containsKey(sortedStr)) {
                // If not, create a new entry in the map
                anagramsMap.put(sortedStr, new ArrayList<>());
            }

            // Add the current string to the list of anagrams for the sorted string
            anagramsMap.get(sortedStr).add(str);
        }

        // Convert the map values to a list and return it
        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String[] args) {
        GroupAnagram ga = new GroupAnagram();
        String[]str = new String[]{"cat", "dog", "tac", "god", "act"};
        System.out.println(ga.groupAnagrams(str));
    }

}
