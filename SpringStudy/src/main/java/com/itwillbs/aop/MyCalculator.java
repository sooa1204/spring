package com.itwillbs.aop;

public class MyCalculator {

	public void add(int a, int b) {
		System.out.println("(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧"); // 보조 기능 
		System.out.println("a+b : " +(a+b) ); // 주기능
		System.out.println("(∩^o^)⊃━☆☆*: .｡. o(≧▽≦)o .｡.:*☆"); // 보조 기능 
	}
	public void sub(int a, int b) {
		System.out.println("a-b : " +(a-b) );
	}
	public void mul(int a, int b) {
		System.out.println("a*b : " +(a*b) );
	}
	public void div(int a, int b) {
		System.out.println("a/b : " +(a/b) );
	}
}
