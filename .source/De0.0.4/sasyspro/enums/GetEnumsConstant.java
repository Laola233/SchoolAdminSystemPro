package sasyspro.enums;

/**
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.3B
 */
public class GetEnumsConstant {
    public int PIN;

    {
        PIN = 120620;
    }

    /**
     * @return 权限枚举常量数组
     * @deprecated
     */
    public Permissions[] getPermissionConstantArray(int PIN) throws Exception {
        if (hasUsePermission(PIN)) {
            return Permissions.values();
        }
        System.out.println("PIN CODE IS WRONG! CHECK IT! OR GET IT ON THE GITHUB PAGE");
        return null;
    }

    public Permissions getPermissionsConstant(String permission, int PIN) throws Exception {
        if (hasUsePermission(PIN)) {
            return Permissions.valueOf(permission);
        }
        System.out.println("PIN CODE IS WRONG! CHECK IT! OR GET IT ON THE GITHUB PAGE");
        return null;
    }

    /**
     * @return 学科枚举常量数组
     * @deprecated
     */
    public Subjects[] getSubjectConstantArray(int PIN) throws Exception {
        if (hasUsePermission(PIN)) {
            return Subjects.values();
        }
        System.out.println("PIN CODE IS WRONG! CHECK IT! OR GET IT ON THE GITHUB PAGE");
        return null;
    }

    public Subjects getSubjectsConstant(String subject, int PIN) throws Exception {
        if (hasUsePermission(PIN)) {
            return Subjects.valueOf(subject);
        }
        System.out.println("PIN CODE IS WRONG! CHECK IT! OR GET IT ON THE GITHUB PAGE");
        return null;
    }

    public boolean hasUsePermission(int PIN) {
        if (PIN == this.PIN) {
            return true;
        }
        return false;
    }
}
