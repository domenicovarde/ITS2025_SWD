package model;

public enum Colore {
	
	RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");
	
	String esadecimale;

	private Colore(String esadecimale) {
		this.esadecimale = esadecimale;
	}

	public String getEsadecimale() {
		return esadecimale;
	}

	public void setEsadecimale(String esadecimale) {
		this.esadecimale = esadecimale;
	}
	
	
	
	
}
