import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static String[] ignoreWords = {"is", "the", "of", "and", "as", "a", "after"};
	public static void main(String[] args) {
		ArrayList<String> msgArray = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int input = numOfInputs(sc);// TODO Auto-generated method stub
		
		msgArray=filterIgnoreWords( ignoreWords, sc, input);
		ArrayList<String> msgArray2=msgArray;
		Collections.sort(msgArray2);
		printMsg(msgArray2);
	}

	private static void printMsg(ArrayList<String> msgArray) {
		for(int i=0;i<msgArray.size();i++){
			System.out.println(msgArray.get(i));
		}
	}

	private static int numOfInputs(Scanner sc) {
		System.out.println("Number of Input");
		String num=sc.nextLine();
		int input = Integer.parseInt(num);
		return input;
	}

	private static ArrayList<String> filterIgnoreWords( String[] ignoreWords, Scanner sc, int input) {
		ArrayList<String> msgArray = new ArrayList<String>();
		String input2;
		for(int i=0;i<input;i++){

			input2=sc.nextLine();
			String[] split = input2.split(" ");
			for(int j=0;j<split.length;j++){
				String msg = "";
				boolean flag=false;
				flag = checkIgnoreWords(ignoreWords, split, j, flag);
				if(flag==false){
					addStringtoArrayList(msgArray, split, j, msg);
				}
			}
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

