package NuberPuzzleOop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Puzzle puzzle = new Puzzle();
		Player player = new Player();
		
		
		puzzle.setPlayer(player);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇자리 퍼즐 맟출래? n * n");
		int countX = sc.nextInt();
		int countY = sc.nextInt();
		
		puzzle.setPuzzle(countX, countY);
		puzzle.print();
		

		while(true) {
			if(puzzle.getIsEnd()) break;
			System.out.println("p를 옮겨서 1~" + (countX * countY -1)+ "순서로 맞춰라");
			System.out.println("2 : 하 / 8 : 상 / 4 : 좌 / 6 : 우 / 0 : 종료 / 5 : 리셋");

			String directions = sc.nextLine();
			int direction =Integer.parseInt(directions);
			System.out.println(direction);
			if(direction == 0) break;
			if(direction == 5) puzzle.shuffle();
			puzzle.movePlayer(direction);


			puzzle.print();
		}
		System.out.println("끝!");
	}

}
