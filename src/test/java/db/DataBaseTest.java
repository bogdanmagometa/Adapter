package db;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataBaseTest extends TestCase {
    DataBase db;
    @BeforeEach
    public void setUp() {
        db = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals(db.getUserData(), "hello");
    }

    @Test
    void getStatisticalData() {
        assertEquals(db.getStatisticalData(), "hello2");
    }
}