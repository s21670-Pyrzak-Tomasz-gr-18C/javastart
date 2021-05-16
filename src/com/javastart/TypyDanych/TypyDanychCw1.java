package com.javastart.TypyDanych;

public class TypyDanychCw1 {

    public static void main(String[] args) {
	int age = 25;
	boolean isTrue = true;
	char initialN = 'J';
	char initialS = 'K';
	boolean isTrueInitials = true;


	System.out.printf("""
			Cześć Jan, słyszałem, że masz %d lat i uczysz sie programowania. Czy to prawda?
			-%b
			-Czy Twoje inicjały to %c%c?
			-Tak,%b""",age,isTrue,initialN,initialS,isTrueInitials);

    }
}
