public class Result {
    private String username;
    private int totalQuestions;
    private int correctAnswers;
    private int wrongAnswers;
    private double percentage;

    public Result(String username,
                  int totalQuestions,
                   int correctAnswers,
                   int wrongAnswers,
                    double percentage
    ){

            this.username=username;
            this.totalQuestions=totalQuestions;
            this.correctAnswers=correctAnswers;
            this.wrongAnswers=wrongAnswers;
            this.percentage=percentage;

    }

         public void displayresult(){
            System.out.println("\n======================== Result =============================");
            System.out.println("Username :" + username);
            System.out.println("TotalQuestion :" + totalQuestions);
            System.out.println("Correct Answers :" + correctAnswers);
            System.out.println(" Wrong Answers :" + wrongAnswers);
            System.out.println("Percentage : " + percentage);

            if(percentage>40){
                System.out.println("pass");
            }
            else{
                System.out.println("Fail");
            }
         }
          
    }

