/**
 * Created by nikigoya on 5/14/2016.
 *
 */
public class LambdaExample1 {

    public static void main(String[] args) {
        MyEvent myEvent = x -> System.out.println(x);
        myEvent.action("Hello World!");
    }

}

interface MyEvent{
    void action(String type);
}