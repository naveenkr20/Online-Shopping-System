package classes;

public class Disp_Items
{
      private String item[];

//setting up the item

      public Disp_Items()
      {
	    item=new String[15];

          item[0]="  Press 1 to purchase Smart Phone";
          item[1]="  Press 2 to purchase T.V";
          item[2]="  Press 3 to purchase refrigerator";
          item[3]="  Press 4 to purchase microwave";
          item[4]="  Press 5 to purchase computer";

	    item[5]="  Press 1 to purchase Jacket";
	    item[6]="  Press 2 to purchase sweater";
	    item[7]="  Press 3 to purchase jeans";
	    item[8]="  Press 4 to purchase t-shirt";
	    item[9]="  Press 5 to purchase sweat-shirt";

	    item[10]="  Press 1 to purchase double bed";
	    item[11]="  Press 2 to purchase single bed";
	    item[12]="  Press 3 to purchase dining table";
	    item[13]="  Press 4 to purchase sofa";
	    item[14]="  Press 5 to purchase chair";
	}

//Choose item title bar

      public void title_bar()
      {
            System.out.print(" Shopping page:\n");
      }

//Displaying electronics items

      public void display_items1()
      {
            System.out.println("");

            for(int i=0;i<5;i++)
            {
                  System.out.println(item[i]);
            }
      }

//Displaying clothing items

      public void display_items2()
      {
            System.out.println("");

            for(int i=5;i<10;i++)
            {
                  System.out.println(item[i]);
            }
      }

//Displaying furniture items

      public void display_items3()
      {
            System.out.println("");

            for(int i=10;i<15;i++)
            {
                  System.out.println(item[i]);
            }
      }
}
