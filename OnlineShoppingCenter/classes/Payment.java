package classes;

import java.util.Scanner;

public class Payment extends Shipping_Details
{
      protected int ch;

      protected long credit_card_no;
      protected String credit_card_expiry_date;
      protected int credit_card_cvv;
            
      protected long debit_card_no;
      protected String debit_card_expiry_date;
      protected int debit_card_cvv;

      protected String mode_of_payment;

      protected String bank_name;
      protected int bank_code;
      protected String email;
      protected String password;
      protected long account_no;
      protected long IFSC_code;

      private Scanner sc;

      public Payment()
      {
            sc=new Scanner(System.in);

      	credit_card_no=0l;
            credit_card_expiry_date="";
            credit_card_cvv=0;
            debit_card_no=0l;
            debit_card_expiry_date="";
            debit_card_cvv=0;
            mode_of_payment="";
            bank_name="";
            bank_code=0;
            email="";
            password="";
            account_no=0l;
            IFSC_code=0l;
      }        	
	

//Payment title bar

      public void title_bar()
      {
            System.out.print(" Payment mode:\n");
      }

//Title bar of cash

      public void title_bar_cash()
      {
            System.out.print(" Mode of payment: cash\n");
      }

//Title bar of credit card

      public void title_bar_credit_card()
      {
            System.out.print(" Mode of payment: credit card\n");
      }

//Title bar of debit card

      public void title_bar_debit_card()
      {
            System.out.print(" Mode of payment: debit card\n");
      }

//Title bar of net banking

      public void title_bar_netbanking()
      {
            System.out.print(" Mode of payment: net banking\n");
      }

//cash

      public void cash()
      {
            System.out.print("\n  Please handover the cash to our delivery agent");
      }

//credit card

      public void credit_card()
      {
            System.out.print("\n  Enter your credit card number: ");
            credit_card_no=sc.nextLong();

	    sc.nextLine();

            System.out.print("  Enter your credit card expiry date: ");
            credit_card_expiry_date=sc.nextLine();

            System.out.print("  Enter your credit card cvv: ");
            credit_card_cvv=sc.nextInt();
      }

//debit card
             
      public void debit_card()
      {
            System.out.print("\n  Enter your debit card number: ");
            debit_card_no=sc.nextLong();

	    sc.nextLine();

            System.out.print("  Enter your debit card expiry date: ");
            debit_card_expiry_date=sc.nextLine();

            System.out.print("  Enter your debit card cvv: ");
            debit_card_cvv=sc.nextInt();
      }

//net banking

      public void netbanking()
      {
	    sc.nextLine();

            System.out.print("\n  Enter your bank name: ");
            bank_name=sc.nextLine();

            System.out.print("  Enter your bank code: ");
            bank_code=sc.nextInt();

	    sc.nextLine();  
      
            System.out.print("  Enter your net banking email id: ");
            email=sc.nextLine();

            System.out.print("  Enter your net banking password: ");
            password=sc.nextLine();

            System.out.print("  Enter your account number: ");
            account_no=sc.nextLong();

            System.out.print("  Enter your IFSC Code: ");
            IFSC_code=sc.nextLong();
      }

//mode of payment

      public void mop(String str)
      {
            mode_of_payment=str;
      }

//Displaying transaction message

      public void transaction_message()
      {
            System.out.print("\n  Transaction successsful, Thank you for the payment");
      }

//Displaying choice

      public void display_choice()
      {
            System.out.print("\n  Press 1 to make payment through cash");
            System.out.print("\n  Press 2 to make payment through credit card");
            System.out.print("\n  Press 3 to make payment through debit card");
            System.out.print("\n  Press 4 to make payment through net banking");
      }

//Taking choice from user

      public int choice()
      {
            System.out.print("\n\n  Enter your choice: ");
            ch=sc.nextInt();

            return ch;
      }
}
