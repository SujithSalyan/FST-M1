package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.println("Please Enter Integers :");
		System.out.println("(EOF or Non integer to terminate): ");
		
		while (scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value generated: "+index);
		System.out.println("Value in array at generated index" + nums[index]);
		
		scan.close();

	}

}
