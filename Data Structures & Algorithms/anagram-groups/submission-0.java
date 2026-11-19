class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> resultMap = new HashMap<>();
        List<List<String>> resultList = new ArrayList<>();


        for(int i=0;i<strs.length;i++){

            String str = strs[i];

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            resultMap.computeIfAbsent(sortedString, k->new ArrayList<>()).add(str);

        }


        for(Map.Entry<String,List<String>> mapEntry: resultMap.entrySet()){
            resultList.add(mapEntry.getValue());
        }

        return resultList;
     
    }
}
