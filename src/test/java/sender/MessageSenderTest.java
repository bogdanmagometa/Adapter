package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;
import user.MyFacebookUser;
import user.MyTwitterUser;
import user.User;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender messageSender;
    User user1, user2, user3;

    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();
        user1 = new MyFacebookUser(new FacebookUser("abc@gmail.com", "Spain", Instant.now().toEpochMilli()));
        user2 = new MyTwitterUser(new TwitterUser("asd@.dsc.sd", "Argentina", 1000000));
        user3 = new MyFacebookUser(new FacebookUser("abadsc@fdsgmail.com", "abc", 10000000));
    }

    @Test
    void testSend() {
        assertTrue(messageSender.send("my text", user1, "Spain"));
        assertFalse(messageSender.send("my text", user2, "Argentina"));
        assertFalse(messageSender.send("my text", user3, "abc"));
    }
}