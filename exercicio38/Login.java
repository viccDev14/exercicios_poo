package exercicio.exercicio38;

import java.util.Scanner;

public class Login {
	private Usuario usuario;
	private Scanner in;
	private Registros registros;

	public Login() {
		usuario = new Usuario();
		in = new Scanner(System.in);
		registros = new Registros();
	}

	public void executarLogin() {
		System.out.print("Digite o código do usuário: ");
		registros.setCodigo(in.nextInt());
		if (!usuario.validarCodigo(registros.getCodigo())) {
			System.out.println("Usuário inválido!");
			return;
		}

		System.out.print("Digite a senha: ");
		registros.setSenha(in.nextInt());

		if (!usuario.validarSenha(registros.getSenha())) {
			System.out.println("senha incorreta");
			return;

		}
		System.out.println("Acesso permitido");
	}
}
