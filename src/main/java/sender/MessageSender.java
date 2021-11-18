package sender;

import user.User;

import java.time.Instant;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        long millis = Instant.now().toEpochMilli() - user.getLastActiveTime();
        if (millis < 3600 * 1000) {
            System.out.println("message: " + text);
            return true;
        }
        return false;
    }
}
