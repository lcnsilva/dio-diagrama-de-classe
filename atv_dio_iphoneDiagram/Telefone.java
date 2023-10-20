package atv_dio_iphoneDiagram;

public interface Telefone {
	public void fazerLigacao(String numero);

	public void enviarMensagem(String numeroTelefone, String mensagem);

	public void ligar();

	public void desligar();

	public void abrirCamera();
}
