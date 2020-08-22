package sasyspro.permission;

import java.util.ArrayList;

import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class UserPermission {
	private static int status = 0;// 0>disabled 1>enabled
	public  ArrayList<String> studentpermission = new ArrayList<String>();
	public ArrayList<String> teacherpermission = new ArrayList<String>();
	public ArrayList<String> administratorpermission = new ArrayList<String>();
	public ArrayList<String> parentpermission = new ArrayList<String>();

	{
		String s1 = "sys.function.look.mark.self";
		String s2 = "sys.account.login";
		String s3 = "sys.account.logout";
		String t1 = "sys.account.login";
		String t2 = "sys.account.logout";
		String t3 = "sys.function.info.manage.selfclass";
		String t4 = "sys.function.look.mark.class";
		String a1 = "*";
		String p1 = "sys.account.login";
		String p2 = "sys.account.logout";
		studentpermission.add(s1);
		studentpermission.add(s2);
		studentpermission.add(s3);
		teacherpermission.add(t1);
		teacherpermission.add(t2);
		teacherpermission.add(t3);
		teacherpermission.add(t4);
		administratorpermission.add(a1);
		parentpermission.add(p1);
		parentpermission.add(p2);
	}

	public final void loadPermissionSystem(Student target) {
		target.permission = studentpermission;
	}

	public final void loadPermissionSystem(Teacher target) {
		target.permission = teacherpermission;
	}

	public final void loadPermissionSystem(Administrator target) {
		target.permission = administratorpermission;
	}
	
	public final void loadPermissionSystem(Parent target) {
		target.permission = parentpermission;
	}
	
	public final void unLoadPermissionSystem(Student target) {
		target.permission.clear();
	}
	
	public final void unLoadPermissionSystem(Teacher target) {
		target.permission.clear();
	}

	public final void unLoadPermissionSystem(Administrator target) {
		target.permission.clear();
	}

	public final void unLoadPermissionSystem(Parent target) {
		target.permission.clear();
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
	
	public final void fluse(Parent target) {
		target.permission = administratorpermission;
	}

	public final int getPermissionSystemStatus() {
		return UserPermission.status;
	}
}
