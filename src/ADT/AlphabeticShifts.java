package ADT;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticShifts {

	private ArrayList<String> shiftWordList = new ArrayList<String>();
	
	public void sort(CircularShift c) {
		// TODO Auto-generated method stub
		shiftWordList = c.getShiftList();
		Collections.sort(shiftWordList);	
	}

	public ArrayList<String> getList() {
		// TODO Auto-generated method stub
		return shiftWordList;
	}
	
}
