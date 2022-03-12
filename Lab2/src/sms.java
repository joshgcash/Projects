import java.time.LocalDateTime;

public class sms {

    private String msisdn;
    private String recipient;
    private String sender;
    private String shortCode;
    private String transactionID;
    private LocalDateTime timeStamp;

    //constructor for sms created by user
    public sms(String msisdn, String recipient, String sender, String shortCode, String transactionID, LocalDateTime timeStamp){
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
    }

    //constructor for sms created by system
    public sms (String msisdn, String recipient, String sender, String shortCode, String transactionID){
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        this.transactionID = transactionID;
        this.timeStamp = LocalDateTime.now();
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





}
