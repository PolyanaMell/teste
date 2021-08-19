package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController opCont = new OperacoesController();
		// opCont.concatenaString();
		// opCont.concatenaBuffer();

		//String frase = "Sejam bem vindos a disciplina de Sistemas Operacionais I do 3º semestre de ADS";
	String frase = JOptionPane.showInputDialog(null,"Digite uma frase:");
		opCont.divideFrase(frase);
	}
}

//Executar: ctrl + F11