package jogo;

import javax.swing.JOptionPane;

public class jogoVelhaMain {

	public static void main(String[] args) {

			JogoDaVelha jogo = new JogoDaVelha();

			String nome1 = JOptionPane.showInputDialog("digite o nome do primeiro jogador");
			String nome2 = JOptionPane.showInputDialog("digite o nome do segundo jogador");

			jogo.MostrarMatriz(nome1, nome2);
	}
}
