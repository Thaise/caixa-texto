import javax.swing.JOptionPane;

public class CaixaTexto {

	public static void main(String[] args){
		int resposta;
		String nome = JOptionPane.showInputDialog(null, "Qual � o seu nome?", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + "?");
		
		if(resposta == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Seu nome � "+nome, "Resposta", JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Seu nome n�o � "+nome, "Resposta", JOptionPane.PLAIN_MESSAGE);
		}
	}
}