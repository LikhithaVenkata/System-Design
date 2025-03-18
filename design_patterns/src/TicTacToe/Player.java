package TicTacToe;

public class Player {
	String name;
	PlayingPiece piece;
	Player(String name,PlayingPiece piece)
	{
		this.name=name;
		this.piece=piece;
	}
	String getName()
	{
		return this.name;
	}
	PlayingPiece getPlayingPiece()
	{
		return this.piece;
	}
}
