public class staticfunctions {
    public static void main(String[] args){
        // it dose not shows error. because we can use static keyword in this method
        // if we create static we cannot create object object creation is not required
        greetings();
// it shows error we cant create object
staticfunctions obj1=new staticfunctions();
       obj1. animal();
    //    nested method can we call




    }
    static void greetings(){
        System.out.println("vanakam");
    }
    void animal(){
        
        System.out.println("vanakam");
    }
    // we cannot declare a nested methods and cannot acess
    static void car(){
    //    static void benz(){
    //         System.out.println("hi iam benz");
            
    //     }
    }

    // we cannot use this keyword inside the object
    

    
    
}
