import java.lang.Exception;
import java.util.ArrayList;

public class Exceptions {
    public void Test1(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(myList);
        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i); //class java.lang.String cannot be cast to class java.lang.Integer 
            }
            catch (ClassCastException e){
                System.out.println(e);
            }
        }
    }
}