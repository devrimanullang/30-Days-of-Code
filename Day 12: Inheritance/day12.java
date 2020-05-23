class Student extends Person{
    
	private int[] testscores;
    Student(String firstName, String lastName ,int id, int[] testScores)
    {
        super(firstName,lastName,id);
        testscores= new int[testScores.length];
        for(int i=0;i<testScores.length;i++){
            testscores[i]=testScores[i];
        }
    }

    char calculate()
    {   int avg=0;
        for(int i=0;i<testscores.length;i++)
            avg+=testscores[i];
        avg=avg/testscores.length;
        
        if( avg > 89){
            return 'O';
        }else if (avg > 79){
            return 'E';
        }else if(avg > 69){
            return 'A';
        }else if(avg > 54){
            return 'P';
        }else if(avg > 39){
            return 'D';
        }else
            return 'T';
    }
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}