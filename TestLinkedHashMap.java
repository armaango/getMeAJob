/**
 * Created by AmmY on 11/03/17.
 */
    import java.io.BufferedReader;
    import java.io.FileReader;
    import  java.util.LinkedHashMap;

public class TestLinkedHashMap {
    private static LinkedHashMap<Integer,String> phoneMap;
    public TestLinkedHashMap (){
        phoneMap = new LinkedHashMap<Integer, String>();
    }

    public LinkedHashMap<Integer,String> readFromFile(String fileName){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line=bufferedReader.readLine())!=null){
                String tokens[] = line.split(",");
                phoneMap.put(Integer.parseInt(tokens[2].trim()),tokens[3]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return phoneMap;
    }

    public static void main(String[] args) {
        TestLinkedHashMap testLinkedHashMap = new TestLinkedHashMap();
        LinkedHashMap<Integer,String> result = testLinkedHashMap.readFromFile("/Users/AmmY/Documents/CTCI_Practise/src/phones.txt");
        System.out.println(result);
    }
}
