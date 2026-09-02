class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>(); //{ }
        for(String s: strs){  //cat
            char []arr = s.toCharArray(); //'c' 'a' 't'
            Arrays.sort(arr); //'a' 'c' 't'
            String cs = new String(arr); //[act]
            if(!map.containsKey(cs)){
                map.put(cs, new ArrayList<>()); 
            }
            map.get(cs).add(s);// act [cat]
        }
            return new ArrayList<>(map.values());

    }
}
