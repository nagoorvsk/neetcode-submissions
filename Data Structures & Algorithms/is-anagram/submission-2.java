class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sCharArray = s.toCharArray();
        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < sCharArray.length; i++) {
            freqMap.put(sCharArray[i], freqMap.getOrDefault(sCharArray[i], 0) + 1);
        }

        char[] tCharArray = t.toCharArray();

        for (int i = 0; i < tCharArray.length; i++) {
            
            if (!freqMap.containsKey(tCharArray[i]))
                return false;

            if (freqMap.get(tCharArray[i]) <= 0)
                return false;

            freqMap.put(tCharArray[i], freqMap.get(tCharArray[i]) - 1);
        }
        return true;
    }
}