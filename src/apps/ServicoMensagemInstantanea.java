package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	/// mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();

	// apenas as classes filhas poderão implementar
	protected void ValidarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");

	}
}
