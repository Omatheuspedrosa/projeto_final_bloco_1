package respository;

import model.Tipo;

public interface Repository {
	
	public void cadastrarPeca(String peca);
	public void listarTodasPecas();
	public void encontrarPeca(int id);
	public void atualizarPeca();
	public void deletarPeca();

}
