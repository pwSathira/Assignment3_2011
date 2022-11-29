import java.util.HashMap;
import java.util.Scanner;

public class VehicleInfoSystem {
    public static void main(String args[]){
        //Key: Time in MS
        //Value: Speed at that time
        HashMap<String, String> M = new HashMap<String, String>();
        M = getUserInput(M);
        for (String key : M.keySet()){
            System.out.println(key);
        }
        for (String value : M.values()){
            System.out.println(value);
        }
    }
    public static HashMap<String, String> getUserInput(HashMap<String, String> m) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int numOfIn = sc.nextInt();

        for (int i = 0; i < numOfIn; i++){
            System.out.print("Enter Key: ");
            String userKey = sc.next();
            System.out.print("Enter Value: ");
            String userVal = sc.next();
            m = addKey(userKey, userVal, m);
        }
        System.out.print("Enter search key: ");
        String searchKey = sc.next();
        String result = searchKey(searchKey, m);
        System.out.print("Result is: " + result);

        System.out.print("Delete key: ");
        String deleteKey = sc.next();
        m = removeKey(deleteKey, m);
        sc.close();
        return m;
    }
    public static String searchKey(String key, HashMap<String, String> m) {
        String value = "";
        value = m.get(key);
        return value;
    }
    public static HashMap<String, String> removeKey(String key, HashMap<String, String> m) {
        m.remove(key);
        return m;
    }
    public static HashMap<String, String> addKey(String k, String v, HashMap<String,String> m) {
        m.put(k,v);
        return m;
    }
}