package projeto_animal;

public class Animal {
	
	    private String nome;
	    private int comer;
	    
	    public Animal(String nome, int comer) {
	        this.nome = nome;
	        this.comer = comer;
	    }
	    
	    public String getNome() {
	        return nome;
	    }
	    
	    public int getComer() {
	        return comer;
	    }
	    
	    public void comer() {
	        System.out.println("O animal comeu.");
	    }
	}


