
public class TrieNode {
	
	TrieNode[] children = new TrieNode[Constants.AlphabetSize];
	
	boolean isEndofWord;
	
	TrieNode() {
		isEndofWord = false;
		
		for(int i=0;i<Constants.AlphabetSize;i++) {
			children[i] = null;
		}
	}
}
