
import java.util.*;

public class pos {
	public static <$m> void main (String[] args){
   
      // Using arrays Item Inventory data saved.....
        String[] item = new String[4];
        item[0]=null; item[1]="Milk";item[2]="Chocolate";item[3]="Coffee";
         int[] itemQ = new int[4];
         itemQ[0]= 0; itemQ[1]=100;itemQ[2]=150;itemQ[3]=100;
      //Default Unit Price assing to Variable...... 
        int $m = 50;
        int $c = 30;
        int $sd = 60;
       
        // Multiple Variable Innitialied in one line
        int item1Total,item2Total,item3Total; 
        int qtyReMilk,qtyReCoffee,qtyReduceChoc; 
        // Assing '0' value 
           item1Total=item2Total=item3Total= 0; 
           qtyReMilk=qtyReCoffee=qtyReduceChoc= 0; 
       
        int grandTotal = 0;
        
     System.out.println("*** Point of Sales System ***");
		
	System.out.println("Enter Goods code number for buy... 1 -MilkPack 2-Chocalate 3-CoffeePack"); 
        System.out.println("For Check Available QTY ! Press 9 ");   // change number 
        System.out.println("For Finish Billing! Press 0 ");
     
     Scanner sa = new Scanner(System.in);
     System.out.println("Enter Customer Name");  // Request to Enter Customer Name 
      String cusName = sa.next(); // Customer Name Emterring Field....
     boolean oparator = false;  // Assign Local Variable for Check Condition....True/False
      
      while (oparator == false) { //Check condition While it is false? Run code inside the while block... 
         
         System.out.println("Enter Goods code number for buy... 1 -MilkPack 2-Chocalate 3-CoffeePack"); 
         System.out.println("For Check Available QTY ! Press 5 ");
         System.out.println("For Finish Billing! Press 0 ");
         
            int goods = sa.nextInt();
        
              if (goods == 1 && itemQ[1]!=0) { // Check whether User enterred Item Number and that number Available QTY not equl to 0, if those condition True execute below if block code

                System.out.println("Availabe Qty" +itemQ[1]); 
                 System.out.println("Enter needed QTY"); 
                  int qty = sa.nextInt();
                    qtyReMilk = itemQ[1]-qty; // Reduce Customer brouth QTY from Total QTy.....
                     item1Total = (qty*$m);  // calculate Customer needed QTY with Relavant Item Unit Price
                         System.out.println("Sub Total is"+' '+item1Total);
      }
              else if(goods == 2 && itemQ[2]!=0) {
                System.out.println("Availabe Qty is" + itemQ[2]); 
                  System.out.println("Enter needed QTY"); 
                   int qty1 = sa.nextInt();
                    qtyReCoffee = itemQ[2]-qty1;
                      item2Total= (qty1*$c);
                        System.out.println("Sub Total is"+' '+item2Total);
            }
            else if(goods == 3 && itemQ[3]!=0) {
              System.out.println("Availabe Qty is" + itemQ[3]); 
                System.out.println("Enter needed QTY"); 
                  int qty2 = sa.nextInt();
                   qtyReduceChoc = itemQ[3]-qty2;
                    item3Total= (qty2*$sd);
                     System.out.println("Sub Total is"+' '+item3Total);
          }  
          else if(goods == 9) {  // If Cashier Enter Number 9 then Running below Code.... Print Available QTY...
            System.out.println("Total Availabe QTY is" + ' '+"Milk =" +qtyReMilk +' '+"Chocalate="+ qtyReduceChoc +' '+"CoffeePacks="+qtyReCoffee);

          }
            else if (goods == 0){ // If User enter 0 then Condition value has changed to true and while loop will end..
              oparator =true;  
              
            }

          } //after Ending While loop below codes execute....
        grandTotal = (item1Total + item2Total + item3Total); 
          System.out.println("Customer Name is" +' ' +cusName +' '+"Grand Total is"+' '+"Rs:"+grandTotal); 
           System.out.println("ThankYou!! WelCome again!!!");
		System.out.println("ThankYou!! WelCome again!!!");
              
    }

  }
