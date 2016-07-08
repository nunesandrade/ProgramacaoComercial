package aulaGit;

	import java.util.HashMap;
	import java.util.Map;

	public class AgendaTelefonica {
		Map<String, String> colecao = new HashMap<String, String>();

		public void inserir(String nome, String numero) {
			colecao.put(nome, numero);
		}

		public String buscarNumero(String nome) {
			return colecao.get(nome).toString();
		}

		public void remover(String nome) {
			colecao.remove(nome);
		}

		public int tamanho() {
			return colecao.size();
		}
}
