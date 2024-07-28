package packagefunctions.packagefun2;

public class main {
    public static void main(String[] args) {
        // there we can define a constructor so we can pass the value in object itself
        car sree=new car(90000, "benz", 2024);
        car srey=new car(100000, "audi", 2024);
        System.out.println(sree.carname);
        System.out.println(srey.carname);
        System.out.println("car count"+car.count);
    }
    
}
