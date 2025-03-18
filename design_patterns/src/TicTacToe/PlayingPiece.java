package TicTacToe;

public class PlayingPiece {
	PieceType type;
	PlayingPiece(PieceType PieceType){
		this.type=PieceType;
	};
}

class PlayingPieceX extends PlayingPiece{
	PlayingPieceX()
	{
		super(PieceType.X);
	}
}

class PlayingPieceO extends PlayingPiece{
	PlayingPieceO()
	{
		super(PieceType.O);
	}
}