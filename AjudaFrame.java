import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class AjudaFrame extends JFrame {

	private JPanel contentPane;

	// criação de ajuda para uso
	public AjudaFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(224, 255, 255));
		getContentPane().setForeground(new Color(176, 224, 230));
		setBounds(100, 100, 455, 630);
		getContentPane().setLayout(null);
		// ajuda da fatoração
		JLabel lblNewLabel_1 = new JLabel("Fatora\u00E7\u00E3o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 116, 63, 14);
		getContentPane().add(lblNewLabel_1);
		
		JTextPane txtpnProdutoOuSeja = new JTextPane();
		txtpnProdutoOuSeja.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtpnProdutoOuSeja.setEditable(false);
		txtpnProdutoOuSeja.setText("Fatora\u00E7\u00E3o ou Fatoriza\u00E7\u00E3o \u00E9 o termo usado na \u00E1lgebra para designar a decomposi\u00E7\u00E3o que se faz de cada um dos elementos que integram um produto, ou seja, o resultado de uma multiplica\u00E7\u00E3o , para utilizar na calculadora , basta colocar o numero que deseja calcular e clicar em igual ");
		txtpnProdutoOuSeja.setBounds(118, 74, 286, 108);
		getContentPane().add(txtpnProdutoOuSeja);
		// ajuda do arranjo
		JLabel lblNewLabel_2 = new JLabel("Arranjo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(29, 274, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JTextPane txtpnUtilizamosOArranjo = new JTextPane();
		txtpnUtilizamosOArranjo.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtpnUtilizamosOArranjo.setText("Utilizamos o arranjo simples para obter a quantidade de agrupamentos poss\u00EDveis de serem realizados com os elementos de um conjunto finito. No arranjo os elementos trocam de posi\u00E7\u00E3o, ou seja, ordem. Com isso os agrupamentos tornam-se distintos, por possu\u00EDrem seus elementos organizados em uma ordem diferente, para utilizar na calculadora , basta colocar o numero de elementos e o numero de posi\u00E7\u00F5es");
		txtpnUtilizamosOArranjo.setBounds(118, 218, 286, 118);
		getContentPane().add(txtpnUtilizamosOArranjo);
		// ajuda da combinação
		JLabel lblNewLabel_3 = new JLabel("Combina\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(29, 433, 79, 14);
		getContentPane().add(lblNewLabel_3);
		
		JTextPane txtpnUmaCombinaoSem = new JTextPane();
		txtpnUmaCombinaoSem.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtpnUmaCombinaoSem.setText("Uma combina\u00E7\u00E3o sem repeti\u00E7\u00E3o, em an\u00E1lise combinat\u00F3ria, \u00E9 um subconjunto com elementos em um conjunto com elementos. Como \u00E9 um conjunto, n\u00E3o h\u00E1 repeti\u00E7\u00E3o de membros dentro do conjunto, para utilizar na calculadora, basta colocar o numero de termos e a posi\u00E7\u00E3o deles");
		txtpnUmaCombinaoSem.setBounds(118, 384, 286, 108);
		getContentPane().add(txtpnUmaCombinaoSem);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(10, 11, 419, 54);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("COMO USAR AS FUN\u00C7\u00D5ES EXTRAS DA CALCULADORA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel);
		// criação do botão de voltar
		JButton btn_voltar = new JButton("Voltar");
		btn_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btn_voltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_voltar.setBounds(309, 519, 97, 37);
		getContentPane().add(btn_voltar);

	}

}
