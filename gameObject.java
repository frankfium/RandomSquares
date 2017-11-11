package TheMainPackage;

import java.awt.Graphics;

public abstract class gameObject {
	
	protected int x,y;
	protected ID id;
	protected int velocityx, velocityy;
	public gameObject(int x, int y, ID id){
	this.x = x;
	this.y = y;
	this.id = id;
	}	

	public abstract void tick();
	public abstract void render(Graphics g);
	
		public void setX(int x) {
			this.x = x;
			
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void setid(ID id) {
			this.id = id;
		}
		public ID getid() {
			return id;
		}
		public void setvelocityx(int velocityx) {
			this.velocityx = velocityx;
		}
		public void setvelocityy(int velocityy) {
			this.velocityy = velocityy;
		}
		public int getvelocityx() {
			return velocityx;
		}
		public int getvelocityy() {
			return velocityy;
		}
		
	

}
