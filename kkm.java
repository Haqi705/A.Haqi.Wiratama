import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class kkm{
    public static void main(String[] args){
        int[] yun = {1,2,2,3,3,3,4};

        Map<Integer,Integer> yuba = new HashMap<>();

        for(int yina:yun){


            yuba.put(yina,yuba.getOrDefault(yina, 0) + 1);



        }
        Map<Integer,Integer> ona = new TreeMap<>(yuba);




        for(Map.Entry<Integer,Integer> entry : ona.entrySet()){
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + "kali" );
        }



        // Yun =array, Yuba = hash map, yina = elemen, ona = tree map 
     




    }


}
