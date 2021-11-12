import java.io.IOException;
import java.util.Scanner;

import classes.*;

public class Main 
{
   public static void main(String args[]) throws IOException, InterruptedException   
   { 
    try
    { 
        new ProcessBuilder("cmd", "/c", "@echo off").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner sc=new Scanner(System.in);
        
    // Declaration and Initilization of variables

        int flow=1,count=0,forward=0,forward2=0,forward3=0;
        int c,c2,c3,c5,c6,ch;
        char c4;
        int count2=0;
        char wait;

    //Assigning memory to object of respective class

        Startup start=new Startup();
        Signup sign=new Signup();
        Login log=new Login();
        Disp_Items disp=new Disp_Items();
        Choose_Item choose=new Choose_Item();
        Shipping_Details sd=new Shipping_Details();
        Query q=new Query();
        Payment pay=new Payment();
        Logout end=new Logout();
	  Invoice invo=new Invoice();
        Category cat=new Category();

        while(flow>=1)
        {
                //startup

                  if(count==0)
                  {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        start.title_bar();
                        start.Welcome_message();
                        start.display_choice();
                        c=start.choice();
                  }
                  else
                  {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        start.title_bar();
                        System.out.println("");
                        start.display_choice();
                        c=start.choice();
                  }


                  if(c==1)
                  {
                        while(true)
                        {
                              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                  //signup

                              sign.title_bar();

                              sign.display();
                              sign.input_details_sign_1();
                              log.input_details_sign_2();

                  //checking email id and password format
                 
                              if(log.check_password()==0 && log.check_length()==0 && log.check_email()==0)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    log.title_bar();
                                    log.input_details_log();

                                                                  
                                    if(log.check_both()==0)
                                    {
                                          forward=1;
                                          count++;
                                    }
                                    else
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                          System.out.print("\n  Please enter registered email id and password !!");
                                          System.out.print("\n\n  Press a key to return to home page: ");
                                          wait=sc.next().charAt(0);
                        
                                          count++;
                                    }                               
                              
                              }
                              else if(log.check_length()==1 && log.check_email()==0)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        
                                    System.out.print("\n  Password should be minimum 6 characters long !!");
                                    System.out.print("\n\n  Press a key to return to signup page: ");
                                    wait=sc.next().charAt(0);

                                    count ++;

                                    sign.refresh();
                        
                                    continue;
                              }
                              else if(log.check_password()==1 && log.check_length()==0 && log.check_email()==0)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.print("\n  Password and confirm password do not match !!");
                                    System.out.print("\n\n  Press a key to return to signup page: ");
                                    wait=sc.next().charAt(0);

                                    count++;

                                    sign.refresh();

                                    continue;
                              }
                              else if(log.check_password()==0 && log.check_length()==0 && log.check_email()==1)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                              
                                    System.out.print("\n  Please enter a valid email ID !!");
                                    System.out.print("\n\n  Press a key to return to signup page: ");
                                    wait=sc.next().charAt(0);

                                    count++;
                                     
                                    sign.refresh();

                                    continue;

                              }
                              else if(log.check_length()==1 && log.check_email()==1)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.print("\n  Please enter a valid email ID !!");
                                    System.out.print("\n  Password should be minimum 6 characters long !!");
                                    System.out.print("\n\n  Press a key to return to signup page: ");
                                    wait=sc.next().charAt(0);

                                    count++;

                                    sign.refresh();

                                    continue;
                              }
                              else if(log.check_password()==1 && log.check_length()==0 && log.check_email()==1)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.print("\n  Please enter a valid email ID !!");
                                    System.out.print("\n  Password and confirm password do not match !!");
                                    System.out.print("\n\n  Press a key to return to signup page: ");
                                    wait=sc.next().charAt(0);

                                    count++;

                                    sign.refresh();
                              
                                    continue;
                         
                              }
                              
                              break;
                        }

                  }
                  else if(c==2)
                  {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

          //Login
      
                        log.title_bar();
                        log.input_details_log();

         //checking email id and password
                              
                        if(log.check_both()==0)
                        {
                              forward=1;
                              count++;
                        }
                        else
                        {
                              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                              System.out.print("\n  Please enter registered email id and password !!");
                              System.out.print("\n\n  Press a key to return to home page: ");
                              wait=sc.next().charAt(0);
                        
                              count++;
                        }                             
                  } 
                  else if(c==3)
                  {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

          //Feedback

                        start.feedback_title_bar();
                        start.add_feedback();

                        System.out.print("\n\n Press a key to return to home page: ");
                        wait=sc.next().charAt(0);

                        count++;
                     
                  }
                  else if(c==4)
                  {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

          //exit
                        System.out.println("\n  Thank you, have a nice day !!");
                        break;
                  }
                  else
                  {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

          //wrong choice

                        System.out.print("\n  Wrong choice !!");
                        System.out.print("\n\n  Press a key to return to home page: ");
                        wait=sc.next().charAt(0);
                        count++;
                        continue;
                  }


                  if(forward==1)
                  {
                        while(true)
                        {

                              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            //displaying category       
           
                              disp.title_bar();
                              cat.disp_category();

                              ch=cat.choice();

                              if(ch==1)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    disp.title_bar();
                                    cat.electronics_catalogue();
                                    disp.display_items1();
            //choosing product
                                    c2=choose.choice();

                                    if(c2==1)
                                    {
                    //Smart Phone
                                          sd.opted_item("Smart Phone");
                                          sd.pcost(15000);
                                    }
                                    else if(c2==2)
                                    {
                    //T.V
                                          sd.opted_item("T.V");
                                          sd.pcost(50000);
                                    }
                                    else if(c2==3)
                                    {
                    //Refrigerator
                                          sd.opted_item("Refrigerator");
                                          sd.pcost(42000);
                                    }
                                    else if(c2==4)
                                    {
                    //Microwave
                                          sd.opted_item("Microwave");
                                          sd.pcost(22000);
                                    }
                                    else if(c2==5)
                                    {
                    //Computer
                                          sd.opted_item("Computer");
                                          sd.pcost(81000);
                                    }
                                    else
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    
                    //Wrong choice
                                          System.out.print("\n  Wrong choice !!");
                                          System.out.print("\n\n  Press a key to return to shopping page: ");
                                          wait=sc.next().charAt(0);

                                          continue;
                                    }
                              }
                              else if(ch==2)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    disp.title_bar();
                                    cat.clothing_catalogue();
                                    disp.display_items2();

                                    c2=choose.choice();

                                    if(c2==1)
                                    {
                    //Jacket
                                          sd.opted_item("Jacket");
                                          sd.pcost(5000);
                                    }
                                    else if(c2==2)
                                    {
                    //Sweater
                                          sd.opted_item("Sweater");
                                          sd.pcost(2000);
                                    }
                                    else if(c2==3)
                                    {
                    //Jeans
                                          sd.opted_item("Jeans");
                                          sd.pcost(3500);
                                    }
                                    else if(c2==4)
                                    {
                    //T-shirt
                                          sd.opted_item("T-shirt");
                                          sd.pcost(1200);
                                    }
                                    else if(c2==5)
                                    {
                    //Sweat-shirt
                                          sd.opted_item("Sweat-shirt");
                                          sd.pcost(2300);
                                    }
                                    else
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    
                    //Wrong choice
                                          System.out.print("\n  Wrong choice !!");
                                          System.out.print("\n\n  Press a key to return to shopping page: ");
                                          wait=sc.next().charAt(0);

                                          continue;
                                    }
                              }
                              else if(ch==3)
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    disp.title_bar();
                                    cat.furniture_catalogue();
                                    disp.display_items3();

                                    c2=choose.choice();

                                    if(c2==1)
                                    {
                    //Double Bed
                                          sd.opted_item("Double Bed");
                                          sd.pcost(25000);
                                    }
                                    else if(c2==2)
                                    {
                    //Single Bed
                                          sd.opted_item("Single Bed");
                                          sd.pcost(12000);
                                    }
                                    else if(c2==3)
                                    {
                    //Dining Table
                                          sd.opted_item("Dining Table");
                                          sd.pcost(13500);
                                    }
                                    else if(c2==4)
                                    {
                    //Sofa
                                          sd.opted_item("Sofa");
                                          sd.pcost(22000);
                                    }
                                    else if(c2==5)
                                    {
                    //Chair
                                          sd.opted_item("Chair");
                                          sd.pcost(3200);
                                    }
                                    else
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    
                    //Wrong choice
                                          System.out.print("\n  Wrong choice !!");
                                          System.out.print("\n\n  Press a key to return to shopping page: ");
                                          wait=sc.next().charAt(0);

                                          continue;
                                    }
                              }
                              else
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.print("\n  Wrong choice !!");
                                    System.out.print("\n\n  Press a key to return to shopping page: ");
                                    wait=sc.next().charAt(0);

                                    continue; 
                              }


                              break;
                        }

                              while(true)
                              {
                        
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                  //Shipping details

                                    sd.title_bar();
                                    sd.shipping_details();
                                    sd.display_choice();

                                    c3=sd.choice();

                                    if(c3==1)
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                          forward2=1;
                                    }
                                    else if(c3==2)
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                          sd.refresh();
                                          continue;
                                    }
                                    else if(c3==3)
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                          sd.refresh();
                                          break;
                                    }
                                    else
                                    {
                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                          
                                          System.out.print("\n  Wrong choice !!");
                                          System.out.print("\n\n  Press a key to continue: ");
                                          wait=sc.next().charAt(0);

                                          sd.refresh();

                                          continue;
                                    }
                                    
                                    break;
                            }

			    if(c3==3)
			    {
				continue;
			    }


                        if(forward2==1)
                        {      
                              System.out.print("\n  Your Amount is: ");
                              sd.display_fees();
                              System.out.print(" INR");

                              System.out.print("\n\n  Press (q - submit query) or (p - give payment): ");
                              c4=sc.next().charAt(0);

                              if(c4=='q')
                              {
                                    while(true)
                                    {
                    //Query

                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  
                                          q.title_bar();
                                          q.add_query();

                                          q.display_choice();
                                          c5=q.choice();

                                          if(c5==1)
                                          {
                                                System.out.print("\n  Your Query has been successfully submitted");
                                                System.out.print("\n\n  Press a key to proceed for payment: ");
                                                wait=sc.next().charAt(0);

                                                c4='p';
                                          }
                                          else if(c5==2)
                                          {
                                                continue;
                                          }
                                          else if(c5==3)
                                          {
                                                new ProcessBuilder("cmd", "/c", "del %cd%\\text_files\\query.txt /s /q").inheritIO().start().waitFor();
                                                break;
                                          }
                                          else
                                          {
                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                          
                                                System.out.print("\n  Wrong choice !!"); 
                                                System.out.print("\n\n  Press a key to go to Home page: ");
                                                wait=sc.next().charAt(0);
                                          }
                                          
                                          break;
                                    }

                                    if(c5==3)
                                    {
                                          sd.refresh();
                                          continue;
                                    }

                                    if(c5!=1 && c5!=2 && c5!=3)
                                    {
                                          continue;
                                    }
                              }
                              if(c4=='p')
                              {
                                    while(true)
                                    {

                                          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    //Payment

                                          pay.title_bar();
                                          pay.display_choice();
                                          c6=pay.choice();

                                          if(c6==1)
                                          {
                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        
                        //cash
                                                pay.title_bar_cash();
                                                pay.mop("cash");
                                                pay.cash();

                                                System.out.print("\n\n  Press a key to show invoice: ");
                                                wait=sc.next().charAt(0);
                                          }
                                          else if(c6==2)
                                          {
                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        //credit card
                                                pay.title_bar_credit_card();
                                                pay.mop("credit card");
                                                pay.credit_card();

                                                System.out.print("\n  Press a key to pay the amount: ");
                                                wait=sc.next().charAt(0);

                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  
                                                pay.transaction_message();
                                          
                                                System.out.print("\n\n  Press a key to show invoice: ");
                                                wait=sc.next().charAt(0);
                                          }
                                          else if(c6==3)
                                          {            
                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        
                        //debit card
                                                pay.title_bar_debit_card();
                                                pay.mop("debit card");
                                                pay.debit_card();

                                                System.out.print("\n  Press a key to pay the amount: ");
                                                wait=sc.next().charAt(0);

                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  
                                                pay.transaction_message();
                                          
                                                System.out.print("\n\n  Press a key to show invoice: ");
                                                wait=sc.next().charAt(0);
                                          }
                                          else if(c6==4)
                                          {
                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        
                        //net banking
                                                pay.title_bar_netbanking();
                                                pay.mop("net banking");
                                                //clean_stdin();
                                                pay.netbanking();

                                                System.out.print("\n  Press a key to pay the amount: ");
                                                wait=sc.next().charAt(0);

                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                                pay.transaction_message();

                                                System.out.print("\n\n  Press a key to show invoice: ");
                                                wait=sc.next().charAt(0);
                                          }
                                          else
                                          {
                                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        //Wrong choice
                                                System.out.print("\n  Wrong choice, Transaction failed !!");

                                                System.out.print("\n\n  Press a key to return to payment page: ");
                                                wait=sc.next().charAt(0);

                                                continue;
                                          }
                                          
                                          break;
                                    }
                              }
                              if(c4!='p' && c4!='q')
                              {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.print("\n  Wrong choice !!");
                                    System.out.print("\n\n  Press a key to return to home page: ");

                                    wait=sc.next().charAt(0);
                                    sd.refresh();
                                    continue;
                              }
                              
                              

                              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                //Invoice

                              System.out.print(" Invoice:\n");

                //displaying invoice

                              invo.display_invoice(sign,sd,pay);
                              System.out.print("\n\n  Press a key to logout: ");
                              wait=sc.next().charAt(0);


                              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                //Logout
                              
                              end.Logout_message();
                              System.out.println("");
                              break;
                              
                       
                  }  
                  
            }
         }
      }
      catch(Exception e)
      {
            System.err.print(e);
      }
   }
}