public class finalizee {

    
    String name;
    //  it is used for remove object as garbage collection
    // using finalize key word
    @Override
    protected void finalize() throws Throwable {
        
        super.finalize();
    }

    public static void main(String[] args) {
        finalizee obj1=new finalizee();
        
        for(int i=1;i>=10;i++){
            obj1.name="sreekanth";
            System.out.println(obj1.name);


        }
        

        
    }

    
}
