import java.util.*;
// LeetCode #242 - Valid Anagram
public class P2ValidAnagramHashMap {

	public static boolean isAnagram(String s, String t) {
		if (s == null || t == null) return false;
		if (s.length() != t.length()) return false;

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c)) return false;
			map.put(c,map.get(c)-1);
			if(map.get(c)==0) {
				map.remove(c);
			}
		}

		return map.isEmpty();
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
}
