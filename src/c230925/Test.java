package c230925;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public void test1()
	{
		//주어진 문자열에서 특정 문자의 개수를 세는 프로그램		
		String a = "Hello, World";
		char b = 'o';
		int count = 0;

		for(int i = 0; i<a.length(); i++)
		{

			if( b ==a.charAt(i))
			{
				count++;		
			}	
		}
		System.out.println("특정 문자의 개수는 : "+count);
	}
	public void test2()
	{
		// 주어진 문자열 역순으로 출력하기
		String a = "Hello, World";
		String b = "";
		for (int i=a.length()-1; i>=0; i--)
		{
			b+=a.charAt(i);
		}
		System.out.println(b);
	}
	public void test3()
	{	//문자열에서 모든 공백을 제거하는 프로그램을 작성하라
		String a = " Hello    World,     Java Test, Is good ";
		System.out.println(a.replaceAll("\s", ""));
	}
	public void test4()
	{
		//주어진 문자열에서 소문자는 대문자로 대문자는 소문자로 바꿔라
		String a = "Hello, World";
		char[] b = a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(Character.isUpperCase(b[i]))
			{
				b[i]=Character.toLowerCase(b[i]);
					
			}
			else if(Character.isLowerCase(b[i]))
			{
				b[i]=Character.toUpperCase(b[i]);
			}
		}
		String c = new String(b);
		System.out.println(c);
	}
	public void test5(String str, char targetChar)
	{
		//문자열 속에 문자 찾기를 수행하는 함수를 완성하라.
		System.out.println(str.indexOf(targetChar));


	}
	public void test6()
	{
		// 문자열을 입력받으면 단어의 갯수를 출력하는 함수를 완성하라.
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("입력해주세요");
		a = sc.nextLine();

		String[] b= a.split(" ");

		int count=0;
		for(String c : b) 
		{
			if(!a.isEmpty()) 
			{
				count++;
			}
			System.out.println(count+"번쨰 입력한 단어 : "+c);
		}
		System.out.println("단어의 갯수는 : "+count);

	}
	public void test7()
	{
		//주어진 숫자가 소수인지 판별하는 solution을 완성하라.

		int num =3;
		boolean isPrime = true;

		if(num%2==0)
		{
			isPrime = false;

		}		
		System.out.printf(isPrime ? "소수":"소수아님");	
		System.out.println();

	}
	public void test8()
	{
		//입력받은 숫자의 각자리수의 합구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요");
		int a = 123456789;
		a = sc.nextInt();

		int sum =0;
		while(a!=0)
		{

			sum += a%10;
			a/=10;

		}
		System.out.println(sum);
	}
	public void test9()
	{
		// 배열에서 공통된거 출력하기
		int[] arr1= {1, 5, 5, 10, 20, 30};
		int[] arr2= {3, 4, 5, 5, 10, 20, 30};
		int[] arr3= {5, 5, 10, 20, 30};

		Set<Integer> check = new TreeSet<Integer>();

		for(int j=0; j<arr1.length;j++)
		{
			for(int k=0; k<arr2.length;k++)
			{
				for(int x=0; x<arr3.length;x++)
				{
					if(arr1[j]==arr2[k]&&arr1[j]==arr3[x])
						check.add(arr1[j]);
				}
			}
		}

		System.out.println(check);

	}

	public static void main(String[] args)
	{		
		Test test = new Test();
		test.test1();  //주어진 문자열에서 특정 문자의 개수를 세는 프로그램
		test.test2();  // 주어진 문자열 역순으로 출력하기
		test.test3();	//문자열에서 모든 공백을 제거하는 프로그램을 작성하라
		test.test4();	//주어진 문자열에서 소문자는 대문자로 대문자는 소문자로 바꿔라
		String str="Hello, World";
		char targetChar='H';
		test.test5(str, targetChar); //문자열 속에 문자 찾기를 수행하는 함수를 완성하라.
		test.test6(); // 문자열을 입력받으면 단어의 갯수를 출력하는 함수를 완성하라.
		test.test7(); //주어진 숫자가 소수인지 판별하는 solution을 완성하라.
		test.test8(); //입력받은 숫자의 각자리수의 합구하기
		test.test9(); // 배열에서 공통된거 출력하기
	}

}
