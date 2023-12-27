import java.util.ArrayList;

public class Simple_Java_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Automation lecture 2");
		System.out.println(10000);
		System.out.print("Hiba");
		System.out.print('H');
		
		int [] array = new int[2];
		array[0] = 1;
		array[1] = 2;
		System.out.println(array[1]);
		
		//ARRAY LIST
		ArrayList<String> array_list = new ArrayList<String>();
		array_list.add("hiba");
		array_list.add("ahmed");
		System.out.println(array_list.get(0));
		System.out.println(array_list.get(1));
		
		ArrayList<String> arr_list = new ArrayList<String>();
		arr_list.add("genetech");
		System.out.println(arr_list.get(0));
		
		
	    //IF-ELSE
		int x = 10;
		if (x == 10 || x == 9)
		{
			
			System.out.println("the value of x is "+ x);
		}
		else
		{
			System.out.println("value is something else");
		}
		
		//LOOPS
		
		for (int y = 1; y< 10; y++) {
		    System.out.println("This loop should run till 9");
		}
		
		
	    //ARRAY
		int[] y = {2,4,6,8,10};
		System.out.println(y[0]);
		System.out.println(y[3]);
		System.out.println(y[2]);
	    
		String[] z = new String[5];
		z[0] = "hiba";
		z[2] = "ahmed";
		System.out.println(z[0] +" "+ z[2]);
		
		//METHOD CALLING
		Simple_Java_Script s = new Simple_Java_Script();
		s.getData();
		
	}
		//METHODS 
		 public void getData() {
		
			 System.out.println("This is a get data method");

	}

}
