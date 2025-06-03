package celularStev;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
	
	public int versao;
	
	public Iphone(int versao) {
		this.versao = versao;
	}

	public void atender() {
		System.out.println("atendendo ligacao");
	}
	
	public void ligar(String contato) {
		System.out.println("ligando para: " + contato);
	}
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo uma página da internet");
	}
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba no safari");
	}
	public void atualizarPagina() {
		System.out.println("Dando reload em uma página na web");
	}
	public void tocar() {
		System.out.println("Tocando uma música da playlist");
	}
	public void pausar() {
		System.out.println("Pausando uma musica da playlist");
	}
	public void selecionarMusica(String musica) {
		System.out.println("selecionando a musica: " + musica);
	}
}
