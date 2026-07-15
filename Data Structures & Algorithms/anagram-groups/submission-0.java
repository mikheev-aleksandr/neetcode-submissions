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
            var list = smap.getOrDefault(cmap, new ArrayList());
            list.add(s);
            smap.put(cmap, list);
        }
        for (var r : smap.values()) {
            result.add(r);
        }
        return result;
    }
}
