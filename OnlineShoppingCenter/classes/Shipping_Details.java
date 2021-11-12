package classes;

import java.util.Scanner;

public class Shipping_Details extends Signup
{
      protected int ch;
      protected String country;
      protected String state;
      protected String city;
      protected String pname;
      protected long postal_code;
      protected int product_cost;
      protected String shipping_address;
      protected String delivery_date;
      protected String delivery_time;

      private Scanner sc;

      public Shipping_Details()
      {
           sc=new Scanner(System.in);
      }

      public void refresh()
      {
	   sc.nextLine();
      }

//Shipping Details title bar

      public void title_bar()
      {
            System.out.print(" Shipping Details:\n");
      }

//Taking details from user

      public void shipping_details()
      {
            System.out.print("\n  Enter your country: ");
            country=sc.nextLine();
                  
            System.out.print("  Enter your state: ");
            state=sc.nextLine();

            System.out.print("  Enter your city: ");
            city=sc.nextLine();

            System.out.print("  Enter your city postal code: ");
            postal_code=sc.nextLong();
		
	      refresh();
                  
            System.out.print("  Enter shipping address: ");
            shipping_address=sc.nextLine();

            System.out.print("  Enter preferred delivery date: ");
            delivery_date=sc.nextLine();

            System.out.print("  Enter preferred delivery time: ");
            delivery_time=sc.nextLine();  
      }

//opted item

      public void opted_item(String str)
      {
            pname=str;
      }

//Cost of product
 
      public void pcost(int cost)
      {
            product_cost=cost;
      }

//Displaying the cost

      public void display_fees()
      {
            System.out.print(product_cost);
      }

//Displaying the choice

      public void display_choice()
      {
            System.out.print("\n  Press 1 to confirm details");
            System.out.print("\n  Press 2 to modify details");
            System.out.print("\n  Press 3 to cancel your purchase");
      }

//Taking choice from user

      public int choice()
      {
            System.out.print("\n\n  Enter your choice: ");
            ch=sc.nextInt();

            return ch;
      }
}