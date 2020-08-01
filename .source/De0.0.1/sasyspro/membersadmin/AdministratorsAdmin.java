package sasyspro.membersadmin;

import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class AdministratorsAdmin {
	private final String msg = "\t���\t����\t����\t�Ա�\t��ְʱ��\tְ��\t����༶";

	public final int checkLast(Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void print(Administrator[] arr) {
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
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

	public final void addTargetA(String name, int age, char gender, String getJobDate, Administrator[] arr) {
		Administrator adm = new Administrator();
		adm.setName(name);
		adm.setAge(age);
		adm.setGender(gender);
		adm.setGetJobDate(getJobDate);
		int i = checkLast(arr);
		adm.setNo(i);
		if (i == 99999) {
			System.err.println("������Ա�����Ѿ��ﵽ���,���������!");
		} else {
			System.out.println("�ɹ�!");
			arr[i] = adm;
		}
		this.print(arr);
	}

	public final void replaceAdmInfo(int No, String name, int age, char gender, String getJobDate,
			Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i].setName(name);
				arr[i].setAge(age);
				arr[i].setGender(gender);
				arr[i].setGetJobDate(getJobDate);
				System.out.println("���¹�����Ա��Ϣ�ɹ�!");
				this.print(arr);
				return;
			}
		}
		System.err.println("������Ա������!������Ϣʧ��!");
	}

	public final void findTarget(int No, Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println("�ɹ�!");
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("������Ա������!");
	}

	public final void deleteAdm(int No, Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i] = null;
				System.out.println("�ɹ�!");
				this.print(arr);
				return;
			}
		}
		System.err.println("������Ա������!");
	}

	public final void setAdmJob(int No, String Job, Administrator[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setJob(Job);
			System.out.println("�ɹ�!");
		} else {
			System.err.println("������Ա������!");
			return;
		}
		this.print(arr);
	}

	public final void setAdminClasses(int No, String adminClasses, Administrator[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setAdminClasses(adminClasses);
			System.out.println("�ɹ�!");
		} else {
			System.err.println("������Ա������!");
			return;
		}
		this.print(arr);
	}
}