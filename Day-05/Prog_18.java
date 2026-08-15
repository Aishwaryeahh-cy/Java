public class Prog_18{
    static String getGrade(int marks){
        if (marks>=90){
            return "Amazing";
        }else if (marks>=80){
            return "Very Good";
        }
        else if (marks>=70){
            return "Good"; 
        }
        else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
        System.out.println(getGrade(90));
        System.out.println(getGrade(78));
        System.out.println(getGrade(55));
    }
}
