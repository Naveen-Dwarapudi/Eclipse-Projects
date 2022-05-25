
public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// 2D Array = an array of arrays
		
		String[][] cars = {
							{"Benz","Toyota","Maruti Suzuki"},
							{"Audi","Renault","Rolls Royce"},
							{"Ferrari","Tesla","Lambo"}
						  };
		
		for(int i=0; i<=cars.length-1; i++) {
			System.out.println();
			for(int j=0; j<=cars[i].length-1; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		

	}

}
