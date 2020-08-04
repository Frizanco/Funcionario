
public class Empresa {
	public static void main(String args[]) {
		
		Funcionario lista[] = new Funcionario[100];
		lista[0] = new Funcionario (0001,"Joao da Silva Neto","Analista",1000.00);
		lista[1] = new Funcionario (0002,"Manuel","Analista",2000.00);
		lista[2] = new Funcionario (0003,"Roberta","chefe",3000.00);
		lista[3] = new Funcionario (0004,"Robinson","vendedor",4000.00);
		lista[4] = new Funcionario (0005,"Wellington","vice-presidente",5000.00);
		lista[5] = new Funcionario (0006,"Washington","presidente",5000.00);
				
		for (int posLista=0; posLista<6; posLista++) {
			System.out.println(lista[posLista].getFuncional()+" - "+lista[posLista].getNome()+" Salario:"+lista[posLista].getSalario()+" Imposto:"+lista[posLista].calcularImposto());
		}
	}
}