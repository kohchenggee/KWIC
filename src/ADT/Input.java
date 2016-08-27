package ADT;

import java.util.Scanner;

public class Input {
	Scanner sc = new Scanner(System.in);
	private String input;
	private String[] lines;
	private Characters words = new Characters();
	
	public void readInput(){
		input = sc.nextLine();
		while(!input.equals("")){
			/*lines = input.split(",");
			for(int i = 0; i < lines.length; i++){
				words.setChar(lines[i]);
			}*/
			words.setChar(input);
			input=sc.nextLine();
		}
	}
	
	public Characters getInput(){
		return words;
	}
}
