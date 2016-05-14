/**
 * Created by nikigoya on 5/15/2016.
 */
public class LambdaExample1_1 {
    public static void main(String[] args) {
        handleEvent(x->System.out.println(x),"Hello World!");
    }

    static void handleEvent(MyEvent myEvent,String type){
        myEvent.action(type);
    }

}
