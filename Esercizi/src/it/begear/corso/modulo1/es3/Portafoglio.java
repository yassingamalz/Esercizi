package it.begear.corso.modulo1.es3;

public class Portafoglio {
	private float valore;
	private int percentuale;
	private float per;
	
	public Portafoglio(float valore, int percentuale) {
		setValore(valore);
		setPercentuale(percentuale);
	}


	public float getValore() {
		return valore;
	}


	public void setValore(float valore) {
		this.valore = valore;
	}


	public int getPercentuale() {
		return percentuale;
	}


	public void setPercentuale(int percentuale) {
		this.percentuale = percentuale;
	}


	@Override
	public String toString() {
		return "Portafoglio [valore=" + valore + ", percentuale=" + percentuale + "]";
	}
	
	
	
	

}
