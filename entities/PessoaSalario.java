package entities;

public class PessoaSalario {

	private String name;
	private double salario;
	public PessoaSalario(String name, double salario) {
		
		this.name = name;
		this.salario = salario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
