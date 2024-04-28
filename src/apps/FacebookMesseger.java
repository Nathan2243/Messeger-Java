package apps;

public class FacebookMesseger extends ServicoMensagemInstantanea {
	
	@Override
	public void enviarMensagem() {
		// metodo protected, somente as classes filhas conhecem
		ValidarConectadoInternet();
		System.out.println("Enviando mensagem Facebook");
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvar historico Facebook");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Facebook");
		
	}
	

}
