package display;

import java.awt.Graphics;

import game.Game;

public class Renderer {
	
	public void render(Game game, Graphics graphics) {
		
		game.getGameObjects().forEach(gameObject -> graphics.drawImage(
				gameObject.getSprite(),
				gameObject.getPosition().getIntX(),
				gameObject.getPosition().getIntY(),
				null				
			));
		
	}

}
