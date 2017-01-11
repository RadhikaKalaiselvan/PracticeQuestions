package CCI;

import java.util.Arrays;

import java.util.Scanner;

public class NearestNeighbour {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
       
        int pendrivesorted=0;
        if(n<m){
        	Arrays.sort(keyboards);
      
        }else {
        	Arrays.sort(pendrives);
        	pendrivesorted=1;
        	
        }
        int maxsum=-1;
      if(pendrivesorted==1){
    	  for(int keyPrice:keyboards){
    		  int diff=s-keyPrice;
    		  if(diff<=0){
    			  break;
    		  }
    		  int searchPos=Arrays.binarySearch(pendrives, diff);
    		 
    			int pos=(searchPos<0)?-(searchPos+2):searchPos;
                 if(pos>=0){ 		
   	int intermediateMax=pendrives[pos]+keyPrice;
    			if(intermediateMax< s && maxsum<intermediateMax ){
    				maxsum=intermediateMax;
    			}
                 }
    	  }
      }else {
    	  for(int penPrice:pendrives){
    		  int diff=s-penPrice;
if(diff<=0){
	break;
}
    		  int searchPos=Arrays.binarySearch(keyboards, diff);
    			int pos=(searchPos<0)?-(searchPos+2):searchPos;
    			if(pos>=0){
    			int intermediateMax=keyboards[pos]+penPrice;
    			if(intermediateMax< s && maxsum<intermediateMax ){
    				maxsum=intermediateMax;
    			}
    			}
    	  }
      }
      System.out.println(maxsum); 
    }
	
}
