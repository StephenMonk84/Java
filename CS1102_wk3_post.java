import java.util.Scanner;
public class CS1102_wk3_post {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number");
        
        String userInp = inp.nextLine();
        int numInp = Integer.parseInt(userInp);
        output(numInp); //numInp is the actual parameter
    }

    static boolean divByFive(int num){
        return num%5==0;
    }

    static void output(int num){ //num is the formal parameter
        boolean testData = divByFive(num);
        if(testData == true){
            System.out.println(num + " is divisible by 5.");
        }
        else{
            System.out.println(num + " is not divisible by 5.");
        }
    }
    
}
