import java.time.LocalDateTime;

public interface smsInterface {

    public boolean insertSms();
    public String retrieveSmsByDate(LocalDateTime dateTime);
    public String retrieveSmsByPromoCode();
    public String retrieveSmsByMsisdn(String msisdn);
    public String retrieveSmsBySent();
    public String retrieveSmsByReceive();
    public String retrieveSmsBySeveralMsisdn(String[] msisdn);

}
