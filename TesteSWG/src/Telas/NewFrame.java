package Telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Main.TopicInterface;

public class NewFrame extends JFrame implements TopicInterface {

	JLabel titulo;
	JLabel origem;
	JLabel destino;

	JComboBox cidadeOrigem;
	JComboBox cidadeDestino;

	JButton avancar;
	JButton voltar;

	protected static int itemSelecionado1;
	protected static int itemSelecionado2;

	public NewFrame() {

		setSize(320, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.black);

		criarLabel(container);
		criarCombobox(container);
		criarButton(container);

		setVisible(true);
	}

	@Override
	public void criarLabel(Container c) {
		titulo = new JLabel("Cooptranscrat®");
		titulo.setBounds(105, 0, 500, 30);
		titulo.setForeground(Color.green);
		c.add(titulo);

		origem = new JLabel("Origem:");
		origem.setBounds(10, 70, 90, 20);
		origem.setForeground(Color.white);
		c.add(origem);

		destino = new JLabel("Destino:");
		destino.setBounds(10, 150, 90, 20);
		destino.setForeground(Color.white);
		c.add(destino);

	}

	@Override
	public void criarCombobox(Container c) {
		ArrayList <String> x1 = new ArrayList<>();
		x1.add("Crateús");
		x1.add("Independência");
		x1.add("Ipaporanga");
		
		
		
		String[] str = { "Crateús", "Independência", "Ipaporanga", "Ipueiras", "Ipú", "Monsenhor Tabósa", "Nova Russas",
				"Novo Oriente", "Quiterianópolis", "Tamboril", "Tauá" };

		cidadeOrigem = new JComboBox(x1.toArray());
		cidadeOrigem.setBounds(10, 100, 170, 30);

		cidadeOrigem.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				itemSelecionado1 = cidadeOrigem.getSelectedIndex();
			}
		});
		c.add(cidadeOrigem);

		String[] str1 = { "Crateús", "Independência", "Ipaporanga", "Ipueiras", "Ipú", "Monsenhor Tabósa",
				"Nova Russas", "Novo Oriente", "Quiterianópolis", "Tamboril", "Tauá" };

		cidadeDestino = new JComboBox(str1);
		cidadeDestino.setBounds(10, 180, 170, 30);

		cidadeDestino.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				itemSelecionado2 = cidadeDestino.getSelectedIndex();
			}
		});
		c.add(cidadeDestino);
	}

	@Override
	public void criarButton(Container c) {
		avancar = new JButton("Avançar");
		avancar.setBounds(210, 400, 100, 20);
		avancar.setToolTipText("Avançar");
		c.add(avancar);

		avancar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (itemSelecionado1 == itemSelecionado2) {
					JOptionPane.showMessageDialog(null, "Origem e destino não podem ser o mesmo!", null,
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					OtherFrame terceiro = new OtherFrame();
					setVisible(false);
				}
			}

		});

		voltar = new JButton("Voltar");
		voltar.setBounds(10, 400, 100, 20);
		voltar.setToolTipText("Pagina anterior");

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame inicio = new MainFrame();

			}

		});
		c.add(voltar);
	}

	@Override
	public void criarField(Container c) {
		// TODO Auto-generated method stub

	}

	public static int getItemSelecionado1() {
		return itemSelecionado1;
	}

	public void setItemSelecionado1(int itemSelecionado1) {
		this.itemSelecionado1 = itemSelecionado1;
	}

	public static int getItemSelecionado2() {
		return itemSelecionado2;
	}

	public void setItemSelecionado2(int itemSelecionado2) {
		this.itemSelecionado2 = itemSelecionado2;
	}
	
	
	void metodo() {
		
	}

}
