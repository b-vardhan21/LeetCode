class Solution {
    public boolean isAnagram(String s, String t) {
        {
        int ch[] = new int[26];
        int ch2[] = new int[26];
        if(t.length() != s.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            ch2[t.charAt(i)-'a']++;
        }
        return Arrays.equals(ch,ch2);
    }
}
}