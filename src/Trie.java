
public class Trie {
	
	static TrieNode root;
	
	void insert(String key) {
		if(root==null) {
			root = new TrieNode();
		}
		TrieNode crawl = root;

		int index;
		int level;
		int length = key.length();
		for (level = 0; level < length; level++) {
			index = key.charAt(level) - 'a';
			if (crawl.children[index] == null) {
				crawl.children[index] = new TrieNode();
			}
			crawl = crawl.children[index];
		}
		
		crawl.isEndofWord = true;
		
	}
	
	boolean search(String key) throws Exception {
		if(root==null) {
			throw new Exception("searching in empty trie");
		}
		TrieNode crawl = root;
		
		int index;
		int level;
		int length = key.length();
		
		for(level=0;level<length;level++) {
			index = key.charAt(level) - 'a';
			if(crawl.children[index]==null) {
				return false;
			}
			crawl = crawl.children[index];
		}
		
		return (crawl!=null && crawl.isEndofWord);
	}
}
