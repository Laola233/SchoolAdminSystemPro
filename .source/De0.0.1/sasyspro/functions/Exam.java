package sasyspro.functions;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class Exam {
	protected String name;
	protected int chinesestatus;
	protected int mathsstatus;
	protected int englishstatus;
	protected int physicsstatus;
	protected int chemistrystatus;
	protected int historystatus;
	protected int politicalstatus;
	protected int geographystatus;
	protected int biologystatus;
	protected int physicaleducationstatus;
	protected int informationtechnologystatus;

	public final void createExam(String name, boolean chinese, boolean maths, boolean english, boolean physics,
			boolean chemistry, boolean history, boolean political, boolean geography, boolean biology,
			boolean physicaleducation, boolean informationtechnology, int status) {
		this.name = name;
		if (chinese) {
			chinesestatus = 1;
		}
		if (maths) {
			mathsstatus = 1;
		}
		if (english) {
			englishstatus = 1;
		}
		if (physics) {
			physicsstatus = 1;
		}
		if (chemistry) {
			chemistrystatus = 1;
		}
		if (history) {
			historystatus = 1;
		}
		if (political) {
			politicalstatus = 1;
		}
		if (geography) {
			geographystatus = 1;
		}
		if (biology) {
			biologystatus = 1;
		}
		if (physicaleducation) {
			physicaleducationstatus = 1;
		}
		if (informationtechnology) {
			informationtechnologystatus = 1;
		}
		switch (status) {
		case 0:
			System.out.println("创建考试完毕!请继续执行其他操作");
			break;
		case 1:
			System.out.println();
			break;
		case 66:
			System.exit(0);
			break;
		}
	}

	public final void enterExamMark() {

	}
}
