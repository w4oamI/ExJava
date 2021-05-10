package ExTDD;

public class firstTdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("숫자를 입력해주세요");
			return;
		}  
		
		double[] s = new double[args.length];
		
		for (int i = 0; i < s.length; i++) {
		    s[i] = Double.parseDouble(args[i]);
		  }
		  
		  double sum = 0;
		
		for (double value : s) {
		    sum += value;
		  }

		  double variance = sum / (s.length);

		  System.out.println("variance = " + variance);
	}

}