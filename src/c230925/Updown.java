package c230925;

import java.util.Random;
import java.util.Scanner;

public class Updown {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int comNum;
		comNum= rd.nextInt(1000);
		int userChoice;
		int userSelect;
		int count =1;
		System.out.println("업다운 게임");
		System.out.println("숫자를 입력해주세요");
		while(true)
		{
			System.out.println(count+"번째 판");
			userChoice = sc.nextInt();
			if(userChoice>comNum)
			{
				System.out.println("Down");
			}
			else if(userChoice<comNum)
			{
				System.out.println("Up");
			}
			else
			{
				System.out.println("정답");
				System.out.println("게임을 더하시려면 1 종료를 원하시면 0 을 입력해주세요");
				userChoice = sc.nextInt();
				switch(userChoice)
				{
				case 1 :
					System.out.println("게임을 다시합니다.");
					Updown.main(args);
				case 0 : 
					System.out.println("게임을 종료합니다.");
					System.exit(1);
					
				}
			}
			count++;
			if(count==11)
			{
				System.out.println("게임을 더하시려면 1 종료를 원하시면 0 을 입력해주세요");
				userChoice = sc.nextInt();
				switch(userChoice)
				{
				case 1 :
					System.out.println("게임을 다시합니다.");
					Updown.main(args);
				case 0 : 
					System.out.println("게임을 종료합니다.");
					System.exit(1);
					
				}
			}
		}

	}



}

