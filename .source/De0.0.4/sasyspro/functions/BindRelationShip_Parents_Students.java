package sasyspro.functions;

import sasyspro.template.Parent;
import sasyspro.template.Student;

import java.util.ArrayList;

/**
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 */
public class BindRelationShip_Parents_Students {
    /**
     * @param par
     * @param stu
     * @deprecated
     */
    public void doBindOperation(Parent par, ArrayList<Student> stu) {
        for (int i = 0; i < stu.size(); i++) {
            if (stu.get(i) != null) {
                par.setBindStu(stu.get(i));
                stu.get(i).setBind(par);
            } else {
                break;
            }
        }
    }

    public void doBindOperation(Parent par, Student stu) {
        stu.setBind(par);
        par.setBindStu(stu);
    }

    /**
     * @param par
     * @param stu
     * @deprecated
     */
    public void doBindOperation(Parent par, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                par.setBindStu(stu[i]);
                stu[i].setBind(par);
            } else {
                break;
            }
        }
    }
}
