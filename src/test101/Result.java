package test101;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1
		HashSet<Integer> RandamArray = new HashSet<Integer>();
		Random randNumber = new Random();
		while (RandamArray.size() < 4) {
			RandamArray.add(1 + randNumber.nextInt(6));
		}
		System.out.println(RandamArray);
		ArrayList<String> test = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			test.add("#");
		}

		
		for (int K = 0; K<10; K++) {

			// step 2
			Scanner input = new Scanner(System.in);
			ArrayList<Integer> UserArray = new ArrayList<Integer>();

			// System.out.println("enter four numbers one by one from 1 to 6");
			for (int IforUser = 0; IforUser < 4; IforUser++) {

				UserArray.add(input.nextInt());
			}

			System.out.println("your numbers are" + UserArray);

			// step3
			ArrayList<Integer> convertiArray = new ArrayList<>(RandamArray);
			for (int i = 0; i < 4; i++) {
				if (convertiArray.get(i) == UserArray.get(i)) {
					result.add("#");
				} else if (RandamArray.contains(UserArray.get(i))) {
					result.add("O");
				}
			}

			if (test.equals(result)) {
				System.out.println("you are win :)");
				System.out.println(result);
				break;

			}else if(K==9 && !test.equals(result)) {
				System.out.println("you are lose");
			}else {
				System.out.println("play again ");
				
			}

		}

	}
}
