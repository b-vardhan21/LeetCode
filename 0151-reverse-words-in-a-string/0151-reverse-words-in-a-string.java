class Solution {
    public String reverseWords(String s) {
        
        int len = s.length();
        StringBuffer sb = new StringBuffer("");
        String[] arrOfStr = s.split(" +");
        
        for(int i = arrOfStr.length - 1; i >= 0 && arrOfStr[i]!=" "; i--){
         
                sb.append(arrOfStr[i]);
           
            
            if(i != 0){
                sb.append(" ");
            }
        }
        
        return sb.toString().trim();
        
    }
}