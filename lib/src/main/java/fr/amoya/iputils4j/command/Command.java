package fr.amoya.iputils4j.command;

import fr.amoya.iputils4j.command.Result.CommandResult;

public interface Command<R extends CommandResult> {
    R exec();
}
