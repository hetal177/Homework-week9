package Week9;

import java.util.HashMap;



    public class Programme9 {
        /*
         * Create a HashMap object called people that will store String keys and Integer
         * values: And use for each loop to iterate the value from Map.
         * @param args
         */
        public static void main(String[] args) {
            //Create a HashMap object called people
            HashMap<String,Integer> people = new HashMap<String,Integer>();

            //Add keys and
            people.put("Ram",40);
            people.put("Sita",38);
            people.put("Hanuman",20);
            people.put("Laksman",17);
            for(String i : people.keySet()){
                System.out.println("key:"  + "value:" + people.get(i));
            }

        }
    }


