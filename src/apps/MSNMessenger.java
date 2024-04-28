package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// metodo protected, somente as classes filhas conhecem
		ValidarConectadoInternet();
		System.out.println("Enviando mensagem MSN");
	}
	
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvar historico MSN");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem MSN");
		
	}

	
	
}

	