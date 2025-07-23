package exercicio.exercicio38;

public class Main {

	//Metodo Principal
	public static void main(String[] args) {

		//Objeto instanciado e com vida
		Login login = new Login();
		//Variavel login chama metodo da classe Login que executa tudo que há dentro da 
		boolean retorno = login.executarLogin();
		if (retorno) {
			System.out.println("Acesso permitido");
		}

	}

}
