// BoardPanel.java
package boardgamegui;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    private BoardObject[][] cells;  // Representation of the board cells

    // Constructor initializes the board
    public BoardPanel(int rows, int cols) {
        cells = new BoardObject[rows][cols];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Iterate through cells and draw each board object
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] != null) {
                    cells[i][j].draw(g);
                }
            }
        }
    }
}
