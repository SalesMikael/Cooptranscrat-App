package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.ListModel;

import org.eclipse.swt.widgets.List;

import Main.Modelo;
import Main.TopicInterface;

public class OtherFrame extends JFrame implements TopicInterface {

	int cidadeOrigem, cidadeDestino;

	JButton voltar;
	JLabel titulo;
	JLabel saida;
	JRadioButton hora;
	JList lista;
	int x, y;
	public OtherFrame(int x, int y){
		this.x=x;
		this.y=y;
	}
	public OtherFrame() {
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

		criarJList(container);

		setVisible(true);

	}

	@Override
	public void criarButton(Container c) {
		voltar = new JButton("Voltar");
		voltar.setBounds(10, 400, 100, 20);
		voltar.setToolTipText("Pagina anterior");

		voltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewFrame segundo = new NewFrame();
				setVisible(false);
			}
		});
		c.add(voltar);
	}

	@Override
	public void criarField(Container c) {

	}

	@Override
	public void criarLabel(Container c) {
		titulo = new JLabel("Cooptranscrat®");
		titulo.setBounds(105, 0, 500, 30);
		titulo.setForeground(Color.green);
		c.add(titulo);

		saida = new JLabel("Saida");
		saida.setBounds(12, 50, 51, 20);
		saida.setForeground(Color.CYAN);
		c.add(saida);
	}

	@Override
	public void criarCombobox(Container c) {

	}

	String hChegada() {
		ArrayList<String> hChegada = new ArrayList<>();
		return hChegada();

	}

	void criarJList(Container c) {
		
		Modelo x1 = new Modelo();
		
		

		String[] hChegada = { "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00",
				"15:00", "16:00", "17:00", "18:00" };

		NewFrame f1 = new NewFrame();
		f1.setVisible(false);

		if (f1.getItemSelecionado1() == 0) {
			if (f1.getItemSelecionado2() == 1) {
				lista = new JList(hChegada);
				lista.setBounds(15, 75, 40, 240);
				add(BorderLayout.WEST, lista);
				c.add(lista);
			}
		}
	}
}
