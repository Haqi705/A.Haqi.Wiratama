import java.util.HashSet;


public class susah{
    public static void main(String[] args){
        int[] yui = {1,4,3,2,5};


        susahs(yui);
    }

    public static void susahs(int[] yui){

        HashSet<Integer> iyh = new HashSet<>();
        boolean impos = false;

        System.out.println("Array: ");

        for(int a : yui){
            System.out.println(a + "");
        }
        System.out.println("\\ gk");
        
        
        
        for(int yoi : yui){
            
            if(iyh.contains(yoi)){
                System.out.println("yh ad yg dobel" + yoi);
                 impos = true;
                 break;
                }
                 iyh.add(yoi);
                 
                
   
            }
            if(!impos){
                System.out.println("gk ada impos yey :)");
            }
            // String[] uy = {"a","b","c"};
            //

    }


}
