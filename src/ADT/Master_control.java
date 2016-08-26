//implement by Phoon Qianonn
package ADT;

public class Master_control {
	
	public static String[] ignoreWords = {"is", "the", "of", "and", "as", "a", "after"};
	
	public static void run() {
		// TODO Auto-generated method stub
		Input i = new Input(); 
		Circular_shift c = new Circular_shift();
		Alphabetic_shifts a = new Alphabetic_shifts();
		Output o = new Output();
		i.readInput();
		c.setup(i,ignoreWords);
		c.shift();
		a.sort(c);
		o.print(a);
	}

}
