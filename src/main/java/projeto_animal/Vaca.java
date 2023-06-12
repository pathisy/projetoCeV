package projeto_animal;

public class Vaca extends Animal {
	
	boolean produtoraDeLeite = true;
	
	public Vaca(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void comer() {
		System.out.println("A vaca comeu");
		
		System.out.println( "A vaca Mimosa é produtora de leite ");
		
	}

}
