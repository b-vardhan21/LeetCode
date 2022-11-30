class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr = new int[26];
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int c : s.toCharArray()){
            arr[c - 'a']++;
        }
        for(int c : t.toCharArray()){
            arr[c - 'a']--;
        }
        
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]!=0) return false;
        }
        
        return true;

}
}