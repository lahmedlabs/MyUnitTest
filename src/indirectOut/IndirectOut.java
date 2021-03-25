package indirectOut;

public class IndirectOut {
    private Greeting something;
    public void doIt(String str){
        if(str== "Hello"){
            something.say("Hello!");
        } else
            something.say("Good bye!");
    }
}
