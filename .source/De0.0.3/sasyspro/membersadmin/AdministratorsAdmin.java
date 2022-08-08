package sasyspro.membersadmin;

import java.util.ArrayList;

import sasyspro.template.Administrator;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */

public class AdministratorsAdmin {
	private int ArrayNo = 0;
	private final String msg = "\t编号\t姓名\t年龄\t性别\t入职时间\t职务\t管理班级";

	public AdministratorsAdmin() {
	}

	/**
	 * @deprecated
	 * @param isDoDefaultMessage
	 */
	public AdministratorsAdmin(boolean isDoDefaultMessage) {
		if (isDoDefaultMessage) {
			System.out.println("正在载入管理人员管理系统");
		}
	}

	public final void addTarget(String name, int age, char gender, String getJobDate, ArrayList<Administrator> arr) {
		Administrator adm = new Administrator();
		adm.setName(name);
		adm.setAge(age);
		adm.setGender(gender);
		adm.setGetJobDate(getJobDate);
		adm.setNo(ArrayNo);
		System.out.println("成功!");
		arr.add(adm);
		ArrayNo++;
		this.print(arr.toArray());
	}

	public final void delete(int No, ArrayList<Administrator> arr) {
		Administrator a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				arr.remove(a);
				System.out.println("成功!");
				this.print(arr.toArray());
				return;
			}
		}
		System.err.println("管理人员不存在!");
	}

	public final boolean exist(int No, Administrator adm) {
		if (adm != null) {
			if (adm.getNo() == No) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private final Administrator FindNoTarget(int No, ArrayList<Administrator> arr) throws NullPointerException {
		if (arr.isEmpty()) {
			return null;
		}
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getNo() == No) {
				return arr.get(i);
			}
		}
		return null;
	}

	public final void findTarget(int No, ArrayList<Administrator> arr) {
		Administrator a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				System.out.println("成功!");
				System.out.println(a);
				return;
			}
		}
		System.err.println("管理人员不存在!");
	}

	public final void print(Object[] arr) {
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final void replaceInfo(int No, String name, int age, char gender, String getJobDate,
			ArrayList<Administrator> arr) {
		Administrator a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				a.setName(name);
				a.setAge(age);
				a.setGender(gender);
				a.setGetJobDate(getJobDate);
				System.out.println("更新管理人员信息成功!");
				this.print(arr.toArray());
				return;
			}
		}
		System.err.println("管理人员不存在!更新信息失败!");
	}

	public final void setAdminClasses(int No, String adminClasses, ArrayList<Administrator> arr) {
		Administrator a = this.FindNoTarget(No, arr);
		if (this.exist(No, a)) {
			a.setAdminClasses(adminClasses);
			System.out.println("成功!");
		} else {
			System.err.println("管理人员不存在!");
			return;
		}
		this.print(arr.toArray());
	}

	public final void setJob(int No, String Job, ArrayList<Administrator> arr) {
		Administrator a = this.FindNoTarget(No, arr);
		if (this.exist(No, a)) {
			a.setJob(Job);
			System.out.println("成功!");
		} else {
			System.err.println("管理人员不存在!");
			return;
		}
		this.print(arr.toArray());
	}
}