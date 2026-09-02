class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // char[] c = s.toCharArray();
            // Arrays.sort(c);

            // String key = new String(c)
            int[]freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
            }
            String key = Arrays.toString(freq);
;
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());

    }
}