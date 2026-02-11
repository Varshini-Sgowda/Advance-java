import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        ArrayList <String> cars =  new ArrayList<>();   
        cars.add("volvo");
        cars.add("BMW");
        cars.add("ford"); 
        cars.add(0,"Mazda");
        System.out.println(cars); 
        cars.get(0);   
        String first =cars.get(0);
        System.out.println("first car");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars.size());
        cars.clear();


    }
}
