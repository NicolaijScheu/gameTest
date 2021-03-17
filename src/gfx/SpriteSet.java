package gfx;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

public class SpriteSet {
	
	private Map<String, Image> animationSheets;
	
	public SpriteSet() {
		this.animationSheets = new HashMap<>();
	}
	
	public void addSheet(String name, Image anitmationSheet) {
		animationSheets.put(name, anitmationSheet);
	}
	
	public Image get(String name) {
		return animationSheets.get(name);
	}

}
