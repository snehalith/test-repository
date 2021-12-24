package com.data.input;

public class OperatorTest {

	public static void main(String[] args) {
		
		int a=50,b=20,c=70,x,p=10, q=17;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b && b>c);  	//and operator
		System.out.println(a>b || b>c);     //or operator
		System.out.println(a!=b);  		//not equal to 
		System.out.println(a==b);       //equality operator
		
		a+=5;    //a value become change i.e 55
		System.out.println(a);   //prints a value
		a-=5;    
		System.out.println(a);
		
		int y=(20>30)?20:30;		//this condition means if 20>30 con. is true then it returrns 20 otherwise returns 30
		System.out.println(y);
		
		String s=(20<30)?"snehal":"priya";		//this condition means if 20<30 con. is true then it returns snehal otherwise returns priya
		System.out.println(s);
		
		x=++p + --q - q-- + ++p * q--;
		System.out.println(x);
		
	}

}
