package user;

import facebook.FacebookUser;

import java.time.LocalDate;
import java.util.Date;

public class MyFacebookUser implements User {
    private final FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser user) {
        this.facebookUser = user;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public long getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
