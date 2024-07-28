public class objectmemory {
    String name;
    int no;
    public static void main(String[] args) {
        objectmemory one=new objectmemory();
        objectmemory two=one;
        one.name="sreekanth";
        one.no=1;
        System.out.println(two.name);
        System.out.println(two.no);
        // because both object point to the same memory 
    }

    
}
