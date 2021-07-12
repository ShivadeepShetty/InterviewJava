package collections;

import java.util.*;

public class HashMap {

     private  Map<String,Integer> map;
     private Scanner scanner;



    public static void main(String[] args) {
        new HashMap();
    }

    public HashMap(){
        map = new java.util.HashMap<String,Integer>();
        System.out.println("Enter values ");
        scanner = new Scanner(System.in);
        createMap();
    }

    private void createMap(){
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();

            if(map.containsKey(token)){
                int count = map.get(token);
                map.put(token,count+1);
            }else {
                map.put(token,1);
            }
        }

        Set<String> keys = map.keySet();

        System.out.println(" values: ");

        for(String key: keys){
            System.out.printf(" %s",map.get(key));
        }


    }
}
