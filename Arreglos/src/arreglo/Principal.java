package arreglo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//inicializacion 
		int [] nums = { 1002, -23, 9, 407, 64, 20};
		//System.out.println(nums.toString()); deveulve referancia del arreglo . direccion de memoria
		///System.out.println(nums); es igual a toString
		
		// Imprimir datos
		System.out.println(nums[0]);// primer variable del arreglo
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		//System.out.println(nums[6]); me pas del tama�o llarga Exeption
		System.out.println("informa arreglo con un for");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
