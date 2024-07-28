public class swap {
    public static void main(String[] args) {
        
    
    // int a=10;
    // int b=20;
    // Integer c=30;

    // int d=c; 
    // it is most flexible than int
    Integer a=10;
    Integer b=20;
    // System.out.println("iNteger"+d);
    
    swap(10,20);
    
    System.out.println(a);
    System.out.println(b);
    }
    public static void swap(Integer a,Integer b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
    System.out.println(b);
     
    }


    
}
