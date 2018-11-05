package general;

import lombok.Data;

@Data
public class Booking {
    private String fromField;
    private String toField;
    private String date;

    public Booking() {
        this.date = "3-11-2018"; //month is real month-1(eg. dec(12) is typed as 11
    }
}