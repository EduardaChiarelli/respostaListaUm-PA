[16:54, 5/9/2024] letícyaa: package listaUm;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;

	public Cachorro (String n, String r, int i) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getRaca () {
		return raca;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setRaca (String r) {
		this.raca = r;
	}
	
	public void setIdade (int i) {
		this.idade = i;
	}
	
	public String latir() {
		return "au au";
	}
	
	public String toString () {
		return "\nNome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade;
	}
}
[16:56, 5/9/2024] letícyaa: package listaUm;

public class Gato {
	private String nome;
	private String raca;
	private int idade;

	public Gato (String n, String r, int i) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getRaca () {
		return raca;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setRaca (String r) {
		this.raca = r;
	}
	
	public void setIdade (int i) {
		this.idade = i;
	}
	
	public String miar() {
		return "miau";
	}
	
	public String toString () {
		return "\nNome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade;
	}
}
