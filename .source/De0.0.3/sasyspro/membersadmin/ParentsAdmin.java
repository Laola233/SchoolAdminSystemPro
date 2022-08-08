package sasyspro.membersadmin;

import java.util.ArrayList;

import sasyspro.template.Parent;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.2B
 *
 */
public class ParentsAdmin {
	private int ArrayNo = 0;
	private final String say = "����" + "\t" + "��ϵ" + "\t\t\t\t\t\t\t\t" + "��ѧ��";

	public ParentsAdmin() {
	}

	/**
	 * @deprecated
	 * @param isDoDefaultMessage
	 */
	public ParentsAdmin(boolean isDoDefaultMessage) {
		if (isDoDefaultMessage) {
			System.out.println("��������ҳ�����ϵͳ");
		}
	}

	public final void addTarget(String name, ArrayList<Parent> arr) throws Exception {
		Parent par = new Parent();
		par.setName(name);
		par.setNo(ArrayNo);
		arr.add(par);
		ArrayNo++;
		this.print(arr.toArray());
	}

	public final void delete(int No, ArrayList<Parent> arr) {
		Parent a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				a = null;
				this.print(arr.toArray());
				return;
			}
		}
		System.err.println("�ҳ�������!");
	}

	public final boolean exist(int No, Parent par) {
		if (par != null) {
			if (par.getNo() == No) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private final Parent FindNoTarget(int No, ArrayList<Parent> arr) {
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

	public final void findTarget(int No, ArrayList<Parent> arr) {
		Parent a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				System.out.println(a);
				return;
			}
		}
		System.err.println("�ҳ�������!");
	}

	public final void print(Object[] arr) {
		System.out.println(say);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final void replaceInfo(int No, String name, ArrayList<Parent> arr) {
		Parent a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				a.setName(name);
				System.out.println("���¼ҳ���Ϣ�ɹ�!");
				this.print(arr.toArray());
				return;
			}
		}
		System.err.println("�ҳ�������!������Ϣʧ��!");
	}
}
