package exercicio.exercicio32;

public class Partida {
	private String time1, time2;
	private int gol1, gol2;
	
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public int getGol1() {
		return gol1;
	}
	public void setGol1(int gol1) {
		this.gol1 = gol1;
	}
	public int getGol2() {
		return gol2;
	}
	public void setGol2(int gol2) {
		this.gol2 = gol2;
	}
	
	public String resultado() {
		if (gol1 > gol2) {
			return "Vencedor: " + time1; 
		} else if (gol2 > gol1) {
			return "Vencedor: " + time2;
		} else {
			return "EMPATE";
		}
	}
}
