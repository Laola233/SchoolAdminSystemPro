package sasyspro.permission;

import sasyspro.enums.Permissions;

/**
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.3B
 */
public class IdentifyPermission {
    @SuppressWarnings("unlikely-arg-type")
    public boolean identfyPermission(String permission) throws Exception {
        for (int i = 0; i < 42; i++) {
            if (permission.equals(Permissions.valueOf(permission))) {
                return true;
            }
        }
        return false;
    }
}
