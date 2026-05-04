// Implement a Trie (Prefix Tree) with insert and search operations.
class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean isEndOfWord = false;
}
class Trie{
    TrieNode root = new TrieNode();
    public void insert(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(node.child[index] == null){
                node.child[index] = new TrieNode();
            }
            node = node.child[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(node.child[index] == null){
                return false;
            }
            node = node.child[index];
        }
        return node.isEndOfWord;
    }
}
public class P1Tries {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("cat");
        t.insert("car");
        System.out.println("Done");
        System.out.println(t.search("cat"));
        System.out.println(t.search("car"));
        System.out.println(t.search("dog"));
    }
}
