package CCI;

import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicates {
	
		private static Scanner s;

		public static void main(String[] args){
		s = new Scanner(System.in);
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		String input=s.next();
		for(int i=0;i<input.length();i++)
		{
		char c=input.charAt(i);
		if(!h.containsKey(c+"")){
		h.put(c+"",0);
		} else {
		System.out.println(c);
		}
		}
		}
		}

