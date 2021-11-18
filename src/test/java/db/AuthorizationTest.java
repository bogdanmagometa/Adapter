package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization authorization;
    DataBase db;
    @BeforeEach
    void setUp() {
        authorization = new Authorization();
        db = new DataBase();
    }

    @Test
    void authorize() {
        assertTrue(authorization.authorize(db));
    }
}