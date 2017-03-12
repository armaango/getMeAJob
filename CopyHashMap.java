import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * Created by AmmY on 11/03/17.
 */
public class CopyHashMap {
    private static HashMap<Integer, String> phoneMap;

    public CopyHashMap() {
        phoneMap = new HashMap<>();
    }

    public HashMap<Integer, String> readFromFile(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String token[] = line.split(",");
                phoneMap.put(Integer.parseInt(token[2].trim()), token[3]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phoneMap;
    }

    public static void main(String[] args) {
        CopyHashMap copyHashMap = new CopyHashMap();
        HashMap<Integer,String> result = copyHashMap.readFromFile("/Users/AmmY/Documents/CTCI_Practise/src/phones.txt");
        System.out.println("Printing hash map");
        System.out.println(result);
    }

}