package exercicio38;

public class Usuario {
	private final int codigoCerto = 1234;
	private final int senhaCerta = 9999;
	
	public boolean validarCodigo(int codigo) {
		return codigo == codigoCerto;
	}
	
	public boolean validarSenha(int senha) {
		return senha == senhaCerta;
	}
}
