package TheMainPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends gameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		//velocityx=1;
		
	}

	@Override
	public void tick() {

		x+=velocityx;
		y+=velocityy;
		
	}
	
private Random rand;
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		rand = new Random();
		float r = rand.nextFloat();
		float a = rand.nextFloat();
		float b = rand.nextFloat();
		g.setColor(new Color(r,a,b));
		g.fillRect(x, y, 20, 20);
		
	}

}
