package sasyspro.functions;

/**
 * @author Laola233
 * @version 0.1
 * @serial SchoolAdminSystemLPro
 * @since 0.4B
 */

public final class EmptyPlaceholder {
    /**
     * @param isdefault
     */
    public final void printPlaceholder(boolean isdefault) {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

    /**
     * @param amount
     */
    public final void printPlaceholder(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println();
        }
    }
}
