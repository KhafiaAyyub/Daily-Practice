

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //t - how many numbers 
		
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();  //n - numbers to be reversed
		    int sum = 0;
		    while(n>0){
		        int rem = n % 10 ;
		        sum = (sum * 10) + rem ;
		        n = n/ 10;
		    }
		    System.out.println(sum);
		}
	}
}

