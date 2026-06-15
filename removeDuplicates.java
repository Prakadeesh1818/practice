package java_practice;

import java.util.*;
public class removeDuplicates {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<>();
		int []arr = {1,1,2,2,2,4,5,5};
		for(int x:arr) {
			set.add(x);
		}
		System.out.print(set.toString());
	}
}
