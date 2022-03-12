import java.time.LocalDateTime;

public class smsManager implements smsInterface{

    private sms sms;
    
    @Override
    public boolean insertSms() {
        return false;
    }


    @Override
    public String retrieveSmsByDate(LocalDateTime dateTime) {
        return null;
    }

    @Override
    public String retrieveSmsByPromoCode() {
        return null;
    }

    @Override
    public String retrieveSmsByMsisdn(String msisdn) {
        return null;
    }

    @Override
    public String retrieveSmsBySent() {
        return null;
    }

    @Override
    public String retrieveSmsByReceive() {
        return null;
    }

    @Override
    public String retrieveSmsBySeveralMsisdn(String[] msisdn) {
        return null;
    }
}
