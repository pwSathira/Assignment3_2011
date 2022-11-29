import java.util.ArrayList;
import java.util.Scanner;

public class VehicleInfoSystemArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Key: Time in MS
        //Value: Speed at that time
        ArrayList<ArrayList<String>> pairList =  createPairList();
        System.out.print("Delete Key: ");
        String delKey = sc.next();
        pairList = delPairList(delKey, pairList);
        System.out.print("Search Key: ");
        String serKey = sc.next();
        String serResult = serPairList(serKey, pairList);
        System.out.println("Result is: " + serResult);
        System.out.print("Insert Key: ");
        String insKey = sc.next();
        System.out.print("Insert Value: ");
        String insVal = sc.next();
        pairList.get(0).add(insKey);
        pairList.get(1).add(insVal);
        for (String key : pairList.get(0)){
            System.out.println(key);
        }
        for (String value : pairList.get(1)){
            System.out.println(value);
        }
    }
    public static ArrayList<ArrayList<String>> delPairList(String delKey, ArrayList<ArrayList<String>> pairList) {
        if(pairList.get(0).contains(delKey)){
            String value = serPairList(delKey, pairList);
            pairList.get(0).remove(delKey);
            pairList.get(1).remove(value);
        }
        return pairList;
    }
    public static String serPairList(String serKey, ArrayList<ArrayList<String>> pairList) {
        String returnStr = "";
        if (pairList.get(0).contains(serKey)){
           returnStr = pairList.get(1).get(pairList.get(0).indexOf(serKey));
        } return returnStr;
    }
    public static ArrayList<ArrayList<String>> createPairList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int numOfIn = sc.nextInt();
        ArrayList<String> keyList = new ArrayList<String>();
        ArrayList<String> valList = new ArrayList<String>();
        for(int i = 0; i < numOfIn; i++){
            System.out.print("Enter Key: ");
            String key = sc.next();
            System.out.print("Enter Value: ");
            String value = sc.next();
            if (keyList.contains(key)) {
                valList.set(keyList.indexOf(key), value);
            } else {
                keyList.add(key);
                valList.add(value);
            }
        }
        ArrayList<ArrayList<String>> pairList = new ArrayList<ArrayList<String>>();
        pairList.add(0, keyList);
        pairList.add(1, valList);
        return(pairList);
    }
}


