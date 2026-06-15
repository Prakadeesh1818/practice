package java_practice;

	import java.util.*;

	public class rotateArray {
	    public static void main(String[] args) {

	        int[] arr = {1,2,3,4,5,6,7};
	        int k = 3;

	        int n = arr.length;

	        int[] temp = new int[n];

	        for(int i = 0; i < n; i++) {
	            temp[(i + k) % n] = arr[i];
	        }

	        for(int num : temp) {
	            System.out.print(num + " ");
	        }
	    }
	}