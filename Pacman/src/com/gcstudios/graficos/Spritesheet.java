package com.gcstudios.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	public static BufferedImage[] pac_right;
	
	public Spritesheet(String path)
	{
		try {
			spritesheet = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static BufferedImage getSprite(int x,int y,int width,int height){
		return spritesheet.getSubimage(x, y, width, height);
	}
	public static void PlayerAnimation() {
		
		 pac_right = new BufferedImage[8];
		
		pac_right[0] = Spritesheet.getSprite(32, 0, 16, 16);
		pac_right[1] = Spritesheet.getSprite(48, 0, 16, 16);
		pac_right[2] = Spritesheet.getSprite(64, 0, 16, 16);
		pac_right[3] = Spritesheet.getSprite(80, 0, 16, 16);
		pac_right[4] = Spritesheet.getSprite(95, 0, 16, 16);
		pac_right[5] = Spritesheet.getSprite(80, 0, 16, 16);
		pac_right[6] = Spritesheet.getSprite(64, 0, 16, 16);
		pac_right[7] = Spritesheet.getSprite(48, 0, 16, 16);
	}
}
