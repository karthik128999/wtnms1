package com.strings;

public class Caseconvert {
public static void main(String[] args) {
	String s="hELLo 31371 karthik";
	String k="";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(!(Character.isDigit(c)))
		{
			if(Character.isLowerCase(c))
			{
				k=k+Character.toUpperCase(c);
			}
			else
			{
				k=k+Character.toLowerCase(c);	
			}
		}	
	}
	StringBuffer sb=new StringBuffer(k);
	String v=sb.reverse()+"";
	for(int i=0;i<v.length();i++)
	{
		if(i%2==0)
			System.out.print(v.charAt(i));
	}
	System.out.println(v);
}
}
