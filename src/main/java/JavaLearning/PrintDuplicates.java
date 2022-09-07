package JavaLearning;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
	
	public boolean pall() {
		int[] nums= {1,2,3,1};
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j])
				{
					return true;
				}
			}}
		
			return false;
	}
	
	public static void main(String[] args) {
		PrintDuplicates call= new PrintDuplicates();
		call.pall();

		int[] a = { 1, 2, 2, 3, 4, 5, 6, 3, 6, 6, 7, 8 };
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.println(a[i]);
			}
		}
		System.out.println();
		System.out.println("********************* ");

		int[] x = { 11, 12, 16, 17, 18 };
		int[] y = { 10, 12, 16, 15, 18 };

		for (int j = 0; j < x.length; j++) {
			for (int k = j; k < y.length; k++) {
				if (x[j] == y[k]) {
					System.out.println(x[j]);
				}
			}

		}
		System.out.println();
		System.out.println("********************* ");

		String str = "It is good to be a Selenium Trainer";
		String[] split = str.split(" ");
		for (int w = 0; w < split.length; w++) {
				char[] charArray = split[w].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
					}

		System.out.println();
		System.out.println("********************* ");
		String word1 = "noo";
		String rev = "";
		char[] charArray = word1.toCharArray();
		for (int l = charArray.length - 1; l >= 0; l--) {
			rev = rev + charArray[l];
		}
		if (word1.equals(rev)) {
			System.out.println(rev + " :Its a pallindrome");
		} else {
			System.out.println(rev + " : not a pallindrome");
		}

		System.out.println();
		System.out.println("********************* ");
		String sent = "Iam practicing the java code for code Interview to do well in java Interview";
		String temp = " ";
		String[] sentsp = sent.split(" ");
		for (int m = 0; m <= sentsp.length - 1; m++) {
			for (int n = m + 1; n <= sentsp.length - 1; n++) {
				if (sentsp[m].equals(sentsp[n])) {
					sentsp[n] = "";
					temp = temp + " " + sentsp[m];
				}
			}
		}
		
		System.out.println(temp);
		for (int h = 0; h <= sentsp.length - 1; h++) {
			System.out.print(sentsp[h] + " ");
		}
		System.out.println();

		System.out.println("********************* ");
		
		Set<String> dup=new LinkedHashSet<String>(Arrays.asList(sentsp));
		System.out.println(dup);
		System.out.println();
		System.out.println("********************* ");

		String s="google";
	
		char[] charArray2 = s.toCharArray();
		Set<Character> ch=new LinkedHashSet<Character>();
		for (Character c : charArray2) {
			ch.add(c);
			
		}
		for (Character dupl : ch) {
		System.out.print(dupl.toString().replace(","," ").replace(" ", ""));
		}
		
		System.out.println();
		System.out.println("********************* ");
		 String input="Testleaf";//testlaf
	     char[] charArray4 = input.toCharArray();
	     Set<Character>unique=new LinkedHashSet<Character>();
	     for (int i = 0; i < charArray4.length; i++) {
	    	 if(!unique.add(charArray4[i])) {
	    		 unique.remove(charArray4[i]);
	    		 
	    	 }
			
		}
	     System.out.println(unique);
		
		
		
				
		
		
		
		
		
		
		
		
		
		
	}
	

}
		
	

