
public class Runner {

	public static void main(String[] args) {
		
		Trie t = new Trie();
		String keys[] = {"the", "a", "there", "answer", "any", 
                "by", "bye", "their"};
		
		String output[] = {"Not present in trie", "Present in trie"};
		
		int i; 
        for (i = 0; i < keys.length ; i++) 
            t.insert(keys[i]);
        try {
        if(t.search("the") == true) 
            System.out.println("the --- " + output[1]); 
        else System.out.println("the --- " + output[0]); 
          
        if(t.search("these") == true) 
            System.out.println("these --- " + output[1]); 
        else System.out.println("these --- " + output[0]); 
          
        if(t.search("their") == true) 
            System.out.println("their --- " + output[1]); 
        else System.out.println("their --- " + output[0]); 
          
        if(t.search("thaw") == true) 
            System.out.println("thaw --- " + output[1]); 
        else System.out.println("thaw --- " + output[0]);
        } catch(Exception e) {
        	e.printStackTrace();
        }

	}

}
