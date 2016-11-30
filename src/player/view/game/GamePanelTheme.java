package player.view.game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class GamePanelTheme extends JPanel {
	

	JPanel boardPanel;
	JPanel titlePanel;
	JPanel infoPanel;
	
	GamePanelTheme(){
		
		this.setLayout(null);
		
		
		boardPanel = new BoardPanel();
	    add(boardPanel);
	    boardPanel.setBounds(40, 100, 420, 420);
	    //boardPanel.setBackground(Color.blue);
	    
	    infoPanel = new InfoPanel();
	    add(infoPanel);
	    infoPanel.setBounds(480, 100, 280, 420);
	    
	    
	    titlePanel = new TitlePanel("Theme");
	    add(titlePanel);
	    titlePanel.setBounds(40, 20, 600, 60);
	    //titlePanel.setBackground(Color.blue);
	    
	    
	    //add(titlePanel);
	   // add(infoPanel);
		
	}
	
}

