package by.pvt.testspring;

/**
 * Created by Dmitry on 11/25/2016.
 */
public class EmailSender implements ISender {

    public void send(String message){
        System.out.println("Message " + message);
    }
}
