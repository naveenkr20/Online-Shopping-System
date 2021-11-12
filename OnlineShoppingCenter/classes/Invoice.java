package classes;

public class Invoice extends Payment
{

//Displaying the invoice

	public void display_invoice(Signup S,Shipping_Details SD,Payment p)
	{
      	System.out.print("\n  "+"Dear Customer please find your invoice here:");

      	System.out.print("\n\n  Customer and Shopping Details");

            System.out.print("\n\n  Name: "+S.Cust_Name);
            System.out.print("\n  Phone Number: "+S.PhoneNo);
            System.out.print("\n  Country: "+SD.country);
            System.out.print("\n  State: "+SD.state);
            System.out.print("\n  City: "+SD.city);
            System.out.print("\n  Postal Code: "+SD.postal_code);
            System.out.print("\n  Product purchased: "+SD.pname);
            System.out.print("\n  Shipping Address: "+SD.shipping_address);
            System.out.print("\n  Preferred Delivery Date: "+SD.delivery_date);
            System.out.print("\n  Preferred Delivery time: "+SD.delivery_time);
            System.out.print("\n  Amount: "+SD.product_cost+" INR");

            System.out.print("\n\n  Transaction details");

            System.out.print("\n\n  Mode of payment: "+p.mode_of_payment);

            if(p.mode_of_payment.equals("cash"))
            {
                  System.out.print("\n  Amount due: "+SD.product_cost+" INR");
                  System.out.print("\n  Transaction status: pending");
            }
            else
            {
                  System.out.print("\n  Amount paid: "+SD.product_cost+" INR");
                  System.out.print("\n  Transaction status: successfull");
            }
      }
}
