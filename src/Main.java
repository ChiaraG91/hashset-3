import java.util.*;

public class Main {

    public static void main(String[] args) {

        set3();

    }

    public static void set3() {
        Set<String> bibite = new HashSet<String>(Arrays.asList("Coca Cola", "Fanta", "Sprite", "OrangeSoda", "Lemonsoda"));

        System.out.println(bibite);
        bibite.add("Orangesoda");

        for(String element : bibite){
             if( Objects.equals(element, "Orangesoda")){
                 bibite.remove(element);
                }
            }  System.out.println(bibite);

        bibite.clear();
        System.out.println(bibite);

    }

}







