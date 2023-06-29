import javax.swing.JOptionPane;
public class Quiz_switch {
    

    

    public static void main(String[] args){
        String question = "What is the largest mammal? \n";
        question += "A. Elephant\n";
        question += "B. Whale Shark\n";
        question += "C. Blue Whale\n";
        question += "D. Hippopotamus\n";
        question += "E. Polar Bear\n";

        
        while(true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("C")){
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            }
            else if(answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E")){
                JOptionPane.showMessageDialog(null, "Incorrect! Please try again.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Input! Please use only A, B, C, D, or E.");
            }
          
        }
            
            
            /* 
            
        } */
        

    }



    }

