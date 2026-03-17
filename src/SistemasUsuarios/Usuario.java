package SistemasUsuarios;

public class Usuario {
String nome;
int idade;
String email;

public Usuario(String nome, int idade, String email) {
	this.nome = nome;
	this.idade = idade;
	this.email = email;
	
}

public void mostrar () {
	System.out.println(
			"Nome: " + nome 
			+"\nIdade: "+ idade
			+"\nemail: "+ email);
	
}
}
