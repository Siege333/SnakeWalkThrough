package com.Siege;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		
		GamePanel panel = new GamePanel();
		this.add(panel);
		//Could also remove GamePanel panel = new GamePanel(); and replace with
		//this.add(new GamePanel()); another shortcut!
		
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	
}
