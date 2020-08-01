package sasyspro.template;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class Exams {
	protected String examName;
	protected String Date;
	protected Student[] kaosheng = new Student[1000];
	protected double[] chinese = new double[1000];
	protected double[] maths = new double[1000];
	protected double[] english = new double[1000];
	protected double[] physics = new double[1000];
	protected double[] chemistry = new double[1000];
	protected double[] history = new double[1000];
	protected double[] political = new double[1000];
	protected double[] geography = new double[1000];
	protected double[] biology = new double[1000];
	protected double[] physicaleducation = new double[1000];
	protected double[] informationtechnology = new double[1000];

	public final void setAllStudentsMark(Student[] arr) {
		for (int i = 0; i < 1000; i++) {
			arr[i].setChineseMark(this.chinese[i]);
			arr[i].setMathsMark(this.maths[i]);
			arr[i].setEnglishMark(this.english[i]);
			arr[i].setPhysicsMark(this.physics[i]);
			arr[i].setChemistryMark(this.chemistry[i]);
			arr[i].setHistoryMark(this.history[i]);
			arr[i].setPoliticalMark(this.political[i]);
			arr[i].setGeographyMark(this.geography[i]);
			arr[i].setBiologyMark(this.biology[i]);
			arr[i].setPEMark(this.physicaleducation[i]);
			arr[i].setITMark(this.informationtechnology[i]);
		}
	}

	public final void setStudentMark(Student[] arr, int studentno, String subject, double mark,
			boolean isEnableDefaultMessage, boolean isEnableSuccessInfo) {
		switch (subject) {
		default:
			if (isEnableDefaultMessage) {
				System.out.println("������������,����ѧ����!");
				System.out.println(
						"����ѧ����:Chinese,Maths,English,Chemistry,Physics,History,Political,Geography,Biology,PE,IT");
			}
			break;
		case "Chinese":
			arr[studentno].setChineseMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "Maths":
			arr[studentno].setMathsMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "English":
			arr[studentno].setEnglishMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "Chemistry":
			arr[studentno].setChemistryMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "Physics":
			arr[studentno].setPhysicsMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "History":
			arr[studentno].setHistoryMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "Political":
			arr[studentno].setPoliticalMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "Geography":
			arr[studentno].setGeographyMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "Biology":
			arr[studentno].setBiologyMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "PE":
			arr[studentno].setPEMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		case "IT":
			arr[studentno].setITMark(mark);
			if (isEnableSuccessInfo) {
				System.out.println("�ɹ�Ϊѧ��" + arr[studentno].getName() + "����" + subject + "ѧ�Ƶĳɼ�" + ",Ϊ" + mark + "��");
			}
			break;
		}
	}
}
