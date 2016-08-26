//Implement By Koh Cheng Gee
package SDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SharedDataSolution {

	public static String[] ignoreWords = {"is", "the", "of", "and", "as", "a", "after"};
	public static void runSSD(){
	ArrayList<String> msgArray = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

		msgArray=filterIgnoreWords(ignoreWords,sc);
	
	Collections.sort(msgArray);
	printMsg(msgArray);
	}
	private static void printMsg(ArrayList<String> msgArray) {
		for(int i=0;i<msgArray.size();i++){
			System.out.println(msgArray.get(i));
		}
	}




	private static ArrayList<String> filterIgnoreWords( String[] ignoreWords, Scanner sc) {
		ArrayList<String> msgArray = new ArrayList<String>();
		String input2;
		System.out.println("System will display the list when enter Empty Line.");
		input2=sc.nextLine();
		while(!input2.equals("")){
			String[] split = input2.split(" ");
			for(int j=0;j<split.length;j++){
				String msg = "";
				boolean flag=false;
				flag = checkIgnoreWords(ignoreWords, split, j, flag);
				if(flag==false){
					addStringtoArrayList(msgArray, split, j, msg);
				}
			}input2=sc.nextLine();
		}
		
		return msgArray;
	}

	private static boolean checkIgnoreWords(String[] ignoreWords, String[] split, int j, boolean flag) {
		for(int k=0;k<ignoreWords.length;k++){
			if(split[j].equalsIgnoreCase(ignoreWords[k])){
				flag=true;
				break;
			}
		}
		return flag;
	}

	private static void addStringtoArrayList(ArrayList<String> msgArray, String[] split, int j, String msg) {
		msg+=split[j];
		for(int l=1;l<split.length;l++){
			int add=j+l;
			if(add>=split.length){
				add=add-split.length;
			}
			msg+=" "+split[add];
			
		}
		msgArray.add(msg);
	}
}
