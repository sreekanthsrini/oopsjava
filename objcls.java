public class objcls {
    static int a=20;
    static int b=7;
    // in here we can declare a static for inner class
    // we cannot access without creating a object

    
        

    
   static class A{
    String name;
    int age;
    public static void main(String[] args) {
        int ans=objcls.a+objcls.b;
        System.out.println(ans);
        // with the creating of object we can access the inner static class because the main class is not static
        A obj=new A();
        obj.name="vanakm";
        
        


    }
}
}
