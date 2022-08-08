package sasyspro.enums;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public enum Subjects {
	Biology(7, "����"), Chemistry(4, "��ѧ"), Chinese(1, "����"), English(3, "Ӣ��"), Geograpjy(6, "����"), History(8, "��ʷ"),
	IT(10, "��Ϣ����"), Maths(2, "��ѧ"), PE(11, "����"), Physics(5, "����"), Political(9, "����");

	@SuppressWarnings("unused")
	private int index;

	@SuppressWarnings("unused")
	private String name;

	private Subjects() {

	}

	private Subjects(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public Object[] toArray() {
		return values();
	}
}
