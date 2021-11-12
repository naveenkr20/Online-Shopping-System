package classes;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Startup
{
      private int ch,num;
      private String str,str1;
      private Scanner sc;

//startup constructor

      public Startup()
      {
      		num=0;
		      sc=new Scanner(System.in);     
      }

//startup title bar

      public void title_bar()
      {
            System.out.print(" Home Page:\n");
      }
     
//feedback window title bar

      public void feedback_title_bar()
      {
            System.out.print(" Feedback:\n");
      }

//Welcome message

      public void Welcome_message()   
      {
            System.out.print("\n  Welcome to YoUR CaRT !!\n\n");
      }

//adding the feedback

      public void add_feedback()
      {

            System.out.print("\n Enter your feedback: ");

            //here
            Scanner sca =new Scanner(System.in);
            String str2=sca.nextLine();
            
    
            File myFile = new File("text_files\\Feedback.txt");
            try {
                myFile.createNewFile();
                System.out.println("\n Feedback submitted successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
    
            //writing
            try {
                FileWriter fileWriter = new FileWriter("text_files\\Feedback.txt");
                fileWriter.write("\n Your Feedback : "+str2);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
           //reading
            try {
                Scanner sc = new Scanner(myFile);
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            

      }

//displaying choice

      public void display_choice()
      {
            System.out.print("  Press 1 for Signup\n");
            System.out.print("  Press 2 for Login\n");
            System.out.print("  Press 3 to give feedback\n");
            System.out.print("  Press 4 to exit\n");
      }
                       
//Taking choice from the user

      public int choice()
      {
            System.out.print("\n  Enter your choice: ");
            ch=sc.nextInt();
                  
            return ch;
      }
}
                                  
