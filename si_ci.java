package intrest_SI_CI;

public class si_ci {
	public  static int SI(int p,int r,int t) {
		return p*t*r/100;
	}
	
	public static double CI(int p,int r,int t) {
		 return p*(Math.pow((1+r/100),t)); 
		
	}

}
