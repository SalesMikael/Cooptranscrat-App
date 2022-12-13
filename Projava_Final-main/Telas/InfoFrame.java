package Telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import Main.Banco;

public class InfoFrame extends JFrame {	

	int parametro;
	JButton b, p;
	
	JLabel t, k, q, jImg1, jImg2, jImg3, jImg4, jImg5, jImg6, jImg7, jImg8, jImg9, jImg10,
	jImg11, jImg12, jImg13, jImg14, jImg15;
	
	ImageIcon img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11,
	img12, img13, img14, img15;
	
	JLabel jImgt1, jImgt2, jImgt3, jImgt4, jImgt5, jImgt6, jImgt7, jImgt8, jImgt9, jImgt10,
	jImgt11, jImgt12, jImgt13, jImgt14, jImgt15;
	
	ImageIcon imgt1, imgt2, imgt3, imgt4, imgt5, imgt6, imgt7, imgt8, imgt9, imgt10, imgt11,
	imgt12, imgt13, imgt14, imgt15;
	
	Banco e = new Banco();

	public InfoFrame(int parametro) {

		setSize(320, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.black);

		criarLabel(container);
		criarButton(container);
		imagem(container);
		
		setVisible(true);
		
		if(parametro==1) {
			add(jImg1);
			add(jImgt1);
		}else if(parametro==2) {
			add(jImg2);
			add(jImgt2);
		}else if(parametro==3) {
			add(jImg3);
			add(jImgt3);
		}else if(parametro==4) {
			add(jImg4);
			add(jImgt4);
		}else if(parametro==5) {
			add(jImg5);
			add(jImgt5);
		}else if(parametro==6) {
			add(jImg6);
			add(jImgt6);
		}else if(parametro==7) {
			add(jImg7);
			add(jImgt7);
		}else if(parametro==8) {
			add(jImg8);
			add(jImgt8);
		}else if(parametro==9) {
			add(jImg9);
			add(jImgt9);
		}else if(parametro==10) {
			add(jImg10);
			add(jImgt10);
		}else if(parametro==11) {
			add(jImg11);
			add(jImgt11);
		}else if(parametro==12) {
			add(jImg12);
			add(jImgt12);
		}else if(parametro==13) {
			add(jImg13);
			add(jImgt13);
		}else if(parametro==14) {
			add(jImg14);
			add(jImgt14);
		}else if(parametro==15) {
			add(jImg15);
			add(jImgt15);
		}else {
			add(jImg4);
			add(jImgt4);
		}
		
		JList d = new JList(e.x1(parametro));
		d.setBounds(10, 200, 150, 75);
		container.add(d);

		JList f = new JList(e.x2(parametro));
		f.setBounds(10, 50, 150, 92);
		container.add(f);

	}

	public void criarLabel(Container c) {
		t = new JLabel("Cooptranscrat®");
		t.setBounds(105, 0, 500, 30);
		t.setForeground(Color.green);
		c.add(t);

		k = new JLabel("Status: ");
		k.setBounds(10, 280, 500, 30);
		k.setForeground(Color.WHITE);
		c.add(k);

		q = new JLabel("no terminal");
		q.setBounds(53, 280, 500, 30);
		q.setForeground(Color.RED);
		c.add(q);
	}

	public void criarButton(Container c) {
		b = new JButton("Voltar");
		b.setBounds(10, 400, 100, 20);
		b.setToolTipText("Pagina anterior");

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OtherFrame segundo = new OtherFrame();
				setVisible(false);
			}
		});
		c.add(b);
		
	}

	public void imagem(Container c) {
		img1 = new ImageIcon(getClass().getResource("1.jpg"));
		jImg1 = new JLabel(img1);
		jImg1.setBounds(140, 47, 180, 100);
		
		img2 = new ImageIcon(getClass().getResource("2.jpg"));
		jImg2 = new JLabel(img2);
		jImg2.setBounds(140, 47, 180, 100);
		
		img3 = new ImageIcon(getClass().getResource("3.jpg"));
		jImg3 = new JLabel(img3);
		jImg3.setBounds(140, 47, 180, 100);
		
		img4 = new ImageIcon(getClass().getResource("4.jpg"));
		jImg4 = new JLabel(img4);
		jImg4.setBounds(140, 47, 180, 100);
		
		img5 = new ImageIcon(getClass().getResource("5.jpg"));
		jImg5 = new JLabel(img5);
		jImg5.setBounds(140, 47, 180, 100);
		
		img6 = new ImageIcon(getClass().getResource("6.jpg"));
		jImg6 = new JLabel(img6);
		jImg6.setBounds(140, 47, 180, 100);
		
		img7 = new ImageIcon(getClass().getResource("7.jpg"));
		jImg7 = new JLabel(img7);
		jImg7.setBounds(140, 47, 180, 100);
		
		img8 = new ImageIcon(getClass().getResource("8.jpg"));
		jImg8 = new JLabel(img8);
		jImg8.setBounds(140, 47, 180, 100);
		
		img9 = new ImageIcon(getClass().getResource("9.jpg"));
		jImg9 = new JLabel(img9);
		jImg9.setBounds(140, 47, 180, 100);
		
		img10 = new ImageIcon(getClass().getResource("10.jpg"));
		jImg10 = new JLabel(img10);
		jImg10.setBounds(140, 47, 180, 100);
		
		img11 = new ImageIcon(getClass().getResource("11.jpg"));
		jImg11 = new JLabel(img11);
		jImg11.setBounds(140, 47, 180, 100);
		
		img12 = new ImageIcon(getClass().getResource("12.jpg"));
		jImg12 = new JLabel(img12);
		jImg12.setBounds(140, 47, 180, 100);
		
		img13 = new ImageIcon(getClass().getResource("13.jpg"));
		jImg13 = new JLabel(img13);
		jImg13.setBounds(140, 47, 180, 100);
		
		img14 = new ImageIcon(getClass().getResource("14.jpg"));
		jImg14 = new JLabel(img14);
		jImg14.setBounds(140, 47, 180, 100);
		
		img15 = new ImageIcon(getClass().getResource("15.jpg"));
		jImg15 = new JLabel(img15);
		jImg15.setBounds(140, 47, 180, 100);
		
		// topic
		
		imgt1 = new ImageIcon(getClass().getResource("1t.jpg"));
		jImgt1 = new JLabel(imgt1);
		jImgt1.setBounds(83, 137, 300, 200);
		
		imgt2 = new ImageIcon(getClass().getResource("2t.jpg"));
		jImgt2 = new JLabel(imgt2);
		jImgt2.setBounds(83, 137, 300, 200);
		
		imgt3 = new ImageIcon(getClass().getResource("3t.jpg"));
		jImgt3 = new JLabel(imgt3);
		jImgt3.setBounds(83, 137, 300, 200);
		
		imgt4 = new ImageIcon(getClass().getResource("4p.jpg"));
		jImgt4 = new JLabel(imgt4);
		jImgt4.setBounds(83, 137, 300, 200);
		
		imgt5 = new ImageIcon(getClass().getResource("5t.jpg"));
		jImgt5 = new JLabel(imgt5);
		jImgt5.setBounds(83, 137, 300, 200);
		
		imgt5 = new ImageIcon(getClass().getResource("5t.jpg"));
		jImgt5 = new JLabel(imgt5);
		jImgt5.setBounds(83, 137, 300, 200);
		
		imgt6 = new ImageIcon(getClass().getResource("6t.jpg"));
		jImgt6 = new JLabel(imgt6);
		jImgt6.setBounds(83, 137, 300, 200);
		
		imgt7 = new ImageIcon(getClass().getResource("7t.jpg"));
		jImgt7 = new JLabel(imgt7);
		jImgt7.setBounds(83, 137, 300, 200);
		
		imgt8 = new ImageIcon(getClass().getResource("8t.jpg"));
		jImgt8 = new JLabel(imgt8);
		jImgt8.setBounds(83, 137, 300, 200);
		
		imgt9 = new ImageIcon(getClass().getResource("9t.jpg"));
		jImgt9 = new JLabel(imgt9);
		jImgt9.setBounds(83, 137, 300, 200);
		
		imgt10 = new ImageIcon(getClass().getResource("10t.jpg"));
		jImgt10 = new JLabel(imgt10);
		jImgt10.setBounds(83, 137, 300, 200);
		
		imgt11 = new ImageIcon(getClass().getResource("11t.png"));
		jImgt11 = new JLabel(imgt11);
		jImgt11.setBounds(83, 137, 300, 200);
		
		imgt12 = new ImageIcon(getClass().getResource("12t.jpg"));
		jImgt12 = new JLabel(imgt1);
		jImgt12.setBounds(83, 137, 300, 200);
		
		imgt13 = new ImageIcon(getClass().getResource("13t.png"));
		jImgt13 = new JLabel(imgt13);
		jImgt13.setBounds(83, 137, 300, 200);
		
		imgt14 = new ImageIcon(getClass().getResource("14t.jpg"));
		jImgt14 = new JLabel(imgt14);
		jImgt14.setBounds(83, 137, 300, 200);
		
		imgt15 = new ImageIcon(getClass().getResource("15t.jpg"));
		jImgt15 = new JLabel(imgt15);
		jImgt15.setBounds(83, 137, 300, 200);
		
	}
}
