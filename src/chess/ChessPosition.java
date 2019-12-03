package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException(" Error iinstanting ChesPosition. Valid Values are from a1 to h8.");
		}

		this.column = column;
		this.row = row;
	}

	public char getColum() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position ToPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromposition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
