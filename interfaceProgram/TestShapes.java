class GameShape{
	public void displayShape(){
		System.out.println("displaying Shape");
	}
}
class PlayerPiece extends GameShape{
	public void movePiece(){
		System.out.println("Moving game piece");
	}
}
class TilePiece extends GameShape{
	public void getAdjacent(){
		System.out.println("getting adjacent Tiles");
	}
}
class TestShapes{
	public static void main(String[] args){
		PlayerPiece player= new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShape(player);
		doShape(tile);
	}
	public static void doShape(GameShape shape){
		shape.displayShape();
		//shape.getAdjacent();
	}
}