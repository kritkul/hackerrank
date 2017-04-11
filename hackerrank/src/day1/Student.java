package day1;

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int scores[]){
        super(firstName, lastName, identification);
        this.testScores = scores;
    //    System.out.println("Grade: " + calculate());
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        char grade;
        int total = 0;
        float avg = 0.0f;
        
        for(int i=0; i < testScores.length; i++ ){
            total = total + testScores[i];
        }
        avg = total/testScores.length;
        
        if(avg >= 90 && avg <= 100) grade = 'O';
            else if(avg >= 80 ) grade = 'E';
                else if(avg >= 70) grade = 'A';
                    else if(avg >= 55) grade = 'P';
                        else if(avg >= 40) grade = 'D';
                            else grade = 'T';
                
         return grade;
        
    }
}