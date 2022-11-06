package ExceptionTp;

public class ErrProd extends Exception{
	public ErrProd() {
		System.out.println("Le nombre a dépassé la limite des entiers");
	}
}
