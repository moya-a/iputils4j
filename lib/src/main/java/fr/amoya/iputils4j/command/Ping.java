package fr.amoya.iputils4j.command;

import fr.amoya.iputils4j.command.result.PingResult;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Builder
public class Ping implements Command<PingResult> {

    private final String host;

    @Override
    public PingResult exec() {
        log.error("execute");
        return null;
    }
}
