import java.util.Scanner;
 class employees {
    int empid;
    String name;
    double salary;
    String address;
    employees(int eid, String ename, double esal, String eaddr) {
        this.empid = eid;
        this.name = ename;
        this.salary = esal;
        this.address = eaddr;
    }
}
public class teacher extends employees{
 String department;
 String subject;
 
 teacher(int eid, String ename, double esal, String eaddr, String dept, String sub){
     super(eid,ename,esal,eaddr);
     this.department= dept;
     this.subject=sub;
 }
    
 void display(){
    System.out.println("Employee id: "+empid);
    System.out.println("Name: "+name);
    System.out.println("Salary: "+salary);
    System.out.println("Address: "+address);
    System.out.println("Department: "+department);
    System.out.println("Subject: "+subject);
 }
 public static void main(String[] args) {
    System.out.println("\nEnter the No. of Employee's");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    teacher arr[]=new teacher[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Employee id: ");
        int empid=sc.nextInt();
        System.out.println("\nEnter Employee Name: ");
        String name=sc.next();
        System.out.println("\nEnter Salary: ");
        double salary=sc.nextDouble();
        System.out.println("\nEnter Address: ");
        String address=sc.next();
        System.out.println("\nEnter department: ");
        String department=sc.next();
        System.out.println("\nEnter Subject: ");
        String subject=sc.next();
        arr[i]=new teacher(empid,name,salary,address,department,subject);
    

    }
    System.out.println("\nInformations of all the employee's");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }
 sc1.close();
 }


}
