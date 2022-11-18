package Telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Main.TopicInterface;

public class MainFrame extends JFrame implements TopicInterface {

	JLabel titulo;
	JLabel usuario;
	JLabel senha;
	JTextField txtUsuario;
	JPasswordField txtSenha;
	JButton login;

	private static String user1 = "";
	private static String password1 = "";
	private String auxUser;
	private String auxPassword;

	public MainFrame() {

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

		new Thread(new Runnable() {

			public void run() {

				try {
					while (true) {

						Thread.sleep(1000);
						System.out.println("mikael"); // CALL TO YAHOO SENSEX

						repaint();
					}
				} catch (Exception ex) {

				}
			}
		}).start();
	}

	@Override
	public void criarLabel(Container c) {
		titulo = new JLabel("Cooptranscrat® ");
		titulo.setBounds(105, 0, 500, 30);
		titulo.setForeground(Color.green);
		c.add(titulo);

		usuario = new JLabel("Usuário:");
		usuario.setBounds(110, 90, 500, 30);
		usuario.setForeground(Color.white);
		c.add(usuario);

		senha = new JLabel("Senha:");
		senha.setBounds(110, 170, 500, 30);
		senha.setForeground(Color.white);
		c.add(senha);
	}

	@Override
	public void criarField(Container c) {
		txtUsuario = new JTextField();
		txtUsuario.setToolTipText("Insira seu nome de usuário");
		txtUsuario.setBounds(110, 120, 90, 20);
		c.add(txtUsuario);

		txtSenha = new JPasswordField();
		txtSenha.setToolTipText("Insira sua senha");
		txtSenha.setBounds(110, 200, 90, 20);
		c.add(txtSenha);

	}

	@Override
	public void criarButton(Container c) {
		login = new JButton("login");
		login.setBounds(115, 250, 80, 20);
		login.setToolTipText("Iniciar sessão");

		login.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				auxUser = txtUsuario.getText();
				auxPassword = txtSenha.getText();
				// System.out.println(auxUser);
				// System.out.println(auxPassword);

				if (auxUser.equals(user1) && auxPassword.equals(password1)) {
					JOptionPane.showMessageDialog(null, "Bem vindo!", null, JOptionPane.INFORMATION_MESSAGE);

					NewFrame segundo = new NewFrame();
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario ou Senha incorreto", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		c.add(login);

	}

	@Override
	public void criarCombobox(Container c) {
		// TODO Auto-generated method stub

	}

}