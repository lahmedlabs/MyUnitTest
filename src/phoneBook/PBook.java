package phoneBook;

import java.util.HashMap;

public class PBook {
    private HashMap<String, String> book = new HashMap<>();
//    private boolean empty = true;
    public boolean isEmpty(){
        //return empty;
        return book.isEmpty();
    }

    public void addNumber1(String name, String pNumber){
 //       empty = false;
        book.put(name, pNumber);
    }
    public String getNumber(String name){
//        return "010-1234-1234";
        return book.get(name);
    }
}
