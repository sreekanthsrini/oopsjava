public class object {
    int rollno;
    String name;
    float mark;
    public static void main(String[] args) {
        // create a object
        object std1=new object();
        std1.rollno=01;
        std1.name="sree";
        std1.mark=100;
        object std2=new object();
        std2.rollno=02;
        std2.name="john";
        std2.mark=99.67f;


        System.out.println(std1.rollno+" "+std1.name);
        System.out.println(std2.rollno+" "+std2.name);
        
    }
    
}
