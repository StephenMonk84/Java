import javax.swing.JOptionPane;
public class Quiz{
    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args){
        
        String question = "What is the largest mammal? \n";
        question += "A. Elephant\n";
        question += "B. Whale Shark\n";
        question += "C. Blue Whale\n";
        question += "D. Hippopotamus\n";
        question += "E. Polar Bear\n";
        String correctAnswer = "C";

        check(question, correctAnswer);
        

        String secondQuestion = "What is the largest land based animal? \n";
        secondQuestion += "A. Hippopotamus\n";
        secondQuestion += "B. Lion\n";
        secondQuestion += "C. Tiger\n";
        secondQuestion += "D. Asian Elephant\n";
        secondQuestion += "E. African Elephant\n";
        String secondCorrect = "E";
        check(secondQuestion, secondCorrect);

        String thirdQuestion = "What creatures are the smartest besides humans?\n";
        thirdQuestion += "A. Parrot\n";
        thirdQuestion += "B. Dolphin\n";
        thirdQuestion += "C. Octopus\n";
        thirdQuestion += "D. Orangutan\n";
        thirdQuestion += "E. Chimpanzee";
        String thirdCorrect = "B";
        check(thirdQuestion, thirdCorrect);
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " +nQuestions);
    }

    static String ask(String question){
        while(true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
           
           if(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
                return answer;
           }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Input! Please use only A, B, C, D, or E.");
            }
        } 
    }
    static void check(String question, String correctAnswer){
        nQuestions++;

        while(true){
            String answer = ask(question);
            if (answer.equals(correctAnswer)){
                JOptionPane.showMessageDialog(null, "Correct!");
                nCorrect++;
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + correctAnswer);
                break;
            }
        }    
        
            
    }



}