package Main;

import java.util.ArrayList;

import org.eclipse.swt.widgets.List;

public class DataBase implements Database{
	//List listTopic =  new List(null, 0);
	static ArrayList<Topic> listTopic = new ArrayList<>();
	static ArrayList<User> listUser = new ArrayList<>();
	static ArrayList<Viagem> listViagem = new ArrayList<>();
	static ArrayList<Motorista> listMotorista = new ArrayList<>();

	@Override
	public List addTopic(Topic t) {
		listTopic.add(t);
		return null;
	}

	@Override
	public List addUser(User u) {
		listUser.add(u);
		return null;
	}

	@Override
	public List addViagem(Viagem v) {
		listViagem.add(v);
		return null;
	}

	@Override
	public List addMotorista(Motorista m) {
		listMotorista.add(m);
		return null;
	}

	public static ArrayList<Topic> getListTopic() {
		return listTopic;
	}

	public static void setListTopic(ArrayList<Topic> listTopic) {
		DataBase.listTopic = listTopic;
	}

	public static ArrayList<User> getListUser() {
		return listUser;
	}

	public static void setListUser(ArrayList<User> listUser) {
		DataBase.listUser = listUser;
	}

	public static ArrayList<Viagem> getListViagem() {
		return listViagem;
	}

	public static void setListViagem(ArrayList<Viagem> listViagem) {
		DataBase.listViagem = listViagem;
	}

	public static ArrayList<Motorista> getListMotorista() {
		return listMotorista;
	}

	public static void setListMotorista(ArrayList<Motorista> listMotorista) {
		DataBase.listMotorista = listMotorista;
	}
	
	
	
}
