//implement by Phoon Qianonn
package ADT;

public class MasterControl {
	
	public static void run() {
		// TODO Auto-generated method stub
		Input i = new Input(); 
		CircularShift c = new CircularShift();
		AlphabeticShifts a = new AlphabeticShifts();
		Output o = new Output();
		i.readInput();
		c.setup(i);
		c.shift();
		a.sort(c);
		o.print(a);
	}

}
