package projeto_animal;

public class Cavalo extends Animal {

	boolean correr = true;

	public Cavalo(String nome, int comer) {
		super(nome, comer);

		Cavalo cavalo = new Cavalo("Pé de Pano", 5);
		System.out.println(cavalo.getNome());
		cavalo.comer();
	}

	@Override
	public void comer() {
		System.out.println("O cavalo comeu.");

		System.out.println("Pé de Pano é um corredor");
		
	}

}
