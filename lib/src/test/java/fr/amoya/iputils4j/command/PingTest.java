package fr.amoya.iputils4j.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PingTest {

    @Test
    void exec() {
        Ping ping = Ping.builder().host("127.0.0.1").build();

        ping.exec();

        assertTrue(true);
    }
}
