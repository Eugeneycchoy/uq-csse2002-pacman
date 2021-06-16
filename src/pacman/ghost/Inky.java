package pacman.ghost;

/**
 * Inky is a ghost that likes to tail close behind the hunter.
 * When not chasing the hunter down, Inky likes to hang out in the
 * bottom right corner of the board in a blue glow.
 */
public class Inky extends Ghost {

    /**
     * Get Inky's colour.
     * @return "#7aa6da"
     */
    @Override
    public String getColour() {
        return "#7aa6da";
    }

    /**
     * Get Inky's type/name.
     * @return GhostType.INKY
     */
    @Override
    public GhostType getType() {
        return GhostType.INKY;
    }
}
