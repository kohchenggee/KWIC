import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ADT.Input;
import ADT.Master_control;
import SDS.SharedDataSolution;
public class Main {

	public static String[] ignoreWords = {"is", "the", "of", "and", "as", "a", "after"};
	public static void main(String[] args) {
		//ArrayList<String> msgArray = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Press 1 to run with Shared Data Solution/nPress 2 to run with ADT");
		String num=sc.nextLine();
		int input = Integer.parseInt(num);
		if(input==1){
		SharedDataSolution.runSSD();
		}else if(input==2){
		Master_control.run();
		}
	}

	

}

