package ObsquraPrograms;

import java.util.Scanner;

public class LinearSearch3 {
	void linear() 
	{
		int array[], key, size, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		size = s.nextInt();
		array = new int[size];
		System.out.println("Number of elements");
		for (i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		System.out.println("Enter Search Element");
		key = s.nextInt();
		for (i = 0; i < size; i++) {
			if (array[i] == key)

			{
				System.out.println("Search key at position" + (i + 1));
				break;

			}

		}
		if (i == size) {
			System.out.println("Element not Found");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch3 obj=new LinearSearch3();
		obj.linear();

	

}
}
