package classes;

import java.util.Scanner;

public class Category
{
	private int ch;
	private Scanner sc;

	public Category()
	{
		sc=new Scanner(System.in);
	}
	
//Displaying category

	public void disp_category()
	{
		System.out.println("\n  Press 1 to browse electronics section");
		System.out.println("  Press 2 to browse clothing section");
		System.out.println("  Press 3 to browse furniture section");
	}

//Electronics catalogue

	public void electronics_catalogue()
	{
		System.out.println("");
		System.out.println("  ------------------------------");
		System.out.println("  - Item         -       Price -");
		System.out.println("  ------------------------------");
		System.out.println("  - Smart Phone  -   15000 INR -");
		System.out.println("  - T.V          -   50000 INR -");
		System.out.println("  - Refrigerator -   42000 INR -");
		System.out.println("  - Microwave    -   22000 INR -");
		System.out.println("  - Computer     -   81000 INR -");
		System.out.println("  ------------------------------");
	}

//Clothing catalogue

	public void clothing_catalogue()
	{
		System.out.println("");
		System.out.println("  ------------------------------");
		System.out.println("  - Item         -       Price -");
		System.out.println("  ------------------------------");
		System.out.println("  - Jacket       -   5000 INR  -");
		System.out.println("  - Sweater      -   2000 INR  -");
		System.out.println("  - Jeans        -   3500 INR  -");
		System.out.println("  - T-shirt      -   1200 INR  -");
		System.out.println("  - Sweat-shirt  -   2300 INR  -");
		System.out.println("  ------------------------------");
	}

//Furniture catalogue

	public void furniture_catalogue()
	{
		System.out.println("");
		System.out.println("  ------------------------------");
		System.out.println("  - Item         -       Price -");
		System.out.println("  ------------------------------");
		System.out.println("  - Double Bed   -   25000 INR -");
		System.out.println("  - Single Bed   -   12000 INR -");
		System.out.println("  - Dining Table -   13500 INR -");
		System.out.println("  - Sofa         -   22000 INR -");
		System.out.println("  - Chair        -    3200 INR -");
		System.out.println("  ------------------------------");
	}

//Taking choice from user

	public int choice()
	{
		System.out.print("\n  Enter your choice: ");
		ch=sc.nextInt();

		return ch;
	}			
}