package tratamentoexcecao;

import tratamentoexcecao.excecao.CpfExeption;
import tratamentoexcecao.excecao.MyException;

public class TratamentoExcecao {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		try {
//			int z = a/b;
//			System.out.println(z);
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//		}
//		
////		Venda venda = new Venda();
////		venda.trataExecao();
////		testaLancaExcecao();
//		System.out.println("acabou");
		
//		try {
//			minhaExecao();
//		} catch (MyException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			cpf();
		} catch (CpfExeption e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void cpf() throws CpfExeption {
		String cpf = "412.332.145-67";
		if (cpf.contains("-") && cpf.contains(".") && cpf.length() != 14){
			throw new CpfExeption("tamanho de cpf inválido");
		} else if (cpf.length() != 11 && cpf.length() != 14) {
			throw new CpfExeption("tamanho de cpf inválido");
		}
	}
	
	public static void minhaExecao() throws MyException {
		int a = 10;
		int b = 0;
		if(b == 0) {
			throw new MyException("divisão por zero");
		}
	}
	
	public static void testaLancaExcecao() {
		Venda venda = new Venda();
		try {
			venda.lancaExcecao();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
