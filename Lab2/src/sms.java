import java.time.LocalDateTime;
import java.util.HashMap;

public class sms {

    private String msisdn;
    private String recipient;
    private String sender;
    private String shortCode;
    private String transactionID;
    private LocalDateTime timeStamp;

    //constructor for creating sms
    public sms(String msisdn, String recipient, String sender, String shortCode, String transactionID, LocalDateTime timeStamp){
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
    }

    public String getMsisdn(){
        return msisdn;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getSender(){
        return sender;
    }

    public String getShortCode(){
        return shortCode;
    }

    public String getTransactionID(){
        return transactionID;
    }

    public LocalDateTime getTimeStamp(){
        return timeStamp;
    }

    public boolean smsChecker(HashMap<String,String> map){
        if (!map.containsKey("Mobile Number") || !map.containsKey("Message") || !map.containsKey("Short Code")){
            return false;
        }
    }




}
