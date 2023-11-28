// BoardObject.java
package boardgamegui;

import java.io.Serializable;

public abstract class BoardObject implements Drawable, Serializable {
    // other methods and properties

    public abstract void performAction();  // Example abstract method
}
