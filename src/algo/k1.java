package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class k1 {

	static int AnswerN;
    static int N = 10;

    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
     
        
        for(int i = 0; i < num; i++) {
        	int num2 = sc.nextInt();
        	int result = 0;
        	String[] box = new String[num2];
        	String[] box2 = new String[num2];
        			
        	String a = "";
        	String b = "";
        	for(int j = 0; j < num2; j++) {
        		String val = sc.next();
        		a += val+" ";
        	}

        	box = a.split(" ");
        	
        	for(int j = 0; j < num2; j++) {
        		String val = sc.next();
        		b += val+" ";
   
        	}
        	box2 = b.split(" ");
        	
        	for(int j = 0; j < box.length; j++) {
        		System.out.println(box[j]);
        	}
        	
        	
           for(int j = 0; j < box.length; j++) {
        	   for(int k = 0; k < box2.length; k++) {
        		 System.out.println(box[j].charAt(box[j].length()-1));
        		   if(box[j].charAt(0) == box2[k].charAt(0) && box[j].charAt(box[j].length()-1) == box2[k].charAt(box2[k].length()-1)) {
        			 
        			   List<Character> list = new ArrayList<Character>();
        			   List<Character> list2 = new ArrayList<Character>();
        			   
        	        	for(int g = 0; g < box[j].length(); g++) {
        	        		list.add(box[j].charAt(g));
        	        	}
        	        	for(int g = 0; g < box[j].length(); g++) {
        	        		list2.add(box[k].charAt(g));
        	        	}
        			   
        	        	Collections.sort(list);
        	        	Collections.sort(list2);
        	        	
        			   
        		   }
        	   }
           }
        	
        	System.out.println("#"+(i+1)+" "+result);
        }
        
        
        
        
    }
}
