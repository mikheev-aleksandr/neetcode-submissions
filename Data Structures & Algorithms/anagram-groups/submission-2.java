class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<Map<Character, Integer>, List<String>> smap = new HashMap<>();
        for (var s : strs) {
            var chars = s.toCharArray();
            Map<Character, Integer> cmap = new HashMap<>();
            for (var c : chars) {
                cmap.merge(c, 1, (oldV, newV) -> oldV + newV);
            }
            smap.computeIfAbsent(cmap, l -> new ArrayList()).add(s);
        }
        return new ArrayList<>(smap.values());
    }
}
