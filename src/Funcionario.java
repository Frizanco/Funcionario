
public class Funcionario {

	private int funcional;
	private String nome;
	private String cargo;
	private double salario;
	public Funcionario(int funcional, String nome, String cargo, double salario) {
		this.funcional = funcional;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularImposto() {
		double imposto;
		if (this.salario<=1000.00) {
			imposto =0.00;
			return imposto;
		}
		else if (this.salario<=2000.00) {
			imposto = this.salario*0.15;
			return imposto;
		}
		else if (this.salario<=4500.00) {
			imposto = this.salario*0.25;
			return imposto;
		}
		else {
			imposto = 2150.00;
			return imposto;
		}
	}
	
}
