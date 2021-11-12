package classes;

import java.util.Scanner;

public class Login extends Signup
{
     private Scanner sc;

     private String Email;
     private String check_passwrd;


//Login title bar

      public Login()
      {
	    sc=new Scanner(System.in);
      }

      public void title_bar()
      {
            System.out.print(" Login Page:\n");
      }

//Taking input from the user

      public void input_details_log()
      {
            System.out.print("\n  Enter your email id: ");
            Email=sc.nextLine();

            System.out.print("  Enter your password: ");
            check_passwrd=sc.nextLine();
      }

//checking the email and password from signup class

      public int check_both()
      {
            if(((check_passwrd.compareTo(conf_password))==0) && (Email_id.compareTo(Email))==0 && check_email()==0)
            {
                  return 0;
            }
            else
            {
                  return 1;
            }
      }
}
