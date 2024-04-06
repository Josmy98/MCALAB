import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        double sum = 0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Count of numbers");
        int N = sc.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter the number");
        for(int i =0;i<N; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i =0;i<N; i++){
            try {
                if (numbers[i] >= 0) {
           
                    sum += numbers[i];
                    count++;
                } else {
                    throw new negative_exception("Negative number : " +numbers[i]);
                }
            }
            catch (negative_exception e){
                System.out.println(e.getMessage());
            }
        }
        double avg = sum/count;
        System.out.println("Average of Positive Numbers ="+avg);

    }

}
class negative_exception extends  Exception{
    public negative_exception(String s){
        super(s);
    }
}
