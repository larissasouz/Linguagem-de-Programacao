package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem{

	private Integer duracao;
	
	@Override
	public Mensagem sendMessage(String mensagem) {
		return this;
	}
}
