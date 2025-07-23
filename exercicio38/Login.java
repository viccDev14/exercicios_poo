package exercicio.exercicio38;

import java.util.Scanner;

// Classe Login
public class Login {

	private Scanner in; // Objeto privado para entrada de dados com variavel nomeada in, ainda
						// inutilizavel.
	private Registros registros; // Objeto Registros privado com variavel nomeada registros, ainda inutilizavel.

	// Construtor
	public Login() {

		in = new Scanner(System.in); // Variavel in da vida ao Objeto Scanner que da entrada a dados, agora esta
										// ativa
		registros = new Registros(); // Variavel registros da vida ao Objeto Registros, agora esta ativa
	}

	// Metodo
	public boolean executarLogin() {
		System.out.print("Digite o código do usuário: "); // Mostra na tela informaçoes
		registros.setCodigo(in.nextInt()); // Le a informaçao e coloca dentro de registros

		// Verifica a informaçao que foi colocada dentro de codigo em registros, se ela
		// é diferente do que há dentro de usuario referente a codigo
		// A exclamaçao é uma negaçao, ou seja, se vim verdadeiro, troca para falso, e
		// vice-versa
		if (!Usuario.validarCodigo(registros.getCodigo())) {
			System.out.println("Usuário inválido!");
			return false;
		}

		System.out.print("Digite a senha: ");
		registros.setSenha(in.nextInt());

		// Verifica a informaçao que foi colocada dentro de senha em registros, se ela é
		// diferente do que há dentro de usuario referente a senha
		if (!Usuario.validarSenha(registros.getSenha())) {
			System.out.println("senha incorreta");
			return false;

		}
		return true;

	}
}
