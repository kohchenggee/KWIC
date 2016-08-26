package ADT;

import java.util.ArrayList;

public class Output {

	private ArrayList<String> sortWordList = new ArrayList<String>();
	public void print(Alphabetic_shifts a) {
		// TODO Auto-generated method stub
		sortWordList = a.getList();
		for(int i=0;i<sortWordList.size();i++){
			System.out.println(sortWordList.get(i));
		}
	}

}
