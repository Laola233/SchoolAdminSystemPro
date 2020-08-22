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
public class ManagePermission extends UserPermission implements Permission {

	@Override
	public final Object[] getPermission(Student target) {
		return target.permission.toArray();
	}

	@Override
	public final Object[] getPermission(Teacher target) {
		return target.permission.toArray();
	}

	@Override
	public final Object[] getPermission(Administrator target) {
		return target.permission.toArray();
	}

	@Override
	public final Object[] getPermission(Parent target) {
		return target.permission.toArray();
	}

	@Override
	public final String getPermission(Student target, int pno) {
		return target.permission.get(pno);
	}

	@Override
	public final String getPermission(Teacher target, int pno) {
		return target.permission.get(pno);
	}

	@Override
	public final String getPermission(Administrator target, int pno) {
		return target.permission.get(pno);
	}

	@Override
	public final String getPermission(Parent target, int pno) {
		return target.permission.get(pno);
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void addPermission(String[] permissionsz, Student target) {
		for (int i = 0; i < permissionsz.length; i++) {
			if (permissionsz[i] != null) {
				target.permission.add(permissionsz[i]);
			} else {
				break;
			}
		}
	}

	@Override
	public final void addPermission(String permission, Student target) {
		target.permission.add(permission);
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void addPermission(String[] permissionsz, Teacher target) {
		for (int i = 0; i < permissionsz.length; i++) {
			if (permissionsz[i] != null) {
				target.permission.add(permissionsz[i]);
			} else {
				break;
			}
		}
	}

	@Override
	public final void addPermission(String permission, Teacher target) {
		target.permission.add(permission);
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void addPermission(String[] permissionsz, Administrator target) {
		for (int i = 0; i < permissionsz.length; i++) {
			if (permissionsz[i] != null) {
				target.permission.add(permissionsz[i]);
			} else {
				break;
			}
		}
	}

	@Override
	public final void addPermission(String permission, Administrator target) {
		target.permission.add(permission);
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void addPermission(String[] permissionsz, Parent target) {
		for (int i = 0; i < permissionsz.length; i++) {
			if (permissionsz[i] != null) {
				target.permission.add(permissionsz[i]);
			} else {
				break;
			}
		}

	}

	@Override
	public final void addPermission(String permission, Parent target) {
		target.permission.add(permission);
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void delPermission(String[] permissionsz, Student target) {
		if (permissionsz.equals((String[]) target.permission.toArray())) {
			target.permission.clear();
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public final void delPermission(String permission, Student target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				target.permission.remove(i);
				continue;
			} else {
				continue;
			}
		}
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void delPermission(String[] permissionsz, Teacher target) {
		if (permissionsz.equals((String[]) target.permission.toArray())) {
			target.permission.clear();
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public final void delPermission(String permission, Teacher target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				target.permission.remove(i);
				continue;
			} else {
				continue;
			}
		}
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void delPermission(String[] permissionsz, Administrator target) {
		if (permissionsz.equals((String[]) target.permission.toArray())) {
			target.permission.clear();
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public final void delPermission(String permission, Administrator target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				target.permission.remove(i);
				continue;
			} else {
				continue;
			}
		}
	}

	/**
	 * @deprecated
	 */
	@Override
	public final void delPermission(String[] permissionsz, Parent target) {
		if (permissionsz.equals((String[]) target.permission.toArray())) {
			target.permission.clear();
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public final void delPermission(String permission, Parent target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				target.permission.remove(i);
				continue;
			} else {
				continue;
			}
		}
	}

	@Override
	public final boolean hasPermission(String permission, Student target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public final boolean hasPermission(String permission, Teacher target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public final boolean hasPermission(String permission, Administrator target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public final boolean hasPermission(String permission, Parent target) {
		for (int i = 0; i < target.permission.size(); i++) {
			if (permission.equals(target.permission.get(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @deprecated
	 */
	@Override
	public final boolean hasPermission(String[] permission, Student target) {
		if (permission.equals((String[]) target.permission.toArray())) {
			return true;
		}
		return false;
	}

	/**
	 * @deprecated
	 */
	@Override
	public final boolean hasPermission(String[] permission, Teacher target) {
		if (permission.equals((String[]) target.permission.toArray())) {
			return true;
		}
		return false;
	}

	/**
	 * @deprecated
	 */
	@Override
	public final boolean hasPermission(String[] permission, Administrator target) {
		if (permission.equals((String[]) target.permission.toArray())) {
			return true;
		}
		return false;
	}

	/**
	 * @deprecated
	 */
	@Override
	public final boolean hasPermission(String[] permission, Parent target) {
		if (permission.equals((String[]) target.permission.toArray())) {
			return true;
		}
		return false;
	}

	public final void addDefaultPermission(String type, String permission) {

		switch (type) {
		case "Student":
			super.studentpermission.add(permission);
			break;
		case "Teacher":
			super.teacherpermission.add(permission);
			break;
		case "Administrator":
			super.administratorpermission.add(permission);
			break;
		}
	}

	public final void delDefaultPermission(String type, String permission) {
		switch (type) {
		case "Student":
			for (int i = 0; i < super.studentpermission.size(); i++) {
				if (permission.equals(super.studentpermission.get(i))) {
					super.studentpermission.remove(i);
				}
			}
			break;
		case "Teacher":
			for (int i = 0; i < super.teacherpermission.size(); i++) {
				if (permission.equals(super.teacherpermission.get(i))) {
					super.teacherpermission.remove(i);
				}
			}
			break;
		case "Administrator":
			for (int i = 0; i < super.administratorpermission.size(); i++) {
				if (permission.equals(super.administratorpermission.get(i))) {
					super.administratorpermission.remove(i);
				}
			}
			break;
		}
	}

	public final Object[] getDefaultPermission(String type) {
		switch (type) {
		case "Student":
			return super.studentpermission.toArray();
		case "Teacher":
			return super.teacherpermission.toArray();
		case "Administrator":
			return super.administratorpermission.toArray();
		}
		return null;
	}
}
