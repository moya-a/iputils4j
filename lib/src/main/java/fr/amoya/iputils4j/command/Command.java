package fr.amoya.iputils4j.command;

import fr.amoya.iputils4j.command.result.CommandResult;

public interface Command<R extends CommandResult> {
    R exec();
}
