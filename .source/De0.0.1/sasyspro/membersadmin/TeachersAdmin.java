package sasyspro.membersadmin;

import java.util.Scanner;
import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class TeachersAdmin {
	public static String say = "\t���\t����\t����\t�Ա�\t����ѧУ����\t\t\t����ѧ��\t����༶\t\t���˷�";

	public final int checkLast(Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void addTargetT(String name, int age, char gender, String getProjDate, Teacher[] arr) {
		Teacher tea = new Teacher();
		tea.setName(name);
		tea.setAge(age);
		tea.setGender(gender);
		tea.setGetProjDate(getProjDate);
		int i = checkLast(arr);
		tea.setNo(i);
		if (i == 99999) {
			System.err.println("��ʦ�����Ѿ��ﵽ���,���������!");
		} else {
			arr[i] = tea;
		}
		this.print(arr);
	}

	public final void print(Teacher[] arr) {
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

	public final void findTarget(int No, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("��ʦ������!");
	}

	public final void replaceTeaInfo(int No, String name, int age, char gender, String getProjDate, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i].setName(name);
				arr[i].setAge(age);
				arr[i].setGender(gender);
				arr[i].setGetProjDate(getProjDate);
				System.out.println("���½�ʦ��Ϣ�ɹ�!");
				this.print(arr);
				return;
			}
		}
		System.err.println("��ʦ������!������Ϣʧ��!");
	}

	public final void deleteTea(int No, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i] = null;
				this.print(arr);
				return;
			}
		}
		System.err.println("��ʦ������!");
	}

	public final void inputkhMarks(int No, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println("Notice!����Ŀ��˷ֱ����С�������������!");
				@SuppressWarnings("resource")
				Scanner setMarksca = new Scanner(System.in);
				System.out.println("������" + arr[i].getName() + "��ʦ�Ŀ��˷�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setkhMark(setMarksca.nextDouble());
				} else {
					System.err.println("�Ƿ�����!����!");
				}
				this.print(arr);
				break;
			}
		}
	}

	public final void setTeaProj(int No, String Proj, Teacher[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setProj(Proj);
		} else {
			System.err.println("��ʦ������!");
			return;
		}
		this.print(arr);
	}

	public final void setTeaclassProj(int No, String classProj, Teacher[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setClassProj(classProj);
		} else {
			System.err.println("��ʦ������!");
			return;
		}
		this.print(arr);
	}

	public final void setKHMarkSort(Teacher[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int c = i + 1; c < arr.length; c++) {
				if (arr[i] != null && arr[c] != null) {
					if (arr[i].getkhMark() < arr[c].getkhMark()) {
						Teacher zj = arr[i];
						arr[i] = arr[c];
						arr[c] = zj;
					}
				}
			}
		}
		this.print(arr);
	}
}
