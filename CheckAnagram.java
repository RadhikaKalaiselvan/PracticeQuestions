package CCI;
import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String mainWord=s.next();
		String anagram=s.next();
		if(mainWord.length()!=anagram.length()){
		 System.out.println("Not an anagram");
		} else {
		char[]  a=mainWord.toCharArray();
		char[] mainwordArray=anagram.toCharArray();
	Arrays.sort(a);
	Arrays.sort(mainwordArray);
	String sortedMainWord="",sortedAnagram="";
	for(int i=0;i<a.length;i++)
	{
		sortedMainWord+=a[i];
		sortedAnagram+=mainwordArray[i];
	}

		if(sortedMainWord.equals(sortedAnagram))
		System.out.println(" Is anagram");
		}
	}
}
