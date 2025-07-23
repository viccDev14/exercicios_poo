package exercicio.exercicio38;

public class Usuario {
	//Variaveis estaticas, prontas para serem usadas e constantes, nunca mudam
	private static final int CODIGO_CERTO = 1234; 
	private static final int SENHA_CERTA = 9999;

	public static boolean validarCodigo(int codigo) {
		return codigo == CODIGO_CERTO;
	}

	public static boolean validarSenha(int senha) {
		return senha == SENHA_CERTA;

	}
}
