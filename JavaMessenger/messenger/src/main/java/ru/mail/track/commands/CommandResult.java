package ru.mail.track.commands;

/**
 *
 */
public abstract class CommandResult {
    enum Status {
        OK,
        FAILED,
        NOT_LOGGINED,

    }

    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
