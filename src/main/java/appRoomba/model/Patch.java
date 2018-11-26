package appRoomba.model;

public class Patch {
	
	private Coordenates coods;

	public Patch(Integer x, Integer y) {
		super();
		this.coods = new Coordenates(x,y);
	}

	public Coordenates getCoods() {
		return coods;
	}

	public void setCoods(Coordenates coods) {
		this.coods = coods;
	}
}
