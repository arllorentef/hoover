package appRoomba.model;

public class Size {
	
	private Integer width;
	private Integer height;
	
	public Size(Integer width, Integer height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
}
