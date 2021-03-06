package javapractice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Question01 {
	//1.A sandwich is two pieces of bread with something in between.
	//Print the string that is between the first and last appearance of "bread" in the 
	//given string, or return string "nothing" if there are not two pieces of bread.
    // EX: breadozkanbread --> ozkan, breadozkan -->nothing
	
	
	/*
	  @returns String between the word od breads otherwise returns "nothing"
	*/
	
	static String isSandwich(String str) {
		
		int first = str.indexOf("bread");
		int second = str.lastIndexOf("bread");
		if(first==second)
		return"nothing";
		return str.substring(first +5,second);
	}
	
	public static String san(String str) {
        int a=str.indexOf("bread");
        int b=str.lastIndexOf("bread");
        return(a==b)? "nothing": str.substring(a+5,b);
    }
	
	
	//2.Print true if the string "java" and "python" appear the same number of times in the given string word.
     
	static boolean isCountSame(String str) {
		int countJava,countPython;
		countJava =countPython=0;
		str = str.replace(" ", "").toLowerCase();
		for(int i=0;i<str.length()-5 ;i++) {
			if(str.substring(i,i+4).equals("java"))
				countJava++;
			if(str.substring(i,i+6).equalsIgnoreCase("python"))
				countPython++;
		}
		return countJava == countPython;
	}
	
	//3.create a two dimensional array of random numbers.
	/**
    *
    * @param outerSize
    * @param innerSize
    * @return a 2 dimensional array of random numbers.
    */
	static int[][] ArrayGenerator(int outerSize, int innerSize){
        int[][] arr = new int[outerSize][innerSize];
        for(int i = 0; i < outerSize; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = new Random().nextInt(20);
            }
        }
        return arr;
    }
	
	
	//4.Given a 2d array of ints, find the biggest number(int) in the array and print it.

    /**
     * @param arr is the 2 dim array.
     * @return the max number in the array that is passed in.
     */
    static int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] eachArr : arr){
            for(int num : eachArr){
                if(num > max)
                    max = num;
            
        }
        }
        System.out.println(Arrays.deepToString(arr));
        return max;
    }
    //5. Write a method that collects the all positive Armstrong numbers up to the number that is passed in.
    //Armstrong is a number that is equal to the sum of its own digits and each digit being raised 
    //to the power of the number of digits. EX: 371 = 3^3 + 7^3 + 1^3 => 371

    static int numOfDigits(int num) {
    	int digits =0;
    	while(num>0) {
    		num/=10;
    		digits++;
    	}
    	return digits;
    }
     
    static boolean isArmstrong(int num) {
    	String str = String.valueOf(num);
    	int sum =0;
    	for(int i =0;i<str.length();i++) {
    		int each = Integer.parseInt(str.substring(i, i+1));
    		sum+=Math.pow(each, numOfDigits(num));
    	}
    	return sum==num;
    }
    static ArrayList<Integer> listOfArmstrong(int num){
    	ArrayList<Integer>al = new ArrayList<>();
    	for(int i =0; i<num;i++) {
    		if(isArmstrong(i))
    			al.add(i);
    	}
    	return al;
    }
    
  //Write a function to check whether a string is pangram or not assuming that the string passed in does not have any punctuation.
  //Pangrams are words or sentences containing every letter of the alphabet at least once.
  //EX: The quick brown fox jumps over the lazy dog --> true
	
	public static void main(String[]args) {
	//	System.out.println(isSandwich("breadozkan"));
	//	System.out.println(isCountSame("javajava"));
	//	System.out.println(Arrays.deepToString(ArrayGenerator(4,4)));
	//	System.out.println(findMax(ArrayGenerator(3,5)));
    //  System.out.println(numOfDigits(1535));
	//	System.out.println(listOfArmstrong(100000));
	}
}
