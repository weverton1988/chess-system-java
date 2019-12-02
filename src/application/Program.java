package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chesMatch = new ChessMatch();
		

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chesMatch.getPieces());
				System.out.println();
				System.out.print("Souce: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print(" Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chesMatch.perfomrChessMove(source, target);
			}
			catch (ChessException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
	}
}
