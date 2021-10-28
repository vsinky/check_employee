public class EmpWageBuilderUC1 {
	public static void main(String[] args) {
		//constant
		int IS_PRESENT = 1;
		double randomNumber = Math.floor(Math.random()* 10)%2;
		//0.5x10 = 5.0 = 5%2 = 1.0
		//0.4x10 = 4.0 = 4%2 = 0.0
		// 1 = present
		// 0 = absent
		
		if(IS_PRESENT == randomNumber) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}

}
