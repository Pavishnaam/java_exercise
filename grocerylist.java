import java.util.*;

public class grocerylist
{
    String item_name;
    int item_cost;
    public grocerylist(String item_name,int item_cost)
    {
        this.item_name=item_name;
        this.item_cost=item_cost; 
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int total_cost=0; int high_amount=0;String high_item ="";;String low_item ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no_of_items : ");
        int n = sc.nextInt();
        List<grocerylist> grocery = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("enter the name of the item : ");
            String name = sc.next();
            System.out.println("enter the cost of the item : ");
            int cost = sc.nextInt();
            grocerylist g = new grocerylist(name,cost);
            grocery.add(g);  
        }
        for(grocerylist items:grocery){
            System.out.println("name of the item : ");
            System.out.println(items.item_name);
            System.out.println("cost of the item : ");
            System.out.println(items.item_cost);
            total_cost+=items.item_cost;
            if(items.item_cost>high_amount){
                high_amount = items.item_cost;
                high_item = items.item_name;
            }
        }
        System.out.println("total_cost of the item : " + total_cost);
        System.out.println(high_item + "  is the item with high cost of Rs. " + high_amount);
        int low_amount=high_amount;
         for(grocerylist items:grocery){
             if(items.item_cost<low_amount){
                low_amount = items.item_cost;
                low_item = items.item_name;
            }
         }
        System.out.println(low_item + "  is the item with low cost of Rs. " + low_amount);
    }
 }
    
