package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class SavegameView extends JFrame {
	JButton saveBtn, loadBtn, deleteBtn, backBtn;
	JLabel titleLbl;
	JPanel buttonPnl, listPnl, mainPnl;
	JTable saveTbl;
	Font gameFont;
	

public SavegameView() {
	
	setTitle("Savegames");
	setSize(1200, 800);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//create Panels
	buttonPnl = new JPanel(new FlowLayout());
	listPnl = new JPanel(new BorderLayout());
	mainPnl = new JPanel(new BorderLayout());
	
	// create Font
	gameFont = new Font("Old English Text MT", Font.BOLD, 64);
	
	
	
	// create Buttons
	saveBtn = new JButton("Spiel speichern");
	loadBtn = new JButton("Spiel laden");
	deleteBtn = new JButton("Spielstand löschen");
	backBtn = new JButton("Zurück");
	
	// create Table
	saveTbl = new JTable(10, 2);
	
	// create Label
	titleLbl = new JLabel("Spielstände", SwingConstants.CENTER);
	titleLbl.setFont(gameFont);
	
	//add Button to Panel
	buttonPnl.add(saveBtn);
	buttonPnl.add(loadBtn);
	buttonPnl.add(deleteBtn);
	buttonPnl.add(backBtn);
	
	//add Lable to Panel
	listPnl.add(titleLbl, BorderLayout.NORTH);
	
	
	// add Table to Panel
	listPnl.add(saveTbl, BorderLayout.SOUTH);
	
	
	
	mainPnl.add(listPnl, BorderLayout.NORTH);
	mainPnl.add(buttonPnl, BorderLayout.SOUTH);
	
	getContentPane().add(mainPnl);
		 
	setLocationRelativeTo(null);
	setVisible(true);
}	
}
