package sasyspro.permission;

import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public interface Permission {

	public abstract String[] getPermission(Student target);

	public abstract String[] getPermission(Teacher target);

	public abstract String[] getPermission(Administrator target);

	public abstract String getPermission(Student target, int pno);

	public abstract String getPermission(Teacher target, int pno);

	public abstract String getPermission(Administrator target, int pno);

	public abstract void addPermission(String[] permissionsz, Student target);

	public abstract void addPermission(String permission, Student target);

	public abstract void addPermission(String[] permissionsz, Teacher target);

	public abstract void addPermission(String permission, Teacher target);

	public abstract void addPermission(String[] permissionsz, Administrator target);

	public abstract void addPermission(String permission, Administrator target);

	public abstract void delPermission(String[] permissionsz, Student target);

	public abstract void delPermission(String permission, Student target);

	public abstract void delPermission(String[] permissionsz, Teacher target);

	public abstract void delPermission(String permission, Teacher target);

	public abstract void delPermission(String[] permissionsz, Administrator target);

	public abstract void delPermission(String permission, Administrator target);

	public abstract boolean hasPermission(String permission, Student target);

	public abstract boolean hasPermission(String permission, Teacher target);

	public abstract boolean hasPermission(String permission, Administrator target);
}
