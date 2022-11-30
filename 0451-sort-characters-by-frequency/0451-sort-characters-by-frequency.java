class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        ArrayList<Character> sortKeys
            = new ArrayList<>(hm.keySet());
 
        sortKeys.sort((x,y) -> hm.get(y) - hm.get(x));
     
        for(char ch: sortKeys){
            for(int i=0; i<hm.get(ch); i++){
                
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}