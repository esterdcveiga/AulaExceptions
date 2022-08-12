package tratamentoexcecao;

public class Venda {
	public void trataExecao() {
		Calculadora calc = new Calculadora();
		try {
			calc.dividir(10, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void lancaExcecao() throws Exception {
		Calculadora calc = new Calculadora();
		calc.dividir(10, 2);
	}

}
