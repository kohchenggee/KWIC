package ADT;

import java.util.ArrayList;

public class CircularShift {
	private ArrayList<String> wordList = new ArrayList<String>();
	private ArrayList<String> shiftWordList = new ArrayList<String>();
	private ArrayList<String> ignoreList = new ArrayList<String>();
	
	public void setup(Input in){
		wordList = in.getInput().getChar();
		ignoreList = in.getInput().getIgnore();
	}

	public void shift() {
		// TODO Auto-generated method stub
		for(int i=0;i<wordList.size();i++){
			shiftPart(wordList.get(i));
		}
	}

	private void shiftPart(String string) {
		// TODO Auto-generated method stub
		String[] splitString = string.trim().split(" ");
		for(int i=0;i<splitString.length;i++){
			if(checkIgnore(splitString[0])){
				shiftWordList.add(combine(splitString));
				splitString=shifting(splitString);
			}else{
				splitString=shifting(splitString);
			}
		}
	}

	private String[] shifting(String[] splitString2) {
		// TODO Auto-generated method stub
		String temp = splitString2[0];
		for(int i=0;i<splitString2.length;i++){
			if(i+1<splitString2.length){
				splitString2[i]=splitString2[i+1];
			}else{
				splitString2[i]=temp;
			}
		}
		return splitString2;
	}

	private String combine(String[] splitString2) {
		// TODO Auto-generated method stub
		String result = "";
		for(int i=0;i<splitString2.length;i++){
			if(i+1==splitString2.length){
				result= result + splitString2[i];
			}else{
				result= result + splitString2[i]+" ";
			}
		}
		return result;
	}

	private boolean checkIgnore(String string) {
		// TODO Auto-generated method stub
		for(int i=0;i<ignoreList.size();i++){
			if(string.toLowerCase().equals(ignoreList.get(i).toLowerCase().trim())){
				return false;
			}
		}
		return true;
	}

	public ArrayList<String> getShiftList() {
		// TODO Auto-generated method stub
		return shiftWordList;
	}
}
