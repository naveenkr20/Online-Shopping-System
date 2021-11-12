package classes;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Query
{
      private int n;
      private int ch;
      private String str;

      Scanner sc;

      public Query()
      {
	    sc=new Scanner(System.in);
      }

//Query title bar

      public void title_bar()
      {
            System.out.print(" Query:\n");
      }

//Adding the query to Query.txt

      public void add_query()
      {     
            System.out.print("\n  Enter your query: ");

           //here
            Scanner sca =new Scanner(System.in);
            String str1=sca.nextLine();
        

        File myFile = new File("text_files\\query.txt");
        try {
            myFile.createNewFile();
            System.out.println("\n  Query added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //writing
        try {
            FileWriter fileWriter = new FileWriter("text_files\\query.txt");
            fileWriter.write("\n  Your Query: "+str1);
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

//Displaying choice

      public void display_choice()
      {
            System.out.print("\n  Press 1 to submit query and proceed for payment");
            System.out.print("\n  Press 2 to modify query");
            System.out.print("\n  Press 3 to delete query and go to home page");
      }

//Taking choice from user

      public int choice()
      {
            System.out.print("\n\n  Enter your choice: ");
            ch=sc.nextInt();

            return ch;
      }
}


