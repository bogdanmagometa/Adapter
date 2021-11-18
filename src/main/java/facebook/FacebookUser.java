package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCountry;
    private long userActiveTime;
}
