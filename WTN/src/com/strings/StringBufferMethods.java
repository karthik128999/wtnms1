package com.strings;

public class StringBufferMethods {
public static void main(String[] args) {
	//StringBuffer->thread safe (synch)
	//StringBuilder->not thread safe(not synch)
	//Mutable
	//the output of the StringBuffer object will be always a StringBuffer (not a String)
	StringBuffer sb= new StringBuffer("hi");
	//append
	sb.append("sai");
	//insert
	sb.insert(2,"hello");//hhelloisai
	//replace
	sb.replace(1,2,"my");
	//delete
	sb.delete(2,5);
	//reverse
	String p="hi how are you";
	StringBuffer ss=new StringBuffer(p);
	ss.reverse();
	String s1=ss+"";
	System.out.println(s1);
	//System.out.println(sb);
	String v="Hi HeLlO pLeAsE";
	String k="";
	for(int i=0;i<v.length();i++)
	{
		if(Character.isLowerCase(v.charAt(i)))
			k=k+Character.toUpperCase(v.charAt(i));
		else
			k=k+Character.toLowerCase(v.charAt(i));
	}
	System.out.println(k);
}
}
