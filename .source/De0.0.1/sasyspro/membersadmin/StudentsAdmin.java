package sasyspro.membersadmin;

import sasyspro.template.*;
import java.util.Scanner;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class StudentsAdmin {
	public final static String say = "\t���\t����\t����\t�Ա�\t��ѧʱ��\t\tѧ����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�\t����ɼ�\t��ѧ�ɼ�\t��ʷ�ɼ�\t���γɼ�\t����ɼ�\t����ɼ�\t�����ɼ�\t��Ϣ�ɼ�\t�ܷ�\tƽ����";

	public final int checkLast(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void addTargetS(String name, int age, char gender, String enterdate, int educatenum, Student[] arr) {
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		stu.setGender(gender);
		stu.setEnterDate(enterdate);
		stu.setEducatenum(educatenum);
		int i = this.checkLast(arr);
		stu.setOn(i);
		if (i == 99999) {
			System.out.println("ѧ�������ѵ���󣬲����������");
		} else {
			arr[i] = stu;
		}
		this.print(arr);
	}

	public final void print(Student[] arr) {
		System.out.println(say);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int on, Student stu) {
		if (stu != null) {
			if (stu.getOn() == on) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void findTarget(int on, Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("ѧ��������!");
	}

	public final void replaceStuInfo(int on, String name, int age, char gender, String enterdate, int educatenum,
			Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				arr[i].setName(name);
				arr[i].setAge(age);
				arr[i].setGender(gender);
				arr[i].setEnterDate(enterdate);
				arr[i].setEducatenum(educatenum);
				System.out.println("����ѧ����Ϣ�ɹ�!");
				this.print(arr);
				return;
			}
		}
		System.out.println("ѧ��������!������Ϣʧ��!");
	}

	public final void deleteStu(int on, Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				arr[i] = null;
				this.print(arr);
				return;
			}
		}
		System.out.println("ѧ��������!");
	}

	public final void inputMarks(int on, Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				System.out.println("Notice!����ĳɼ������С�������������!");
				@SuppressWarnings("resource")
				Scanner setMarksca = new Scanner(System.in);
				System.out.println("������" + arr[i].getName() + "�����ĳɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setChineseMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "����ѧ�ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setMathsMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "��Ӣ��ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setEnglishMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "������ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setPhysicsMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "�Ļ�ѧ�ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setChemistryMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "����ʷ�ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setHistoryMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "�����γɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setPoliticalMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "�ĵ���ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setGeographyMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "������ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setBiologyMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "�������ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setPEMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				System.out.println("������" + arr[i].getName() + "����Ϣ�ɼ�");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setITMark(setMarksca.nextDouble());
				} else {
					System.out.println("�Ƿ�����!����!");
				}
				this.print(arr);
				break;
			}
		}
	}

	public final void setSort(int chosesubj, Student[] arr) {
		if (chosesubj == 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getChineseMark() < arr[c].getChineseMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 2) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getMathsMark() < arr[c].getMathsMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 3) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getEnglishMark() < arr[c].getEnglishMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 4) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getPhysicsMark() < arr[c].getPhysicsMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 5) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getChemistryMark() < arr[c].getChemistryMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 6) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getHistoryMark() < arr[c].getHistoryMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 7) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getPoliticalMark() < arr[c].getPoliticalMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 8) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getGeographyMark() < arr[c].getGeographyMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 9) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getBiologyMark() < arr[c].getBiologyMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 10) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getPEMark() < arr[c].getPEMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 11) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getITMark() < arr[c].getITMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		}
		this.print(arr);
	}

	public final void setSumSort(Student[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int c = i + 1; c < arr.length; c++) {
				if (arr[i] != null && arr[c] != null) {
					if (arr[i].getSum() < arr[c].getSum()) {
						Student lei = arr[i];
						arr[i] = arr[c];
						arr[c] = lei;
					}
				}
			}
		}
		this.print(arr);
	}
}
