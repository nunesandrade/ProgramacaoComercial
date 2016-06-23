package aulaGit;

public class Teste {
	
	public static void main(String[] args) {
		Moeda m = new Moeda (5, "5 centavos");
		Moeda m1 = new Moeda (7, "7 centavos");
		Moeda m2 = new Moeda (8, "8 centavos");
		Moeda m3 = new Moeda (23, "23 centavos");
		Cofrinho c = new Cofrinho();
		c.adicionar(m);
		c.adicionar(m1);
		c.adicionar(m2);
		c.adicionar(m3);
		System.out.println(c.quantidadeMoedas());
		System.out.println(c.quantidadeMoedas(8));
		System.out.println(c.maiorValor());
	}

}
