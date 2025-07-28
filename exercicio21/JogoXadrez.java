package exercicio.exercicio21;

public class JogoXadrez {
	private int horasInicio;
	private int horasFinal;

	public int getHorasInicio() {
		return horasInicio;
	}

	public void setHorasInicio(int horasInicio) {
		this.horasInicio = horasInicio;
	}

	public int getHorasFinal() {
		return horasFinal;
	}

	public void setHorasFinal(int horasFinal) {
		this.horasFinal = horasFinal;
	}

	public int duraçao() {
		if (horasInicio < horasFinal) {
			return horasFinal - horasInicio;
		} else {
			return (24 - horasInicio) + horasFinal;
		}
	}
}
