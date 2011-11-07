import javax.swing.JOptionPane;

public class CaixaTexto {

	public static void main(String[] args){
		int resposta;
		String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
		
		if(resposta == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Seu nome é "+nome, "Resposta", JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Seu nome não é "+nome, "Resposta", JOptionPane.PLAIN_MESSAGE);
		}
	}
}