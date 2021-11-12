package classes;

import java.util.Scanner;

public class Choose_Item
{
      private int ch;
      private Scanner sc;

      public Choose_Item()
      {
	    sc=new Scanner(System.in);
      }

//Taking choice from user

      public int choice()
      {
            System.out.print("\n  Enter your choice: ");
            ch=sc.nextInt();

            return ch;
      }
}
      
