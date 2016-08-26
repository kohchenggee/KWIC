package ADT;

import java.util.ArrayList;

public class Characters {
	private ArrayList<String> wordList = new ArrayList<String>();
	
	public void setChar(String string) {
		// TODO Auto-generated method stub
		wordList.add(string);
	}

	public ArrayList<String> getChar() {
		// TODO Auto-generated method stub
		return wordList;
	}

}
