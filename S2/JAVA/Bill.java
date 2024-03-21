import java.util.Scanner;

interface calc
{
    void calculate();
}

class bill implements calc
{
    String date,name,product_id;
    int quantity;
    double unit_price,total,namount=0;
    Scanner sc = new Scanner(System.in);
    public void getdata()
    {
        System.out.println("\nEnter product id:");
        product_id = sc.nextLine();
        System.out.println("Enter product name:");
        name = sc.nextLine();
        System.out.println("Enter the Quantity:");
        quantity = sc.nextInt();
        System.out.println("Enter the unit price:");
        unit_price = sc.nextDouble();
    }
    
    public void calculate()
    {
        total = quantity * unit_price;
    }
    public void display()
    {        
        System.out.println(product_id+"\t\t"+name+"\t\t"+quantity+"\t\t"+unit_price+"\t"+total);
    }
}


public class Bill 
{
    public static void main(String[] args) 
    {
        int n,i;
        double namount=0,t;
        String date;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nOrder no.:");
        t = sc.nextInt();
        System.out.println("Enter the date:");
        date = sc.next();
        System.out.println("Enter how many products are there:");
        n = sc.nextInt();
        bill ob[] = new bill[n];
        for(i=0;i<n;i++)
            ob[i] = new bill();
        for(i=0;i<n;i++){
            ob[i].getdata();
            ob[i].calculate();
        }
        System.out.println("Date:"+date);
        System.out.println("Product Id \tName\t   Quantity\t   unit price\t Total ");
        System.out.println("--------------------------------------------------------------");
        for(i=0;i<n;i++){
            ob[i].display();
            namount += ob[i].total;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\t\tNet.Amount\t"+ namount);

    }
}
