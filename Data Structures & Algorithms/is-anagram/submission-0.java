class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, (oldVal, newVal) -> oldVal + newVal);
        }
        for (char c : t.toCharArray()) {
            map.merge(c, -1, (oldVal, newVal) -> oldVal + newVal);
        }
        return !map.entrySet().stream()
                    .anyMatch(e -> e.getValue() != 0);
                        
    }
}
