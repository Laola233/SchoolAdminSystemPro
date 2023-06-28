package sasyspro.enums;

/**
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 */
public enum Subjects {
    Biology(7, "生物"), Chemistry(4, "化学"), Chinese(1, "语文"), English(3, "英语"), Geograpjy(6, "地理"), History(8, "历史"),
    IT(10, "信息技术"), Maths(2, "数学"), PE(11, "体育"), Physics(5, "物理"), Political(9, "政治");

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
