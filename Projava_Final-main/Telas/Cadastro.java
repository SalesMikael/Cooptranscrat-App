package Telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Main.Banco;

public class Cadastro extends JFrame{

	Banco i = new Banco();
	
	JLabel titulo;
	JLabel newUser;
	JLabel newSenha;
	
	static JTextField txtNewUser;
	static JTextField txtNewSenha;
	
	JButton ok;

	public Cadastro() {

		setSize(320, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.black);
		
		criarLabel(container);
		criarField(container);
		criarButton(container);
		setVisible(true);
	}

	public void criarLabel(Container c) {
		titulo = new JLabel("Cooptranscrat®");
		titulo.setBounds(105, 0, 500, 30);
		titulo.setForeground(Color.green);
		c.add(titulo);
		
		newUser = new JLabel("Nome de usuário:");
		newUser.setBounds(110, 90, 500, 30);
		newUser.setForeground(Color.white);
		c.add(newUser);

		newSenha = new JLabel("Nova senha:");
		newSenha.setBounds(110, 170, 500, 30);
		newSenha.setForeground(Color.white);
		c.add(newSenha);

	}

	public void criarField(Container c) {
		txtNewUser = new JTextField();
		txtNewUser.setToolTipText("Insira seu nome de usuário");
		txtNewUser.setBounds(110, 120, 90, 20);
		c.add(txtNewUser);

		txtNewSenha = new JPasswordField();
		txtNewSenha.setToolTipText("Insira sua senha");
		txtNewSenha.setBounds(110, 200, 90, 20);
		c.add(txtNewSenha);
		
		System.out.println();

	}
	
	public void criarButton(Container c) {
		ok = new JButton("Salvar");
		ok.setBounds(190, 400, 100, 20);
		ok.setToolTipText("Salvar");
		c.add(ok);
		
		i.addUser(txtNewUser.getText(), txtNewSenha.getText());
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				i.addUser(txtNewUser.getText(), txtNewSenha.getText());
		
				MainFrame inicio = new MainFrame();
				setVisible(false);
			}
		});	
	}
}
