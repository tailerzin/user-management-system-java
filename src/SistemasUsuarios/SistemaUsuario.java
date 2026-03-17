package SistemasUsuarios;

public class SistemaUsuario {

	Usuario[] usuarios = new Usuario[100];
	int contador = 0;
	
	public void cadastrar(String nome, int idade, String email) {
		Usuario novo = new Usuario(nome,idade,email);
				usuarios[contador] = novo;
		contador++;
		 System.out.println("\n\n--Usuário cadastrado!--\n\n");
	}
	
	public void listar() {
		 System.out.println("------------------");
		 for (int i = 0; i < contador; i++) {
			 usuarios[i].mostrar();;
			 System.out.println("------------------");
		 }
		
	}
	
	public void buscar(String nomeBuscar) {
		boolean encontrado = false;
		System.out.println("\n");
		for(int i = 0; i< contador; i++) {
			if(usuarios[i].nome.equalsIgnoreCase(nomeBuscar)) {
				System.out.println("Usuário encontrado");
				usuarios[i].mostrar();
				encontrado = true;
				break;
			}
			
		}
		if(!encontrado) {
				System.out.println("Usuário não encontrado.");
			}
		
	}
	
	public void remover(String nomeRemover) {
		boolean encontrado = false;
		System.out.println("\n");
		for(int i = 0; i< contador; i++) {
			
			if(usuarios[i].nome.equalsIgnoreCase(nomeRemover)) {
				
				for(int j = i; j < contador - 1; j++) {
					usuarios[j] = usuarios[j +1];
				}
				usuarios[contador - 1] = null;
				contador--;
				
				System.out.println("Usuário removido!");
				encontrado = true;
				break;
			}
				
		}
		if(!encontrado) {
			System.out.println("Usuário não encontrado");
		}
		
	}
	
}
