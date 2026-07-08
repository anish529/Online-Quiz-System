import java.util.ArrayList;
    
public class Quiz {
   private ArrayList<Question>questions;

   public Quiz(){
    questions=new ArrayList<>();
   }

   public void addQuestion(Question question){
    questions.add(question);
   }

   public ArrayList<Question>getQuestions(){
      return questions;
   }

   public void startQuiz(){
      
   }
}
