import java.time.LocalDateTime;

public class promo {

    private String promoCode;
    private String details;
    private String shortCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public promo(String promoCode, String details, String shortCode, LocalDateTime starDate, LocalDateTime endDate){
        this.promoCode = promoCode;
        this.details = details;
        this.shortCode = shortCode;
        this.startDate = starDate;
        this.endDate = endDate;
    }

    public String getPromoCode(){
        return promoCode;
    }

    public String getDetails(){
        return details;
    }

    public String getShortCode(){
        return shortCode;
    }

    public LocalDateTime getStartDate(){
        return startDate;
    }

    public LocalDateTime getEndDate(){
        return endDate;
    }


}
