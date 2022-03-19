package entidade;

public class Pessoa {

	public String nome;
	public double diaNasc;
	public int mesNasc;
	public int anoNasc;

	public Pessoa() {
	}

	public Pessoa(String nome, double dia, int mesNasc, int anoNasc) {
		super();
		this.nome = nome;
		this.diaNasc = dia;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaNasc() {
		return (int) diaNasc;
	}

	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}

	public int getMesNasc() {
		return mesNasc;
	}

	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	/*@Override
	public String toString() {
		return nome + " " + diaNasc + " " + mesNasc + " " + anoNasc;
	}*/

}
