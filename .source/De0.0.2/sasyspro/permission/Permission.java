package sasyspro.permission;

import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public interface Permission {
	public abstract Object[] getPermission(Student target);

	public abstract Object[] getPermission(Teacher target);

	public abstract Object[] getPermission(Administrator target);

	public abstract Object[] getPermission(Parent target);

	public abstract String getPermission(Student target, int pno);

	public abstract String getPermission(Teacher target, int pno);

	public abstract String getPermission(Administrator target, int pno);

	public abstract String getPermission(Parent target, int pno);

	public abstract void addPermission(String[] permissionsz, Student target);

	public abstract void addPermission(String permission, Student target);

	public abstract void addPermission(String[] permissionsz, Teacher target);

	public abstract void addPermission(String permission, Teacher target);

	public abstract void addPermission(String[] permissionsz, Administrator target);

	public abstract void addPermission(String permission, Administrator target);

	public abstract void addPermission(String[] permissionsz, Parent target);

	public abstract void addPermission(String permission, Parent target);

	public abstract void delPermission(String[] permissionsz, Student target);

	public abstract void delPermission(String permission, Student target);

	public abstract void delPermission(String[] permissionsz, Teacher target);

	public abstract void delPermission(String permission, Teacher target);

	public abstract void delPermission(String[] permissionsz, Administrator target);

	public abstract void delPermission(String permission, Administrator target);

	public abstract void delPermission(String[] permissionsz, Parent target);

	public abstract void delPermission(String permission, Parent target);

	public abstract boolean hasPermission(String permission, Student target);

	public abstract boolean hasPermission(String permission, Teacher target);

	public abstract boolean hasPermission(String permission, Administrator target);

	public abstract boolean hasPermission(String permission, Parent target);

	public abstract boolean hasPermission(String[] permission, Student target);

	public abstract boolean hasPermission(String[] permission, Teacher target);

	public abstract boolean hasPermission(String[] permission, Administrator target);

	public abstract boolean hasPermission(String[] permission, Parent target);
}
