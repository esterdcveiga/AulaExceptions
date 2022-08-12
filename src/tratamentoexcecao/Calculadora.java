package tratamentoexcecao;

public class Calculadora {

	public double dividir(double n1, double n2) throws Exception {
		if(n2 == 0) {
			throw new Exception("Divisão por zero");
		}
		return n1/n2;	
	}
}
