package Main;

import java.util.ArrayList;

import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Banco implements Database {

	private static ArrayList<Topic> listTopic = new ArrayList<>();
	private static ArrayList<User> listUser = new ArrayList<>();
	private static ArrayList<Viagem> listViagem = new ArrayList<>();
	private static ArrayList<Motorista> listMotorista = new ArrayList<>();

	private static boolean status;

	public static boolean getStatus() {
		return status;
	}

	public static void setStatus(boolean status) {
		Banco.status = status;
	}

	public JLabel l;
	private String user2;

	public Banco() {

		listUser.add(new User("almada", "1234"));

		listTopic.add(new Topic("123ABC", "Sprim", 1999));
		listTopic.add(new Topic("345DEF", "Besta", 2008));
		listTopic.add(new Topic("678GHI", "Jimbei", 2002));
		listTopic.add(new Topic("567WER", "Trinque", 1997));
		listTopic.add(new Topic("678QWE", "Master", 2006));
		listTopic.add(new Topic("890PMD", "Sprinter", 2016));
		listTopic.add(new Topic("315YJK", "Furgão", 1991));
		listTopic.add(new Topic("456KOP", "Transit", 2010));
		listTopic.add(new Topic("908IKO", "Doblo", 2017));
		listTopic.add(new Topic("123ABC", "Master", 2001));
		listTopic.add(new Topic("076UFD", "Transit", 2008));
		listTopic.add(new Topic("234IKO", "Drim", 1994));
		listTopic.add(new Topic("021SGB", "Trax", 2002));
		listTopic.add(new Topic("467KLM", "Besta", 2011));
		listTopic.add(new Topic("098JHG", "Sprinter", 2015));

		listMotorista.add(new Motorista("Antonio Edcleuton", "321.123.456-78", 32, "497283"));
		listMotorista.add(new Motorista("Raimundo Veloso", "786.324.678-98", 42, "573283"));
		listMotorista.add(new Motorista("Francisco Dai", "768.342.564-87", 23, "647831"));
		listMotorista.add(new Motorista("Mateus Vitor", "073.446.654-55", 24, "746308"));
		listMotorista.add(new Motorista("Cleito Rasta", "145.235.123-78", 30, "590283"));
		listMotorista.add(new Motorista("Francisco Carlos", "098.456.123-08", 36, "397283"));
		listMotorista.add(new Motorista("José Roberto", "321.123.231-13", 42, "352670"));
		listMotorista.add(new Motorista("Antonio Pereira", "553.675.908.56", 35, "784532"));
		listMotorista.add(new Motorista("Percival Luiz", "123.456.789.01", 49, "567864"));
		listMotorista.add(new Motorista("Antonio Pereira", "553.675.908.56", 35, "784532"));
		listMotorista.add(new Motorista("Mario Portela", "564.678.345-23", 61, "098765"));
		listMotorista.add(new Motorista("Jose Maria", "345.567.123-98", 31, "123456"));
		listMotorista.add(new Motorista("Francisco Antonio", "234.123.786-56", 52, "456789"));
		listMotorista.add(new Motorista("Edvaldo Costa", "231.564.789-32", 33, "890123"));
		listMotorista.add(new Motorista("Ernandes Alves", "324.675.231-78", 54, "978645"));

	}

	@Override
	public List addTopic(String placa, String modelo, int ano) {
		listTopic.add(new Topic(placa, modelo, ano));
		return listTopic;
	}

	@Override
	public List addUser(String usuario, String senha) {
		listUser.add(new User(usuario, senha));
		return listUser;
	}

	public String imprimeTopic(int n) {
		return listTopic.get(n).toString();
	}

	public String[] x1(int n) {

		return listTopic.get(n).textList();
	}

	public String[] x2(int n) {
		return listMotorista.get(n).textList1();
	}

	public boolean buscaUser(String user, String senha) {
		for (int i = 0; i < listUser.size(); i++) {
			if (listUser.get(i).getUsuario().equals(user) && listUser.get(i).getSenha().equals(senha))
				this.status = true;
			else
				this.status = false;
		}
		return this.status;
	}

	@Override
	public List addViagem(Viagem v) {
		listViagem.add(v);
		return null;
	}

	@Override
	public List addMotorista(String nome, String cpf, int idade, String cnh) {
		listMotorista.add(new Motorista(nome, cpf, idade, cnh));
		return null;
	}

	public static String getListTopic(int index) {
		return listTopic.get(index) + "";
	}

	public static void setListTopic(ArrayList<Topic> listTopic) {
		Banco.listTopic = listTopic;
	}

	public static ArrayList<User> getListUser() {
		return listUser;
	}

	public static void setListUser(ArrayList<User> listUser) {
		Banco.listUser = listUser;
	}

	public static ArrayList<Viagem> getListViagem() {
		return listViagem;
	}

	public static void setListViagem(ArrayList<Viagem> listViagem) {
		Banco.listViagem = listViagem;
	}

	public static ArrayList<Motorista> getListMotorista() {
		return listMotorista;
	}

	public static void setListMotorista(ArrayList<Motorista> listMotorista) {
		Banco.listMotorista = listMotorista;
	}

	public void imprmirUserTeste() {
		for (int i = 0; i < listUser.size(); i++) {
			System.out.println(listUser.get(i).getUsuario());
			System.out.println(listUser.get(i).getSenha());
			System.out.println("");
		}
	}

}
