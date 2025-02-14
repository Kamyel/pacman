package com.gcstudios.entities;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.graficos.Spritesheet;
import com.gcstudios.world.World;

public class Player extends Entity{
	public boolean right,up,left,down;
	
	public int curAnimation = 0;
	public int curFrames = 0, targetFrames = 15;
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
	}
	
	public void tick(){
		depth = 1;
		if(right && World.isFree((int)(x+speed),this.getY())) {
			x+=speed;
		}
		else if(left && World.isFree((int)(x-speed),this.getY())) {
			x-=speed;
		}
		if(up && World.isFree(this.getX(),(int)(y-speed))){
			y-=speed;
		}
		else if(down && World.isFree(this.getX(),(int)(y+speed))){
			y+=speed;
		}
		curFrames++;
		if(curAnimation == targetFrames) {
			curFrames = 0;
			curAnimation++;
			if(curAnimation == Spritesheet.pac_right.length) {
				curAnimation = 0;
			}
		}
	}
	public void render(Graphics g) {
		if(right == true) {
		g.drawImage(Spritesheet.pac_right[0], x, y, 16, 16, null);
	   }else if(left == true) {
		   
	   }else if(up == true) {
		   
	   }else if(down == true) {
		   
	   }
	}
}
