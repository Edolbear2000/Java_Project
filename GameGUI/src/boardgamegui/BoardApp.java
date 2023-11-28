// BoardApp.java
package boardgamegui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Board Game Board");
        BoardPanel boardPanel = new BoardPanel(10, 10);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem designItem = new JMenuItem("Design");
        JMenuItem loadItem = new JMenuItem("Load");

        designItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement board design logic
            }
        });

        loadItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement board loading logic
            }
        });

        fileMenu.add(designItem);
        fileMenu.add(loadItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.add(boardPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
