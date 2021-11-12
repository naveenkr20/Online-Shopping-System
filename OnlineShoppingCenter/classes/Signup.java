package classes;

import java.util.Scanner;

public class Signup
{
     protected String Cust_Name;
     protected long PhoneNo;
     protected String Email_id;
     protected String password;
     protected String conf_password;

     Scanner sc;

//Signup constructor

      public Signup()  
      { 
            Cust_Name="admin";
            PhoneNo=123456;
            Email_id="your_cart@iiitl.ac.in";
            conf_password="admin";

	    sc=new Scanner(System.in);
      }

 //Refreshing sc object
 
      public void refresh()
      {
            sc.nextLine();
      }

//Signup title bar

      public void title_bar() 
      {
            System.out.print(" Signup Page:\n");
      }

//checking the Email ID format

      public int check_email()  
      {
            for(int i=0;i<Email_id.length();i++)
            {
                  if(Email_id.charAt(i)=='@')
                  {
                        for(int j=i+1;j<Email_id.length();j++)
                        {
                              if(Email_id.charAt(j)=='.' && j!=i+1)
                              {
                                    for(int k=j+1;k<Email_id.length();k++)
                                    {
                                          if(Email_id.charAt(k)=='.' && k!=j+1)
                                          {
                                                return 0;
                                          }
                                          else if(Email_id.charAt(k)=='.' && k==j+1)
                                          {
                                                return 1;
                                          }
                                    }
                  
                                    return 0;
                              }
                        }
                  }
            }

            return 1;
      }

//Displaying the rules while user is signing up

      public void display()  
      {
            System.out.print("\n  Note:");
            System.out.print("\n\n  1) Email id should be a valid email id");
            System.out.print("\n  2) Password must be minimum 6 characters long");
      }

//Inputting user details

      public void input_details_sign_1() 
      {
            System.out.print("\n\n  Enter your details:"); 
            System.out.print("\n\n  Enter your Name: ");          
            Cust_Name=sc.nextLine();

            System.out.print("  Enter your phone number: ");
            PhoneNo=sc.nextLong();
      }

//Inputting user important details   
       
      public void input_details_sign_2() 
      {
            System.out.print("  Enter your email id: ");
            Email_id=sc.nextLine();          

            System.out.print("  Enter your password: ");
            password=sc.nextLine();

            System.out.print("\n  Confirm your password: ");
            conf_password=sc.nextLine();
      }

//checking that the password matches the confirm password

      public int check_password()  
      {
            if(password.compareTo(conf_password)==0)
            {
                  return 0;
            }
            else
            {
                  return 1;
            }
      }

//checking the length of the password (i.e min 6 characters)

      public int check_length()  
      { 
            if(password.length()>5 && conf_password.length()>5)
            {
                  return 0;
            }
            else
            {
                  return 1;
            }
      }
}
