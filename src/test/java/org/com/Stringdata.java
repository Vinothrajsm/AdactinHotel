package org.com;

public class Stringdata {
	public static void main(String[] args) {
		String s1="vinoth";
		String s2="Vinoth";
		System.out.println(s1);
		char ch=s1.charAt(02);
		System.out.println(ch);
		boolean b=s1.equals(s1);
		System.out.println(b);
		boolean b1=s1.equals(s2);
		System.out.println(b1);
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		
		
		//contains()
		String a1= "Hello welcome to java class";
		boolean z1=a1.contains("to");
		System.out.println(z1);
		
		//split()
		String ba2="hell vinoth from lg";
		String[] x=ba2.split(" ");
		System.out.println(ba2.length());
		System.out.println(x.length);
		String[] x1=ba2.split("o");
		System.out.println(ba2.length());
		System.out.println(x1.length);
	}

}
