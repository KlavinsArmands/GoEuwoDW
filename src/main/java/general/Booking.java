package general;

import lombok.Data;

@Data
public class Booking {
    private String fromField;
    private String toField;
    private String date;
    private String transportMode;

    public Booking() {
        this.date = "20-00-2019"; //month is real month-1(eg. dec(12) is typed as 11
    }
}