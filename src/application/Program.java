package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chesMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chesMatch.getPieces());
			System.out.println();
			System.out.print("Souce: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print(" Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chesMatch.perfomrChessMove(source, target);
		}
	}
}
