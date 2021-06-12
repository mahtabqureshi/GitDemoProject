package com.demo.github;

import java.util.Scanner;



class hello{
	  public static float getw(String s)
		{
		  String s1[]=s.split("@");
		  String sx=s1[0];
		  String res="";
		  
			  res=sx.replace('-', '.');
			  return Float.valueOf(res);
		  
			
		}
	  public static float geth(String s)
	  {
		  String s2[]=s.split("@");
		  String sy=s2[1];
		  String res="";
		  res=sy.replace('-', '.');
		  return Float.valueOf(res);
		  
	  }
	}


public class demogit {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(hello.getw(str));

}
}
