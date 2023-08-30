package NuberPuzzleOop;

public class Moving {
	protected Player player;
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	protected boolean movePlayer(int[][] puzzle, int direction) {	
		int playerX = player.getX();
		int playerY = player.getY();
		int movingPlayerX = playerX;
		int movingPlayerY = playerY;		
		switch(direction){
		case 2:
			movingPlayerY++;
			System.out.println("");
			break;
		case 4:
			movingPlayerX--;
			break;
		case 6:
			movingPlayerX++;
			break;
		case 8:
			movingPlayerY--;
			break;
		default:
			break;
		}
		if(getIsOut(puzzle, movingPlayerX, movingPlayerY)) return false;
		Shuffle.changeArray(puzzle, playerX, playerY, movingPlayerX, movingPlayerY);

		player.setPosition(movingPlayerX, movingPlayerY);
		return true;
	}
	protected boolean movePlayer(int[][] puzzle, String direction) {	
		int playerX = player.getX();
		int playerY = player.getY();
		int movingPlayerX = playerX;
		int movingPlayerY = playerY;
		switch(direction){
		case "하":
			movingPlayerY++;
			break;
		case "좌":
			movingPlayerX--;
			break;
		case "우":
			movingPlayerX++;
			break;
		case "상":
			movingPlayerY--;
			break;
		default:
			break;
		}
		if(getIsOut(puzzle, movingPlayerX, movingPlayerY)) return false;
		Shuffle.changeArray(puzzle, playerX, playerY, movingPlayerX, movingPlayerY);
		//		int temp = puzzle[playerY][playerX];
		//		puzzle[playerY][playerX] = puzzle[movingPlayerY][movingPlayerX];
		//		puzzle[movingPlayerY][movingPlayerX] = temp;
		player.setPosition(movingPlayerX, movingPlayerY);
		return true;
	}
	

	private boolean getIsOut(int[][] arr, int movingPlayerX, int movingPlayerY) {
		if(movingPlayerX < 0|| 
				movingPlayerX > arr[0].length - 1 ||
				movingPlayerY < 0 ||
				movingPlayerY > arr.length - 1) return true;




		return false;
	}
}









