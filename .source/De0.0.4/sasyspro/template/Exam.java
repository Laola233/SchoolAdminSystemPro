package sasyspro.template;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 */
public class Exam implements Serializable {
    private static boolean isEnabled = true; // Whether this template should be enabled?
    private final String templatetype = "Exam"; // This template type
    private ArrayList<Double> biology = new ArrayList<Double>();
    private ArrayList<Double> chemistry = new ArrayList<Double>();
    private ArrayList<Double> chinese = new ArrayList<Double>();
    private Date Date;
    private ArrayList<Double> english = new ArrayList<Double>();
    private String examName;
    private ArrayList<Double> geography = new ArrayList<Double>();
    private ArrayList<Double> history = new ArrayList<Double>();
    private ArrayList<Double> informationtechnology = new ArrayList<Double>();
    private ArrayList<Student> ks = new ArrayList<Student>();
    private ArrayList<Double> maths = new ArrayList<Double>();
    private ArrayList<Double> physicaleducation = new ArrayList<Double>();
    private ArrayList<Double> physics = new ArrayList<Double>();
    private ArrayList<Double> political = new ArrayList<Double>();
    private ArrayList<Teacher> yjteacher = new ArrayList<Teacher>();

    {
        examName = null;
        Date = null;
    }

    public Exam() {
        System.out.println("没有参数!将创建一个空的考试!");
    }

    public Exam(String examName, Date Date, ArrayList<Student> ks, ArrayList<Teacher> yjteacher) throws Exception {
        this.examName = examName;
        this.Date = Date;
        this.ks = ks;
        this.yjteacher = yjteacher;
    }

    public Exam(String examName, Date Date, ArrayList<Student> ks, ArrayList<Teacher> yjteacher,
                ArrayList<Double> chinese, ArrayList<Double> maths, ArrayList<Double> english, ArrayList<Double> physics,
                ArrayList<Double> chemistry, ArrayList<Double> history, ArrayList<Double> political,
                ArrayList<Double> geography, ArrayList<Double> biology, ArrayList<Double> physicaleducation,
                ArrayList<Double> informationtechnology) throws Exception {
        this(examName, Date, ks, yjteacher);
        this.chinese = chinese;
        this.maths = maths;
        this.english = english;
        this.physics = physics;
        this.chemistry = chemistry;
        this.history = history;
        this.political = political;
        this.geography = geography;
        this.biology = biology;
        this.physicaleducation = physicaleducation;
        this.informationtechnology = informationtechnology;
    }

    public final static boolean getIsEnabled() {
        return isEnabled;
    }

    public final static void setIsEnabled(boolean status) {
        isEnabled = status;
    }

    public final Date getDate() {
        return this.Date;
    }

    public final void setDate(Date Date) throws Exception {
        this.Date = Date;
    }

    public final String getExamName() {
        return this.examName;
    }

    public final void setExamName(String examName) {
        this.examName = examName;
    }

    public final Student getKs(int num) throws Exception {
        return this.ks.get(num);
    }

    public final Object[] getKsArray() throws Exception {
        return this.ks.toArray();
    }

    /**
     * @param subject
     * @param num
     * @return
     * @throws Exception
     * @deprecated
     */
    public final Double getMark(String subject, int num) throws Exception {
        switch (subject) {
            default:
                System.out
                        .println("可用学科名:Chinese,Maths,English,Chemistry,Physics,History,Political,Geography,Biology,PE,IT");
                break;
            case "Chinese":
                return this.chinese.get(num);
            case "Maths":
                return this.maths.get(num);
            case "English":
                return this.english.get(num);
            case "Chemistry":
                return this.chemistry.get(num);
            case "Physics":
                return this.physics.get(num);
            case "History":
                return this.history.get(num);
            case "Political":
                return this.political.get(num);
            case "Geography":
                return this.geography.get(num);
            case "Biology":
                return this.biology.get(num);
            case "PE":
                return this.physicaleducation.get(num);
            case "IT":
                return this.informationtechnology.get(num);
        }
        return null;
    }

    public final Object[] getMarkArray(String subject) throws Exception {
        switch (subject) {
            default:
                System.out
                        .println("可用学科名:Chinese,Maths,English,Chemistry,Physics,History,Political,Geography,Biology,PE,IT");
                break;
            case "Chinese":
                return this.chinese.toArray();
            case "Maths":
                return this.maths.toArray();
            case "English":
                return this.english.toArray();
            case "Chemistry":
                return this.chemistry.toArray();
            case "Physics":
                return this.physics.toArray();
            case "History":
                return this.history.toArray();
            case "Political":
                return this.political.toArray();
            case "Geography":
                return this.geography.toArray();
            case "Biology":
                return this.biology.toArray();
            case "PE":
                return this.physicaleducation.toArray();
            case "IT":
                return this.informationtechnology.toArray();
        }
        return null;
    }

    public final String getType() {
        return this.templatetype;
    }

    public final Teacher getYjTeacher(int num) throws Exception {
        return this.yjteacher.get(num);
    }

    public final Object[] getYjTeacherArray() throws Exception {
        return this.yjteacher.toArray();
    }

    public final void setMark(String subject, ArrayList<Double> arrlist) throws Exception {
        switch (subject) {
            default:
                System.out
                        .println("可用学科名:Chinese,Maths,English,Chemistry,Physics,History,Political,Geography,Biology,PE,IT");
                break;
            case "Chinese":
                this.chinese = arrlist;
                break;
            case "Maths":
                this.maths = arrlist;
                break;
            case "English":
                this.english = arrlist;
                break;
            case "Chemistry":
                this.chemistry = arrlist;
                break;
            case "Physics":
                this.physics = arrlist;
                break;
            case "History":
                this.history = arrlist;
                break;
            case "Political":
                this.political = arrlist;
                break;
            case "Geography":
                this.geography = arrlist;
                break;
            case "Biology":
                this.biology = arrlist;
                break;
            case "PE":
                this.physicaleducation = arrlist;
                break;
            case "IT":
                this.informationtechnology = arrlist;
                break;
        }
    }

    /**
     * @param subject
     * @param arr
     * @deprecated
     */
    public final void setMark(String subject, double arr) {
        switch (subject) {
            default:
                System.out
                        .println("可用学科名:Chinese,Maths,English,Chemistry,Physics,History,Political,Geography,Biology,PE,IT");
                break;
            case "Chinese":
                sets(this.chinese, arr);
                break;
            case "Maths":
                sets(this.maths, arr);
                break;
            case "English":
                sets(this.english, arr);
                break;
            case "Chemistry":
                sets(this.chemistry, arr);
                break;
            case "Physics":
                sets(this.physics, arr);
                break;
            case "History":
                sets(this.history, arr);
                break;
            case "Political":
                sets(this.political, arr);
                break;
            case "Geography":
                sets(this.geography, arr);
                break;
            case "Biology":
                sets(this.biology, arr);
                break;
            case "PE":
                sets(this.physicaleducation, arr);
                break;
            case "IT":
                sets(this.informationtechnology, arr);
                break;
        }
    }

    public final void setMark(String subject, double[] arr) throws Exception {
        switch (subject) {
            default:
                System.out
                        .println("可用学科名:Chinese,Maths,English,Chemistry,Physics,History,Political,Geography,Biology,PE,IT");
                break;
            case "Chinese":
                sets(this.chinese, arr);
                break;
            case "Maths":
                sets(this.maths, arr);
                break;
            case "English":
                sets(this.english, arr);
                break;
            case "Chemistry":
                sets(this.chemistry, arr);
                break;
            case "Physics":
                sets(this.physics, arr);
                break;
            case "History":
                sets(this.history, arr);
                break;
            case "Political":
                sets(this.political, arr);
                break;
            case "Geography":
                sets(this.geography, arr);
                break;
            case "Biology":
                sets(this.biology, arr);
                break;
            case "PE":
                sets(this.physicaleducation, arr);
                break;
            case "IT":
                sets(this.informationtechnology, arr);
                break;
        }
    }

    private final void sets(ArrayList<Double> arrlist, double mark) {
        if (mark != 0.0d) {
            arrlist.add(mark);
        }
    }

    private final void sets(ArrayList<Double> arrlist, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0.0d) {
                arrlist.add(arr[i]);
            } else {
                break;
            }
        }
    }

    /**
     * @param stulist
     * @deprecated
     */
    public final void setStudentMember(ArrayList<Student> stulist) throws Exception {
        this.ks = stulist;
    }

    public final void setStudentMember(int num, Student stu) throws Exception {
        this.ks.add(stu);
    }

    public final void setStudentMember(Student[] stuarr) throws Exception {
        for (int i = 0; i < stuarr.length; i++) {
            if (stuarr[i] != null) {
                this.ks.add(stuarr[i]);
            } else {
                break;
            }
        }
    }

    /**
     * @param tealist
     * @throws Exception
     * @deprecated
     */
    public final void setYjTeacher(ArrayList<Teacher> tealist) throws Exception {
        this.yjteacher = tealist;
    }

    public final void setYjTeacher(int num, Teacher tea) throws Exception {
        this.yjteacher.add(num, tea);
    }

    public final void setYjTeacher(Teacher[] teaarr) throws Exception {
        for (int i = 0; i < teaarr.length; i++) {
            if (teaarr[i] != null) {
                this.yjteacher.add(teaarr[i]);
            } else {
                break;
            }
        }
    }
}
