public class Main {
	public static void main(String[] args) {
		Cachorro cao01 = new Cachorro();
		cao01.nome = "Spike";
		cao01.idade = 3;
		cao01.emitirSom();
		cao01.correr();
		
		Cavalo cavalo01 = new Cavalo();
		cavalo01.nome = "Epona";
		cavalo01.idade = 5;
		cavalo01.emitirSom();
		cavalo01.correr();
		
		Preguica preguica01 = new Preguica();
		preguica01.nome = "Pipoca";
		preguica01.idade = 1;
		preguica01.emitirSom();
		preguica01.subirArvore();
	}
}
