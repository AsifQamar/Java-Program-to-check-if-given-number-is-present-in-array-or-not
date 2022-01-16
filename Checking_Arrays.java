import java.util.Scanner;
public class Checking_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to check that if it's present in array or not");
        int num = sc.nextInt();
        int [] data = {10, 90, 80, 70, 50};
        int i = 0;
        while (i<data.length){
            if (num == data[i]){
                System.out.println("This is present in array");
                break;
            }
            else{
                i++;
                continue;
            }
        }
        if(i==data.length){
            System.out.println("This is not present in array");
        }
        sc.close();
    }
}
