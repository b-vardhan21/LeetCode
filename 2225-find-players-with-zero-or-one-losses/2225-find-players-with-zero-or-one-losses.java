class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        HashSet<Integer> allPlayers = new HashSet<>();
        HashSet<Integer> losers = new HashSet<>();
        HashSet<Integer> nonLosers = new HashSet<>();
        HashSet<Integer> lostOneMatch = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int[] match : matches){
            losers.add(match[1]);
            allPlayers.add(match[0]);
            allPlayers.add(match[1]);
            
            int lostTimes = map.getOrDefault(match[1],0);
            map.put(match[1], lostTimes + 1);
        }
        
        for(int i : allPlayers){
            if(!losers.contains(i)){
                nonLosers.add(i);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                lostOneMatch.add(entry.getKey());
            }
        }
        
        List<Integer> nonLosersList = new ArrayList<>(nonLosers);
        Collections.sort(nonLosersList);
        List<Integer> lostOneMatchList = new ArrayList<>(lostOneMatch);
        Collections.sort(lostOneMatchList);
        ans.add(nonLosersList);
        ans.add(lostOneMatchList);
        
        return ans;
        
        
    }
}