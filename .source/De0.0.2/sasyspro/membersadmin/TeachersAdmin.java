package sasyspro.membersadmin;

import java.util.ArrayList;
import java.util.Scanner;
import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class TeachersAdmin {
	private int ArrayNo = 0;
	private static String say = "\t���\t����\t����\t�Ա�\t����ѧУ����\t\t\t����ѧ��\t����༶\t\t���˷�";

	public TeachersAdmin() {
	}

	/**
	 * @deprecated
	 * @param isDoDefaultMessage
	 */
	public TeachersAdmin(boolean isDoDefaultMessage) {
		if (isDoDefaultMessage) {
			System.out.println("���������ʦ����ϵͳ");
		}
	}

	private final Teacher FindNoTarget(int No, ArrayList<Teacher> arr) {
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

	public final void addTarget(String name, int age, char gender, String getProjDate, ArrayList<Teacher> arr) {
		Teacher tea = new Teacher();
		tea.setName(name);
		tea.setAge(age);
		tea.setGender(gender);
		tea.setGetProjDate(getProjDate);
		tea.setNo(ArrayNo);
		arr.add(tea);
		ArrayNo++;
		this.print(arr.toArray());
	}

	public final void print(Object[] arr) {
		System.out.println(say);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int No, Teacher tea) {
		if (tea != null) {
			if (tea.getNo() == No) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void findTarget(int No, ArrayList<Teacher> arr) {
		Teacher a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				System.out.println(a);
				return;
			}
		}
		System.err.println("��ʦ������!");
	}

	public final void replaceInfo(int No, String name, int age, char gender, String getProjDate,
			ArrayList<Teacher> arr) {
		Teacher a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				a.setName(name);
				a.setAge(age);
				a.setGender(gender);
				a.setGetProjDate(getProjDate);
				System.out.println("���½�ʦ��Ϣ�ɹ�!");
				this.print(arr.toArray());
				return;
			}
		}
		System.err.println("��ʦ������!������Ϣʧ��!");
	}

	public final void delete(int No, ArrayList<Teacher> arr) {
		Teacher a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				a = null;
				this.print(arr.toArray());
				return;
			}
		}
		System.err.println("��ʦ������!");
	}

	public final void inputMarks(int No, ArrayList<Teacher> arr) {
		Teacher a = this.FindNoTarget(No, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(No, a)) {
				System.out.println("Notice!����Ŀ��˷ֱ����С�������������!");
				@SuppressWarnings("resource")
				Scanner setMarksca = new Scanner(System.in);
				System.out.println("������" + a.getName() + "��ʦ�Ŀ��˷�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setkhMark(setMarksca.nextDouble());
				} else {
					System.err.println("�Ƿ�����!����!");
				}
				this.print(arr.toArray());
				break;
			}
		}
	}

	public final void setProj(int No, String Proj, ArrayList<Teacher> arr) {
		Teacher a = this.FindNoTarget(No, arr);
		if (this.exist(No, a)) {
			a.setProj(Proj);
		} else {
			System.err.println("��ʦ������!");
			return;
		}
		this.print(arr.toArray());
	}

	public final void setclassProj(int No, String classProj, ArrayList<Teacher> arr) {
		Teacher a = this.FindNoTarget(No, arr);
		if (this.exist(No, a)) {
			a.setClassProj(classProj);
		} else {
			System.err.println("��ʦ������!");
			return;
		}
		this.print(arr.toArray());
	}

	public final void setKHMarkSort(ArrayList<Teacher> arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int c = i + 1; c < arr.size(); c++) {
				if (arr.get(i) != null && arr.get(c) != null) {
					if (arr.get(i).getkhMark() < arr.get(c).getkhMark()) {
						Teacher zj = arr.get(i);
						arr.set(i, arr.get(c));
						arr.set(c, zj);
					}
				}
			}
		}
		this.print(arr.toArray());
	}
}
