import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	private JButton btn_ajuda;
	private JButton btn_sair;
	Double valor1 , valor2;
	String sinal;
	
	//Mostra a calculadora
	public Calculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Danilo\\Desktop\\cbb25ff6f1471030763f0709c87e276a---cone-de-calculadora-by-vexels.png"));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResultado = new JTextField();
		txtResultado.setBackground(new Color(255, 255, 255));
		txtResultado.setEditable(false);
	
		txtResultado.setBounds(125, 108, 411, 31);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		//Faz os botãos
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"7");
			}
		});
		btnNewButton.setBounds(125, 205, 72, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"8");
			}
		});
		btnNewButton_1.setBounds(207, 205, 72, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"9");
			}
		});
		btnNewButton_2.setBounds(289, 205, 72, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
			}
		});
		btnCe.setBounds(382, 205, 72, 40);
		contentPane.add(btnCe);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "soma";
			}
		});
		btnNewButton_4.setBounds(464, 205, 72, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"4");
			}
		});
		btnNewButton_5.setBounds(125, 256, 72, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("5");
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"5");
			}
		});
		btnNewButton_5_1.setBounds(207, 256, 72, 40);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("6");
		btnNewButton_5_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"6");
			}
		});
		btnNewButton_5_2.setBounds(291, 256, 72, 40);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("C");
		btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1=0.0;
				valor2=0.0;
				txtResultado.setText("");
			}
		});
		btnNewButton_5_3.setBounds(382, 256, 72, 40);
		contentPane.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("-");
		btnNewButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "sub";
			}
		});
		btnNewButton_5_4.setBounds(464, 256, 72, 40);
		contentPane.add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("1");
		btnNewButton_5_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResultado.setText(txtResultado.getText()+"1");
			}
		});
		btnNewButton_5_5.setBounds(125, 307, 72, 40);
		contentPane.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("2");
		btnNewButton_5_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"2");
			}
		});
		btnNewButton_5_6.setBounds(210, 307, 72, 40);
		contentPane.add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("3");
		btnNewButton_5_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"3");
			}
		});
		btnNewButton_5_7.setBounds(291, 307, 72, 40);
		contentPane.add(btnNewButton_5_7);
		
		
		
		JButton btnNewButton_5_9 = new JButton("x");
		btnNewButton_5_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "mult";
			}
		});
		btnNewButton_5_9.setBounds(464, 307, 72, 40);
		contentPane.add(btnNewButton_5_9);
		
		JButton btnNewButton_5_10 = new JButton("0");
		btnNewButton_5_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"0");
			}
		});
		btnNewButton_5_10.setBounds(125, 358, 154, 40);
		contentPane.add(btnNewButton_5_10);
		
		JButton btnNewButton_5_11 = new JButton(".");
		btnNewButton_5_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+".");
			}
		});
		btnNewButton_5_11.setBounds(291, 358, 72, 40);
		contentPane.add(btnNewButton_5_11);
		
		JButton btnNewButton_5_13 = new JButton("/");
		btnNewButton_5_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_13.setBounds(464, 358, 72, 40);
		contentPane.add(btnNewButton_5_13);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 663, 82);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		panel.add(lblNewLabel);
		
		JButton btn_Fat = new JButton("Fatora\u00E7\u00E3o");
		btn_Fat.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btn_Fat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				sinal = "fat";
			}
		});
		//faz o botão de combinação
		btn_Fat.setBounds(124, 150, 98, 33);
		contentPane.add(btn_Fat);
		
		JButton btnNewButton_6 = new JButton("Combina\u00E7\u00E3o");
		btnNewButton_6.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "Comb";
			}
		});
		// faz o botão de arranjo
		btnNewButton_6.setBounds(285, 150, 104, 33);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Arranjo");
		btnNewButton_7.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "arranjo";
			}
		});
		//criação das contas
		btnNewButton_7.setBounds(438, 150, 98, 33);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_5_8 = new JButton("=");
		btnNewButton_5_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(sinal.equals("soma")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1+valor2));
				}
				else if (sinal.equals("sub")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1-valor2));
				}
				else if (sinal.equals("mult")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1*valor2));
				}
				else if (sinal.equals("div")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1/valor2));
				}
				else if (sinal.equals("fat")) {
					int fat=1;
					if (valor1 > 0 ) 
					{
						for (int i = 1; i <= valor1; i++)
						{
							fat = fat * i;
						}
						txtResultado.setText(String.valueOf(fat));
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Informe algum numero maior ou igual a 0!");
					}
					
				}
				else if (sinal.equals("Comb")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					int cont;
					int fatoracao = 1;
					int denominador;
					int fatoracao2 = 1;
					int fatoracao3 = 1;
					float mult;
					float resultado;
										
					if(valor1 > 0) {
						for(cont = 1; cont <= valor1; cont++) {
							fatoracao = fatoracao * cont; 
						}
						
						denominador = (int) (valor1 - valor2);
						
						for(cont = 1; cont <= valor2; cont++) {
							fatoracao2 = fatoracao2 * cont; 
						}
						for(cont = 1; cont <= denominador; cont++) {
							fatoracao3 = fatoracao3 * cont; 
						}
						mult = (fatoracao2 * fatoracao3);
						resultado = fatoracao/mult;
						
						txtResultado.setText(String.valueOf(resultado));
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Digite um numero maior ou igual a 0!");
					}
					
				}
				else if (sinal.equals("arranjo")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					int cont;
					int fat = 1;  
					int fat2 = 1;
					int sub = 0;
					int resultado = 0;
					
					if(valor1 > 0){
						for(cont = 1; cont <= valor1; cont++) {
							fat = fat * cont;
						}
						sub = (int) (valor1 - valor2);
						for(cont = 1; cont <= sub; cont++) {
							fat2 = fat2 * cont;
						}
						
						resultado = fat / fat2;
						txtResultado.setText(String.valueOf(resultado));
							
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Informe numeros a partir de 0!");
					}
				}
			}
		});
		btnNewButton_5_8.setBounds(382, 308, 72, 90);
		contentPane.add(btnNewButton_5_8);
		
		ButtonHandler handler = new ButtonHandler();
		btn_ajuda = new JButton("Ajuda");
		btn_ajuda.setBounds(124, 422, 89, 23);
		btn_ajuda.addActionListener(handler);
		contentPane.add(btn_ajuda);
		
		JButton btn_sair = new JButton("Sair");
		btn_sair.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_sair.setBounds(447, 422, 89, 23);
		contentPane.add(btn_sair);
		btn_sair.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Ajuda")) {
				AjudaFrame frame = new AjudaFrame();
				frame.setVisible(true);
				frame.setResizable(false);
			}
			else if(e.getActionCommand().equals("Sair")) {
				dispose();
			}
			
		}
		
	}
}

