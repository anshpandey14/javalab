public class studentdetails {

    String name;
    int rollno;
    
    int marks1 = 0;
    int marks2 = 0;
    int marks3 = 0;
    
    
    void totalmarks(){
        int total = marks1+marks2+marks3;
        System.out.println("Total Marks are: "+total);
    }    

    void average(){
        int average = (marks1+marks2+marks3)/3;
        System.out.println("Average marks are: "+average);
    }
    public static void main(String[] args) {
        studentdetails s1 = new studentdetails();
        s1.name = "Ansh";
        s1.rollno = 36;
        s1.marks1 = 80;
        s1.marks2 = 82;
        s1.marks3 = 85;
        s1.totalmarks();
        s1.average();
    }
}
