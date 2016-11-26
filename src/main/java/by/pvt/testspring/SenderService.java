package by.pvt.testspring;

/**
 * Created by Dmitry on 11/25/2016.
 */
public class SenderService {

    private String message = "qqqqq";
    private ISender sender;

    public SenderService() {
    }

    public SenderService(String message, ISender sender) {
        this.message = message;
        this.sender = sender;
    }


    public void sendMessage(){
        sender.send(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ISender getSender() {
        return sender;
    }

    public void setSender(ISender sender) {
        this.sender = sender;
    }
}
