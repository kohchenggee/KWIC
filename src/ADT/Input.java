package ADT;

import java.util.Scanner;

public class Input {
	Scanner sc = new Scanner(System.in);
	private String input,ignore;
	private Characters words = new Characters();
	
	public void readInput(){
		System.out.println("Please insert word to ignore. \nPress enter twice to start insert the lines to process\n");
		ignore = sc.nextLine();
		while(!ignore.equals("")){
			words.setIgnore(ignore);
			ignore=sc.nextLine();
		}
		System.out.println("Please insert the lines to process. \nPress enter twice to get the output\n");
		input = sc.nextLine();
		while(!input.equals("")){
			words.setChar(input);
			input=sc.nextLine();
		}
	}
	
	public Characters getInput(){
		return words;
	}
}
