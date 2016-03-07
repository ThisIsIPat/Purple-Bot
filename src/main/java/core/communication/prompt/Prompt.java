package core.communication.prompt;

import java.util.UUID;

public abstract class Prompt {

    private final UUID id;

    protected Prompt() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
