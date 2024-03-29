package by.mrf1n.session_manager.commands;

import by.mrf1n.model.CommandType;
import by.mrf1n.model.request.BodyContract;
import by.mrf1n.session_manager.model.UserSession;

/**
 * Интерфейс для выполнения одной комманды
 */

public interface Command {
    CommandType execute(UserSession userSession);
}
