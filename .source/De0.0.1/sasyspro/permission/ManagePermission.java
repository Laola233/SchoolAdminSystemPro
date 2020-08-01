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
public class ManagePermission extends UserPermission implements Permission {

	@Override
	public String[] getPermission(Student target) {
		return target.permission;
	}

	@Override
	public String[] getPermission(Teacher target) {
		return target.permission;
	}

	@Override
	public String[] getPermission(Administrator target) {
		return target.permission;
	}

	@Override
	public String getPermission(Student target, int pno) {
		return target.permission[pno];
	}

	@Override
	public String getPermission(Teacher target, int pno) {
		return target.permission[pno];
	}

	@Override
	public String getPermission(Administrator target, int pno) {
		return target.permission[pno];
	}

	/**
	 * @deprecated
	 */
	@Override
	public void addPermission(String[] permissionsz, Student target) {
		target.permission = permissionsz;
	}

	@Override
	public void addPermission(String permission, Student target) {
		target.permission[target.checkLast()] = permission;
	}

	/**
	 * @deprecated
	 */
	@Override
	public void addPermission(String[] permissionsz, Teacher target) {
		target.permission = permissionsz;
	}

	@Override
	public void addPermission(String permission, Teacher target) {
		target.permission[target.checkLast()] = permission;
	}

	/**
	 * @deprecated
	 */
	@Override
	public void addPermission(String[] permissionsz, Administrator target) {
		target.permission = permissionsz;
	}

	@Override
	public void addPermission(String permission, Administrator target) {
		target.permission[target.checkLast()] = permission;
	}

	/**
	 * @deprecated
	 */
	@Override
	public void delPermission(String[] permissionsz, Student target) {
		if (permissionsz == target.permission) {
			for (int i = 0; i < target.permission.length; i++) {
				target.permission[i] = null;
			}
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public void delPermission(String permission, Student target) {
		for (int i = 0; i < target.permission.length; i++) {
			if (target.permission[i] == permission) {
				target.permission[i] = null;
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
	public void delPermission(String[] permissionsz, Teacher target) {
		if (permissionsz == target.permission) {
			for (int i = 0; i < target.permission.length; i++) {
				target.permission[i] = null;
			}
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public void delPermission(String permission, Teacher target) {
		for (int i = 0; i < target.permission.length; i++) {
			if (target.permission[i] == permission) {
				target.permission[i] = null;
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
	public void delPermission(String[] permissionsz, Administrator target) {
		if (permissionsz == target.permission) {
			for (int i = 0; i < target.permission.length; i++) {
				target.permission[i] = null;
			}
		}
		System.out.println("无法删除所有数组里的权限,因为数组里的权限不与原有相同");
	}

	@Override
	public void delPermission(String permission, Administrator target) {
		for (int i = 0; i < target.permission.length; i++) {
			if (target.permission[i] == permission) {
				target.permission[i] = null;
				continue;
			} else {
				continue;
			}
		}
	}

	@Override
	public boolean hasPermission(String permission, Student target) {
		for (int i = 0; i < target.permission.length; i++) {
			if (target.permission[i] == permission) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean hasPermission(String permission, Teacher target) {
		for (int i = 0; i < target.permission.length; i++) {
			if (target.permission[i] == permission) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean hasPermission(String permission, Administrator target) {
		for (int i = 0; i < target.permission.length; i++) {
			if (target.permission[i] == permission) {
				return true;
			}
		}
		return false;
	}

	public void addDefaultPermission(String type, String permission) {
		switch (type) {
		case "Student":
			UserPermission.studentpermission[UserPermission.checkSLast()] = permission;
			break;
		case "Teacher":
			UserPermission.teacherpermission[UserPermission.checkTLast()] = permission;
			break;
		case "Administrator":
			UserPermission.administratorpermission[UserPermission.checkALast()] = permission;
			break;
		}
	}

	public void delDefaultPermission(String type, String permission) {
		switch (type) {
		case "Student":
			for (int i = 0; i < UserPermission.studentpermission.length; i++) {
				if (UserPermission.studentpermission[i] == permission) {
					UserPermission.studentpermission[i] = null;
				}
			}
			break;
		case "Teacher":
			for (int i = 0; i < UserPermission.teacherpermission.length; i++) {
				if (UserPermission.teacherpermission[i] == permission) {
					UserPermission.teacherpermission[i] = null;
				}
			}
			break;
		case "Administrator":
			for (int i = 0; i < UserPermission.administratorpermission.length; i++) {
				if (UserPermission.administratorpermission[i] == permission) {
					UserPermission.administratorpermission[i] = null;
				}
			}
			break;
		}
	}

	public String[] getDefaultPermission(String type) {
		switch (type) {
		case "Student":
			return UserPermission.studentpermission;
		case "Teacher":
			return UserPermission.teacherpermission;
		case "Administrator":
			return UserPermission.administratorpermission;
		}
		return null;
	}
}
