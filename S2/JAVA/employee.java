import java.util.Scanner;
public class employee {
    int eno;
    String ename;
    double esalary;
    public void details(){
        System.out.println("\nEnter the Employee details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee number : ");
        eno=sc.nextInt();
        System.out.println("Name : ");
        sc.nextLine();
        ename=sc.nextLine();
        System.out.println("Salary : ");
        esalary=sc.nextDouble(); 
    }
    void display(){
        System.out.println("Empolyee No :"+eno);
        System.out.println("Name :"+ename);
        System.out.println("Salary Amount"+esalary+"\n");
    }
    public static void main(String[] args) {
        System.out.println("\nEnter the No. of Employee's");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        employee arr[]=new employee[num];
        for(int i =0;i<num;i++){
               arr[i]=new employee();
               arr[i].details();

        }
        System.out.println("\nInformations of all the employee's");
        for(int i=0;i<num;i++){
            arr[i].display();
     }
 
     System.out.println("\nEnter the Employee Number to get details of a employee");
     int num2= sc1.nextInt();
     for(int i=0;i<num;i++){
         if(arr[i].eno==num2){
        System.out.println("\nEmployee details");
         arr[i].display();
         }
        }    
    }
}
