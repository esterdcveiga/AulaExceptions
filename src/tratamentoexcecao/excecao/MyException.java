package tratamentoexcecao.excecao;

public class MyException extends Exception{
	//private static final long serialVer
	private static final long serialVersionUID = 1L;

	public MyException(String texto) {
		super(texto);
	}
}
