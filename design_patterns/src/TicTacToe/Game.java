package TicTacToe;

import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {
	Board gameBoard;
	Deque<Player> players;
	
	Game()
	{
		initializeGame();
	}
	
	void initializeGame()
	{
		PlayingPieceX crossPiece=new PlayingPieceX();
		Player player1=new Player("player1",crossPiece);
		
		PlayingPieceO oPiece=new PlayingPieceO();
		Player player2=new Player("player1",oPiece);
		
		players.add(player1);
		players.add(player2);
		gameBoard=new Board(3);
	}
	
	String startGame()
	{
		boolean noWinner=true;
		while(noWinner)
		{
			List<Integer> freeCells=gameBoard.getFreeCells();
			if(freeCells.isEmpty())
			{
				noWinner=false;
				continue;
			}
			Player playerTurn=players.removeFirst();
			System.out.println("Player: "+playerTurn+" Enter row,column");
			Scanner scannerObj=new Scanner(System.in);
			String input=scannerObj.nextLine();
			String[] arr=input.split(",");
			int row=Integer.valueOf(arr[0]);
			int column=Integer.valueOf(arr[1]);
			boolean piece_added=gameBoard.addPiece(row,column,playerTurn.getPlayingPiece());
			if(!piece_added)
				{System.out.println("Incorrect position, choose again");
				players.addFirst(playerTurn);
				continue;
				}
			players.addLast(playerTurn);
			boolean isWinner=isWinner(row,column,playerTurn.piece);
			if(isWinner)
					return playerTurn.name;
		
		}
		return "tie";	
	}
	
	boolean isWinner(int row,int column,PlayingPiece PlayingPiece)
	{
//		boolean RowMatch=true;
//		boolean ColumnMatch=true;
//		boolean DiagnolMatch=true;
//		boolean SecondDiagnol=true;
		for(int i=0;i<gameBoard.size;i++)
		{
			if(gameBoard.board[row][i]==null || gameBoard.board[row][i]!=PlayingPiece)
				return false;
		}
		for(int i=0;i<gameBoard.size;i++)
		{
			if(gameBoard.board[i][column]==null || gameBoard.board[i][column]!=PlayingPiece)
				return false;
		}
		//diagnolsMatch
		for(int i=0,j=0;i<gameBoard.size;i++)
		{
			if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!=PlayingPiece)
				return false;
		}
		for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++)
		{
			if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!=PlayingPiece)
				return false;
		}
		return true;
	}
}
