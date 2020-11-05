package jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JogoDaVelha extends JFrame {

	JButton btn[] = new JButton[9];
	JButton nome = new JButton("Trocar Jogadores");
	JLabel placar = new JLabel("Placar");
	JLabel pontX = new JLabel();
	JLabel pontO = new JLabel();
	JButton resetjogo = new JButton("Novo Jogo");
	JButton limparPlacar = new JButton("Limpar Placar");
	int pX = 0;
	int pO = 0;
	String nome1, nome2;

	boolean simboloJogador = false;
	boolean botao[] = new boolean[9];

	public void MostrarMatriz(String n1, String n2) {

		this.nome1 = n1;
		this.nome2 = n2;
		pontX.setText(n1 + ":");
		pontO.setText(n2 + ":");

		setVisible(true);
		setTitle("Jogo Da Velha");
		setDefaultCloseOperation(3);
		setLayout(null);
		setBounds(0, 0, 411, 600);
		add(placar);
		add(pontX);
		add(pontO);
		add(nome);
		placar.setBounds(50, 350, 100, 150);
		pontX.setBounds(50, 365, 100, 150);
		pontO.setBounds(50, 380, 100, 150);
		add(resetjogo);
		add(limparPlacar);
		resetjogo.setBounds(200, 420, 150, 30);
		limparPlacar.setBounds(200, 460, 150, 30);
		nome.setBounds(200, 500, 150, 30);
		int cont = 0;
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 3; col++) {

				btn[cont] = new JButton();
				add(btn[cont]);
				btn[cont].setBounds(100 * lin + 50, 100 * col + 50, 95, 95);
				cont++;
			}
		}
		for (int i = 0; i < 9; i++) {
			botao[i] = false;
		}

		btn[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[0] == false) {
					botao[0] = true;
					jogada(btn[0]);

				}
			}

		});
		btn[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[1] == false) {
					botao[1] = true;
					jogada(btn[1]);

				}
			}

		});
		btn[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[2] == false) {
					botao[2] = true;
					jogada(btn[2]);

				}
			}

		});
		btn[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[3] == false) {
					botao[3] = true;
					jogada(btn[3]);

				}
			}

		});
		btn[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[4] == false) {
					botao[4] = true;
					jogada(btn[4]);

				}
			}

		});
		btn[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[5] == false) {
					botao[5] = true;
					jogada(btn[5]);

				}
			}

		});
		btn[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[6] == false) {
					botao[6] = true;
					jogada(btn[6]);

				}
			}

		});
		btn[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[7] == false) {
					botao[7] = true;
					jogada(btn[7]);

				}
			}

		});
		btn[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (botao[8] == false) {
					botao[8] = true;
					jogada(btn[8]);

				}
			}

		});
		resetjogo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				limpar();

			}
		});
		limparPlacar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pX = 0;
				pO = 0;
				placarAtual();

			}
		});
		nome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nome1 = JOptionPane.showInputDialog("digite o nome do primeiro jogador");
				String nome2 = JOptionPane.showInputDialog("digite o nome do segundo jogador");

				trocarNome(nome1, nome2);
			}
		});

	}

	public void jogada(JButton btn) {
		if (simboloJogador) {
			btn.setText("O");
			simboloJogador = false;
		} else {
			btn.setText("X");
			simboloJogador = true;
		}
		Ganhador();
	}

	public void Ganhador() {
		int contJogadas = 0;
		for (int i = 0; i < 9; i++) {
			if (botao[i] == true) {
				contJogadas++;
			}
			if (btn[0].getText() == "X" && btn[1].getText() == "X" && btn[2].getText() == "X"
					|| btn[3].getText() == "X" && btn[4].getText() == "X" && btn[5].getText() == "X"
					|| btn[6].getText() == "X" && btn[7].getText() == "X" && btn[8].getText() == "X" ||

					btn[0].getText() == "X" && btn[3].getText() == "X" && btn[6].getText() == "X"
					|| btn[1].getText() == "X" && btn[4].getText() == "X" && btn[7].getText() == "X"
					|| btn[2].getText() == "X" && btn[5].getText() == "X" && btn[8].getText() == "X" ||

					btn[0].getText() == "X" && btn[4].getText() == "X" && btn[8].getText() == "X"
					|| btn[2].getText() == "X" && btn[4].getText() == "X" && btn[6].getText() == "X") {

				JOptionPane.showMessageDialog(null, nome1 + " venceu !");
				pX++;
				placarAtual();
				limpar();

			} else if (btn[0].getText() == "O" && btn[1].getText() == "O" && btn[2].getText() == "O"
					|| btn[3].getText() == "O" && btn[4].getText() == "O" && btn[5].getText() == "O"
					|| btn[6].getText() == "O" && btn[7].getText() == "O" && btn[8].getText() == "O" ||

					btn[0].getText() == "O" && btn[3].getText() == "O" && btn[6].getText() == "O"
					|| btn[1].getText() == "O" && btn[4].getText() == "O" && btn[7].getText() == "O"
					|| btn[2].getText() == "O" && btn[5].getText() == "O" && btn[8].getText() == "O" ||

					btn[0].getText() == "O" && btn[4].getText() == "O" && btn[8].getText() == "O"
					|| btn[2].getText() == "O" && btn[4].getText() == "O" && btn[6].getText() == "O") {

				JOptionPane.showMessageDialog(null, nome2 + " venceu !");
				pO++;
				placarAtual();
				limpar();
			} else if (contJogadas == 9) {
				JOptionPane.showMessageDialog(null, "EMPATE");
				limpar();
			}
		}

	}

	public void limpar() {
		for (int i = 0; i < 9; i++) {
			btn[i].setText("");
			botao[i] = false;
			simboloJogador = false;

		}
	}

	public void placarAtual() {
		pontX.setText(nome1 + " : " + pX);
		pontO.setText(nome2 + " : " + pO);
	}

	public void trocarNome(String n1, String n2) {
		nome1 = n1;
		nome2 = n2;
		pX = 0;
		pO = 0;
		placarAtual();

	}

}
