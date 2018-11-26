package appRoomba.model;

public class Coordenates {
	
	private Integer x;
	private Integer y;
	
	public Coordenates(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public boolean sameSpot(Coordenates coords) {
		return this.x == coords.getX() && this.y == coords.getY();
	}

}
