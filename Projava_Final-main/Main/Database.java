package Main;

import java.util.List;

public interface Database {
	List addTopic(String placa, String modelo, int ano);
	
	List addViagem(Viagem v);

	List addMotorista(String nome, String cpf, int idade, String cnh);

	List addUser(String usuario, String senha);

}
