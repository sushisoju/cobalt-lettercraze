package player.view.game.gamepanel;

import player.models.Puzzle;
import player.view.game.BoardPanel;
import player.view.game.CustomResetButton;
import player.view.game.CustomUndoButton;
import player.view.game.InfoPanel;
import player.view.game.TitlePanel;
import player.view.game.featurePanel.FeaturePanelPuzzle;
import player.view.game.submitbutton.CustomSubmitButton;
import player.view.game.submitbutton.PuzzleSubmitButton;

import java.awt.*;

public class GamePanelPuzzle extends GamePanel {
	private FeaturePanelPuzzle featurePanel;
	private PuzzleSubmitButton btnSubmit;
	private CustomResetButton btnReset;
	private CustomUndoButton btnUndo;
	
	public GamePanelPuzzle(Puzzle level){
		super(level);

		titlePanel = new TitlePanel("Puzzle");
		add(titlePanel);
		titlePanel.setBounds(40, 20, 600, 45);
		//titlePanel.setBackground(Color.blue);

		featurePanel = new FeaturePanelPuzzle(level, this.boardPanel);
		add(featurePanel);
		featurePanel.setBounds(200, 60, 300, 50);
		//featurePanel.setBackground(Color.blue);

		btnSubmit = new PuzzleSubmitButton(level, this.boardPanel, this.infoPanel, this.featurePanel);
		add(btnSubmit);
		btnSubmit.setBounds(60, 65, 100, 30);
		
		btnReset = new CustomResetButton(level, this.boardPanel);
		add(btnReset);
		btnReset.setBounds(160, 65, 100, 30);
		
		btnUndo = new CustomUndoButton(level, this.boardPanel, this.infoPanel, this.featurePanel);
		add(btnUndo);
		btnUndo.setBounds(260, 65, 100, 30);
	}

	public void initButton() {

	}

	@Override
	public Puzzle getLevel() {
		return (Puzzle) level;
	}

	@Override
	public FeaturePanelPuzzle getFeaturePanel() {
		return featurePanel;
	}

	@Override
	public CustomSubmitButton getSubmitButton() {
		return btnSubmit;
	}
	
	public CustomResetButton getResetButton() {
		return btnReset;
	}
	
	public CustomUndoButton getUndoButton() {
		return btnUndo;
	}
}


