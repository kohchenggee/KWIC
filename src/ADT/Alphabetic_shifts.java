package ADT;

import java.util.ArrayList;
import java.util.Collections;

public class Alphabetic_shifts {

	private ArrayList<String> shiftWordList = new ArrayList<String>();
	
	public void sort(Circular_shift c) {
		// TODO Auto-generated method stub
		shiftWordList = c.getShiftList();
		Collections.sort(shiftWordList);	
	}

	public ArrayList<String> getList() {
		// TODO Auto-generated method stub
		return shiftWordList;
	}
	
}
