public class Question {
    private int id;
    private String question;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    
    private char correctAns;

    public Question(int id , String question,
                      String optionA,
                      String optionB,
                      String optionC,
                      String optionD,
                      char correctAns
    ){

        this.id=id;
        this.question=question;
        this.optionA=optionA;
         this.optionB=optionB;
          this.optionC=optionC;
           this.optionD=optionD;
           this.correctAns=Character.toUpperCase(correctAns);
    }

    public void displayQuestion(){
        System.out.println("\nQ" + id +"." +question);
        System.out.println("A." +optionA);
        System.out.println("B." +optionB);
        System.out.println("C." +optionC);
        System.out.println("D." +optionD);
    }

    public char getCorrectAns(){
        return correctAns;
    }
    public String toString(){
        return id+ ","+question+ ","+
        optionA+
        ","+optionB + "," +optionC +"," +optionD +"," +correctAns;
    }
}
