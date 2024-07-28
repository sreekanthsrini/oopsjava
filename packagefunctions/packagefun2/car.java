package packagefunctions.packagefun2;

public class car {
    int price;
    String carname;
    int model;
    // we cannot make it works  without declere a static 
    // the static keyword is used to acces it without create object we can access by class itself
   static int count;
    car(int price,String carname,int model){
        this.price=price;
        this.carname=carname;
        this.model=model;
     car.count+=1;
        
    }
    

    
}