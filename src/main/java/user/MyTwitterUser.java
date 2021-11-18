package user;

import twitter.TwitterUser;

import java.time.LocalDate;
import java.util.Date;

public class MyTwitterUser implements User {
    private final TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser user) {
        this.twitterUser = user;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
