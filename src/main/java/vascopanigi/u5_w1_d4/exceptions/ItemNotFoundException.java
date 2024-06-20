package vascopanigi.u5_w1_d4.exceptions;

import java.util.UUID;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(UUID id) {
        super("The item with id " + id + " has not been found.");
    }
}
