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
public class UserPermission {
	private static int status = 0;// 0>disabled 1>enabled
	public static String[] studentpermission = new String[99999];
	public static String[] teacherpermission = new String[99999];
	public static String[] administratorpermission = new String[99999];

	public final static int checkSLast() {
		for (int i = 0; i < studentpermission.length; i++) {
			if (studentpermission[i] == null) {
				return i;
			}
		}
		return studentpermission.length;
	}

	public final static int checkTLast() {
		for (int i = 0; i < teacherpermission.length; i++) {
			if (teacherpermission[i] == null) {
				return i;
			}
		}
		return teacherpermission.length;
	}

	public final static int checkALast() {
		for (int i = 0; i < administratorpermission.length; i++) {
			if (administratorpermission[i] == null) {
				return i;
			}
		}
		return administratorpermission.length;
	}

	private final void setPermission() {
		studentpermission[0] = "sys.function.look.mark.self";
		studentpermission[1] = "sys.account.login";
		studentpermission[2] = "sys.account.logout";
		teacherpermission[0] = "sys.account.login";
		teacherpermission[1] = "sys.account.logout";
		teacherpermission[2] = "sys.function.info.manage.selfclass";
		teacherpermission[3] = "sys.function.look.mark.class";
		administratorpermission[0] = "*";
	}

	public final void loadPermissionSystemOn(Student target) {
		setPermission();
		target.permission = studentpermission;
	}

	public final void loadPermissionSystemOn(Teacher target) {
		setPermission();
		target.permission = teacherpermission;
	}

	public final void loadPermissionSystemOn(Administrator target) {
		setPermission();
		target.permission = administratorpermission;
	}

	public final void fluse(Student target) {
		target.permission = studentpermission;
	}

	public final void fluse(Teacher target) {
		target.permission = teacherpermission;
	}

	public final void fluse(Administrator target) {
		target.permission = administratorpermission;
	}

	public final int getPermissionSystemStatus() {
		return UserPermission.status;
	}
}
