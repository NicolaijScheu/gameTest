package display;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import game.Game;
import input.Input;

public class Display extends JFrame {
	
	private Canvas canvas;
	private Renderer renderer;
	
	public Display(int width, int height, Input input) {
		setTitle("CoronaBomber");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		this.renderer = new Renderer();
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setFocusable(false);
		add(canvas);
		addKeyListener(input);
		pack();
		
		canvas.createBufferStrategy(2); // paint one picture while the next one is painted - no flickering
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void render(Game game) {
		BufferStrategy bufferStrategy = canvas.getBufferStrategy();
		Graphics graphics = bufferStrategy.getDrawGraphics();
		
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		
		renderer.render(game, graphics);		
		
		graphics.dispose();
		bufferStrategy.show(); //change to the buffered image
	}
}
