package Main;

import java.util.Scanner;

public class PrincipaTeste {

	public static void main(String[] args) {
		
		Banco i = new Banco();
		Scanner sc = new Scanner(System.in);
		System.out.println("inserir: ");
		
		String user, senha;
		user = sc.next();
		senha = sc.next();
		
		i.addUser("Iarley", "1234");
		i.addUser("taissa", "0000");
		
		i.addUser(user, senha);
		i.imprmirUserTeste();
		
		System.out.println("Buscar: ");
		String user1, senha1;
		user1 = sc.next();
		senha1 = sc.next();
		
		i.buscaUser(user1, senha1);
		
		System.out.println(i.getStatus());
	
	}

}
