// Board.java
package boardgamegui;

public class Board {
    private BoardObject[][] cells;

    public Board(int rows, int cols) {
        cells = new BoardObject[rows][cols];
    }

    public void placeObject(int row, int col, BoardObject object) {
        cells[row][col] = object;
    }
}
