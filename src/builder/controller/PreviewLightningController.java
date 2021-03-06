package builder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JTextField;

import builder.view.BuilderApplication;
import builder.view.editGame.lightning.LightningInfoPanel;
import builder.view.editGame.puzzle.PuzzleGamePanel;
import builder.view.editGame.puzzle.PuzzleInfoPanel;
import player.models.Board;
import player.view.game.GameFrame;

public class PreviewLightningController implements ActionListener {
	LightningInfoPanel application;     /** Application we have control over. */
	Board b;
	int levelNum;
	
	/**
	 * constructor
	 * @param  app LightningInfoPanel
	 * @param  b   Board
	 */
	public PreviewLightningController(LightningInfoPanel app, Board b) {
		this.application = app;
		this.b = b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String maxWords = application.getTextField_3().getText();
		String star_1 = application.getTextField().getText();
		String star_2 = application.getTextField_1().getText();
		String star_3 = application.getTextField_2().getText();
		
		ArrayList<String> stars = new ArrayList<String>(); 
		stars.add(star_1);
		stars.add(star_2);
		stars.add(star_3);
		
		try {
			String name = "../cobalt-lettercraze/tempFile/temp.txt";
			File file = new File(name);
			PrintWriter writer = new PrintWriter(file);
			writer.println(String.format("%d", 2));
			writer.println(maxWords);
			for (int j = 0; j <3; j++){
				writer.print(stars.get(j) + " ");
			}
			writer.println();
			writer.println(0);
			writer.println(0);
			writer.println(b.toStringForBuilder());
			writer.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		GameFrame gf = new GameFrame("lightning","../cobalt-lettercraze/tempFile/temp.txt");
		gf.setVisible(true);
	}
}
	
	