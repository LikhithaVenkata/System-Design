package TicTacToe;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
//import javafx.util.Pair;

public class Board {
	PlayingPiece[][] board;
	int size;
	Board(int size)
	{
		this.size=size;
		board=new PlayingPiece[size][size];
	}
	boolean addPiece(int row,int column,PlayingPiece piece)
	{
		if(board[row][column]!=null)
			return false;
		board[row][column]=piece;
		return true;
	}
	
	List<Integer> getFreeCells()
	{
		List<Integer> freeCells=new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				if(board[i][j]==null)
					freeCells.add(i);
		}
		return freeCells;
	}
}
