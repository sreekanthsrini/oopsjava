public class thisfunction {

    int rollno;
    String name;
    int marks;
    void greeting(){
        System.out.println("hi my name is "+name);
    }
    thisfunction(){
        this.rollno=18;
        this.name="sreekanth";
        this.marks=99;
    }
    public static void main(String[] args) {
        thisfunction obj1=new thisfunction();
        System.out.println(obj1.name);
        System.out.println(obj1.rollno);
        System.out.println(obj1.marks);
        // second obbject
        thisfunction obj2=new thisfunction();
        System.out.println("object 2");
        System.out.println(obj2.name);
        System.out.println(obj2.rollno);
        System.out.println(obj2.marks);
        System.out.println("printing of methods");
        obj1.greeting();
    }
   
}
