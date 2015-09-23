package be.foreseegroup.resourceservice.messagelistener;

/**
 * Created by Kaj on 23/09/15.
 */
public class Receiver {


    public Receiver() {

    }

    public void receiveMessage(String message) {
        System.out.println("EVENT! A new person was created with ID ["+message+"]");
    }

}
