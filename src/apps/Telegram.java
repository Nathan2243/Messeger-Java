package apps;

public class Telegram extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		// metodo protected, somente as classes filhas conhecem
		ValidarConectadoInternet();
		System.out.println("Enviando mensagem Telegram");
	}

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvar historico Telegram");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Telegram");

	}

}
