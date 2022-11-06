package ExceptionTp;

public class EntNat {
	int entier;
	public EntNat(int ent) throws ErrConst {
		if(ent>=0) {
			entier=ent;
			System.out.println(entier);
		}else throw new ErrConst();
	}	
	public int getInt() {
		return entier;
	}
	public EntNat Somme(EntNat n1,EntNat n2) throws ErrConst,ErrSom{
		int N1=n1.getInt();
		int N2=n2.getInt();
		long Result=N1+N2;
		if(Result>Integer.MAX_VALUE) throw new ErrSom();
		return new EntNat(N1+N2);
	}
	public EntNat Diff(EntNat n1,EntNat n2) throws ErrConst,ErrDiff{
		int N1=n1.getInt();
		int N2=n2.getInt();
		long Result=N1-N2;
		if(Result>Integer.MAX_VALUE || Result<0) throw new ErrDiff();
		return new EntNat(N1-N2);
	}
	public EntNat Prod(EntNat n1,EntNat n2) throws ErrConst,ErrProd{
		int N1=n1.getInt();
		int N2=n2.getInt();
		long Result=N1*N2;
		if(Result>Integer.MAX_VALUE) throw new ErrProd();
		return new EntNat(N1*N2);
	}
	public int getN() throws ErrConst,ErrSom,ErrDiff,ErrProd{
		return entier;
	}
	public static void main(String[]args) throws ErrConst {
		EntNat N1=new EntNat(-5);
		EntNat N2=new EntNat(10);
		EntNat N3=new EntNat(2);
	}

}